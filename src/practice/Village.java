package practice;

public class Village {
    static int waterAmount;
    int peopleNumber;
    String name;
    Village(String s){
        name=s;
    }
    static void setWaterAmount(int m){
        if(m>0)
            waterAmount=m;
    }
    void drinkWater(int n) {
        if (waterAmount - n >= 0) {
            waterAmount = waterAmount - n;
            System.out.println(name + "喝了" + n + "升水");
        } else
            waterAmount=0;
    }
    static int lookWaterAmount(){
        return waterAmount;
    }
    void setPeopleNumber(int n){
        peopleNumber=n;
    }
    int getPeopleNumber(){
        return peopleNumber;
    }

    public static class Land {
        public static void main(String args[]){
            setWaterAmount(200);
            int leftWater= waterAmount;
            System.out.println("水井中有"+leftWater+"升水");
            Village zhaoZhuang,maJiaHeZhi;
            zhaoZhuang=new Village("赵庄");
            maJiaHeZhi=new Village("马家河子");
            zhaoZhuang.setPeopleNumber(80);
            maJiaHeZhi.setPeopleNumber(120);
            zhaoZhuang.drinkWater(50);
            leftWater=maJiaHeZhi.lookWaterAmount();
            String name= maJiaHeZhi.name;
            System.out.println(name+"发现水井中有"+leftWater+"升水");
            maJiaHeZhi.drinkWater(100);
            leftWater= zhaoZhuang.lookWaterAmount();
            name= zhaoZhuang.name;
            System.out.println(name+"发现水井中有"+leftWater+"升水");
            int peopleNumber= zhaoZhuang.getPeopleNumber();
            System.out.println("赵庄的人口:"+peopleNumber);
            peopleNumber=maJiaHeZhi.getPeopleNumber();
            System.out.println("马家河子的人口:"+peopleNumber);

        }
    }
}
