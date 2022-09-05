/*Program: Fibonacci Series Upto 10
 
     Abbrevations: 
     nextno = Next Number in the Series
     no1 = First Number
     no2 = Secong Number

*/
public class Fibo
{
  public static void main (String args[])
  {
    int no1 = 0, no2 = 1, next, i;
    
        System.out.print(no1 + " " + no2 + " ");
    
    for (i = 0; i < 10; i++)
      {
          
    	nextno = no1 + no2;
    	no1 = no2;
        no2 = nextno;
	    
	    System.out.print(" " + nextno);
      }

  }
}
