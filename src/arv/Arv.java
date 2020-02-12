package arv;

import java.util.ArrayList;

public class Arv {

    static ArrayList<Animal> zoo = new ArrayList<>();

    public static void main(String[] args) {

        Animal dog1 = new Animal("Dog", " Meat, fish, chicken", 3, 5000);
        System.out.println(dog1);
        Dog dog2 = new Dog("Dog", " Meat, fish, chicken", 3, 5000, "Folksam");
        System.out.println(dog2);
        zoo.add(dog2);
        Snake s = new Snake("Snake", "Meat", 3, 1000, 10);
        zoo.add(s);
        Fish f = new Fish("Fish", "grains", 3, 45, "Orange");
        zoo.add(f);
        for (Animal animal : zoo) {
            animal.makeNoise();
            
        }

//        if (zoo.get(0) instanceof Dog) {
//            String x = (Dog) zoo.get(0)).insuranceCompany;
//            System.out.println(x);
//        } else if (zoo.get(0) instanceof Fish) {
//
//        }
//        for (Animal animal : zoo) {
//            if (animal instanceof Dog) {
//                ((Dog) animal).makeNoise();
//            } else if (animal instanceof Fish) {
//                ((Fish) animal).makeNoise();
//            } else if (animal instanceof Snake) {
//
//                ((Snake) animal).makeNoise();
//            }
//        }
    }
}
