import java.util.HashMap;
import java.util.Map;

class Test1{
  public static void main(String args[]){
    System.out.println(blackjack(19,21));
  }
  public static int blackjack(int a, int b) {
    int threshold = 21;
    int temp_a = 0;
    int temp_b = 0;
    if(a > threshold && b > threshold){
      return 0;
    }else if(a > threshold){
      return b;
    }else if(b > threshold){
      return a;
    }

    if(a < threshold){
      temp_a = threshold - a;
    }else if(a > threshold){
      temp_a = a - threshold;
    }else{
      temp_a = 0;
    }

    if(b < threshold){
      temp_b = threshold - b;
    }else if(b > threshold){
      temp_b = b - threshold;
    }else{
      temp_b = 0;
    }

    if(temp_a < temp_b){
      return a;
    }else{
      return b;
    }

  }

}
