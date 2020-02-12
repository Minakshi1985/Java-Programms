
package arv;


public class Dog extends Animal {
    String insuranceCompany;
   public Dog(String type, String food, int age, double price, String insuranceCompany){
    super(type,food,age,price);
    this.insuranceCompany=insuranceCompany;
    }
    @Override
    public void makeNoise(){
    System.out.println("A dog barks");
}
    @Override
    public String toString() {
        return super.toString()+ " InsuranceCompany=" + insuranceCompany;
    }
    
    
}
