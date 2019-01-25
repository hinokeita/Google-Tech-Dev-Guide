import java.util.HashMap;
import java.util.Map;

class Test1{
  public static void main(String args[]){
    System.out.println(encoder(new String[]{"a","a"}, new String[]{"1","2","3","4"}));
  }
  public static String[] encoder(String[] raw, String[] code_words) {
    Map<String,String> map = new HashMap<String,String>();
    int count = 0;
    String result[] = new String[raw.length];
    for(int i = 0;i < raw.length; i++){
      if(map.containsKey(raw[i])){
        result[i] = map.get(raw[i]);
      }else{
        result[i] = code_words[i];
        map.put(raw[i],code_words[count]);
        count++;
      }
    }
    System.out.println(result[0]);
    return result;
  }
}
