package String_lvl1;
import java.util.*; //start with vowel
import java.lang.*;
public class String16 
{ String[] n= new String[5];
  void input()
  {   Scanner ob=new Scanner(System.in);
      System.out.println("Enter the five name:");
      for(int i=0;i<5;i++)
          n[i]=ob.nextLine();
  }
  void print()
  {    String c="AEIOUaeiou";
      System.out.println("Names that start with vowel are:");
      for(int i=0;i<5;i++)
      {   char ch=n[i].charAt(0);
          if(c.indexOf(ch)!=-1)
          System.out.println(n[i]);
      }
  }
    public static void main(String[] args)
    { String16 obj=new String16();
      obj.input();
      obj.print();
        
    }
}

