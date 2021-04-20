package practice;

public class MainClass {
    public static void main(String args[]) {
        TV haierTV = new TV();
        haierTV.setChannel(5);
        System.out.println("hai erTV的频道是" + haierTV.getChannel());
        Family zhangsanFamily = new Family();
        zhangsanFamily.buyTV(haierTV);
        System.out.println("zhangsanFamily开始看电视节目");
        zhangsanFamily.seeTV();
        int m = 4;
        System.out.println("zhangsanFamily 将电视更换到" + "频道");
        zhangsanFamily.remoteControl(m);
        System.out.println("hai erTV的频道是" + haierTV.getChannel());
        System.out.println("zhangsanFamily再看电视节目");
        zhangsanFamily.seeTV();
        Family lisiFamily = new Family();
        lisiFamily.buyTV(haierTV);
        System.out.println("lisiFamily开始看电视节目");
        lisiFamily.seeTV();
        System.out.println("lisiFamily 将电视更换到" + "频道");
        lisiFamily.remoteControl(m);
        System.out.println("hai erTV的频道是" + haierTV.getChannel());
        System.out.println("lisiamily再看电视节目");
        lisiFamily.seeTV();
    }
}


