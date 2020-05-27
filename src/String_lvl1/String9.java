package String_lvl1;
import java.util.*; //palindrome
import java.lang.*;
public class String9 
{
  String str;
  void input()
  { Scanner ob=new Scanner(System.in);
    System.out.println("Enter the string:");
    str=ob.nextLine();   
  }
  void palindrome()
  {   int i=0,len;
      String rev="";
      len=str.length();
      for(i=0;i<len;i++)
      {
          rev=str.charAt(i)+rev;
      }
      if(str.compareTo(rev)==0)
          System.out.println("String is Palindrome.");
      else
          System.out.println("String is not Palindrome.");
      
  }
   public static void main(String[] args) {
        String9 obj=new String9();
        obj.input();
        obj.palindrome();
    }
}
