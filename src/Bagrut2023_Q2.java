public class Bagrut2023_Q2 {
    public static int missingNum(int[] arr) {
        int first = arr[0];
        int second = arr[1];
        int firstDiff = second - first;
        for (int i = 1; i < arr.length - 1; i++) {
            first = arr[i];
            second = arr[i + 1];
            if (second - first == 2 * firstDiff) {
                return first + firstDiff;
            } else if (second - first == firstDiff / 2) {
                return first - firstDiff / 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 4;
        arr[1] = 8;
        arr[2] = 12;
        arr[3] = 16;
        arr[4] = 20;
        arr[5] = 28;
        System.out.println(missingNum(arr));

    }
}
