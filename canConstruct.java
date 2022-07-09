import java.util.*;
class canConstruct
{
    
    static boolean checkString(String test,String[] arr,HashMap map)
    {
        if(map.containsKey(test))
          return (boolean) map.get(test);
         if(test.equals(""))
          return true;
         for(int i=0;i<arr.length;i++)
         {
            if(test.indexOf(arr[i])==0)
            {
                String new_test = test.substring(arr[i].length());
                if(checkString(new_test,arr,map))
                {
                    map.put(test,true);
                    return true;
                }
            }
         }
         map.put(test,false);
         return false;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String test = scan.nextLine();
        System.out.println("Enter the size of the array word to check");
        int size = scan.nextInt();
        scan.nextLine();
        String[] arr = new String[size];
        System.out.println("Enter the array of words to check");
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextLine();
        }
        HashMap<String ,Boolean> map = new HashMap<>();
        System.out.println(checkString(test,arr,map));
    }
}