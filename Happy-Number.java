class Solution {
    public boolean isHappy(int n) {
        return findsum(n);

    }
    public boolean findsum(int n){
        int arr[]=new int[10];
        int i=0;
        while(n>0){
            
            arr[i]=n%10;
            n=n/10;
            i++;
        }
        int sum=0;
        for(int j=0;j<i;j++){
            sum=sum+(arr[j]*arr[j]);
        }
        if (sum == 1) return true;
        if (sum == 4) return false;
        return findsum(sum);
        
    }
}
