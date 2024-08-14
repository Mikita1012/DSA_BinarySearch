import java.util.Arrays;

public class FindPositionOfNum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 7, 7, 7, 5, 5};
        int target = 7;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

//        check first occurrence if target first
        ans[0] = search(nums, target, true); // 2
        if(ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }




        return ans;
    }
    //    this function just returns the index value of the target
    static int search(int[] nums, int target, boolean findStartIndex) {
         int ans = -1;
        int start = 0;
        int end  = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2; //better way to find mid

            if(target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid+1;
            } else {
//                potential answer found
                ans = mid;
                if(findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
