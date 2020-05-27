package String_lvl1;
import java.util.*; // title case
import java.lang.*;
public class String19 
{ String str;
  void input()
  { Scanner ob=new Scanner(System.in);
    System.out.println("Enter the String:");
    str=ob.nextLine();   
  }
   void title()
   {   String cpy=" ";
       int l =str.length(),t=0;
       str=str+" ";
       for(int i=0;i<=l;i++)
       { String wd;
         if(str.charAt(i)==' ')
          {  wd=str.substring(t, i);
             t=i+1;
             cpy=cpy+Character.toUpperCase(wd.charAt(0))+wd.substring(1, wd.length())+" "; 
          }
       }
       System.out.println("The String is title case is :"+cpy);
   }
    public static void main(String[] args) 
   {
        String19 obj=new String19();
        obj.input();
        obj.title();
    }
}
