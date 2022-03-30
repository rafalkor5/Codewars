package January.Your_order_please;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Order {
    public static String order(String words) {
        List<String> singlewords = new ArrayList<>();
        Collections.addAll(singlewords, words.split(" "));
        singlewords.remove("");
        singlewords.remove(" ");
        List<String> newlist = new ArrayList<>();
        for (int i = 0; i < singlewords.size(); i++) {
            newlist.add("");
        }
        Function<String,Integer> mapper = x ->{
            for (String e:x.split("")) {
                try {
                    if(Integer.parseInt(e) < 10 && Integer.parseInt(e) > 0 ){
                        newlist.set(Integer.parseInt(e)-1,x);
                        return 0;
                    }
                } catch (NumberFormatException ex) {
                }
            }
            return 0;
        };
        singlewords.stream().map(mapper).collect(Collectors.toList());
        StringBuilder newword = new StringBuilder();
        for (String e: newlist) {
            newword.append(e);
            if(e != newlist.get(newlist.size()-1)) newword.append(" ");
        }
        return newword.toString();
    }
}

