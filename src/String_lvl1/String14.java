package String_lvl1;
import java.util.*; // 15th aug to 26th jan.
import java.lang.*;
public class String14 
{ String str;
  void input()
  { Scanner ob=new Scanner(System.in);
    System.out.println("Enter the String:");
   str=ob.nextLine();   
  }
  void change()
  {
      String[] arr=new String[10];
      String wd;
      int n=0,i,l,t=0;
      l=str.length();
      str=str+" ";
      for(i=0;i<=l;i++)
      { char c=str.charAt(i);
        if(c==' ')
        { wd=str.substring(t,i);
          arr[n++]=wd;
          t=i+1;    
        }   
      }
      for(i=0;i<n;i++)
      {
          if(arr[i].compareToIgnoreCase("15")==0)
              arr[i]="26";
          if(arr[i].compareToIgnoreCase("August")==0)
              arr[i]="Januray";
          if(arr[i].compareToIgnoreCase("Independance")==0)
              arr[i]="Republic";
      }
      System.out.println("The new String is:");
      for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
  }
   public static void main(String[] args) 
   {
        String14 obj=new String14();
        obj.input();
        obj.change();
    }
    
}
