package January.Odd_or_Even;

public class Codewars {
    public static String oddOrEven (int[] array) {
        int sum =0;
        for (int e: array){
            sum += e;
        }
        if(sum%2 == 0){
            return "even";
        }else{
            return "odd";
        }
    }
}