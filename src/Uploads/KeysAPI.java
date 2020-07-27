package Uploads;

import shareJ.BuildConfig;

public class KeysAPI {

    public static String IMGUR_CLIENT_ID = "";
    public static String IMGUR_SECRET = "";

    public static void init(){
        IMGUR_CLIENT_ID = BuildConfig.shareJ_ImgurClient_ID;
        IMGUR_SECRET = BuildConfig.shareJ_ImgurSecret;
    }
}
