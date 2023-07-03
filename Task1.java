public class Task1 {
    public static void main(String[] args) {
        String[][] arr0 = new String[][]{
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };
        System.out.println(sum2d(arr0));

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        } catch (NumberFormatException e) {
            // Обработка исключения NumberFormatException
            System.out.println("Ошибка формата числа: " + e.getMessage());
        } catch (NullPointerException e) {
            // Обработка исключения NullPointerException
            System.out.println("Ошибка null-ссылки: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Обработка исключения ArrayIndexOutOfBoundsException
            System.out.println("Ошибка выхода за границы массива: " + e.getMessage());
        }
        return sum;
    }
}

//    В данном коде можно получить следующие типы исключений:
//
//     1. NumberFormatException: Если метод Integer.parseInt() не сможет преобразовать строку в целое число, будет сгенерировано исключение NumberFormatException. Это может произойти, если в ячейке массива arr находится неправильный формат числа, например, символы, не являющиеся цифрами.
//
//     2. NullPointerException: Если массив arr является null или одна из его ячеек равна null, то при попытке обращения к элементам массива будет сгенерировано исключение NullPointerException.
//
//     3. ArrayIndexOutOfBoundsException: Если значение переменной i выходит за пределы индексов массива arr, то будет сгенерировано исключение ArrayIndexOutOfBoundsException. Это может произойти, если i больше или равно arr.length.
//
//     4. ArrayIndexOutOfBoundsException: Если значение переменной j выходит за пределы индексов вложенного массива arr[i], то будет сгенерировано исключение ArrayIndexOutOfBoundsException. Это может произойти, если j больше или равно 5.
//
//        Таким образом, можно получить три разных типа исключений в данном коде.