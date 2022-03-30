package January.Stop_gninnipS_My_sdroW;

public class SpinWords {

    public String spinWords(String sentence) {
        String[] newTable = sentence.split(" ");
        StringBuilder endstringbuilder = new StringBuilder();
        int counter =0;
        for (String e:newTable) {
            counter ++;
            if(e.length() >4){
                StringBuilder newstringbuilder = new StringBuilder();
                newstringbuilder.append(e);
                newstringbuilder.reverse();
                endstringbuilder.append(newstringbuilder.toString());
            }else{
                endstringbuilder.append(e);
            }
            if(newTable.length == 1 || counter == newTable.length){

            }else{
                endstringbuilder.append(" ");
            }}
        return endstringbuilder.toString();
    }
}
