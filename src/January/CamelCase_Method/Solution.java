package January.CamelCase_Method;

public class Solution {

    public static String camelCase(String str) {
        StringBuilder newstr = new StringBuilder();
        for (String e: str.split(" ")) {
            if(e.equals(" ") || e.equals("")){
            }else{
                char[] x = e.toCharArray();
                x[0] = Character.toUpperCase(x[0]);
                newstr.append(String.copyValueOf(x));
            }}
        return newstr.toString();
    }

}
