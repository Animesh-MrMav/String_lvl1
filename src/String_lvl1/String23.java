package String_lvl1;
import java.util.*;
public class String23 
{ String[] n=new String[5],rno=new String[5];
  void input()
  {
      Scanner ob =new Scanner(System.in);
      for(int i=0;i<5;i++)
      {
          System.out.println("enter the Name of student "+(i+1)+":");
          n[i]=ob.nextLine();
          System.out.println("enter the Roll no. of student "+(i+1)+":");
          rno[i]=ob.nextLine();
      }
  }
  void print()
  {
      System.out.println("Name\t\tRoll No.");
      for(int i=0;i<5;i++)
      {
          System.out.println(n[i]+"\t\t"+rno[i]);
         
      }
  }
    public static void main(String[] args) 
   {
        String23 obj=new String23();
        obj.input();
        obj.print();
    }
    
    
}
