package chap17;
// URL を使ったHTTP クライアント

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class HttpClientByURL {
    public static void main(String[] args) throws IOException {
        URL url;
        BufferedReader in = null;
        String host = "www.ndl.go.jp";
        url = new URL("http://" + host + "/index.html");
        in = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
