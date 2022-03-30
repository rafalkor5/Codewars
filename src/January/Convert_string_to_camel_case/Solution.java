package January.Convert_string_to_camel_case;

import java.lang.StringBuilder;

class Solution{

    static String toCamelCase(String s){
        char[] listaznakow = s.toCharArray();
        StringBuilder newstring = new StringBuilder();
        boolean check = false;
        for(int i =0; i< listaznakow.length; i++){
            if (Character.valueOf(listaznakow[i]) == '-' || Character.valueOf(listaznakow[i]) == '_'){
                check = true;
            }else{
                if(check == true){
                    newstring.append(String.valueOf(listaznakow[i]).toUpperCase().charAt(0));
                    check = false;
                }else{
                    newstring.append(listaznakow[i]);
                }}

        }
        return newstring.toString();
    }
}
