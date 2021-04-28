//继承及向上转型
package practice.polymorphism.music;

public class Music {
    public static <Instrument> void tune(Instrument i){

        i.equals(Note.MIDDLE_C);
    }

    public static void main(String args[]){
        Wind flute=new Wind();
        tune(flute);  //向上转型|
    }

}
