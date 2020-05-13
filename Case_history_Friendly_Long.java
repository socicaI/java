package Case_History;

public class Case_history_Friendly_Long extends Case_history_Friendly{
	public void rifle() {
		hp=10;
		attack=20;
		defense=1;
		attackcharge=2;
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println("소총병 | 가격:400원");
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: "+ hp);
		System.out.println("공격력: "+ attack);
		System.out.println("방어력: "+ defense);
		System.out.println();
	}
	public void sniper() {
		hp=10;
		attack=30;
		defense=1;
		attackcharge=2;
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println("저격병 | 가격:500원");
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: "+ hp);
		System.out.println("공격력: "+ attack);
		System.out.println("방어력: "+ defense);
		System.out.println();
	}
}
