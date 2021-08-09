public class Searching {
    public static int linearSearch(int[] arr, int min, int max, int targetElement) {
        int index = min;
        boolean found = false;
        while (!found && index <= max) {
            if (arr[index] == targetElement) {
                found = index;
            }
            index++;
        }

        return found;
    }

    public static int binarySearch(int[] arr, int min, int max, int targetElement) {

        int mid = (min + max) / 2;

        if (arr[mid] == targetElement) {
            return mid;
        }

        if (min >= max) {
            return -1;
        }

        if (arr[mid] < targetElement) {
            return binarySearch(arr, mid + 1, max, targetElement);
        }

        if (arr[mid] > targetElement) {
            return binarySearch(arr, min, mid - 1, targetElement);
        }

        return mid;
    }
}
