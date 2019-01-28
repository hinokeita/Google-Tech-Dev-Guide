import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class Test1{
  public static void main(String args[]){
    System.out.println(evenlySpaced(2,4,6));
  }
  public static boolean evenlySpaced(int a, int b, int c) {
    int[] numbers = {a,b,c};
    Arrays.sort(numbers);
    if(numbers[2] - numbers[1] == numbers[1] - numbers[0]){
      return true;
    }else{
      return false;
    }
  }
}
