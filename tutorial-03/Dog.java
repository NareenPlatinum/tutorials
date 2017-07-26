public class Dog extends Animal{

 public Dog(String name, int year){
  super(name,year);
 }
  
  public String noise(){
   //declare string used for noise
   String DogNoise;
   //choose meow or purr
   if(Math.random() < 0.5){
    DogNoise = ("woof");
   }
   else{
    DogNoise = ("grrrr");
   }
   //return string
   return DogNoise;
 }
  
}