package String_lvl1;
import java.util.*; //invert case of letters
import java.lang.*;
public class String8
{  String str;
  void input()
  { Scanner ob=new Scanner(System.in);
    System.out.println("Enter the string:");
    str=ob.nextLine();   
  }
  void invert()
  {   int i;
      int l=str.length();
      String s="";
      for (i=0;i<l;i++)
      {  char ch=str.charAt(i);
         if (Character.isLowerCase( ch)==true)
         {
             ch=Character.toUpperCase( ch);
             s=s+ch;
         }
         if(Character.isUpperCase( ch)==true)
         {
            ch= Character.toLowerCase( ch);
             s=s+ch;
      }
     }
      System.out.println("Inverted String is:"+s);
  }   
   public static void main(String[] args) {
        String8 obj=new String8();
        obj.input();
        obj.invert();
    }
    
}
