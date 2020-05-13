package Case_History;

public class Case_history_Friendly_Short extends Case_history_Friendly{
	public void tanker() {
		hp=50;	
		attack=10;
		defense=5;
		attackcharge=1;
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println("탱커 | 가격:500원");
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: "+ hp);
		System.out.println("공격력: "+ attack);
		System.out.println("방어력: "+ defense);
		System.out.println();
	}
	public void nife() {
		hp=30;
		attack=35;
		defense=2;
		attackcharge=1;
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println("칼병 | 가격:400원");
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: "+ hp);
		System.out.println("공격력: "+ attack);
		System.out.println("방어력: "+ defense);
		System.out.println();
	}
}
