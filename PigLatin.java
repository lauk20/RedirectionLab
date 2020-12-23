public class PigLatin{
  public static String pigLatinSimple(String s){
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
}
