package String_lvl1;
import java.util.*; //cnt no of words
import java.lang.*;
public class String5
{  String str;
  void input()
  { Scanner ob=new Scanner(System.in);
    System.out.println("Enter the string:");
    str=ob.nextLine();   
  }
  void calc()
  {
      int i=0,len,cnt=0;
      len=str.length();
      str=" "+str;
      if(str.charAt(len)==' ')
          len--;
       for(i=0;i<=len;i++)
      {  char ch=str.charAt(i);
          if(ch==' ')
              cnt++;        
      }
       System.out.println("The no of words:"+cnt);
  }
   public static void main(String[] args) {
        String5 obj=new String5();
        obj.input();
        obj.calc();
    }
    
}
