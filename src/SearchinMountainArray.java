//public class SearchinMountainArray {
//    public static void main(String[] args) {
//
//    }
//
////    1. find the peak element
////    2. Binary search in asc array
////    3. If not found search in desc array.
//
//    int search(int arr[], int target) {
//        int peak = peakIndexInMountainArray(arr);
//        int firstTry = orderAgnostic(arr, target, 0, peak);
//        if(firstTry != -1) {
//            return firstTry;
//        }
////        try search in second half
//        return orderAgnostic(arr, target, peak+1, arr.length-1);
//    }
//
//    public static int peakIndexInMountainArray(int[] arr) {
//        int start = 0;
//        int end = arr.length-1;
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//
//            if(arr[mid] > arr[mid+1]) {
//
//                end = mid;
//            } else {
//                start = mid+1;
//
//            }
//        }
//        return start;
//    }
//
//    static int orderAgnostic(int[] arr, int target, int start, int end) {
//
//        boolean isAsc = arr[start] < arr[end];
//
//        while(start <= end) {
//            int mid = start + (end - start) / 2;
//            if(arr[mid] == target) {
//                return mid;
//            }
//
//            if(isAsc) {
//                if (target < arr[mid]) {
//                    end = mid - 1;
//                } else  {
//                    start = mid + 1;
//                }
//            } else {
//                if (target > arr[mid]) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//        }
//        return -1;
//    }
//}
