package String_lvl1;
import java.util.*; //cnt no of capital letters.
import java.lang.*;
public class String3 
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
      for(i=0;i<len;i++)
      {  char ch=str.charAt(i);
          if(Character.isUpperCase(ch))
              cnt++;        
      }
      System.out.println("The number of capital letters:"+cnt);
  }
    public static void main(String[] args) {
        String3 obj=new String3();
        obj.input();
        obj.calc();
    }
    
}
