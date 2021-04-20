package practice;

public class ConstructionBank extends Bank{
    double year;
    public double computerInternet(){
        super.year=(int)year;
        double r=year-(int)year;
        int day=(int)(r*1000);
        double yearInterest=super.computerInternet();
        double dayInterest=day*0.0001*saveMoney;
        interest=yearInterest+dayInterest;
        System.out.println("%d元存在建设银行%d年零%d天的利息:%f元\n");
    }
}
