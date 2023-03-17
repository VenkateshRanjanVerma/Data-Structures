class Solution {
    public boolean isAnagram(String s, String t) {
        //corner case
        if(s.length()!=t.length())
        {
            return false;
        }

        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(hm.containsKey(ch))
            {
                int val = hm.get(ch);
                val++;
                hm.put(ch,val);
            }
            else{
                hm.put(ch,1);
            }
        }

         HashMap<Character,Integer> hm1 = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch1= t.charAt(i);
            if(hm1.containsKey(ch1))
            {
                int val1 = hm1.get(ch1);
                val1++;
                hm1.put(ch1,val1);
            }
            else{
                hm1.put(ch1,1);
            }
        }

        // for(Character key:hm.keySet()){
        //     int val=hm.get(key);
        //         int val1=hm1.get(key);
        //         System.out.print(key+"->"+val+"->"+val1);
        // }


    //checking
    
        int counter=0,overall=0;

        for(Character key:hm.keySet()){
            overall++;
           // int val=hm.get(key);

            if(hm1.containsKey(key))  //first check whether the key is available in the 2nd hm
            {
              int val=hm.get(key);
                int val1=hm1.get(key);
                if(val==val1){
                  counter++;
            }        
        }
        }
        if(overall==counter){
           return true;
        }
        else{
            return false;
        }
       
        
    }
}