package Calculator.Converter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConverterTest {
    currencyConverter curConv=new currencyConverter();
    double res;
    @Test
    public void usdToInr()
    {
        res=curConv.usdToInr(10);
        assertEquals(81.52 * 10, res, 0.01);

        res=curConv.usdToInr(-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void inrToUsd()
    {
        res=curConv.inrToUsd(10);
        assertEquals(0.012 * 10, res, 0.01);

        res=curConv.inrToUsd(-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void poundToInr()
    {
        res=curConv.poundToInr(10);
        assertEquals(96.92 * 10, res, 0.01);

        res=curConv.poundToInr(-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void inrToPound()
    {
        res=curConv.inrToPound(10);
        assertEquals(0.010 * 10, res, 0.01);

        res=curConv.inrToPound(-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void yenToInr()
    {
        res=curConv.yenToInr(10);
        assertEquals(0.58 * 10, res, 0.01);

        res=curConv.yenToInr(-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void inrToYen()
    {
        res=curConv.inrToYen(10);
        assertEquals(1.72 * 10, res, 0.01);

        res=curConv.inrToYen(-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void dirhumToInr()
    {
        res=curConv.dirhumToInr(10);
        assertEquals(22.19 * 10, res, 0.01);

        res=curConv.dirhumToInr(-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void inrToDirhum()
    {
        res=curConv.inrToDirhum(10);
        assertEquals(0.045 * 10, res, 0.01);

        res=curConv.inrToDirhum(-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void rubleToInr()
    {
        res=curConv.rubleToInr(10);
        assertEquals(1.34 * 10, res, 0.01);

        res=curConv.rubleToInr(-937);
        assertEquals(-1, res, 0.01);
    }

    @Test
    public void inrToRuble()
    {
        res=curConv.inrToRuble(10);
        assertEquals(0.75 * 10, res, 0.01);

        res=curConv.inrToRuble(-937);
        assertEquals(-1, res, 0.01);
    }
}
