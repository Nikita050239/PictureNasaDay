import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        NasaUrl nasaUrl = new NasaUrl();
        int urlBegin = 0;
        int urlEnd = 0;
        int explanationBegin = 0;
        int explanationEnd = 0;
        String pictureDay = nasaUrl.nasa(urlBegin, urlEnd, explanationBegin, explanationEnd);
        System.out.println(pictureDay);
    }


}