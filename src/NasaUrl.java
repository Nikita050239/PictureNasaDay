import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NasaUrl {
    public String nasa(int urlBegin, int urlEnd, int explanationBegin, int explanationEnd) throws IOException {
        DownLoadWeb dw = new DownLoadWeb();
        String page = dw.downloadWebPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
        urlBegin = page.lastIndexOf("url");
        urlEnd = page.lastIndexOf("}");
        String url = page.substring(urlBegin + 6, urlEnd - 1);
        try (InputStream in = new URL(url).openStream()) {
            Files.copy(in, Paths.get("new.jpg"));
        }
        System.out.println("Picture saved!");
        explanationBegin = page.lastIndexOf("explanation");
        explanationEnd = page.lastIndexOf("hdurl");
        String explanation = page.substring(explanationBegin + 13, explanationEnd - 3);
        return explanation;
    }
}
