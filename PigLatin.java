import java.util.*;

public class PigLatin{
  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    String holder = "";

    if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
      holder =  s + "hay";
    }
    else{
      for (int i = 0; i < s.length(); i++){
        if (i != 0){
          holder = holder + s.charAt(i);
        }
      }

      holder = holder + s.charAt(0) + "ay";
    }

    return holder;
  }

  public static String pigLatin(String s){
    s = s.toLowerCase();
    String[] digraphs = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    String result = "";

    if (s.length() >= 2){
      for (int i = 0; i < digraphs.length; i++){
        if (s.substring(0, 2).equals(digraphs[i])){
          for (int j = 0; j < s.length(); j++){
            if (j != 0 && j != 1){
              result = result + s.charAt(j);
            }
          }
          return result + s.substring(0, 2) + "ay";
        }
      }
    }

    return pigLatinSimple(s);
  }

  public static String pigLatinBest(String s){
    s = s.toLowerCase();

    if (s.length() >= 1){
      if (s.charAt(0) < 'a' || s.charAt(0) > 'z'){
        return s;
      }
      else{
        if ((s.charAt(s.length() - 1) < 'a' || s.charAt(s.length() - 1) > 'z') && (s.charAt(s.length() - 1) < '0' || s.charAt(s.length() - 1) > '9')){
          return pigLatin(s.substring(0, s.length() - 1)) + s.charAt(s.length() - 1);
        }
      }
    }

    return pigLatin(s);
  }

  public static void main(String[] args){
    Scanner file = new Scanner(System.in);

    while (file.hasNextLine()){
      String line = file.nextLine();
      Scanner text = new Scanner(line);

      while(text.hasNext()){
        String next = text.next();
        System.out.print(pigLatinBest(next));
        if (text.hasNext()){
          System.out.print(" ");
        }
      }

      if (file.hasNextLine()){
        System.out.println();
      }
    }
  }
}
