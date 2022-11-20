package Calculator.Converter;

public class currencyConverter {
    public double usdToInr(double usd)
    {
        if(usd<0)
            return -1; //signifies invalid number
        return usd * 81.52;
    }

    public double inrToUsd(double inr)
    {
        if(inr<0)
            return -1; //signifies invalid number
        return 0.012 * inr;
    }

    public double poundToInr(double pound)
    {
        if(pound<0)
            return -1; //signifies invalid number
        return pound * 96.92;
    }

    public double inrToPound(double inr)
    {
        if(inr<0)
            return -1; //signifies invalid number
        return 0.010 * inr;
    }

    public double yenToInr(double yen)
    {
        if(yen<0)
            return -1; //signifies invalid number
        return yen * 0.58;
    }

    public double inrToYen(double inr)
    {
        if(inr<0)
            return -1; //signifies invalid number
        return 1.72 * inr;
    }

    public double dirhumToInr(double dirhum)
    {
        if(dirhum<0)
            return -1; //signifies invalid number
        return dirhum * 22.19;
    }

    public double inrToDirhum(double inr)
    {
        if(inr<0)
            return -1; //signifies invalid number
        return 0.045 * inr;
    }

    public double rubleToInr(double ruble)
    {
        if(ruble<0)
            return -1; //signifies invalid number
        return ruble * 1.34;
    }

    public double inrToRuble(double inr)
    {
        if(inr<0)
            return -1; //signifies invalid number
        return 0.75 * inr;
    }
}
