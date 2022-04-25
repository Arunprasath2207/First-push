class Rearrange_String
{
    public String restoreString(String s, int[] in) 
    {
        char[] c = new char[s.length()];
        for(int i=0;i<in.length;i++)
        {
            c[in[i]]=s.charAt(i);
        }
        String str = new String(c);
        return str;
    }
}