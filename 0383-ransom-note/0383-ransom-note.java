class Solution {
    public boolean canConstruct(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();
        char[] c = b.toCharArray(); 
        for(int i = 0;i<n1;i++){
            boolean found = false;
            for(int j = 0;j<n2;j++){
                if(c[j]==a.charAt(i)){
                    c[j]='#';
                    found = true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;

        
    }
}