
package arv;


public class Fish extends Animal {
    String colour;

    public Fish(String type, String food, int age, double price, String colour) {
        super(type, food, age, price);
        this.colour=colour;
    }
    
   public void makeNoise(){
       System.out.println("Silent");
   } 
}
