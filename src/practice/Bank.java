package practice;

public class Bank {
    int saveMoney;
    int year;
    double interest;
    double interestRate=0.29;
    public double computerInterest(){
        interest=year*interestRate*saveMoney;
        return interest;
    }
    public void setInterestRate(double rate){
        interestRate=rate;
    }

    public static class ConstructionBank extends Bank {
        double year;
        public double computerInterest() {
            super.year = (int) year;
            double r = year - (int) year;
            int day = (int) (r * 1000);
            double yearInterest = super.computerInterest();
            double dayInterest = day * 0.0001 * saveMoney;
            interest = yearInterest + dayInterest;
            System.out.printf("%d元存在建设银行%d年零%d天的利息:%f元\n", saveMoney, super.year, day, interest);

            return interest;
        }
    }

    public static class CommercialBank extends Bank{
        double year;
        public double computerInterest(){
            super.year=(int)year;
            double r=year-(int)year;
            int day=(int)(r*1000);
            double yearInterest=super.computerInterest();
            double dayInterest=day*0.00014;
            interest=yearInterest+dayInterest;
            System.out.printf("%d元存在商业银行%d年零%d天的利息:%f元\n",saveMoney,super.year,day,interest);
            return interest;
        }

    }

    public static class BankOfDalian extends Bank {
            double year;

            public double computerInterest() {
                super.year = (int) year;
                double r = year - (int) year;
                int day = (int) (r * 1000);
                double yearInterest = super.computerInterest();
                double dayInterest = day * 0.00012 * saveMoney;
                interest = yearInterest + dayInterest;
                System.out.printf("%d元存在大连银行%d年零%d天的利息:%f元\n", saveMoney, super.year, day, interest);
                return interest;
            }
        }

    public static class SaveMoney {
        public static void main(String args[]) {
            int amount = 8000;
            ConstructionBank bank1 = new ConstructionBank();
            bank1.saveMoney = amount;
            bank1.year = 8.236;
            bank1.setInterestRate(0.035);
            double interest1 = bank1.computerInterest();
            BankOfDalian bank2 = new BankOfDalian();
            bank2.saveMoney = amount;
            bank2.year = 8.236;
            bank2.setInterestRate(0.035);
            double interest2 = bank2.computerInterest();
            CommercialBank bank3 = new CommercialBank();
            bank3.saveMoney = amount;
            bank3.year = 8.236;
            bank3.setInterestRate(0.035);
            double interest3 = bank3.computerInterest();
        }
    }
}
