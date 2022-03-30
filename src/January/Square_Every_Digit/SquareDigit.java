package January.Square_Every_Digit;

public class SquareDigit {

    public int squareDigits(int n) {
        StringBuilder newstringbuilder = new StringBuilder();
        char[] newchartable = String.valueOf(n).toCharArray();
        for (char e: newchartable) {
            int x = (int)Math.pow(Integer.parseInt(String.valueOf(e)),2);
            newstringbuilder.append(x);
        }
        return Integer.valueOf(newstringbuilder.toString());
    }

}
