package in.ashokit;

public class App {
public static void main(String[] args) {
	
	
	IPayment p1=new CreditCardPayment ();
	IPayment p2=new DebitCardPayment ();
	
	//Constructor Injection 
	PaymentService ps = new PaymentService(p1);
	
	ps.setPayment(p2);
	
	ps.doPayment(400.00);
	
}
}
