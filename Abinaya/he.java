import java.util.Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        
        HashSet<Integer> res=new HashSet<>();
       
        for(int num:nums){
            res.add(num);
        }

        int[] arr=new int[res.size()];
        int index=0;
        for(int num:res){
            arr[index++]=num;
        }

        Arrays.sort(arr);
        if(nums.length<3){
            return arr[arr.length-1];
        }

        return arr[arr.length-3];
    }
}