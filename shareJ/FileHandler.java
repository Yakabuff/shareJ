package shareJ;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import javax.imageio.ImageIO;

import History.HistoryWrite;
import MainGui.RecentScreenshotPanel;
import Screenshot.Screenshot;
import Uploads.ImgurUpload;
import org.apache.commons.codec.binary.Base64;

public class FileHandler {

	static LocalDate ld;

	public static void  screenshotFolderHandler() {
		Path p = Paths.get(System.getProperty("user.dir"), "Screenshots");
		if (Files.notExists(p)) {
			File screenshots = new File(System.getProperty("user.dir"), "Screenshots");
			screenshots.mkdir();
		}
	}

	public static void monthFolderHandler() {
		ld = LocalDate.now();
		Month currMonth = ld.getMonth();
		Path p = Paths.get(System.getProperty("user.dir")+File.separator+"Screenshots", currMonth.toString());
		if(Files.notExists(p)) {
			File months = new File(System.getProperty("user.dir")+File.separator+"Screenshots", currMonth.toString());
			months.mkdir();
		}

	}

	public static void saveScreenshotOperation(BufferedImage bf) {
		preOperationCheck();
		String filename = Screenshot.dateTime();
		try {
			Path p = Paths.get(System.getProperty("user.dir")+File.separator+"Screenshots"+File.separator+ld.getMonth().toString(), filename+"."+Screenshot.format);
			File f = p.toFile();
			ImageIO.write(bf, Screenshot.format, f);
			HistoryWrite.insert(p.toString(), Screenshot.dateTime());
			ImgurUpload upload = new ImgurUpload(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RecentScreenshotPanel.updateHistory();
	}

	public static void preOperationCheck() {
		screenshotFolderHandler();
		monthFolderHandler();
	}

	public static String getBase64(Path p){
		String encodedBase64 = "";
		try{
			File f = p.toFile();
			FileInputStream fileInputStreamReader = new FileInputStream(f);
			byte[] bytes = new byte[(int)f.length()];
			fileInputStreamReader.read(bytes);
			encodedBase64 = new String(Base64.encodeBase64(bytes), "UTF-8");
		}catch (IOException e){
			e.printStackTrace();
		}

		return encodedBase64;
	}
	
}
