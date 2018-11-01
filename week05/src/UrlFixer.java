import java.lang.String;

public class UrlFixer {

    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        System.out.println(ProblemSolved1(url));
        System.out.println(ProblemSolved2(url));
    }

    public static String ProblemSolved1(String  oldurl){
        String newurl;
        newurl = oldurl.replace("bots", "odds");
        newurl = newurl.replace("https/", "https:/");
        return newurl;
    }

    public static String ProblemSolved2(String oldurl){
        String substring1 = oldurl.substring(0, 5);
        String substring2 = oldurl.substring(5, 38);
        String substring3 = oldurl.substring((41));
        String newurl = substring1 + ":" + substring2 + "odd" + substring3;
        return newurl;
    }
}
