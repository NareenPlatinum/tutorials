/** basic biased coin flip */

import java.util.Random;

public class Flip{
 
 public static void main(String[] args){
  double bias = 0.5;  // 50% heads, 50% tails
  boolean ok = true;
  int heads = 0;
  int tails = 0;
    
  if(args.length == 1){
   try{
    bias = Double.parseDouble(args[0]);
   }
   
   catch(Exception e){
    System.out.println("command line argument must be a number");
    ok = false;
   }
  }

  
  
  if(ok){
  
    
    //COIN FLIPS
    for(int i=0; i<100; i++){ // do it 100 times
      
    Random x = new Random();
    double random = x.nextDouble();
    //System.out.println(random);
    
      //CONDITION TO MAKE IT HEADS OR TAILS
      //if random < bias
      if (random < bias)
      {
        heads = heads +1;
      } 
      else
      {
        tails = tails +1;
      }
    }
    System.out.println("bias is " + bias);
    //output
    System.out.println("Amount Of Heads: " + heads);
    System.out.println("Amount Of Tails: " + tails);
  }
 }
}
