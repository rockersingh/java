public class classes {

    public static class HelloWorld{

        public static void hello(){

            System.out.println("Hello World");
        }


    }
    //OOPS = polymorphism, inheritance, encapsulation, abstraction

    static class Animal{
        public void animalSound(){
            System.out.println("The animal makes a sound");
        }
    }
    //function overriding

    static class Pig extends Animal{
        public void animalSound(){
            System.out.println("The pig says wee wee");
        }
    }

    static class Elephant extends Animal{

    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myElephant = new Elephant();
        myAnimal.animalSound();
        myPig.animalSound();
        myElephant.animalSound();
    }
}
