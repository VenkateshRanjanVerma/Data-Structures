class Solution {
    public int[] topKFrequent(int[] nums, int k) {


       if(k==1)
        if(nums.length == k)
        {
            return nums;
        }

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))
            {
                int val=hm.get(nums[i]);
                val++;
                hm.put(nums[i],val);
            }
            else{
                hm.put(nums[i],1);
            }
        }
      
      int i=0;
       PriorityQueue<Integer> pq= new PriorityQueue<>();
       for(Integer key:hm.keySet())
       {
           int val=hm.get(key);
           if(i<k)
           {
            pq.add(hm.)
           }

       }


        //  int[] arr=new int[count];
        //  int p=0;
        //    for(Integer key:hm.keySet()){
        //     int val=hm.get(key);
        //     if(val>=k)
        //     {
        //       arr[p]=key; 
        //     }
           
        //    p++;
        // }
        
        return arr;
    }
}