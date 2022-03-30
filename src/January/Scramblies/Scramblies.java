package January.Scramblies;

import java.util.ArrayList;
import java.util.List;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        char[] str1char = str1.toCharArray();
        char[] str2char = str2.toCharArray();
        List<Character> str1list = new ArrayList<>();
        List<Character> str2list = new ArrayList<>();
        for (char e: str1char) {
            str1list.add(Character.valueOf(e));
        }
        for (char e: str2char) {
            str2list.add(Character.valueOf(e));
        }
        int counter = 0;
        for (Character e: str2list) {
            for (Character x: str1list) {
                if(e.equals(x)){
                    str1list.remove(e);
                    counter ++;
                    break;
                }
            }
        }
        return (counter == str2list.size()) ? true : false;
    }
}
