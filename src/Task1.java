
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car maruti=new Car();
		maruti.Color="Red";
		maruti.Price=123456;
		System.out.println("The Color of car is "+ maruti.Color + " Price is "+ maruti.Price);
	}

}
class Car{
	String Color;
	int Price;
}
