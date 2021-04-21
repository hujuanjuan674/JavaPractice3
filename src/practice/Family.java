package practice;

public class Family {
        TV homeTV;
        void buyTV(TV tv){
            homeTV=tv;
        }
        void remoteControl(int m){
            homeTV.setChannel(m);
        }
        void seeTV(){
            homeTV.showProgram();
        }

    public static class TV {
           int channel;   //电视频道
           void setChannel(int m){
               if(m>=1){
                   channel=m;
               }
           }
           int getChannel(){
               return channel;
           }
           void showProgram(){
               switch(channel){
                   case 1:System.out.println("综合频道");
                       break;
                   case 2:System.out.println("经济频道");
                       break;
                   case 3:System.out.println("文艺频道");
                       break;
                   case 4:System.out.println("国际频道");
                       break;
                   case 5:System.out.println("体育频道");
                       break;
                   default : System.out.println(" 不能收看"+channel+"频道");
               }

           }

    }

    public static class MainClass {
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
}


