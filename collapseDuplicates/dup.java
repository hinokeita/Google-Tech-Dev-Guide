import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

class Test1{
  public static void main(String args[]){
    System.out.println(collapseDuplicates("aabc"));
  }
  public static String collapseDuplicates(String a) {
    int i = 0;
    String result = "";
    while (i < a.length()) {
      char ch = a.charAt(i);
      if (!result.endsWith(String.valueOf(ch)))
        result += ch;
      i++;
    }
    return result;
  }
}
