public class Main
{
	public static void main(String[] args) {
		one temp=new one(5);
	}

}
class one{
   one(int x){
       System.out.println("This is One class");
   }
}

class two extends one{
    two(){
        super(25);
    }
}
