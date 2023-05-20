public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		test t=new test();
		t.display();
		abstest temp =new abstest();
		temp.display();
	}
}
interface Testable{
    void display();

}
class test implements Testable{
    public void display(){
        System.out.println("This is test class");
    }
}
abstract class abstest implements Testable
{
    abstract public void display();
}
//error: abstest is abstract; cannot be instantiated
