package practice.polymorphism;

import think.polymorphism.music.Note;

import static net.mindview.util.Print.print;

class Cycle {

    public void ride(Note n){
        print("Cycle.ride()");
    }

    public enum Bycycle{
        MIDDLE_C,C_SHARP,B_FLAT;
    }

    static class Tricycle extends Cycle{
         //重写接口方法
        public void ride(Note n) {
            System.out.println("Tricycle.ride()"+n);
        }
    }
//继承及向上转型
    public static class Unicycle {
        public static void tune(Cycle i){
            i.ride(Note.MIDDLE_C);
        }
        public static void main(String args[]){
            Tricycle flute=new Tricycle();
            tune(flute);//向上转型i
        }
    }
}
