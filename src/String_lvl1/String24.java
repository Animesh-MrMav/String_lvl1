package String_lvl1;
import java.util.*; //7 Wonders
import java.lang.*;
public class String24
{ String[] cn={"India","Egypt","China","Jordan","Brazil","Peru","Mexico","Italy"};
  String[] wn={"Taj Mahal","The Great Pyramid of Giza(honorary mention)","The Great Wall of China","Petra","Christ the Redeemer","Machu Picchu","Chichen Itza",
               "Colosseum"};
  String c;
  void input()
  {
      Scanner ob=new Scanner(System.in);
      System.out.println("Enter the name of the country:");
      c=ob.nextLine();
  }
  void wonder()
  {   int f=-1;
      for(int i=0;i<=7;i++)
      {
          if(c.compareToIgnoreCase(cn[i])==0)
          {
              System.out.println("The Wonder of the country is:"+wn[i]);
              f=1;
          }
      }
      if(f==-1)
          System.out.println("Check the country name again.");
           
  }
    public static void main(String[] args) 
   {
        String24 obj=new String24();
        obj.input();
        obj.wonder();
    }
  
    
}
