public class Owl extends Animal{
  
 public boolean wise; 

  public Owl(String name, int year, boolean wise){
   super(name,year);  
   this.wise= wise;
 }
 
   public String noise(){
   //declare string used for noise
   String OwlNoise = ("hooo");
   //return string
   return OwlNoise;
 }
   
    /*  
   public boolean isWise(){
  boolean wise;
  if(Math.random() < 0.5){
    wise  = true;  
  }
  else{
    wise = false;
  }
  return wise;
}
*/

   @Override
 public String toString(){
  return "name: " + this.name + "Year: " + this.birthYear + " wise: " + this.wise;  
  //return "name: " + name + " Year: " + year;
 }
   
   
}