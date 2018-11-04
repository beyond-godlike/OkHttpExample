import util.OkHttpUtil;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        OkHttpUtil util = new OkHttpUtil();

        // to get a readme of my friend`s project
        String response = util.run("https://raw.github.com/Ice-crusher/MyGmail/master/README.md");
        System.out.println(response);

        // to post json to a server
        String json = util.bowlingJson("Mary", "Katy");
        String resp = util.post("http://www.roundsapp.com/post", json);
        System.out.println(resp);
    }
}
