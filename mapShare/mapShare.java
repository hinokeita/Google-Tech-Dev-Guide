import java.util.HashMap;
import java.util.Map;

class Test1{
  public static void main(String args[]){
    Map<String,String> map = new HashMap<String,String>();
    map.put("a","aaa");
    map.put("b","bbb");
    System.out.println(mapShare(map));
  }

  public static Map<String, String> mapShare(Map<String, String> map) {
    // mapにkey[a]が含まれていたら、key[b]にkey[a]のvalueを格納する
    if(map.containsKey("a")){
      map.put("b",map.get("a"));
    }
    // mapに含まれる、key[c]を削除
    map.remove("c");
    return map;
  }
}
