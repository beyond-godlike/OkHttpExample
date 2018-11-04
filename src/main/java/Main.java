import util.OkHttpUtil;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // to gen a readme of my friend`s project
        OkHttpUtil get = new OkHttpUtil();
        String response = get.run("https://raw.github.com/Ice-crusher/MyGmail/master/README.md");
        System.out.println(response);

        // to post json to a server
        OkHttpUtil send = new OkHttpUtil();
        String json = send.bowlingJson("Mary", "Katy");
        String resp = send.post("http://www.roundsapp.com/post", json);
        System.out.println(resp);
    }
}
