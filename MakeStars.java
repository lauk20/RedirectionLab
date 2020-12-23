import java.util.*;

public class MakeStars{
  public static void main(String[] args){
    Scanner file = new Scanner(System.in);
    String result = "";

    while (file.hasNextLine()){
      String line = file.nextLine();
      Scanner text = new Scanner(line);
      while (text.hasNext()){
        String next = text.next();

        for (int i = 0; i < next.length(); i++){
          result = result + "*";
        }

        result = result + " ";
      }

      if (file.hasNextLine()){
        result = result + "\n";
      }
    }

    System.out.println(result);
  }
}
