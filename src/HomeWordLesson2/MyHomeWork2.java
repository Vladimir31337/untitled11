package HomeWordLesson2;

    public class MyHomeWork2 {

        private final static int SIZE = 4;

        public static void main(String[] args) {
            String testArr1[][] = {
                    {"1", "2", "3", "4"},
                    {"11", "21", "31", "41"},
                    {"22", "33", "443", "45"},
                    {"11", "22", "41", "42"}};

            String testArr2[][] = {
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}};

            String testArr3[][] = {
                    {"1", "2", "3", "4"},
                    {"1", "qwerty", "3", "4"},
                    {"1", "2", "3"},
                    {"1", "2", "3", "4"}};

            String testArr4[][] = {
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}};
            try {
                System.out.println("Сумма массива 1: " + ArraySum(testArr1));
            } catch (MyArraySizeException | MyArrayDataException ex) {
                System.out.println(ex);
            }

            try {
                System.out.println("Сумма массива 2: " + ArraySum(testArr2));
            } catch (MyArraySizeException | MyArrayDataException ex) {
                System.out.println(ex);
            }

            try {
                System.out.println("Сумма массива 3: " + ArraySum(testArr3));
            } catch (MyArraySizeException | MyArrayDataException ex) {
                System.out.println(ex);
            }

            try {
                System.out.println("Сумма массива 4: " + ArraySum(testArr4));
            } catch (MyArraySizeException | MyArrayDataException ex) {
                System.out.println(ex);
            }

        }

        public static int ArraySum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
            int res = 0;

            if (arr.length != SIZE) {
                throw new MyArraySizeException();
            }

            for (int i=0; i<arr.length; i++) {
                if (arr[i].length != SIZE) {
                    throw new MyArraySizeException();
                }

                for (int j=0; j<arr[i].length; j++) {
                    try {
                        res += Integer.valueOf(arr[i][j]);
                    } catch (NumberFormatException ex) {
                        throw new MyArrayDataException(i, j, arr[i][j], ex);
                    }
                }
            }

            return res;
        }


        static class MyArraySizeException extends Exception{
            public  MyArraySizeException() {
                super("Некорректный размер массива");
            }
        }
        static class MyArrayDataException extends Exception{
            public MyArrayDataException(int i, int j, String value, Throwable caused) {
                super(String.format("Некорректное значение %s в ячейка [%d][%d]", value, i, j), caused);
            }
        }


    }
