package prob03;
// static에 저장된다는 것 그래서 코딩이 어떻게 바뀌는지 알아야 한다.
public class CurrencyConverter {
	
	private static double rate;
	private static double won;
	private static double dollar;
	

	public static double getRate() {
		return rate;
	}

	public static double  toDollar(double won) {
		return won / rate;
	      // 한국 원화를 달러로 변환
	   }
	public static double  toKRW(double dollar) {
	      // 달러를 한국 원화로 변환
		return dollar * rate ;
	}

	
	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;  //static 에서는 this를 쓸 수없다. 대신에 클래스 이름을 써준다. 
	}
	
}
