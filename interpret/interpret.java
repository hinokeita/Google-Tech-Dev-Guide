import java.util.HashMap;
import java.util.Map;

class Test1{
  public static void main(String args[]){
    System.out.println(interpret(3,new String[]{"+","-"},new int[]{3,1}));
    System.out.println(interpret(1,new String[]{"+","*"},new int[]{1,3}));
  }
  public static int interpret(int value, String[] commands, int[] args) {

    for(int i = 0;i < commands.length;i++){
      switch(commands[i]) {
        case "+":
          value = value + args[i];
          break;
        case "-":
          value = value - args[i];
          break;
        case "*":
          value = value * args[i];
          break;
        case "/":
          value = value / args[i];
          break;
        case "?":
          return -1;
      }
    }
    return value;
  }
}
