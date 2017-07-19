/**
 * A Money object models money as dollars and cents
 **/
 
public class Money{
  
  /* attributes */ 
  private int dollars = -1;
  private int cents = -1;

  
  public Money(){
  // create an object with zero dollars and cents.
  dollars = 0;
  cents = 0;
  
  }
  
  public Money(int c){
  // create an object with c cents
  cents = c;
  dollars = 0;
  // (adjusting dollars and cents so that 0<=cents<=99)
  
 if ( cents>99){     
      dollars = dollars +  c/100; 
      cents = c%100;
    }

 
  }
  
  public Money(int d, int c){
     // create an object with d dollars and c cents
    dollars = d;
    cents = c;
    
    // (adjusting dollars and cents so that 0<=cents<=99)
    
    if ( cents>99){     
      dollars = d +  c/100; 
      cents = c%100;
    }
     
  }
  
  
  
  /** 
   * Returns a String representation of the value of the current object. 
   * 
   * @return The value of the current object is returned as the <code>String</code>"$D.cc"
   * where D is the number of dollars and cc is the cents of the value.  Uses the <code>format()</code>
   * method from the <code>String</code> class to ensure that the cents are displayed properly (2 spaces
   * with leading zeros if needed).
   **/
  public String getMoney(){
    return "$" + String.format("%01d", dollars) + "." + String.format("%02d", cents);
  }
  
}