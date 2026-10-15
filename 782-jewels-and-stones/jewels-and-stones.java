class Solution {
    public int numJewelsInStones(String jew, String st) {
        int count=0;
        for(int i=0;i<jew.length();i++){
            for(int j=0;j<st.length();j++){
                if(jew.charAt(i)==st.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}