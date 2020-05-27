package String_lvl1;
import java.util.*; //xtrct palin.
import java.lang.*;
public class String21 
{
  String str;
  void input()
  { Scanner ob=new Scanner(System.in);
    System.out.println("Enter the string:");
    str=ob.nextLine();   
  }
  int palindrome(String w)
  {   int i=0,len;
      String rev="";
      len=w.length();
      for(i=0;i<len;i++)
      {
          rev=w.charAt(i)+rev;
      }
      if(w.compareToIgnoreCase(rev)==0)
        return 1;
      else
          return 0;
      
  }
  void xtrct()
  {   String wd;
      int len = str.length(),t=0,flag;
      str=str+" ";
      System.out.println("The palindrome words are:");
      for(int i=0;i<=len;i++)
      {  if(str.charAt(i)==' ')
          {  
             wd=str.substring(t, i);
             t=i+1;
             flag= palindrome(wd);
             if(flag==1)
                  System.out.println(wd);
          }
      }
  }
    public static void main(String[] args) 
   {
        String21 obj=new String21();
        obj.input();
        obj.xtrct();
    }
    
}
