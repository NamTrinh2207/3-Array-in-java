public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 10, 6, 9, 1};
        int indexMin = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[indexMin]);
    }

    public static int minValue(int[] arr) {
        int index = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                arr[index] = arr[i];
            }
        }
        return index;
    }
}