package prob02;
// for문 안에 생성자 넣어주기 !!!! 
import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Goods[] all = new Goods[3];
		
		for (int i = 0; i < COUNT_GOODS; i++) {
			Goods goods = new Goods(); // 생성자도 같이 생성해주어야 한다. for문 밖에 있으면 생성을 한번 밖에 못해서 마지막 저장값만 찍힌다.
			String info = scanner.nextLine();
			String[] data = info.split(" ");  //" " 스페이스마다 data에 값을 집어넣는다.
			
			String name = data[0];
			int price = Integer.parseInt(data[1]);
			int count = Integer.parseInt(data[2]);
			
			
			goods.setName(name);
			goods.setPrice(price);
			goods.setCount(count);
			
			all[i] =goods;
			
		}
		
		for (int i = 0; i < COUNT_GOODS; i++) {			
			System.out.println(
					all[i].getName() +
					"(가격:"+all[i].getPrice()+")이 " +
					all[i].getCount()+"개 입고 되었습니다."
					);
		}
		
		scanner.close();
	}
}
