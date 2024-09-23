public class RBS_with_duplicate_values {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 6, 1, 2};
        System.out.println(findPivotWithDuplicates(arr));
    }
    static int findPivotWithDuplicates(int[] arr) {
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


//            if elements at mid, start, end are equal then just skip the duplicates.
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
//                skip duplicates

//               NOTE:  what if these elements at start and end are pivot
//                check if start is pivot
                if(arr[start] > arr[start+1]) {
                    return start;
                }
                start++;

//                check if end is pivot
                if(arr[end] < arr[end-1]) {
                    return end-1;
                }
                end--;
            }
//            left side is sorted, so pivot should be in right
            else if (arr[start] <arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid+1;
            } else  {
                end  = mid-1;
            }
        }
        return -1;
    }
}
