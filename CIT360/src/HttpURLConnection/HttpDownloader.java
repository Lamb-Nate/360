package HttpURLConnection;

import java.io.IOException;

public class HttpDownloader {
 
    public static void main(String[] args) {
        String fileURL = "https://github.com/yenrab/doing-stuff-with-java/raw/master/Doing%20Stuff%20with%20Java.pdf";
        String saveDir = "C:\\test";
        try {
            HttpDownloadUtility.downloadFile(fileURL, saveDir);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
