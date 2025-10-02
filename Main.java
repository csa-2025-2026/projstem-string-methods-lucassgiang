public class Main
{
  public static void main(String[] args)
  {
    removeStr("badaboom", "ada");
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
  
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output = null;
    int num = s1.indexOf(s2);
    output = s1.substring(0,num) + s1.substring(num + s2.length());
    System.out.println(output);
    return output;
  }
}
