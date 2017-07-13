/*NAREEN KHURSHID
 * 
 * COMP1006/1406 - Summer 2017
 * Tutorial #1 
 * Example program that uses command line arguments
 * 
 * M. Jason Hinek, July 2017
 * 
 *  java HelloHello [num]
 * Note: Square brackets, as used above, denote optional input.
 */
public class HelloHello{
  
  public static void main(String[] args){
  
    /* defult number of time to print the message */
    int num = 1;
    
    /* update number of times to print message if a command 
     * line argument is present */
    if( args.length > 0 ){
      num = Integer.parseInt(args[0]);
    }   
    
    /* print out the message num times */
    for(int i=0; i<num; i+=1){
      for(int j=0; j<num; j+=1){
      System.out.print("Q");
      //do nested loop for the box thing
      }
      System.out.println();
    } 

  } // end main method
  
} // end class HelloWorld