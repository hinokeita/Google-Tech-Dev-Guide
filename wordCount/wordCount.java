import java.util.HashMap;
import java.util.Map;

class Test1{
  public static void main(String args[]){
    System.out.println(wordCount(new String[]{"a","b","a","c","d"}));
    System.out.println(wordCount(new String[]{"c","c","c","c"}));
  }
  public static Map<String, Integer> wordCount(String[] strings) {
    Map<String,Integer> map = new HashMap<String,Integer>();
    Integer count;
    for(int i = 0; i < strings.length; i++){
      if(map.containsKey(strings[i])){
        count = map.get(strings[i]) + 1;
        map.put(strings[i],count);
      }else{
        map.put(strings[i],1);
      }
    }
    return map;
  }
}
