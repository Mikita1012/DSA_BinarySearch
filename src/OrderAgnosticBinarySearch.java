public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {-18, -8, -6, -4, 2, 4, 6, 8, 9, 12, 14, 16, 18, 20};
        int[] arr = {99, 88, 75, 67, 54, 44, 32, 22, 10};
        int target = 22;

        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }
//good developers copy - great developers paste
    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

//        find whether the array is sorted in asc or desc order.

        boolean isAsc = arr[start] < arr[end]; //simplified if-else
//        if(arr[start] < arr[end]) {
//            isAsc = true;
//        } else {
//            isAsc = false;
//        }



        while(start <= end) {
            int mid = start + (end - start) / 2; //better way to find mid

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
