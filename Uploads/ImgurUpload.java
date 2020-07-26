package Uploads;

import com.google.common.net.HttpHeaders;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import shareJ.FileHandler;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ImgurUpload {
    public static String URL = "https://api.imgur.com/3/image";
    String clientID = KeysAPI.IMGUR_CLIENT_ID;
    String clientSecret = KeysAPI.IMGUR_SECRET;
    String jsonResponse = "";
    public ImgurUpload(Path p) {

        try {
            CloseableHttpClient client = HttpClients.createDefault();
            HttpPost request = new HttpPost(URL);

            request.setHeader(HttpHeaders.AUTHORIZATION, "Client-ID " + clientID);

            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("image", FileHandler.getBase64(p)));
            request.setEntity(new UrlEncodedFormEntity(params));
            CloseableHttpResponse response = client.execute(request);
            System.out.println(response.getCode());
            System.out.println(response.getReasonPhrase());
            jsonResponse = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
