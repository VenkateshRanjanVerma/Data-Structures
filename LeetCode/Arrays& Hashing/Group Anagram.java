class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       HashMap<HashMap<Character,Integer>, ArrayList<String>> bmap = new HashMap<>(); //watch pepcoding video to revise

       for(String str:strs){                                        // creating frequency map for each string str
           HashMap<Character,Integer> fmap = new HashMap<>();  
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(fmap.containsKey(ch)){
                    int val=fmap.get(ch);
                    val++;
                    fmap.put(ch,val);
                }
                else{
                    fmap.put(ch,1);
                }
            }

            if(bmap.containsKey(fmap)==false)                      // checking in big map, whether that str's fmap is there in bigmap 
            {                                                      // if not, then create new array list and add that sting
                ArrayList<String> li=new ArrayList<>();
                li.add(str);
                bmap.put(fmap,li);
            }
            else{
                ArrayList<String> li = bmap.get(fmap);
                li.add(str);
            }
       }


       List<List<String>> ans= new ArrayList<>();

       for(ArrayList<String> val:bmap.values())
       {
           ans.add(val);
       }

       return ans;

    }

}