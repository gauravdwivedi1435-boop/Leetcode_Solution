class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int x=n;
        int t=10;
        int alice=0;
        int bob=0;
        while(x>=t){
            if(alice==bob){
                alice++;
                x=x-t;
                t--;
            }
            else if(bob<alice){
                bob++;
                x=x-t;
                t--;

            }
        }
       
        if(alice>bob){
            return true;
        }
        return false;
        
    }
}