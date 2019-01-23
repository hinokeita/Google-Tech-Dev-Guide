class Test1{
  public static void main(String args[]){
    // 動作確認用
    System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
  }
  public static boolean canBalance(int[] nums) {
    int left_sum = 0;
    int right_sum = 0;

    for(int i = 0; i < nums.length ;i++){
      left_sum = left_sum + nums[i];
      right_sum = 0;
      for(int j = i + 1; j < nums.length; j++){
        right_sum = right_sum + nums[j];
      }
      if(left_sum == right_sum){
        return true;
      }
    }
    return false;
  }
}
