package practice;

public class Bank {
    int saveMoney;
    int year;
    double interest;
    double interestRate=0.29;
    public double computerInternet(){
        interest=year*interestRate*saveMoney;
        return interest;
    }

    public void setInterest(double interest) {
        double rate;
        interestRate =rate;
    }
}
