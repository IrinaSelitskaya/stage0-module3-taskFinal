package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
     double temperatureCelsiusDouble=(double)temperatureCelsius;
     double f=temperatureCelsiusDouble*1.8+32;
     System.out.println(f);
    }
}
