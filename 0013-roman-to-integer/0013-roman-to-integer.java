class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> s1=new HashMap<>();
        s1.put('I',1); s1.put('V',5);
        s1.put('X',10); s1.put('L',50);
        s1.put('C',100); s1.put('D',500);
        s1.put('M',1000);

        


        // char[] s2=new char[s.length()];
        // s2=s.toCharArray();
        int sum=0;

        for(int i=0;i<s.length();i++){
            int value=s1.get(s.charAt(i));
           // check if next character has larger value
            if(i+1<s.length() && value<s1.get(s.charAt(i+1)) ){
                sum=sum-value;
            }
            else{
                sum+=value;
            }


                // if(s2[i]==s1.get(s2[i])){
                //     sum=sum+s1.get(s2[i]);
                // }
            
        }

    return sum;

       } 


}