public class RotationCountInRotatedSortedArray {
    //    arr = {15, 18, 2, 3, 6, 12};
//    output: 2
//    Initial given array  = {2, 3, 6, 12, 15, 18}
//    HINT: count is always equal to pivot + 1
//    Here, pivot is 18 = index 1
//    Therefore, rotated count = pivot[index]+1 = 2
//    Array rotated is 2 times
    public static void main(String[] args) {
//        int[] arr = {4, 5, 6, 7, 0, 1, 2};
//        int[] arr = {8, 9, 10, 11, 12, 0, 1, 2, 4, 5};
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(countRotations(arr));
    }

    static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot+1;
    }

//    use this for duplicates
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
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


//            if elements at mid, start, end are equal then just skip the duplicates.
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
//                skip duplicates

//               NOTE:  what if these elements at start and end are pivot
//                check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

//                check if end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
//            left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
//    use this for non duplicates
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





