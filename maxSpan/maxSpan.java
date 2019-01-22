class Test1{
  public static void main(String args[]){
    int nums[] = {1,2,1,1,3};
    System.out.println(maxSpan(nums));
    int nums2[] = {3,3,3};
    System.out.println(maxSpan(nums2));
    int nums3[] = {};
    System.out.println(maxSpan(nums3));
  }

  public static int maxSpan(int[] nums) {
    int max = 1;
    if(nums.length == 0){
      return 0;
    }
    for(int i = 0;i < nums.length; i++){
      for(int j = i + 1; j < nums.length; j++){
        if(nums[i] == nums[j] && max < j - i + 1){
          max = j - i + 1;
        }
      }
    }
    return max;
  }
}
