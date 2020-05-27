package String_lvl1;
import java.util.*; //words greater than 5 letters.
import java.lang.*;
public class String20
{  String str;
   void input()
   { Scanner ob=new Scanner(System.in);
     System.out.println("Enter the String:");
     str=ob.nextLine();   
   }
   void print5()
   {
       int l=str.length(),t=0;
       String wd;
       str=str+" ";
       System.out.println("The words with length greater than 5 are:");
       for(int i=0;i<=l;i++)
       {
            if(str.charAt(i)==' ')
          {  wd=str.substring(t, i);
             t=i+1;
             if(wd.length()>5)
                  System.out.println(wd);
             
          }
       }
   }
     public static void main(String[] args) 
   {
        String20 obj=new String20();
        obj.input();
        obj.print5();
    }
}
