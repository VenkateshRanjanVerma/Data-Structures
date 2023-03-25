class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr=new int[2];
        
        HashMap<Integer,Integer> hm=new HashMap<>();
         for(int i=0;i<nums.length;i++)
        {
   
           if(hm.containsKey(target-nums[i])){
               arr[0]=i;
               arr[1]=hm.get(target-nums[i]);
                break;
           }    

            hm.put(nums[i],i);      

        }
        return arr;


    }
}



//solution2


class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }
}
