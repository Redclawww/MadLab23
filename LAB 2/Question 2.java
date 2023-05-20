class mother
{
  public static void show ()
  {
    System.out.println ("Mother class");
  }
  public static int x;
}

class child extends mother
{
   public static void show ()
  {
    System.out.println ("Child class");
  }
}
class Main
{
  public static void main (String args[])
  {
    mother m = new mother ();
      m.show ();
    child ch = new child ();
      ch.show ();
  }
}
