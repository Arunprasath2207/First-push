class Count_items_Matching
{
    public int countMatches(List<List<String>> items, String r, String ruleValue) 
    {
      int count=0;
      for(int i=0;i<items.size();i++)
      {
          List<String> s = new ArrayList<>(items.get(i));
          if(r.equals("color") && s.get(1).equals(ruleValue))
              count++;
          else if(r.equals("type") && s.get(0).equals(ruleValue))
              count++;
          else if(r.equals("name") && s.get(2).equals(ruleValue))
              count++;
      }
      return count;
    }
}