import java.util.HashMap;
import java.util.Map;

class Test1{
  public static void main(String args[]){
    System.out.println(word0(new String[]{"a","b"}));
  }
  public static Map<String, Integer> word0(String[] strings) {
    Map<String,Integer> map = new HashMap<String,Integer>();

    for(int i = 0; i < strings.length; i++){
      map.put(strings[i],0);
    }
    return map;
  }
}
