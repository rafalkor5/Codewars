package January.Scramblies;

public class Scrambilies2 {
    public static boolean scramble(String str1, String str2) {
        if(str2.length()>str1.length()) return false;
        for (String e:str2.split("")){
            if(!str1.contains(e))return false;
            str1 = str1.replaceFirst(e,"");
        }
        return true;
    }}
