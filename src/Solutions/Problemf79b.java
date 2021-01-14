package Solutions;
import java.util.ArrayList;
import java.util.Collections;

public class Problemf79b extends Problem {

    public Boolean isPalindrome(long n){
        //way overcomplicated, should've just made a string, checked against reversed, ew casts to ints.
        ArrayList<Integer> digits = new ArrayList<Integer>();
        int quot, rem;

        while (n != 0){
            quot = (int) (n / 10);
            rem = (int) (n % 10);
            digits.add(rem);
            n = quot;
        }
        return digits.equals(reverselist(digits));
    }

    private <t> ArrayList<t> reverselist(ArrayList<t> list){
        ArrayList<t> revlist = new ArrayList<t>();
        for (int i = list.size() - 1; i >= 0; i--){
            revlist.add(list.get(i));
        }
        return revlist;
    }

    @Override
    public void runProblem(String[] args) {
        for (long n = 0; n < 1500; n++){
            if (isPalindrome(n)){
                System.out.println(Long.toString(n) + " cubed is " + Long.toString(n * n * n));
            }
        }
    }
}
