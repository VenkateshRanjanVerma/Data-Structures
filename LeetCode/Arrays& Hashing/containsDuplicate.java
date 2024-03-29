class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                int val = hm.get(nums[i]);
                val++;
                hm.put(nums[i],val);
            }
            else{
                hm.put(nums[i],1);
            }          
        }


        for(int key:hm.keySet())
        {
            Integer val = hm.get(key);
            if(val>1)
            {
                return true;
            }
        }
        return false;
        
    }
}