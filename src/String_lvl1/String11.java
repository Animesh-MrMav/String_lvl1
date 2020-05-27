package String_lvl1;
import java.util.*; // piglatin
import java.lang.*;
public class String11
{ String str;
  void input()
  { Scanner ob=new Scanner(System.in);
    System.out.println("Enter the string:");
    str=ob.nextLine();   
  }
  void piglatin()
  {   int l=str.length(),i;
      String pg,v="AEIOUaeiou";
      for(i=0;i<l;i++)
      {  char c= str.charAt(i);
         if(v.indexOf(c)!=-1)
          break;
      }
      pg=str.substring(i)+str.substring(0,i)+"ay";
      System.out.println("Piglatin Word:"+pg);  
      
  }
   public static void main(String[] args) {
        String11 obj=new String11();
        obj.input();
        obj.piglatin();
    }
    
}
