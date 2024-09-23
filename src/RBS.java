public class RBS {
//    ROTATED BINARY SEARCH - RBS

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int result = findPivot(arr);
        System.out.println(arr[result]);

    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

//        if you did not find a pivot, it means the array is not rotated.
        if(pivot == -1){
//            just do normal Binary Search
            return binarySearch(arr, target, 0, arr.length-1);
        }

        if(arr[pivot] == target) {
            return pivot;
        }
//      if you found pivot, we have two asc arrays
        if(target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot-1);
        }
        return binarySearch(arr, target, pivot+1, arr.length-1 );
    }

    static int binarySearch(int[] arr, int target, int start, int end) {


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

    static int findPivot(int[] arr) {
        int start = 0;
        int end  = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
//            4 cases below
//            CASE 1:
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {  //CASE 2
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) { // CASE 3
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
