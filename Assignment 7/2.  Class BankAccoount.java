import java.util.*;
class Bankaccount{
    private int balance=100;
     void deposit(int amount){
        balance+=amount;
         System.out.println("deposited:"+ amount);
    }
     int getBalance(){
        return balance;
    }
}
public class Main
{
	public static void main(String[] args) {
		Bankaccount customer = new Bankaccount();
		customer.deposit(200);
		System.out.println(customer.getBalance());
		System.out.println(customer.balance);
	}
}
