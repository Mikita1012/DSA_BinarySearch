public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        char[] letters = {'c', 'f', 'j'};
//        int target = 21;
        char target = 'j';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(letters[ans]);

    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end  = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2; //better way to find mid

            if(target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid+1;
            }
        }
        System.out.println(letters[start % letters.length]);
        return letters[start % letters.length];
    }

}
