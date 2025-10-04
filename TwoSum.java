import java.util.*;  //calling Map Interface & HashMap Class

public class TwoSum{
    public static void main(String[] args){
        int arr[] = {10, 20, 30, 55, 77};

        int[] ret = twoSum(arr, 65);    //forwarding hard-coded values to check
        
        if(ret != null) //to confirm that null is not returned
            System.out.println(arr[ret[0]]+" + "+arr[ret[1]]+" = 65");
        else
            System.out.println("Result not as per expectation!");
    }
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> sum = new HashMap<>();    //incorporating the use of HashMap

        for(int i=0 ; i<nums.length ; i++){
            int remain = target - nums[i];  //considering the selected number and searching for the remaining required part if exists.

            if(sum.containsKey(remain))
            {
                return new int[] {i, sum.get(remain)};  //if exists, then returned immediately
            }
            sum.put(nums[i], i);    //otherwise, data gets put into the map
        }
        return null;    //if desired values are not found
    }
}
