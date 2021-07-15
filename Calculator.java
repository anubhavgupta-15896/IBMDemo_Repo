public class Calculator
{
  public static int square(nt x)
  {
    return x*x;
  }
  public static int sum(int x, int y)
  {
    return x+y;
  }
  public static int power(int x, int y)
  {
    int res = 1;
    for(;y>0;y--)
      res =res *x;
    return res;
  }
  public static void sayHello()
  {
    System.out.println("Hello World");
  }
}
