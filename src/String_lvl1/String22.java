package String_lvl1;
import java.util.*; //double pattern
import java.lang.*;
public class String22
{  String str;
   void input()
   { Scanner ob=new Scanner(System.in);
     System.out.println("Enter the string:");
     str=ob.nextLine();   
   }
   int doublewrds(String w)
   { int flag=-1;
     for(int i=0;i<w.length()-1;i++)
     {
         if(w.charAt(i)==w.charAt(i+1))
         {
             flag=1;
             break;
         }
     }
       if(flag==1)
           return 1;
       else
           return 0;
   }
   void check()
   {
      String wd;
      int len = str.length(),t=0,f;
      str=str+" ";
      System.out.println("Word\t\tStatus");
      for(int i=0;i<=len;i++)
      {  if(str.charAt(i)==' ')
          {  
             wd=str.substring(t, i);
             t=i+1;
             f= doublewrds(wd);
             if(f==1)
                  System.out.println(wd+"\t\t"+"Double word.");
             else
                  System.out.println(wd+"\t\t"+"Not a Double word.");
          }
      }
   }
     public static void main(String[] args) 
   {
        String22 obj=new String22();
        obj.input();
        obj.check();
    }
   
    
}
