class Test1{
  public static void main(String args[]){
    System.out.println(sumNumbers("abc123xyz"));
    System.out.println(sumNumbers("aa11b33"));
    System.out.println(sumNumbers("7 11"));
    System.out.println(sumNumbers("Chocolate"));
  }
  public static int sumNumbers(String str) {
    // 数字以外をすべて半角スペースに変換
    String buf = str.replaceAll("[^0-9]", " ");
    String list[] = buf.split(" ");
    int sum = 0;

    // スペースで区切って合計を算出
    for(int i = 0; i < list.length; i++){
      if (!(list[i].isEmpty())){
        sum = sum + Integer.parseInt(list[i]);
      }
    }
    return sum;
  }
}
