public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] difference = arrayDifference(arr1, arr2);
        if (difference != null) {
            System.out.println("Разности элементов массивов:");
            for (int i = 0; i < difference.length; i++) {
                System.out.println(difference[i]);
            }
        }
    }


    public static int[] arrayDifference(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Длины массивов не равны");
            return null;
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }

        return result;
    }

}