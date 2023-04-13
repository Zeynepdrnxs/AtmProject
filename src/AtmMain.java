import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {
		
		Account account1=new Account("111","1", 5000, "Zeynep", "DURNA");
		
		Account account2=new Account();
		account2.setCardNumber("222");
		account2.setPassword("2");
		account2.setBalance(2000);
		account2.setUserName("Zeynep");
		account2.setLastName("DURNA");
		
		String cardNumber, password;
		
		Scanner scanner=new Scanner(System.in);
		while(account2.getBalance()>0) {
			
		System.out.println("Lütfen kart numaranızı giriniz:");
		cardNumber=scanner.nextLine();
		if(cardNumber.equals(account2.getCardNumber())) {
			
		System.out.println(account2.getUserName()+ " " + account2.getLastName()+  " HOŞGELDİNİZ LÜTFEN ŞİFRENİZİ GİRİNİZ: "  );
			
		password=scanner.nextLine();
		if (password.equals(account2.getPassword())) {
			boolean b = true;
		while(b) {
			
		System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
		System.out.println("1-Para Çekmek");
		System.out.println("2-Para Yatırmak");
		System.out.println("3-Güncel Bakiye");
		System.out.println("4-Çıkış");
		
		int islem=scanner.nextInt();
		if (islem==1) {
			System.out.println("Güncel Bakiye:" +account2.getBalance());
			System.out.println("Lütfen çekmek istediğiniz tutarı giriniz:");
			double tutar=scanner.nextDouble();
			
			if (tutar>account2.getBalance()) {
				System.out.println("Bakiye Yetersiz! Güncel Bakiye="+account2.getBalance());
	
			}else {
				System.out.println("Para çekme işlemi başarılı!");
			account2.setBalance(account2.getBalance()-tutar);
			System.out.println("Bakiye:" +account2.getBalance());
			
			}
			
		}else if (islem==2 ) {
			System.out.println("Güncel Bakiye:" +account2.getBalance());
			System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz:");
			double tutar=scanner.nextDouble();
			
			account2.setBalance(tutar+account2.getBalance());
			System.out.println("Güncel Bakiye:" +account2.getBalance());
			
		}else if (islem==3) {
			System.out.println("Güncel Bakiye:" +account2.getBalance());
			
		}else if (islem==4) {
			System.out.println("Kullanımız için teşekkürler İyi Günler " + account2.getUserName()+" "+ account2.getLastName());
			return;
		}else {
		System.out.println("HATALI İŞLEM LÜTFEN TEKRAR DENEYİNİZ! ");	
		}
		}
		}else {
			System.out.println("HATALI ŞİFRE GİRDİNİZ!");
		}
		
		}else {
			System.out.println("YANLIŞ KART NUMARASI GİRDİNİZ!");
		}
		
		}
	}
	
}
