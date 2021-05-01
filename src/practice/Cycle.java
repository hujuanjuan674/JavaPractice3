package practice;

import think.polymorphism.music.Note;

class Cycle {

        public void ride(Note n) {
                System.out.println("ride");
        }
        public void wheels(){
                System.out.println("4");
        }

        public static class Tricycle extends Cycle{
            //重写接口方法

            public void wheels() {
                System.out.println("Tricycle.wheels()");
            }
        }

    public static class Unicycle extends Cycle {
        public void wheels(){
            System.out.println("Unicycle.wheels()");
        }
    }

    public static class Bycycle extends Cycle {


        public void wheels() {
            System.out.println("Bycycle.wheels()");
        }

        public static void main(String[] args) {
            Bycycle flute = new Bycycle();
        }
    }
}

