//Happy number
//using slow & fast to find a cycle
class Solution {
    public static int cal(int n){
        int a=0;
        while(n!=0){
                int d=(int)n%10;
                a+=d*d;
                n=n/10;
            }
        return a;
    }
    public boolean isHappy(int n) {
        int slow=cal(n);
        int fast=cal(cal(n));
        while(fast!=1){
            slow=cal(slow);
            fast=cal(cal(fast));
            if(slow==fast) return false;
        }
        return true;
    }
}
