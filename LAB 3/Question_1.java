class bharatvanshis{
    public void fight(){
    System.out.println("All bharatvanshis are fighters");
    }
}
class pandavas extends bharatvanshis{

    int kindness,obedience;
    public pandavas(int x,int y)
    {
        kindness=x;
        obedience=y;
    }
    void kind(){
    System.out.println("Kindness = "+ kindness);
    }
    void obey()
    {
    System.out.println("Obedience"+ obedience);
    }

}
class kauravs extends bharatvanshis
{
    int kindness,obedience;
    public kauravs(int x,int y){
        kindness=x;
        obedience=y;
    }
    void kind(){
    System.out.println("Kindness = "+ kindness);
    }
    void obey()
    {
    System.out.println("Obedience"+ obedience);
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Mahabharat");
		pandavas Arjun=new pandavas(10,10);
	    pandavas Bheem=new pandavas(8,10);
	    kauravs Duryodhan=new kauravs(0,0);
	    kauravs Vikarn=new kauravs(10,10);
	    Arjun.fight();
	}

}
