package Solutions;

import java.util.ArrayList;
import java.util.Collections;

public class Problemf79b implements Problem {
  private Boolean isPalindrome(long n) {
    // way overcomplicated, should've just made a string, checked against reversed
    // ints.
    ArrayList<Integer> digits = new ArrayList<Integer>();
    int quot, rem, size;

    while (n != 0) {
      quot = (int) (n / 10);
      rem = (int) (n % 10);
      digits.add(rem);
      n = quot;
    }

    size = digits.size();

    for (int i = 0; i < (size / 2); i++){
      if (digits.get(i) != digits.get(size - i - 1)){
        return false;
      }
    }
    return true;
  }

  @Override
  public void runProblem(String[] args) {
    for (long n = 0; n < 1500; n++) {
      if (isPalindrome(n)) {
        System.out.println(Long.toString(n) + " cubed is " + Long.toString(n * n * n));
      }
    }
  }
}
