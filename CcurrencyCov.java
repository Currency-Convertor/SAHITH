package cConverter;

public class CcurrencyCov {

    double er = 0;

public CcurrencyCov(double todayRate) {
    er = todayRate;
}

    public double YenToPound(double Yenp){
        double pound = 0;
        pound = Yenp*er;
        return pound;
    }
    public double YenToCad(double Yenc){
        double cad = 0;
        cad = Yenc*er;
        return cad;
    }
    public double PoundToDollar(double Poundd){
        double dollar = 0;
        dollar = Poundd*er;
        return dollar;
    }
    public double PoundToInr(double Poundi){
        double inr = 0;
        inr = Poundi*er;
        return inr;
    }
    public double PoundToEuro(double Pounde){
        double euro = 0;
        euro = Pounde*er;
        return euro;
    }
    public double PoundToYen(double Poundy){
        double yen = 0;
        yen = Poundy*er;
        return yen;
    }
    
}






