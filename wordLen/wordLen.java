import java.util.HashMap;
import java.util.Map;

class Test1{
  public static void main(String args[]){
    System.out.println(wordLen(new String[]{"a","b","abc"}));
  }

  public static Map<String, Integer> wordLen(String[] strings) {
    Map<String,Integer> map = new HashMap<String,Integer>();

    for(int i = 0; i < strings.length; i++){
      map.put(strings[i],strings[i].length());
    }
    return map;
  }
}
