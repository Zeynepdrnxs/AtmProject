
public class Account {
	   private String cardNumber;
	   private String password;
	   private double balance;
	   private String userName;
	   private String lastName;
	public Account(String cardNumber, String password, double balance, String userName, String lastName) {
		
		this.cardNumber = cardNumber;
		this.password = password;
		this.balance = balance;
		this.userName = userName;
		this.lastName = lastName;
	}
	public Account() {
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	 
}
