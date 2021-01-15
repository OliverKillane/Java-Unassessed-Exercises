package Solutions;

public class Problem98e3 implements Problem {
  private int next(int x) {
    return x % 2 == 0 ? x / 2 : 3 * x + 1;
  }

  @Override
  public void runProblem(String[] args) {
    int current = Integer.parseInt(args[0]);

    do {
      System.out.print(current);
      System.out.print(' ');
      current = next(current);
    } while (current != 1);
    System.out.print(1);
  }
}
