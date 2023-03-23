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



class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) return res;
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] hash = new int[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = new String(Arrays.toString(hash));
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}