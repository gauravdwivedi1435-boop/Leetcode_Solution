class Solution {
    public int numJewelsInStones(String jew, String st) {
        HashMap<Character,Integer> arr=new HashMap<>();
        int count=0;
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(arr.containsKey(ch)){
                int freq=arr.get(ch);
                arr.put(ch,freq+1);
            }
            else{
                arr.put(ch,1);
            }
        }
        for(int i=0;i<jew.length();i++){
            char ch=jew.charAt(i);
            if(arr.containsKey(ch)){
                count=count+arr.get(ch);
            }
        }
        return count;
    }
}