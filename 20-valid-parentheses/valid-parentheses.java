// class Solution {
//     public boolean isValid(String s) {
//         int n=s.length();
//         if(n%2!=0){
//             return false;
//         }
//         int depth1=0;
//         int depth2=0;
//         int depth3=0;
//         boolean flag=true;
//         boolean flag1=true;
//         for(int i=0;i<n;i++){
//             if(i%2==0 && i<n){
//                 if(s.charAt(i)=='(' && s.charAt(i+1)!=')' 
//                 || s.charAt(i)=='{' && s.charAt(i+1)!='}'
//                 || s.charAt(i)=='[' && s.charAt(i+1)!=']'
//                 ){
//                     flag=false;
//                 }

//                 if(s.charAt(i)=='('){
//                     depth1++;
//                 }
//                 if(s.charAt(i)=='{'){
//                     depth2++;
//                 }
//                 if(s.charAt(i)=='['){
//                     depth3++;
//                 }
//                 if(s.charAt(i)==')'){
//                     depth1--;
//                 }
//                 if(s.charAt(i)=='}'){
//                     depth2--;
//                 }
//                 if(s.charAt(i)==']'){
//                     depth3--;
//                 }
//             }
//         }
//         boolean flag3=true;
//         if(depth1>0 && depth2>0 && depth3>0){
//             flag1=false;
//         }
//         if(flag==false && flag1==true){
//             flag3=true;
//         }
//         if(flag=false && depth1>0 || depth2>0 || depth3>0){
//             flag3=false;
//         }
        
//         return flag3;
//     }
// }



class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 != 0) {
            return false; // odd length can never be valid
        }

        // Brute force: keep removing valid pairs until no more exist
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }

        // After removing all valid pairs, check remaining characters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // If any character remains, it's invalid
            if (ch == '(' || ch == ')' || ch == '{' || ch == '}' || ch == '[' || ch == ']') {
                return false;
            }
        }

        return true; // string is empty, all characters matched
    }
}
