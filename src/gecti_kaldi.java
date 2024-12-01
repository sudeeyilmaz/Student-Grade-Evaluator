import java.util.Scanner;
public class gecti_kaldi {

	public static void main(String[] args) {
		Scanner cevap = new Scanner(System.in);
		
		System.out.println("Harf veya sayı giriniz: ");
		String harf = cevap.nextLine();
		
		double ortalama = 0;
		
		try {
			
			int vize = Integer.parseInt(harf);
			if(vize<-1 || vize>100) {
				
				System.out.println("Geçersiz bir not girdiniz. ");
				while(vize<-1 || vize>100) {
			    System.out.println("Harf veya sayı giriniz: ");
			    harf = cevap.nextLine();
			    vize = Integer.parseInt(harf);
			    }
			   
			}
			    if(vize>=-1 && vize<=100)
			    	
				System.out.println("İkinci notu giriniz: ");
				int finall = Integer.parseInt(cevap.nextLine());
				
				
				 if(finall < -1 || finall > 100) {
					 System.out.println("Geçersiz bir not girdiniz");
					 while(finall <-1 || finall>100) {
				     System.out.println("İkinci notu giriniz: ");
				    
					 finall = Integer.parseInt(cevap.nextLine());
					 }
					 }
					 ortalama = (vize * 0.4) + (finall * 0.6);
		 
					 if(vize==-1) {
				    		ortalama = finall*0.6;
						}
					 if(finall==-1) {
						 ortalama = vize*0.4;
					 }
			
				 if(ortalama>=90 && ortalama<=100) 
					 System.out.print("Ortalama " + ortalama + " ile Pekiyi olarak değerlendirildiniz.");
				 else if(ortalama>=85 && ortalama<=89)
					 System.out.print("Ortalama " + ortalama + " ile İyi-Pekiyi olarak değerlendirildiniz.");
				 else if(ortalama>=80 && ortalama<=84)
					 System.out.print("Ortalama " + ortalama + " ile İyi olarak değerlendirildiniz.");
				 else if(ortalama>=70 && ortalama<=79)
					 System.out.print("Ortalama " + ortalama + " ile Orta-İyi olarak değerlendirildiniz.");
				 else if(ortalama>=60 && ortalama<=69)
					 System.out.print("Ortalama " + ortalama + " ile Orta olarak değerlendirildiniz.");
				 else if(ortalama>=50 && ortalama<=59)
					 System.out.print("Ortalama " + ortalama + " ile Geçer olarak değerlendirildiniz.");
				 else if(ortalama>=0 && ortalama<=49)
					 System.out.print("Ortalama " + ortalama + " ile Başarısız olarak değerlendirildiniz.");
				      
				    	
			
		}
		catch(NumberFormatException e) {}
		
		
		switch(harf.toUpperCase()) {
		
		case("AA"):
		  System.out.print("Pekiyi olarak değerlendirildiniz.");
		    break;
		case("BA"):
			System.out.print("İyi-Pekiyi olarak değerlendirildiniz.");
		    break;
		case("BB"):
			  System.out.print("İyi olarak değerlendirildiniz.");
			  break;
		case("CB"):
			  System.out.print("Orta-İyi olarak değerlendirildiniz.");
			  break;
		case("CC"):
			  System.out.print("Orta olarak değerlendirildiniz.");
			  break;
		case("DC"):
			  System.out.print("Geçer olarak değerlendirildiniz.");
			  break;
		case("DD"):
			  System.out.print("Geçer olarak değerlendirildiniz.");
			  break;
		case("FF"):
			  System.out.print("Başarısız olarak değerlendirildiniz.");
			  break;
		case("M"):
			  System.out.print("Muaf olarak değerlendirildiniz.");
			  break;
		case("S"):
			  System.out.print("Yeterli-Başarılı olarak değerlendirildiniz.");
			  break;
		case("U"):
			  System.out.print("Yetersiz-Başarısız olarak değerlendirildiniz.");
			  break;
		case("I"):
			  System.out.print("Eksik-Tamamlanmamış olarak değerlendirildiniz.");
			  break;
		case("NA"):
			  System.out.print("Devamsız-Başarısız olarak değerlendirildiniz.");
			  break;
		case("-1"):
			  System.out.print("Sınava girmedi olarak değerlendirildiniz.");
			  break;
			  
		}
		
		

	}

}
