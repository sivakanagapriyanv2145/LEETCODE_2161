class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i,j=0;
        int values[]=new int[nums.length];
        for(i=0;i<nums.length;i++){
            if(pivot>nums[i]){
                values[j++]=nums[i];
            }
        }
        for(i=0;i<nums.length;i++){
            if(pivot==nums[i]){
                values[j++]=nums[i];
            }
        }
        for(i=0;i<nums.length;i++){
            if(pivot<nums[i]){
                values[j++]=nums[i];
            }
        }
        return values;
        
    }
}
