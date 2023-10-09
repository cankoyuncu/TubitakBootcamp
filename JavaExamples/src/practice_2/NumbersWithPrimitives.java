package practice_2;

public class NumbersWithPrimitives {

    public static void main(String[] args) {

        int min = 50;
        int max = 60;

        double doubleFirstValue =  Math.random() * (max-min)+min;
        double doubleSecondValue = Math.random() * (max-min)+min;

        System.out.println("doubleFirstValue:  "+ doubleSecondValue);
        System.out.println("doubleSecondValue: "+ doubleSecondValue);

        long longFirstValue  = Math.round(doubleFirstValue);
        long longSecondValue = Math.round(doubleSecondValue);

        System.out.println("longFirstValue : "+ longFirstValue);
        System.out.println("longSecondValue:" + longSecondValue);

        int intFirstValue = Math.toIntExact(longFirstValue);
        int intSecondValue = Math.toIntExact(longSecondValue);

        System.out.println("intFirstValue: "+intFirstValue);
        System.out.println("intSecondValue: "+intSecondValue);

        short shortFirstValue = Short.parseShort(String.valueOf(intFirstValue));
        short shortSecondValue = Short.parseShort(String.valueOf(intSecondValue));

        System.out.println("shortFirstValue: "+shortFirstValue);
        System.out.println("shortSecondValue: "+shortFirstValue);

        float floatFirstValue = shortFirstValue;
        float floatSecondValue = shortSecondValue;

        System.out.println("floatFirstValue: "+floatFirstValue);
        System.out.println("floatSecondValue "+floatSecondValue);

        char charFirstValue = (char) floatFirstValue;
        char charSecondValue = (char) floatSecondValue;

        System.out.println("charFirstValue: "+charFirstValue);
        System.out.println("charSecondValue "+charSecondValue);

    }
}