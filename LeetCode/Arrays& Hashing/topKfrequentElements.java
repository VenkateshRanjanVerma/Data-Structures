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


class Solution3 {
    /**
    * Time Complexity: O(n)
    * Space Complexity: O(n)
    */
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> count = new HashMap<>();
       List<Integer> bucket[] = new ArrayList[nums.length + 1];                
       
       for (int num : nums)
           count.merge(num, 1, Integer::sum);
       
       for (int key : count.keySet()){
           int freq = count.get(key);
           if (bucket[freq] == null)
               bucket[freq] = new ArrayList<>();
           bucket[freq].add(key);
       }
       
       int index = 0;
       int[] res = new int[k];
       for (int i = nums.length; i >= 0; i--)
           if (bucket[i] != null)
               for (int val : bucket[i]){
                   res[index++] = val;
                   if(index == k)
                       return res;
               }
       return res;
   }