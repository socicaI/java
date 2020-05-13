package Case_History;

public class Case_history_Enemy_Long extends Case_history_Enemy{
	public int mutal_hp =10;
	public int mutal_attack=30;
	public int mutal_defense=1;
	public void mutal() {
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println("뮤탈");
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: "+ mutal_hp);
		System.out.println("공격력: "+ mutal_attack);
		System.out.println("방어력: "+ mutal_defense);
	}
	public int hydra_hp =10;
	public int hydra_attack=20;
	public int hydra_defense=1;
	public void hydra() {

		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println("히드라");
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: "+ hydra_hp);
		System.out.println("공격력: "+hydra_attack);
		System.out.println("방어력: "+ hydra_defense);
	}
}
