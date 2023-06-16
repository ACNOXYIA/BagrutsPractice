public class Bagrut2023_Q1 {
    public static boolean PosOrder(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] < first) {
                    return false;
                }
                first = arr[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[9];
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = -3;
        arr[3] = 17;
        arr[4] = 0;
        arr[5] = 29;
        arr[6] = -20;
        arr[7] = -40;
        arr[8] = 30;
        System.out.println(PosOrder(arr));
    }
}
