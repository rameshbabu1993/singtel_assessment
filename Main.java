class Animal {

    void walk() {
        System.out.println("I am walking");
    }

    void sing(){
        System.out.println("I am Singing");
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
    
    void say(){
        System.out.println(this.getClass().getSimpleName() + " says " + this.voice);
    }
}


class Fish extends Animal {

    String did = "", appreance = "";

    public Fish(){};

    public Fish(String appreance, String did){
        this.did = did;
        this.appreance = appreance;
    }

    void walk() {
        System.out.println(this.getClass().getSimpleName() + " do not walk");
    }

    void sing(){
        System.out.println(this.getClass().getSimpleName() + " do not sing");
    }
    
    void swim(){
        System.out.println(this.getClass().getSimpleName() + " can swim");
    }

    void howItLook(){
         System.out.println(this.getClass().getSimpleName() + " " + this.appreance);
    }

    void does(){
         System.out.println(this.getClass().getSimpleName() + " " + this.did);
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

class Parrot extends Bird {

    public Parrot(String voice){
        super(voice);
    }
}

class Shark extends Fish {

    public Shark(String appreance, String did){
        super(appreance, did);
    }

}

class Clownfish extends Fish {

    public Clownfish(String appreance, String did){
        super(appreance, did);
    }

}

class Dolphins extends Fish {

    public Dolphins(String appreance, String did){
        super(appreance, did);
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

        // Parrot with dog
        Parrot parrot = new Parrot("Woof, woof with a dog ");
        parrot.say();

        // parrot with cat
        Parrot cat_parrot = new Parrot("Meow with a Meow "); 
        cat_parrot.say();

        // parrot with cat
        Parrot rooster_parrot = new Parrot("Cock-a-doodle-doo with a rooster"); 
        rooster_parrot.say();

        // Fish
        Fish fish = new Fish();
        fish.sing();
        fish.walk();
        fish.swim();

        // shark
        Shark shark = new Shark("large and grey", "eat other fish");
        shark.howItLook();
        shark.does();

        // clownfish
        Clownfish clownfish = new Clownfish("are small and colourful (orange)", "make jokes");
        clownfish.howItLook();
        clownfish.does();

        // dolfins
        Dolphins dolphins = new Dolphins("are beautifull", "help others");
        dolphins.howItLook();
        dolphins.does();
    }
}