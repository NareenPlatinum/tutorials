public class Cat extends Animal{

 //public abstract class Cat(String name, int year){
 
 public Cat(String name, int year){
   super(name,year);
 }
  
 public String noise(){
   //declare string used for noise
   String catNoise;
   //choose meow or purr
   if(Math.random() < 0.5){
    catNoise = ("Meow");
   }
   else{
    catNoise = ("Purrr");
   }
   //return string
   return catNoise;
 }
 
}
