package practice.polymorphism.music3;

import think.polymorphism.music.Note;

import static net.mindview.util.Print.print;

class Stringed extends Instrument{
    void play(Note n){print("Stringed.play()"+n);}
    String what(){return "c";}
    void adjust(){print("Adjust Stringed");}
}
