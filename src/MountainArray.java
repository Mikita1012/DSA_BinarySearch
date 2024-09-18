public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 1};
//        int[] arr = {1,2,1};
        int result = peakIndexInMountainArray(arr);
        System.out.println("index: "+result);
        System.out.println("element: "+arr[result]);
        System.out.println(3/2);

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]) {
//                you are in dec part of the array
//                this may be the ans, but look at left
//                this is why end != mid - 1
                end = mid;
            } else {
//                you are in asc part of array
                start = mid+1; //because we know that mid+1 > mid

            }
        }
//        in the end, start == end and pointing to the largest number because of the 2 checks above.
//        start and end are always trying to find the max element in above two steps.
//        Hence, when they are pointing to just one element, that is the max one.
//        At every point of time for start and end, they have the best possible answer till that time
//        and if we say that only one item is remaining hence coz of above line the best possible ans.

        return start;
    }
}
