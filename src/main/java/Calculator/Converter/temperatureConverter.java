package Calculator.Converter;

public class temperatureConverter
{
    public  double tconverter(int type,double x)
    {
        if(type==1)
            return FahrenheitTocelsius(x);
        else if(type==2)
            return celsiusToFahrenheit(x);
        else if(type==3)
            return celsiusToKelvin(x);
        else if(type==4)
            return KelvinToCelsius(x);
        else
            return -999;
    }
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
