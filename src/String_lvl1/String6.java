package String_lvl1;
import java.util.*; //compare two strings.
import java.lang.*;
public class String6
{ String s1,s2;
  void input()
  { Scanner ob=new Scanner(System.in);
    System.out.println("Enter string1:");
    s1=ob.nextLine();
    System.out.println("Enter string2:");
    s2=ob.nextLine();
      
  }
  void compare()
  {  System.out.println("After Comarison");
      int a=s1.compareTo(s2);
     if(a<=0)
          System.out.println(s1+"\n"+s2);
     else
          System.out.println(s2+"\n"+s1);   
      
  }
   public static void main(String[] args) 
   {
        String6 obj=new String6();
        obj.input();
        obj.compare();
    }
    
}
