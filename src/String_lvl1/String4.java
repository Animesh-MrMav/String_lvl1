package String_lvl1;
import java.util.*; //cnt no of vowels
import java.lang.*;
public class String4
{ String str;
  void input()
  { Scanner ob=new Scanner(System.in);
    System.out.println("Enter the string:");
    str=ob.nextLine();   
  }
  void calc()
  {
      int i=0,len,cnt=0;
      len=str.length();
      String s="AEIOUaeiou";
       for(i=0;i<len;i++)
      {  char ch=str.charAt(i);
          if(s.indexOf(ch)!=-1)
              cnt++;        
      }
       System.out.println("The no of vowels is:"+cnt);
  }
  public static void main(String[] args) {
        String4 obj=new String4();
        obj.input();
        obj.calc();
    }
}
