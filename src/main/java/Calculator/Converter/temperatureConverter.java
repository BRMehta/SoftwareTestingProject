package Calculator.Converter;

public class temperatureConverter
{


    public double FahrenheitTocelsius(double x)
    {
       return (x-32)*.5556;
    }

    public double celsiusToFahrenheit(double x)
    {
        return (x*1.8)+32;
    }
    public double celsiusToKelvin(double x)
    {
        return x+273.15;
    }
    public double KelvinToCelsius(double x)
    {
        return x-273.15;
    }
}
