package Solutions;

public class Problemf7c3 implements Problem {
  // Only done for lower case characters
  @Override
  public void runProblem(String[] args) {
    System.out.println(
        args[0]
          .toLowerCase()
          .replaceAll("( |^)[b-df-hj-np-tv-z](\\w+)", "$1$2ay")
          .replaceAll("( |^)[a|e|i|o|u](\\w+)","$1$2way"));
  }
}
