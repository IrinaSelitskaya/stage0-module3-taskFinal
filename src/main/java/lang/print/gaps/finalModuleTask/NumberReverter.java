package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
     int third=number%10;
     int number2=number/10;
     int second=number2%10;
     int first=number2/10;
     System.out.println(third+""+second+""+first);
    }
}
