public class home {

    public static void main (String[] args) {
        String[][] myArray = new String[][]{{"11", "1" , "1", "1"}, {"2", "2", "2"}, {"3", "3", "3"}, {"3", "3", "3", "3"}};
        try {
            try {
                int result = myMethod(myArray);
                System.out.println(result);
            } catch (myArraySizeException e) {
                System.out.println("Неверный размер массива");
            }
        }
        catch (myArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка: " + " ");
        }
    }


public static int myMethod(String[][] myArray) throws myArraySizeException , myArrayDataException {
int count = 0;
if(myArray.length !=4) {
    throw new myArraySizeException();
}
    for (int i = 0; i < myArray.length; i++) {
        if (myArray[i].length != 4) {
           throw new myArraySizeException();
        }

        for (int j = 0; j < myArray.length; j++) {
            try {
                count = count + Integer.parseInt(myArray[i][j]) ;
            }
           catch (NumberFormatException e) {
              throw new myArrayDataException(i,j);
           }
        }

    }
return count;
}



public  static class myArraySizeException extends Exception{

}
public  static class myArrayDataException extends Exception{
        public int i;
        public int j;
        myArrayDataException(int i, int j) {
            this.i = i;
            this.j = j;
        }
}
}



