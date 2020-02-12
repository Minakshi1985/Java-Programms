
package arv;


public class Snake extends Animal {
  int poisionLevel;
  
  public Snake(String type, String food, int age, double price, int poisionLevel ){
      
      super(type,food,age,price);
      this.poisionLevel=poisionLevel;
  }
  public void makeNoise(){
      System.out.println("A snake hiss");
  }
}
