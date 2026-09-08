class Solution {
    public int countCommas(int n) {
        int comma=0;
        int original=n;
        if(n<1000){
            return 0;
        }
        else{
            comma=n-1000+1;
        }
        return comma;
        
    }

}

// else{
//     int i=1000;
//     while(i<n){
//         count++;
//         i++;
//     }
//     return count;
// }