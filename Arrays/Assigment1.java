package Arrays;

import java.util.HashSet;

public class Assigment1 {
    public static boolean isRepite(int nums[]){
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(hs.contains(nums[i])){
                return true;
            }else{
                hs.add(nums[i]);
            }
        }

        return false;
    }
    public static int ispresent(int nums[],int target){

        return 1;
    }

    public static int maxprofit(int price[]){
        int low = price[0];
        int profit = 0;

        for(int i=1; i<price.length; i++){
            if(price[i] > low){
                profit = Math.max(profit, price[i]-low);
            }
            else{
                low = price[i];
            }
        }

        return profit;
    }
    public static int calrainheight(int height[]){
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        left[0] = height[0];
        for(int i=1; i<height.length; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }
        right[height.length-1] =height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        } 
        int ans = 0;
        for(int i=0; i<height.length; i++){
            ans += Math.min(left[i], right[i]) - height[i];
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int price[] = {7,6,4,3,1};
        int height[] = {4,2,0,3,2,5};
        // System.err.println(isRepite(nums));
        // System.err.println(ispresent(nums,0));
        // System.out.println(maxprofit(price));
        System.out.println(calrainheight(height));
    }
}
