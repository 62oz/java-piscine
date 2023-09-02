package ComputeArray;

public class ComputeArray {
    public static int[] computeArray(int[] array) {
        int[] result = new int[array.length];
        int index = 0;
        for (int num : array) {
            if (num % 3 == 0) {
                result[index] = num * 5;
            } else if (num % 3 == 1) {
                result[index] = num + 7;
            } else {
                result[index] = num;
            }
            index++;
        }
        return result;
    }
}
