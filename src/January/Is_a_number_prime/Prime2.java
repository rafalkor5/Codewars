package January.Is_a_number_prime;

public class Prime2 {
    public static boolean isPrime(int num) {
        if(num == 2) return true;
        if(num <2 || num%2 == 0) return false;
        for (int i = 3; i <(int)Math.sqrt(num)+1 ; i++) if(num%i == 0) return false;
        return true;
    }
}
