package String_lvl1;
import java.util.*; //frequency of each alphabet
import java.lang.*;
public class String18
{ String str;
  void input()
  { Scanner ob=new Scanner(System.in);
    System.out.println("Enter the String:");
   str=ob.nextLine();   
  }
  void frequency()
  {
      int l=str.length(),in=0,flag;
      int[] f=new int[20];
      char[] c=new char[20];
      for(int i=0;i<l;i++)
      { char ch=str.charAt(i);
        flag=-1;
        for(int j=0;j<in;j++)
        {
            if(c[j]==ch)
            {
                flag=j;
                break;
            }
        }
          if(flag!=-1)
          {
              f[flag]++;
          }
          else
          {   
              c[in]=ch;
              f[in]=1;
              in++;
              
          }
      }
      System.out.println("Character\t\tFrequency");
      for(int i=0;i<in;i++)
          System.out.println(c[i]+"\t\t"+f[i]);
  }
    public static void main(String[] args) 
   {
        String18 obj=new String18();
        obj.input();
        obj.frequency();
    }
    
}
