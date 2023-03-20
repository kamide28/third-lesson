import java.util.HashMap;
import java.util.Map;

public class Song {
    public static void main(String[] args) {
        Map<String, String> MaiSong = new HashMap<>();
        MaiSong.put("6th", "ガールズルール");
        MaiSong.put("20th", "シンクロニシティ");
        MaiSong.put("25th", "しあわせの保護色");

        System.out.println("白石麻衣単独センターは" + MaiSong.size() + "曲です。");
        for (Map.Entry<String, String> entry : MaiSong.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

