class Solution {
    public int[] topKFrequent(int[] nums, int k) {

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

     // Pair <Integer,Integer> pair = new Pair<>(Integer key, Integer value)
       
        PriorityQueue<Pair<Integer,Integer>> pq= new PriorityQueue<>(Comparator.comparing(Pair ::getValue ));

       for(Integer key:hm.keySet())
       {
           int val=hm.get(key);
           if(i<k)
           {
            pq.add(new Pair<>(key,val));
           }
           else if(val>pq.peek().getValue())
           {
               pq.remove();
               pq.add(new Pair<>(key,val));
               
           }
           i++;
       }

       int[] ans=new int[k];
       
       int j=0;
       while(pq.size()>0)
       {
        Pair p = pq.remove();
        ans[j]=(int)p.getKey();
        j++;
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
        
        return ans;
    }
}