package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int distanceTraveled; 
        private int speed;
        private int runDuration;
        private int restDuration;
        private int counter;
        private int restCounter;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.restDuration = restDuration;
            this.runDuration = runDuration;
            distanceTraveled = 0;
            counter = runDuration;
            restCounter = restDuration;
        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }

        public String getName(){
            return name;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            if(counter>0){
                distanceTraveled += speed;
                counter--;
                System.out.println(counter);
            } else if (counter == 0 && restCounter >0){
                restCounter --;
            } else{
                counter = runDuration;
                restCounter = restDuration;
            }
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        Reindeer winner = new Reindeer(null, 0, 0, 0);
        for (Reindeer reindeer : reindeers){
            for(int i = 0; i < time; i++){
                reindeer.simulateSecond();
            }
            if(reindeer.getDistanceTraveled() > winner.getDistanceTraveled()){
                winner = reindeer;
            }
        }
        
        return winner.getName();
    }

    
    public static void main(String[] args) { // for testing purposed
        Reindeer a = new Reindeer("test", 100, 5, 2);
    }
}



