package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
     int fourth=number%10;
     int number2=number/10;
     int third=number2%10;
     int number3=number2/10;
     int second=number3%10;
     int first=number3/10;
     System.out.println(fourth+third+second+first);
    }
}
