package String_lvl1;
import java.util.*; // merit
import java.lang.*;
public class String25
{ String[] n=new String[5];
  int[] m=new int[5];
  void input()
  {
      Scanner ob =new Scanner(System.in);
      for(int i=0;i<5;i++)
      {
          System.out.println("enter the Name of student "+(i+1)+":");
          n[i]=ob.next();
          System.out.println("enter the marks of student "+(i+1)+":");
          m[i]=ob.nextInt();
      }
  }
  void merit()
  {   String temp;
      int t;
      System.out.println("Rank\t\tName\t\tMarks");
      for(int i=0;i<4;i++)
      {
          for(int j=0;j<4-i;j++)
           { if(m[j]<m[j+1])
              {  t=m[j];
                 m[j]=m[j+1];
                 m[j+1]=t;
                 temp=n[j];
                 n[j]=n[j+1];
                 n[j+1]=temp;
              }
          }
      }
      for(int i=0;i<5;i++)
      {
          System.out.println((i+1)+"\t\t"+n[i]+"\t\t"+m[i]);
      }
      
  }
   public static void main(String[] args) 
   {
        String25 obj=new String25();
        obj.input();
        obj.merit();
    }
    
}
