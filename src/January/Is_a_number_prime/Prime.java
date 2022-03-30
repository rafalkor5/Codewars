package January.Is_a_number_prime;

public class Prime {
    public static boolean isPrime(int num) {
        if(num == 2) return true;
        if(num <2 || num%2 == 0) return false;
        boolean ret = true;
        for (int i = 3; i <(int)Math.sqrt(num)+1 ; i++) {
            if(num%i == 0){
                ret = false;
                break;
            }
        }
        return (!ret) ?  false : true;
    }
}
