public class CielOfNum {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 3;
        int ans = ceil(arr, target);
        System.out.println(arr[ans]);

    }
    static int ceil(int[] arr, int target) {
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

        return start;
    }
}

