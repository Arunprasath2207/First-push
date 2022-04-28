class First_palindrome__String_Array
{
    public boolean find(String w)
    {
       int i=0;
       int j=w.length()-1;
       while(i<j)
       {
           if(w.charAt(i)!=w.charAt(j))
               return false;
           i++;
           j--;
       }
        return true;
    }
    public String firstPalindrome(String[] words) 
    {
        for(int i=0;i<words.length;i++)
        {
           if(find(words[i]))
           {
               return words[i];
           }
        }
        String str="";
        return str;
    }
}