public class FloorOfNum {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int[] arr = {-18, -8, -6, -4, 2, 4, 6, 8, 9, 12, 14, 16, 18, 20};;
        int target = 9;
        int ans = floor(arr, target);
        System.out.print(arr[ans]+ " ");
        System.out.print(ans);
    }

//    return index: greatest number >= target
    static int floor(int[] arr, int target) {
        int start = 0;
        int end  = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2; //better way to find mid

//            if(target > arr[arr.length - 1]) {
//                return -1;
//            }

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }

        return end;
    }
}
