class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> set1=new HashMap<>();
        int n=s.length();
        for(int i=0;i<=n;i++){
            if(i<n){
                if(set1.containsKey(s.charAt(i))){
                    int freq=set1.get(s.charAt(i));
                    set1.put(s.charAt(i),freq+1);
                }else{
                    set1.put(s.charAt(i),1);
                }
            }
            if(set1.containsKey(t.charAt(i))){
                    int freq=set1.get(t.charAt(i));
                    set1.put(t.charAt(i),freq+1);
                }else{
                    set1.put(t.charAt(i),1);
                }
            
        }
        for(char ele:set1.keySet()){
            int freq=set1.get(ele);
            if(freq%2!=0){
                return ele;
            }
        }
        return ' ';
    }
}