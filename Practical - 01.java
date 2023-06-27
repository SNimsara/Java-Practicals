//1.	Write you first java programme to display “Hello World” on the screen
class Hello
{
       public static void main ( String[] args )
      {
	   System.out.println (“Hello World”);
       }
}



//2.	Write a programme to display your name on the first line and to display your degree programme on the second line on the screen. Please use command line (cmd) to execute your code.
package com.mycompany.q;
public class Input 
{
    private String name, degree;
    public void setData (String n, String d)
    {
        name = n;
        degree = d;
    }
  public void display()
    {
        System.out.println("Name - "+name);
        System.out.println("Degree program - "+degree);
    }
}



package com.mycompany.q;
public class App {
             public static void main(String[] args) 
    {
       Input i1 = new Input();
       i1.setData("Nimsara", "Software Engineering");
       i1.display();
    }
}




/*3.	Write down a programme to get the following output using a for loop. Repeat the same example by using a while loop. 

Executing Loop  0
Executing Loop  1
Executing Loop  2
Executing Loop  3
Executing Loop  4 */

For loop
package com.mycompany.forloop;
            public class ForLoop
           {
                   public static void main(String[] args) 
              {
                   int i;
                   for (i=0 ; i<=4 ; i++)

                     {
                                 System.out.println("Executing Loop "+i);
                      }      
         }
      }
While loop
package com.mycompany.whileloop;
            public class WhileLoop
           {
                   public static void main(String[] args) 
              {
                   int count = 0;
                   while (count < 5)
                       {
                          System.out.println("Executing Loop "+count);
                                count++;
                    }
              }
      }




/*4.	Write a class and insert the following code block into the appropriate place. Execute the code and get the result.

      int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers ){
         if( x == 30 ){
	    break;
         }
         System.out.print( x );
         System.out.print("\n");
      }
          System.out.print(“I’m  out of the Loop now");		*/ 

/* Results: 
10
20
I’m  out of the Loop now */

/* Repeat the same code using “continue” instead of “break”. Write down the output.

/* Results: 
10
20
40
50
I’m  out of the Loop now */



/* 5.	Write a class and insert the following code block into the appropriate place. Execute the code and get the result.
1.	char grade =‘A’;
2.	 switch(grade)
3.	{
4.	case 'A' :
5.	System.out.println("Excellent!"); 
6.	break;
7.	case 'D' :
8.	System.out.println("You passed");
9.	case 'F' :
10.	System.out.println("Better try again");
11.	break;
12.	default :
13.	System.out.println("Invalid grade");
14.	}
15.	System.out.println("Your grade is " + grade); */

/*Results: 
Excellent!
Your grade is A */

/* Repeat the same removing “break” command at line number 6. Write down the output.
  Excellent!
You passed
Better try again
Your grade is A */




/* 6.	As of java 5 the enhanced for loop was introduced. This is mainly used for Arrays. Below code contains few mistakes. First execute the code. Then identify the errors printed on the console. Rectify all the errors and execute to get the output:
	class TestEnhanceForLoop {
   	public static void mains(String args[]){
     	 int [] numbers = {10, 20, 30, 40, 50};
      		for(int x : numbers ){
        			 System.out.print( x );
         			System.out.print(",")
      		}
	 System.out.print("\n");
      	String [] names ={“James”, "Larry", "Tom", "Lacy"}
      		for( String name : names ) {
        		 	System.out.print( name );
         			System.out.print(","); */



 /*	   	Output: 
10,20,30,40,50,
James,Larry,Tom,Lacy,  */

// Rectified code
package com.mycompany.loop6q;
public class LOOP6Q 
{
    public static void main(String[] args)
    {
        int[] numbers = {10,20,30,40,50};
        for(int x : numbers )
        {
            System.out.print( x );
            System.out.print(",");
      	}
            System.out.print("\n");
            String[] names ={"James", "Larry", "Tom", "Lacy"};
            for( String name : names ) 
            {
        	System.out.print( name );
         	System.out.print(",");
            }
    }
}









