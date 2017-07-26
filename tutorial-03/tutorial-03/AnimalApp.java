import java.util.Random;
import java.util.Calendar;
/** COMP 1006/1406 Tutorial Material*/

public class AnimalApp{
 /** number of animals in collection */
 public static final int SIZE = 20;

 /** a collection of names for generating random animals */
 public static String[] names = {"Fluffy ", "Tiger ", "Spot ", 
     "Bubbles ", "Dodger ", "Ace ", "Flower ", "Tiny ", "Pip ",};
 
 public static void main(String[] args){
  Random rnd = new Random();
  
  /* get the current year based on computer's clock */
   Calendar now = Calendar.getInstance();   
  int year = now.get(Calendar.YEAR);  
  System.out.println("The year is " + year);
  
  /* some animals */
  Animal[] animals = new Animal[SIZE];

  // randonly pick a cat or dog or owl                
  // use random names from the `names` array   
  // use random birth years          
  for(int i=0; i<SIZE; i+=1){
   if(Math.random() < 1.0/4.0){
    animals[i] = new Cat( names[rnd.nextInt(names.length)], rnd.nextInt(12) + 2000);
   }
   else if(Math.random() < 2.0/4.0) {
    animals[i] = new Owl( names[rnd.nextInt(names.length)], rnd.nextInt(14) + 2000, true);
   }
   
   else if(Math.random() < 3.0/4.0) { 
    animals[i] = new Owl( names[rnd.nextInt(names.length)], rnd.nextInt(14) + 2000, false);
   }
   
   else{
    animals[i] = new Dog( names[rnd.nextInt(names.length)], rnd.nextInt(14) + 2000);
   }
  }
  
  for(Animal animal: animals){
   System.out.print(animal + " ... ");
   System.out.println(animal.noise());
   //System.out.println(wise());
  }
   
 }
}



