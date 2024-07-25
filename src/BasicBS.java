public class BasicBS {
    public static void main(String[] args) {
        int[] arr = {-18, -8, -6, -4, 2, 4, 6, 8, 9, 12, 14, 16, 18, 20};
        int target = -4;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
//    return index
//    return -1 if element not present
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end  = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2; //better way to find mid

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
