package practice.polymorphism;

import think.polymorphism.music.Note;

import static net.mindview.util.Print.*;

class Cycle {
    public static void main(String args[]){

    }

    public void play(Note n) {

        System.out.println("Cycle");
    }

    public static void wheels() {
        System.out.println("4");
    }

    public class Bycycle extends Cycle {
        public void play(Note n) {

            System.out.println("Tricycle");
        }
    }

    public class Tricycle extends Cycle {
        //重写接口方法
        public void play(Note n) {

            System.out.println("Tricycle");
        }
    }

    //继承及向上转型
    public class Unicycle extends Cycle {
        public void play(Note n) {
            System.out.println("Unicycle");

        }
    }
}

