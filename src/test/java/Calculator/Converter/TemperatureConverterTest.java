package Calculator.Converter;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TemperatureConverterTest {
    temperatureConverter tc = new temperatureConverter();
    double res;

    @Test
    public void FahrenheitTocelsius(double x)
    {
        res=tc.FahrenheitTocelsius(10);
        assertEquals((10-32)*.5556, res, 0.01);

        res=tc.FahrenheitTocelsius(-93.7);
        assertEquals((-93.7-32)*.5556, res, 0.01);
    }


    @Test
    public void celsiusToFahrenheit(double x)
    {
        res=tc. celsiusToFahrenheit(10);
        assertEquals((10)*1.8+32, res, 0.01);

        res=tc. celsiusToFahrenheit(-93.7);
        assertEquals((-93.7)*1.8+32, res, 0.01);
    }


    @Test
    public void celsiusToKelvin(double x)
    {
        res=tc. celsiusToKelvin(10);
        assertEquals((10)+273.15, res, 0.01);

        res=tc. celsiusToKelvin(-93.7);
        assertEquals(-93.7+273.15, res, 0.01);
    }
    @Test
    public void KelvinToCelsius(double x)
    {
        res=tc.KelvinToCelsius(10);
        assertEquals((10)-273.15, res, 0.01);

        res=tc.KelvinToCelsius(-93.7);
        assertEquals(-93.7-273.15, res, 0.01);
    }


}
