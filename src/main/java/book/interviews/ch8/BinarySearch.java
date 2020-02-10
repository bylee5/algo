package book.interviews.ch8;

public class BinarySearch {
    public int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length-1);
    }

    public int binarySearch(int[] array, int target, int lower, int upper) {
        int center, range;

        range = upper -lower;
        if(range < 0) {
            System.out.println("Element not in array");;
        }
        if(array[lower] > array[upper]) {
            System.out.println("Array not sorted");
        }
        center = (range/2) + lower;
        if(target == array[center]) {
            return center;
        } else if(target < array[center]) {
            return binarySearch(array, target, lower, center - 1);
        } else {
            return binarySearch(array, target, center + 1, upper);
        }
    }
}
