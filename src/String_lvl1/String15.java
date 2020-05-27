package String_lvl1;
import java.util.*; // trim
import java.lang.*;
public class String15
{ String str;
  void input()
  { Scanner ob=new Scanner(System.in);
    System.out.println("Enter the String:");
   str=ob.nextLine();   
  }
   void trim()
   {   String cpy="";
       int l=str.length();
       for(int i=0;i<l;i++)
       { 
           char ch=str.charAt(i);
           if(ch==' ')
               continue;
           else
               cpy=cpy+ch;
           
       }
       System.out.println("The new string is:"+cpy);
   }
   public static void main(String[] args) 
   {
        String15 obj=new String15();
        obj.input();
        obj.trim();
    }
}
