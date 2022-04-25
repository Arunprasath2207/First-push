class Jwell_Stone
{
    public int numJewelsInStones(String j, String s) 
    {
        int count=0;
       for(int i=0;i<j.length();i++)
       {
           for(int k=0;k<s.length();k++)
           {
               if(s.charAt(k)==j.charAt(i))
                   count++;
           }
       }
        return count;

     }
}