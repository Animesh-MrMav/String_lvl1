package String_lvl1;
import java.util.*; //substring
import java.lang.*;
public class String10 
{ String str;
  void input()
  { Scanner ob=new Scanner(System.in);
    System.out.println("Enter the string:");
    str=ob.nextLine();   
  }
  void subs()
  {   int c;
      int l=str.length();
      c=str.indexOf(" ");
      System.out.println("The substring is:"+str.substring(c-1));
  }
   public static void main(String[] args) {
        String10 obj=new String10();
        obj.input();
        obj.subs();
    }
    
}
