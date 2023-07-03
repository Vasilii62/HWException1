public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {8, 2, 4,};
        int[] arr2 = {4, 1, 2, 1};

        try {
            int[] division = arrayDivision(arr1, arr2);
            System.out.println("Частное элементов массивов:");
            for (int i = 0; i < division.length; i++) {
                System.out.println(division[i]);
            }
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int[] arrayDivision(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на ноль");
            }
            result[i] = arr1[i] / arr2[i];
        }

        return result;
    }

}



