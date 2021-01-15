package Solutions;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class Problem014e implements Problem {
  @Override
  public void runProblem(String[] args) {
    int x = Integer.parseInt(args[0]), n;

    ArrayList<Integer> ans = new ArrayList<Integer>();
    Random generator = new Random();

    int[] ints = IntStream.range(0, x).toArray();

    System.out.println("Generating Random Numbers:");

    while (notFull(ints, ans)) {
      n = generator.nextInt(x);
      ans.add(n);
      System.out.print(n);
      System.out.print(' ');
    }

    System.out.println(
        "\nI had to generate "
            + ans.size()
            + " random numbers between 0 and "
            + (x - 1)
            + " to have produced all such numbers at least once.");
  }

  private Boolean notFull(int[] ints, ArrayList<Integer> ans) {
    for (int i : ints) {
      if (!ans.contains(i)) {
        return true;
      }
    }
    return false;
  }
}
