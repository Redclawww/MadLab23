class mother
{
  public static void show ()
  {
    System.out.println ("mother class");
  }
  public static int x;
}

class child extends mother
{
   // derived class from mother
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
