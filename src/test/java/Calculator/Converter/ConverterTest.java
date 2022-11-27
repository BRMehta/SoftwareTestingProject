package Calculator.Converter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConverterTest {
    currencyConverter curConv=new currencyConverter();
    double res;
    @Test
    public void usdToInr()
    {
        res=curConv.convert(1,10);
        assertEquals(81.52 * 10, res, 0.01);

        res=curConv.convert(1,-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void inrToUsd()
    {
        res=curConv.convert(2,10);
        assertEquals(0.012 * 10, res, 0.01);

        res=curConv.convert(2,-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void poundToInr()
    {
        res=curConv.convert(3,10);
        assertEquals(96.92 * 10, res, 0.01);

        res=curConv.convert(3,-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void inrToPound()
    {
        res=curConv.convert(4,10);
        assertEquals(0.010 * 10, res, 0.01);

        res=curConv.convert(4,-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void yenToInr()
    {
        res=curConv.convert(5,10);
        assertEquals(0.58 * 10, res, 0.01);

        res=curConv.convert(5,-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void inrToYen()
    {
        res=curConv.convert(6,10);
        assertEquals(1.72 * 10, res, 0.01);

        res=curConv.convert(6,-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void dirhumToInr()
    {
        res=curConv.convert(7,10);
        assertEquals(22.19 * 10, res, 0.01);

        res=curConv.convert(7,-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void inrToDirhum()
    {
        res=curConv.convert(8,10);
        assertEquals(0.045 * 10, res, 0.01);

        res=curConv.convert(8,-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void rubleToInr()
    {
        res=curConv.convert(9,10);
        assertEquals(1.34 * 10, res, 0.01);

        res=curConv.convert(9,-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void inrToRuble()
    {
        res=curConv.convert(10,10);
        assertEquals(0.75 * 10, res, 0.01);

        res=curConv.convert(10,-937);
        assertEquals(-1, res, 0.01);
    }
}
