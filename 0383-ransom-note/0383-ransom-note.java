class Solution {
    public boolean canConstruct(String A, String B) {
        HashMap<Character,Integer> s1=new HashMap<>();
        HashMap<Character,Integer> s2=new HashMap<>();
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(s1.containsKey(ch)){
                int freq=s1.get(ch);
                s1.put(ch,freq+1);
            }
            else{
                s1.put(ch,1);
            }
        }
        for(int i=0;i<B.length();i++){
            char ch=B.charAt(i);
            if(s2.containsKey(ch)){
                int freq=s2.get(ch);
                s2.put(ch,freq+1);
            }
            else{
                s2.put(ch,1);
            }
        }
        //checking comparing two maps
        for(char ele:s1.keySet()){
            if(!s2.containsKey(ele) || s2.get(ele)<s1.get(ele)){
                return false;
            }
        }
        return true;


    }
}