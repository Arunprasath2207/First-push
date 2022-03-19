import java.util.*;
public class largest_number_formed
{
    public static void main(String[] args)
{
     int n;
     String a,b;
     String swap;
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the size of the array");
     n=scan.nextInt();
     scan.nextLine();
     String[] array = new String[n];
     for(int i=0;i<n;i++)
     {
        array[i]=scan.nextLine();
     }
     for(int i=0;i<n-1;i++)
     {
      for(int j=i+1;j<n;j++)
      {
         int position=i;
         a = array[i].concat(array[j]);
         b = array[j].concat(array[i]);
         if(Integer.parseInt(a)<Integer.parseInt(b))
         {
           position = j;
         }
         if(position!=i)
         {
          swap = array[i];
          array[i]=array[position];
          array[position]=swap;
         }
      }
     }
     for(int i=0;i<n;i++)
     {
         System.out.print(""+array[i]);
     }
}
}