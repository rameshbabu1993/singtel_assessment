class Animal {

    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {

    String voice = ""; 

    public Bird(){};

    public Bird(String voice){
        this.voice = voice;
    }

    void fly() {
        System.out.println("I am flying");
    }

    void sing(){
        System.out.println("I am Singing");
    }
    
    void say(){
        System.out.println(this.getClass().getSimpleName() + " says " + this.voice);
    }
}



class Duck extends Bird {

    public Duck(String voice){
        super(voice);
    }


    void swim(){
        System.out.println("I am swimming");
    }
}

class Chicken extends Bird {

    public Chicken(String voice){
        super(voice);
    }

    void fly(){
        System.out.println("I can't able to fly");
    }
}

class Rooster extends Chicken {

    public Rooster(String voice){
        super(voice);
    }
}


public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        // duck 
        Duck duck = new Duck("Quack, quack");
        duck.say();
        duck.swim();

        // chicken
        Chicken chicken = new Chicken("Cluck, cluck");
        chicken.say();
        chicken.fly();
        
        // rooster
        Rooster roster = new Rooster("Cock-a-doodle-doo");
        roster.say();
    }
}