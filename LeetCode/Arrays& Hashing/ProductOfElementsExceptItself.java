class Solution {
    public int[] productExceptSelf(int[] nums) {

     int[] res = new int[nums.length];
     int pro=1;
      for(int i=0; i<nums.length; i++)
      {
          res[i]=pro;
          pro*=nums[i];
      }
      
      pro=1;
      for(int i=nums.length-1;i>=0;i--){
          res[i]*=pro;
          pro*=nums[i];
      }

      return res;
    }
}


//solution 2

class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }

    public int[] productExceptSelfNumsAsPrefix(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;

        for (int i = 0; i < nums.length - 1; i++) output[i + 1] =
            output[i] * nums[i];

        for (int i = nums.length - 2; i >= 0; i--) {
            output[i] = nums[i + 1] * output[i];
            nums[i] = nums[i] * nums[i + 1];
        }
        return output;
    }
}