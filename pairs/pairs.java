import java.util.HashMap;
import java.util.Map;

class Test1{
  public static void main(String args[]){
    System.out.println(pairs(new String[]{"code","bug"}));
  }
  public static Map<String, String> pairs(String[] strings) {
    Map<String,String> map = new HashMap<String,String>();
    String first;
    String last;
    for(int i = 0; i < strings.length; i++){
      first = String.valueOf(strings[i].charAt(0));
      last = String.valueOf(strings[i].charAt(strings[i].length() - 1));
      map.put(first,last);
    }
    return map;
  }
}
