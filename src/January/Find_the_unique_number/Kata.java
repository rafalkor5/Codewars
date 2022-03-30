package January.Find_the_unique_number;

public class Kata {
    public static double findUniq(double arr[]) {
        //int counter = 0;
        double ret =0;
        for (double e: arr) {
            int counter = 0;
            for (double x: arr) {
                if(counter > 1) break;
                if(e == x)counter++;
            }
            if(counter == 1){
                ret =e;
                break;
            }
        }
        return ret;
    }}
