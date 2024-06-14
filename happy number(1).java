//Happy Number
//example 19-->1^2+9^2=82-->8^2+2^2--->68-->6^2+8^2-->100>1^2---1
//final number need to be 1.
class Solution {
    public boolean isHappy(int n1) {
        long n=n1;
        Set<Long> si=new HashSet<>();
        si.add(n);
        while(true){
            long a=0;
            while(n!=0){
                int d=(int)n%10;
                a+=d*d;
                n=n/10;
            }
            if(a==1) return true;
            if(!si.add(a)) return false;
            n=a;
        }
    }
}
