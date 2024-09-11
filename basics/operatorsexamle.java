import java.util.*;
public class operatorsexamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a = 40;
         int b = 20;
         int c = 10;
         int  result = a+b;
         int diff = a-b;
         int mul = a*b;
        float div = b/a;
         System.out.println("addition"+result);
         System.out.println("diff"+diff);
         System.out.println("mul"+mul);
         System.out.println("div"+div);
         
         if(a==c)
         {
        	 System.out.println("true");
         }
         else
         {
        	 System.out.println("false");
         }
         //Assignment operator
           int x =5;
            x += 5;  // x = x+5; //10
            x -= 2;  // 8
            x *=3; // 24
            x /=6; //4		
            System.out.println(x);
            //unary perator
            int y = 6;
           // System.out.println(++y);
            System.out.println(y-- - --y); //6 - 4
           // ternary operator //?:
           char z = (a>b)?'t':'f';
            System.out.println(z);
           // tt => t
            // t f => f
            // f t => f
            //ff => f
            //logical operators
           /* if(a>b && a> c && a==c)
            {
            	System.out.println("a is greatest");
            }
            else
            {
            	System.out.println("a is not  greatest");
            }*/
            
            //float bo = 10.2f;
            //int xo = (int) bo;
            //System.out.println(xo);
            int i = 65;
            char co = (char)i;
            System.out.println(co);
            // + -  == 0 , ve number;
            //eligible for vote or not (heghtand weight)
            // (ch > A AND CH< Z)
            // NO BETWEEN 0 AND 9
            // scanner methods
            //even odd
            //calc app using scanner to enter +-*/
            
           /* System.out.println("entern no");
            Scanner sc = new Scanner(System.in);
            int  io = sc.nextInt();
            System.out.println(io);
            System.out.println("entern char");
            char ch = sc.next().charAt(0);
            System.out.println(ch);*/
            
            //Shift operator
            int ls = 10 << 2;  // convert into binary and add zeros
            System.out.println("left shift"+ls);
            int rs =  20 >> 2;
            System.out.println("right shift"+rs);//// convert into binary and remove
            //last digits
            
            //typecasting
             double dtc = 5.555;
             int tc = (int)dtc;
             System.out.println(tc);
             
             
             double dtc1;
             int xtc1 = 40;
             dtc1 = xtc1;
             System.out.println(dtc1);
             
             int as = 65;
             char ch = (char)as;
             System.out.println(ch);
             // divisible by 3 and 5 both
             int num = 16;
             if(num % 4 == 0 && num % 8 == 0)
             {
            	 System.out.println("divisible");
             }
             else
             {
            	 System.out.println("no divisible");
             }
            int num1 = 18;
           char ch2 = 'f';
           
           if(ch2 >= 'A' && ch2 <= 'Z')
           {
        	   System.out.println("capital letter");
           }
           else
           {
        	   System.out.println("not a cap letter");
           }
            int height = 5;
            int weight = 50;
            if(height > 5 && weight < 60)
            {System.out.println("person is eligible");}
            else
            {
            	System.out.println("person is not eligible");
            }
           
           
	}

}
