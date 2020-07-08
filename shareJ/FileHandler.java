package shareJ;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import javax.imageio.ImageIO;

import History.HistoryWrite;
import Screenshot.Screenshot;

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
		String filename = Screenshot.filename();
		try {
			Path p = Paths.get(System.getProperty("user.dir")+File.separator+"Screenshots"+File.separator+ld.getMonth().toString(), filename);
			File f = p.toFile();
			ImageIO.write(bf, Screenshot.format, f);
			HistoryWrite.insert(p.toString(), filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void preOperationCheck() {
		screenshotFolderHandler();
		monthFolderHandler();
	}
	
}
