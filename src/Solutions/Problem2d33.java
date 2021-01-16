package Solutions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class Problem2d33 implements Problem {
  @Override
  public void runProblem(String[] args) {

    //not working atm

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayDeque<String> lines = new ArrayDeque<String>();
    String line;
    try{
      line = br.readLine();
      while (line != null){
        lines.push(line);
        line = br.readLine();
      }
    }
    catch(IOException e){
      System.out.println(e);
    }
    System.out.println("\nLines written in reverse:");
    for (String storedline : lines){
      System.out.println(storedline);
    }
  }
}
