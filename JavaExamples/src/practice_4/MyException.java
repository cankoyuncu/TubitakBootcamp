package practice_4;

public class MyException extends Exception {
    public MyException(int number) {
        super(number + "sayisi 100'den buyuk");
    }
}