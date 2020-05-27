package String_lvl1;
import java.util.*; //Capital small alternate
import java.lang.*;
public class String17 
{ String str;
  void input()
  { Scanner ob=new Scanner(System.in);
    System.out.println("Enter the String:");
   str=ob.nextLine();   
  }
  void alternate()
  {   String cpy="";
      int l=str.length();
      for(int i=0;i<l;i++)
      {   char ch=str.charAt(i);
          if(i%2==0)
              cpy=cpy+Character.toUpperCase(ch);
          else
              cpy=cpy+Character.toLowerCase(ch);       
      }
      System.out.println("The new string is:"+cpy);
  }
     public static void main(String[] args) 
   {
        String17 obj=new String17();
        obj.input();
        obj.alternate();
    }
    
}
