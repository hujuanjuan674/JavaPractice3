package practice;

public class AmericanPeople extends People{
    public void speakHelllo(){
        System.out.println("How do you do");
    }
    public void averageHeight(){
        height=176;
        System.out.println("American‘s averageHeight:"+height+"cm");
    }
    public void averageWeight(){
        weight=75;
        System.out.println("American's averageWeight:"+weight+"kg");
    }
    public void americanBoxing(){
        System.out.println("直拳,勾拳,组合拳");
    }

}
