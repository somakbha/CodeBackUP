import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample1 {

	public static void main(String[] args) {
		Supplier<Date> systemDateSupplier=()->new Date();
		System.out.println(systemDateSupplier.get());
		
		Supplier<String> otpGenerator=()->{
			String otp="";
			for (int i=0; i<6;i++)
			{
				int newNumber=(int)(Math.random()*10);
				otp=otp+newNumber;
			}
			return otp;
		};
		
		
		System.out.println(otpGenerator.get());
		System.out.println(otpGenerator.get());
		System.out.println(otpGenerator.get());

	}

}
