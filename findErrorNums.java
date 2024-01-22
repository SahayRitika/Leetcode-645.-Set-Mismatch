class Solution {
    public int frq(int i,int[] nums){
        int c=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==i){
                c++;
            }
        }
        return(c);
    }
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int res[]=new int[2];
        for(int i=1;i<=n;i++){
            if(frq(i,nums)==2){
                res[0]=i;
            }
            if(frq(i,nums)==0){
                res[1]=i;
            }
        }
        return res;
    }
}
