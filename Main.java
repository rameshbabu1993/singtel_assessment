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
}



class Duck extends Bird {

    public Duck(String voice){
        super(voice);
    }

    void say(){
        System.out.println("Duck Says" + super.voice);   
    }

    void swim(){
        System.out.println("I am swimming");
    }
}

class Chicken extends Bird {

    public Chicken(String voice){
        super(voice);
    }

    void say(){
        System.out.println("Chicken Says" + super.voice);   
    }

    void fly(){
        System.out.println("I can't able to fly");
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
    }
}