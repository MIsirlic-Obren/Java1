package main;

import media.Radio;
import media.Television;

public class main {

    public static void main(String[] args) {
    
        Television televizija = new Television();
        televizija.setCurrentProgram(5);
        televizija.setVolume(24);
        televizija.setTurnOn(true);
        
       televizija.info();
       
       
       
       Radio myRadio = new Radio(100.3, 700, 'A');
       myRadio.info();
        
        
    }
    
}
