package Calculator.Converter;

public class currencyConverter {
    public double convert(int type,double input_cur)
    {
        if(input_cur<0)
            return -1; //signifies invalid number
        else
        {
            if(type == 1) return usdToInr(input_cur);
            else if(type == 2) return  inrToUsd(input_cur);
            else if(type == 3) return poundToInr(input_cur);
            else if(type == 4) return inrToPound(input_cur);
            else if(type == 5) return yenToInr(input_cur);
            else if(type == 6) return inrToYen(input_cur);
            else if(type == 7) return dirhumToInr(input_cur);
            else if(type == 8) return inrToDirhum(input_cur);
            else if(type == 9) return rubleToInr(input_cur);
            else return inrToRuble(input_cur);
        }
    }
    public double usdToInr(double usd)
    { return usd * 81.52;}
    public double inrToUsd(double inr)
    { return 0.012 * inr;}
    public double poundToInr(double pound)
    { return pound * 96.92;}
    public double inrToPound(double inr)
    { return 0.010 * inr;}
    public double yenToInr(double yen)
    { return yen * 0.58;}
    public double inrToYen(double inr)
    { return 1.72 * inr;}
    public double dirhumToInr(double dirhum)
    { return dirhum * 22.19;}
    public double inrToDirhum(double inr)
    { return 0.045 * inr;}
    public double rubleToInr(double ruble)
    { return ruble * 1.34;}
    public double inrToRuble(double inr)
    { return 0.75 * inr;}
}
