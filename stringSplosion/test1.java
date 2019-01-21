class Test1{
  public static void main(String args[]){
    System.out.println(stringSplosion("Code"));
  }
  public static String stringSplosion(String str) {
    String str_array[] = str.split("");
    String result = "";

    for(int i = 0; i < str_array.length; i++){
      for(int j = 0; j < str_array.length; j++){
        result = result.concat(str_array[j]);
        if(i == j){
          break;
        }
      }
    }
    return result;
  }
}
