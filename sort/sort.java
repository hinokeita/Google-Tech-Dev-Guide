import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Test1{
  public static void main(String args[]){
    int buf[] = sort(new int[]{1, 1, 1, 2, 1});
    for(int i = 0;i < buf.length; i++){
      System.out.println(buf[i]);
    }
  }

  public static int[] sort(int[] a) {
    List<Integer> ptn = new ArrayList<Integer>();

    for(int i = 0;i < a.length; i++){
      if(ptn.contains(a[i])){
      }else{
        ptn.add(a[i]);
      }
    }
    int[] buf = new int[ptn.size()];
    for(int i = 0; i < ptn.size(); i++){
      buf[i] = ptn.get(i);
    }
    return buf;
  }
}
