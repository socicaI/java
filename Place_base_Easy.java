package Place;

import java.util.Scanner;

public class Place_base_Easy extends Place_Base implements Runnable {
	Scanner sc = new Scanner(System.in);
	Place_Shop shop = new Place_Shop();
	Case_History.Case_history_Friendly_Short charge1 = new Case_History.Case_history_Friendly_Short();
	Case_History.Case_history_Friendly_Long charge2 = new Case_History.Case_history_Friendly_Long();
	Case_History.Case_history_Enemy_Short e_charge1 = new Case_History.Case_history_Enemy_Short();
	Case_History.Case_history_Enemy_Long e_charge2 = new Case_History.Case_history_Enemy_Long();
	Case_History.Friendly fr = new Case_History.Friendly();

	String arr[] = new String[5];
	String arr2[] = new String[4];
	int arr5[] = new int[1];
	String arr6[] = new String[5];
	int stone = 0;
	int num;
	int sum;
	int sum1;
	public boolean t = true;

	int mutal_hp = 10;
	int mutal_attack = 30;
	int mutal_defense = 1;

	int hydra_hp = 10;
	int hydra_attack = 20;
	int hydra_defense = 1;

	int thief_hp = 30;
	int thief_attack = 35;
	int thief_defense = 2;

	int goblin_hp = 50;
	int goblin_attack = 10;
	int goblin_defense = 5;
	String a = "thief";
	String b = "goblin";
	String c = "mutal";
	String d = "hydra";
	int j;
	int i;
	int tanker_hp = 50;
	int tanker_attack = 10;
	int tanker_defense = 5;

	int nife_hp = 30;
	int nife_attack = 35;
	int nife_defense = 2;

	int rifle_hp = 10;
	int rifle_attack = 20;
	int rifle_defense = 1;

	int sniper_hp = 10;
	int sniper_attack = 30;
	int sniper_defense = 1;

	int tanker_hp_1 = tanker_hp;
	int tanker_hp_2 = tanker_hp;
	int tanker_hp_3 = tanker_hp;
	int tanker_hp_4 = tanker_hp;
	int tanker_hp_5 = tanker_hp;

	int nife_hp_1 = nife_hp;
	int nife_hp_2 = nife_hp;
	int nife_hp_3 = nife_hp;
	int nife_hp_4 = nife_hp;
	int nife_hp_5 = nife_hp;

	int rifle_hp_1 = rifle_hp;
	int rifle_hp_2 = rifle_hp;
	int rifle_hp_3 = rifle_hp;
	int rifle_hp_4 = rifle_hp;
	int rifle_hp_5 = rifle_hp;

	int sniper_hp_1 = sniper_hp;
	int sniper_hp_2 = sniper_hp;
	int sniper_hp_3 = sniper_hp;
	int sniper_hp_4 = sniper_hp;
	int sniper_hp_5 = sniper_hp;

	int hydra_hp_1 = hydra_hp;
	int goblin_hp_1 = goblin_hp;
	int mutal_hp_1 = mutal_hp;
	int thief_hp_1 = thief_hp;
	int p = 0;

	int o = 0;
	int oo = 0;
	int ooo = 0;
	int oooo = 0;
	int ooooo = 0;

	int z = 0;
	int zz = 0;
	int zzz = 0;
	int zzzz = 0;
	int zzzzz = 0;
	int yy=0;
	
	public void money() {
		int kk=(int)(Math.random() * 10);
		if(kk==7) {
			money+=1000;
		}
	}

	@Override // 스레드 시작
	public void run() {
		try {
			while (t == true) {
				if (hp1 <= 0) {
					this.defeat();
				} else if (hp2 <= 0) {
					this.win();
				}
				this.base();
				this.easy();
				Thread.sleep(1000);
				
				yy++;
				if(yy==2) {
				this.money();
				yy=0;
				}
				p++;
				if (p >= 3) { // 3초가 될 때마다 랜덤으로 생성한 유닛을 랜덤배치
					j = (int) (Math.random() * 4);// 1~4까지
					i = (int) (Math.random() * 5);// 0~4까지의 배열
					if (j == 0) {
						if (arr6[i] == "빈 공간") {
							arr6[i] = a; // thief 소환
							p = 0;
						}
					} else if (j == 1) {
						if (arr6[i] == "빈 공간") {
							arr6[i] = b; // goblin 소환
							p = 0;
						}
					} else if (j == 2) {
						if (arr6[i] == "빈 공간") {
							arr6[i] = c;// mutal 소환
							p = 0;
						}
					} else if (j == 3) {
						if (arr6[i] == "빈 공간") {
							arr6[i] = d; // hydra 소환
							p = 0;
						}
					}
				}
				this.off();
				if (arr1[0] != "빈 공간") { // arr1[0]에 유닛이 있을 경우
					if (o == 2) { // o가 2이면 공격
						if (arr1[0] == "  탱커" || arr1[0] == "탱커(R)" || arr1[0] == "탱커(G)" || arr1[0] == "탱커(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= tanker_attack;
							}
						} else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)"
								|| arr1[0] == "칼병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= nife_attack;
							}
						} else if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)"
								|| arr1[0] == "소총병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= rifle_attack;
							}
						} else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)"
								|| arr1[0] == "저격병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= sniper_attack;
							}
						}
						if (arr1[0] == "  탱커" || arr1[0] == "탱커(R)" || arr1[0] == "탱커(G)" || arr1[0] == "탱커(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= tanker_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= tanker_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= tanker_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= tanker_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= tanker_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= tanker_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= tanker_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= tanker_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] == "칼병(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= nife_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= nife_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= nife_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= nife_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= nife_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											money += 150;
											goblin_hp_1 = goblin_hp;;
										}
									} else if (j == 1) {
										goblin_hp_2 -= nife_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= nife_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= nife_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] == "소총병(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= rifle_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= rifle_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= rifle_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= rifle_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= rifle_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= rifle_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											money += 150;
											goblin_hp_2 = goblin_hp;;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= rifle_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= rifle_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" || arr1[0] == "저격병(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= sniper_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= sniper_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= sniper_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= sniper_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= sniper_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= sniper_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= sniper_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= sniper_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							} // 시작끝
						}
						if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" || arr1[0] == "저격병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= sniper_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= sniper_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= sniper_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= sniper_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= sniper_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= sniper_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= sniper_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= sniper_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= sniper_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= sniper_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= sniper_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= sniper_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						}
						if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] == "소총병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= rifle_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= rifle_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= rifle_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= rifle_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= rifle_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= rifle_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= rifle_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= rifle_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= rifle_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= rifle_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= rifle_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												money += 150;
												thief_hp_4 = thief_hp;
											}
										} else if (j == 4) {
											thief_hp_5 -= rifle_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						}
						if (arr1[0] == "  탱커" || arr1[0] == "탱커(R)" || arr1[0] == "탱커(G)" || arr1[0] == "탱커(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= tanker_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= tanker_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												money += 150;
												hydra_hp_4 = hydra_hp;;
											}
										} else if (j == 4) {
											hydra_hp_5 -= tanker_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= tanker_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= tanker_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= tanker_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= tanker_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= tanker_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= tanker_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[0] == "thief") {
										if (j == 2) {
											thief_hp_3 -= tanker_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= tanker_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= tanker_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						}
						if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] == "칼병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= nife_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= nife_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= nife_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= nife_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= nife_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= nife_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= nife_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= nife_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= nife_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= nife_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= nife_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= nife_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						}
					}
					if (o != 2) {
						o++;
					} else if (o == 2) {
						o = 0;
					}
				} // arr6[0] 끝
					// arr6[1] 시작
				if (arr1[1] != "빈 공간") { // arr6[1]에 유닛이 있을 경우
					if (oo == 2) { // oo가 2이면 공격
						if (arr1[1] == "  탱커" || arr1[1] == "탱커(R)" || arr1[1] == "탱커(G)" || arr1[1] == "탱커(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= tanker_attack;
							}
						} else if (arr1[1] == "  칼병" || arr1[1] == "칼병(R)" || arr1[1] == "칼병(G)"
								|| arr1[1] == "칼병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= nife_attack;
							}
						} else if (arr1[1] == "소총병" || arr1[1] == "소총병(R)" || arr1[1] == "소총병(G)"
								|| arr1[1] == "소총병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= rifle_attack;
							}
						} else if (arr1[1] == "저격병" || arr1[1] == "저격병(R)" || arr1[1] == "저격병(G)"
								|| arr1[1] == "저격병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= sniper_attack;
							}
						}
						if (arr1[1] == "  탱커" || arr1[1] == "탱커(R)" || arr1[1] == "탱커(G)" || arr1[1] == "탱커(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= tanker_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= tanker_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= tanker_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= tanker_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= tanker_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= tanker_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= tanker_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											money += 150;
											thief_hp_1 = thief_hp;
										}
									} else if (j == 1) {
										thief_hp_2 -= tanker_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[1] == "  칼병" || arr1[1] == "칼병(R)" || arr1[1] == "칼병(G)" || arr1[1] == "칼병(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= nife_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= nife_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											money += 150;
											hydra_hp_2 = hydra_hp;;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= nife_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= nife_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= nife_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= nife_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								}
							} else if (arr6[j] == "thief") {
								if (j == 0) {
									thief_hp_1 -= nife_attack;
									thief_hp_1 += thief_defense;
									if (thief_hp_1 <= 0) {
										arr6[0] = "빈 공간";
										thief_hp_1 = thief_hp;
										money += 150;
									}
								} else if (j == 1) {
									thief_hp_2 -= nife_attack;
									thief_hp_2 += thief_defense;
									if (thief_hp_2 <= 0) {
										arr6[1] = "빈 공간";
										thief_hp_2 = thief_hp;
										money += 150;
									}
								}
							}
						}
						if (arr1[1] == "소총병" || arr1[1] == "소총병(R)" || arr1[1] == "소총병(G)" || arr1[1] == "소총병(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= rifle_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= rifle_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= rifle_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= rifle_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= rifle_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= rifle_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= rifle_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= rifle_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[1] == "저격병" || arr1[1] == "저격병(R)" || arr1[1] == "저격병(G)" || arr1[1] == "저격병(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= sniper_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= sniper_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= sniper_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= sniper_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= sniper_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= sniper_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= sniper_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= sniper_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											money += 150;
											thief_hp_2 = thief_hp;
										}
									}
								}
							}
							// 시작끝1
						}
						if (arr1[1] == "저격병" || arr1[1] == "저격병(R)" || arr1[1] == "저격병(G)" || arr1[1] == "저격병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" || arr6[2] != "빈 공간" || arr6[3] != "빈 공간"
									|| arr6[4] != "빈 공간") {
								j = (int) (Math.random() * 3) + 2;// 2~4까지
								if (arr6[j] == "hydra") {
									if (j == 2) {
										hydra_hp_3 -= sniper_attack;
										hydra_hp_3 += hydra_defense;
										if (hydra_hp_3 <= 0) {
											arr6[2] = "빈 공간";
											hydra_hp_3 = hydra_hp;;
											money += 150;
										}
									} else if (j == 3) {
										hydra_hp_4 -= sniper_attack;
										hydra_hp_4 += hydra_defense;
										if (hydra_hp_4 <= 0) {
											arr6[3] = "빈 공간";
											money += 150;
											hydra_hp_4 = hydra_hp;;
										}
									} else if (j == 4) {
										hydra_hp_5 -= sniper_attack;
										hydra_hp_5 += hydra_defense;
										if (hydra_hp_5 <= 0) {
											arr6[4] = "빈 공간";
											hydra_hp_5 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 2) {
										mutal_hp_3 -= sniper_attack;
										mutal_hp_3 += mutal_defense;
										if (mutal_hp_3 <= 0) {
											arr6[2] = "빈 공간";
											mutal_hp_3 = mutal_hp;mutal_hp_3 = mutal_hp;
											money += 150;
										}
									} else if (j == 3) {
										mutal_hp_4 -= sniper_attack;
										mutal_hp_4 += mutal_defense;
										if (mutal_hp_4 <= 0) {
											arr6[3] = "빈 공간";
											mutal_hp_4 = mutal_hp;
											money += 150;
										}
									} else if (j == 4) {
										mutal_hp_5 -= sniper_attack;
										mutal_hp_5 += mutal_defense;
										if (mutal_hp_5 <= 0) {
											mutal_hp_5 = mutal_hp;
											arr6[4] = "빈 공간";
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 2) {
										goblin_hp_3 -= sniper_attack;
										goblin_hp_3 += goblin_defense;
										if (goblin_hp_3 <= 0) {
											arr6[2] = "빈 공간";
											goblin_hp_3 = goblin_hp;;
											money += 150;
										}
									} else if (j == 3) {
										goblin_hp_4 -= sniper_attack;
										goblin_hp_4 += goblin_defense;
										if (goblin_hp_4 <= 0) {
											arr6[3] = "빈 공간";
											goblin_hp_4 = goblin_hp;;
											money += 150;
										}
									} else if (j == 4) {
										goblin_hp_5 -= sniper_attack;
										goblin_hp_5 += goblin_defense;
										if (goblin_hp_5 <= 0) {
											arr6[4] = "빈 공간";
											goblin_hp_5 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 2) {
										thief_hp_3 -= sniper_attack;
										thief_hp_3 += thief_defense;
										if (thief_hp_3 <= 0) {
											arr6[2] = "빈 공간";
											money += 150;
											thief_hp_3 = thief_hp;
										}
									} else if (j == 3) {
										thief_hp_4 -= sniper_attack;
										thief_hp_4 += thief_defense;
										if (thief_hp_4 <= 0) {
											arr6[3] = "빈 공간";
											thief_hp_4 = thief_hp;
											money += 150;
										}
									} else if (j == 4) {
										thief_hp_5 -= sniper_attack;
										thief_hp_5 += thief_defense;
										if (thief_hp_5 <= 0) {
											arr6[4] = "빈 공간";
											thief_hp_5 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[1] == "소총병" || arr1[1] == "소총병(R)" || arr1[1] == "소총병(G)" || arr1[1] == "소총병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" || arr6[2] != "빈 공간" || arr6[3] != "빈 공간"
									|| arr6[4] != "빈 공간") {
								j = (int) (Math.random() * 3) + 2;// 2~4까지
								if (arr6[j] == "hydra") {
									if (j == 2) {
										hydra_hp_3 -= rifle_attack;
										hydra_hp_3 += hydra_defense;
										if (hydra_hp_3 <= 0) {
											arr6[2] = "빈 공간";
											hydra_hp_3 = hydra_hp;;
											money += 150;
										}
									} else if (j == 3) {
										hydra_hp_4 -= rifle_attack;
										hydra_hp_4 += hydra_defense;
										if (hydra_hp_4 <= 0) {
											arr6[3] = "빈 공간";
											hydra_hp_4 = hydra_hp;;
											money += 150;
										}
									} else if (j == 4) {
										hydra_hp_5 -= rifle_attack;
										hydra_hp_5 += hydra_defense;
										if (hydra_hp_5 <= 0) {
											arr6[4] = "빈 공간";
											hydra_hp_5 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 2) {
										mutal_hp_3 -= rifle_attack;
										mutal_hp_3 += mutal_defense;
										if (mutal_hp_3 <= 0) {
											arr6[2] = "빈 공간";
											money += 150;
											mutal_hp_3 = mutal_hp;
										}
									} else if (j == 3) {
										mutal_hp_4 -= rifle_attack;
										mutal_hp_4 += mutal_defense;
										if (mutal_hp_4 <= 0) {
											arr6[3] = "빈 공간";
											mutal_hp_4 = mutal_hp;
											money += 150;
										}
									} else if (j == 4) {
										mutal_hp_5 -= rifle_attack;
										mutal_hp_5 += mutal_defense;
										if (mutal_hp_5 <= 0) {
											arr6[4] = "빈 공간";
											mutal_hp_5 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 2) {
										goblin_hp_3 -= rifle_attack;
										goblin_hp_3 += goblin_defense;
										if (goblin_hp_3 <= 0) {
											arr6[2] = "빈 공간";
											goblin_hp_3 = goblin_hp;;
											money += 150;
										}
									} else if (j == 3) {
										goblin_hp_4 -= rifle_attack;
										goblin_hp_4 += goblin_defense;
										if (goblin_hp_4 <= 0) {
											arr6[3] = "빈 공간";
											goblin_hp_4 = goblin_hp;;
											money += 150;
										}
									} else if (j == 4) {
										goblin_hp_5 -= rifle_attack;
										goblin_hp_5 += goblin_defense;
										if (goblin_hp_5 <= 0) {
											arr6[4] = "빈 공간";
											goblin_hp_5 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 2) {
										thief_hp_3 -= rifle_attack;
										thief_hp_3 += thief_defense;
										if (thief_hp_3 <= 0) {
											arr6[2] = "빈 공간";
											money += 150;
											thief_hp_3 = thief_hp;
										}
									} else if (j == 3) {
										thief_hp_4 -= rifle_attack;
										thief_hp_4 += thief_defense;
										if (thief_hp_4 <= 0) {
											arr6[3] = "빈 공간";
											money += 150;
											thief_hp_4 = thief_hp;
										}
									} else if (j == 4) {
										thief_hp_5 -= rifle_attack;
										thief_hp_5 += thief_defense;
										if (thief_hp_5 <= 0) {
											arr6[4] = "빈 공간";
											thief_hp_5 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[1] == "  탱커" || arr1[1] == "탱커(R)" || arr1[1] == "탱커(G)" || arr1[1] == "탱커(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= tanker_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= tanker_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= tanker_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= tanker_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= tanker_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= tanker_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= tanker_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= tanker_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= tanker_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= tanker_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= tanker_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= tanker_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						}
						if (arr1[1] == "  칼병" || arr1[1] == "칼병(R)" || arr1[1] == "칼병(G)" || arr1[1] == "칼병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= nife_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= nife_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= nife_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= nife_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= nife_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= nife_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= nife_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= nife_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= nife_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= nife_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= nife_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= nife_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												money += 150;
												thief_hp_5 = thief_hp;
											}
										}
									}
								}
							}
						}
					}
					if (oo != 2) {
						oo++;
					} else if (oo == 2) {
						oo = 0;
					}
				}
				// arr6[1]끝
				// arr6[2]시작
				if (arr1[2] != "빈 공간") {
					if (ooo == 2) { // ooo가 2이면 공격
						if (arr1[2] == "  탱커" || arr1[2] == "탱커(R)" || arr1[2] == "탱커(G)" || arr1[2] == "탱커(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= tanker_attack;
							}
						} else if (arr1[2] == "  칼병" || arr1[2] == "칼병(R)" || arr1[2] == "칼병(G)"
								|| arr1[2] == "칼병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= nife_attack;
							}
						} else if (arr1[2] == "소총병" || arr1[2] == "소총병(R)" || arr1[2] == "소총병(G)"
								|| arr1[2] == "소총병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= rifle_attack;
							}
						} else if (arr1[2] == "저격병" || arr1[2] == "저격병(R)" || arr1[2] == "저격병(G)"
								|| arr1[2] == "저격병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= sniper_attack;
							}
						}
						if (arr1[2] == "  탱커" || arr1[2] == "탱커(R)" || arr1[2] == "탱커(G)" || arr1[2] == "탱커(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= tanker_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= tanker_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= tanker_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= tanker_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											money += 150;
											mutal_hp_2 = mutal_hp;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= tanker_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											money += 150;
											goblin_hp_1 = goblin_hp;;
										}
									} else if (j == 1) {
										goblin_hp_2 -= tanker_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= tanker_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= tanker_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[2] == "  칼병" || arr1[2] == "칼병(R)" || arr1[2] == "칼병(G)" || arr1[2] == "칼병(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= nife_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= nife_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= nife_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= nife_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= nife_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= nife_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= nife_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= nife_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						} else if (arr1[2] == "소총병" || arr1[2] == "소총병(R)" || arr1[2] == "소총병(G)"
								|| arr1[2] == "소총병(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= rifle_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= rifle_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= rifle_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= rifle_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= rifle_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= rifle_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= rifle_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= rifle_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						} else if (arr1[2] == "저격병" || arr1[2] == "저격병(R)" || arr1[2] == "저격병(G)"
								|| arr1[2] == "저격병(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= sniper_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= sniper_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= sniper_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= sniper_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= sniper_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= sniper_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= sniper_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= sniper_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[2] == "저격병" || arr1[2] == "저격병(R)" || arr1[2] == "저격병(G)" || arr1[2] == "저격병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= sniper_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= sniper_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												money += 150;
												hydra_hp_4 = hydra_hp;;
											}
										} else if (j == 4) {
											hydra_hp_5 -= sniper_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= sniper_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= sniper_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= sniper_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= sniper_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= sniper_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= sniper_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= sniper_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= sniper_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= sniper_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												money += 150;
												thief_hp_5 = thief_hp;
											}
										}
									}
								}
							}
						} else if (arr1[2] == "소총병" || arr1[2] == "소총병(R)" || arr1[2] == "소총병(G)"
								|| arr1[2] == "소총병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= rifle_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= rifle_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= rifle_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= rifle_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= rifle_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= rifle_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												money += 150;
												mutal_hp_5 = mutal_hp;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= rifle_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= rifle_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= rifle_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= rifle_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= rifle_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= rifle_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						} else if (arr1[2] == "  탱커" || arr1[2] == "탱커(R)" || arr1[2] == "탱커(G)"
								|| arr1[2] == "탱커(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= tanker_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= tanker_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= tanker_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= tanker_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= tanker_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= tanker_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= tanker_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= tanker_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= tanker_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= tanker_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= tanker_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= tanker_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						} else if (arr1[2] == "  칼병" || arr1[2] == "칼병(R)" || arr1[2] == "칼병(G)"
								|| arr1[2] == "칼병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= nife_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= nife_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= nife_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= nife_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= nife_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= nife_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= nife_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= nife_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												money += 150;
												goblin_hp_4 = goblin_hp;;
											}
										} else if (j == 4) {
											goblin_hp_5 -= nife_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= nife_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= nife_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= nife_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												thief_hp_5 = thief_hp;
												arr6[4] = "빈 공간";
												money += 150;
											}
										}
									}
								}
							}
						}
					}
					if (ooo != 2) {
						ooo++;
					} else if (ooo == 2) {
						ooo = 0;
					}
				}
				// arr6[2] 끝
				if (arr1[3] != "빈 공간") {
					if (oooo == 2) { // oooo가 2이면 공격
						if (arr1[3] == "  탱커" || arr1[3] == "탱커(R)" || arr1[3] == "탱커(G)" || arr1[3] == "탱커(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= tanker_attack;
							}
						} else if (arr1[3] == "  칼병" || arr1[3] == "칼병(R)" || arr1[3] == "칼병(G)"
								|| arr1[3] == "칼병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= nife_attack;
							}
						} else if (arr1[3] == "소총병" || arr1[3] == "소총병(R)" || arr1[3] == "소총병(G)"
								|| arr1[3] == "소총병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= rifle_attack;
							}
						} else if (arr1[3] == "저격병" || arr1[3] == "저격병(R)" || arr1[3] == "저격병(G)"
								|| arr1[3] == "저격병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= sniper_attack;
							}
						}
						if (arr1[3] == "  탱커" || arr1[3] == "탱커(R)" || arr1[3] == "탱커(G)" || arr1[3] == "탱커(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= tanker_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= tanker_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= tanker_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= tanker_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											money += 150;
											mutal_hp_2 = mutal_hp;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= tanker_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= tanker_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= tanker_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= tanker_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						} else if (arr1[3] == "  칼병" || arr1[3] == "칼병(R)" || arr1[3] == "칼병(G)"
								|| arr1[3] == "칼병(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= nife_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= nife_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= nife_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= nife_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= nife_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											money += 150;
											goblin_hp_1 = goblin_hp;;
										}
									} else if (j == 1) {
										goblin_hp_2 -= nife_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= nife_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= nife_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											money += 150;
											thief_hp_2 = thief_hp;
										}
									}
								}
							}
						} else if (arr1[3] == "소총병" || arr1[3] == "소총병(R)" || arr1[3] == "소총병(G)"
								|| arr1[3] == "소총병(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= rifle_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= rifle_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											money += 150;
											hydra_hp_2 = hydra_hp;;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= rifle_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= rifle_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= rifle_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= rifle_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= rifle_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= rifle_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						} else if (arr1[3] == "저격병" || arr1[3] == "저격병(R)" || arr1[3] == "저격병(G)"
								|| arr1[3] == "저격병(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= sniper_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= sniper_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= sniper_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= sniper_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= sniper_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= sniper_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											goblin_hp_2 = goblin_hp;
											arr6[1] = "빈 공간";
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= sniper_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= sniper_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[3] == "저격병" || arr1[3] == "저격병(R)" || arr1[3] == "저격병(G)" || arr1[3] == "저격병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= sniper_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= sniper_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= sniper_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= sniper_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= sniper_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= sniper_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= sniper_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= sniper_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= sniper_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												money += 150;
												goblin_hp_5 = goblin_hp;;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= sniper_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= sniper_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= sniper_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												money += 150;
												thief_hp_5 = thief_hp;
											}
										}
									}
								}
							}
						} else if (arr1[3] == "소총병" || arr1[3] == "소총병(R)" || arr1[3] == "소총병(G)"
								|| arr1[3] == "소총병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= rifle_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= rifle_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= rifle_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= rifle_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= rifle_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= rifle_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												money += 150;
												mutal_hp_5 = mutal_hp;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= rifle_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= rifle_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= rifle_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[0] == "thief") {
										if (j == 2) {
											thief_hp_3 -= rifle_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= rifle_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= rifle_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						} else if (arr1[3] == "  탱커" || arr1[3] == "탱커(R)" || arr1[3] == "탱커(G)"
								|| arr1[3] == "탱커(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= tanker_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= tanker_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= tanker_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= tanker_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												money += 150;
												mutal_hp_3 = mutal_hp;
											}
										} else if (j == 3) {
											mutal_hp_4 -= tanker_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= tanker_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= tanker_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= tanker_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= tanker_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= tanker_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= tanker_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= tanker_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						} else if (arr1[3] == "  칼병" || arr1[3] == "칼병(R)" || arr1[3] == "칼병(G)"
								|| arr1[3] == "칼병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= nife_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= nife_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= nife_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= nife_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= nife_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= nife_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= nife_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												money += 150;
												goblin_hp_3 = goblin_hp;;
											}
										} else if (j == 3) {
											goblin_hp_4 -= nife_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= nife_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= nife_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= nife_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= nife_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						}
					}
					if (oooo != 2) {
						oooo++;
					} else if (oooo == 2) {
						oooo = 0;
					}
				}
				// arr1[3] 끝
				if (arr1[4] != "빈 공간") {
					if (ooooo == 2) { // ooooo가 2이면 공격
						if (arr1[4] == "  탱커" || arr1[4] == "탱커(R)" || arr1[4] == "탱커(G)" || arr1[4] == "탱커(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= tanker_attack;
							}
						} else if (arr1[4] == "  칼병" || arr1[4] == "칼병(R)" || arr1[4] == "칼병(G)"
								|| arr1[4] == "칼병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= nife_attack;
							}
						} else if (arr1[4] == "소총병" || arr1[4] == "소총병(R)" || arr1[4] == "소총병(G)"
								|| arr1[4] == "소총병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= rifle_attack;
							}
						} else if (arr1[4] == "저격병" || arr1[4] == "저격병(R)" || arr1[4] == "저격병(G)"
								|| arr1[4] == "저격병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] == "빈 공간"
									&& arr6[4] == "빈 공간") {
								hp2 -= sniper_attack;
							}
						}
						if (arr1[4] == "  탱커" || arr1[4] == "탱커(R)" || arr1[4] == "탱커(G)" || arr1[4] == "탱커(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= tanker_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= tanker_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= tanker_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											money += 150;
											mutal_hp_1 = mutal_hp;
										}
									} else if (j == 1) {
										mutal_hp_2 -= tanker_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= tanker_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= tanker_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= tanker_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= tanker_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						} else if (arr1[4] == "  칼병" || arr1[4] == "칼병(R)" || arr1[4] == "칼병(G)"
								|| arr1[4] == "칼병(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= nife_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= nife_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= nife_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= mutal_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= nife_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= nife_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= nife_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= nife_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						} else if (arr1[4] == "소총병" || arr1[4] == "소총병(R)" || arr1[4] == "소총병(G)"
								|| arr1[4] == "소총병(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= rifle_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= rifle_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= rifle_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= rifle_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= rifle_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= rifle_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= rifle_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= rifle_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						} else if (arr1[4] == "저격병" || arr1[4] == "저격병(R)" || arr1[4] == "저격병(G)"
								|| arr1[4] == "저격병(B)") {
							if (arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
								j = (int) (Math.random() * 2);// 0~1까지
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= sniper_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= sniper_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											hydra_hp_2 = hydra_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= sniper_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= sniper_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= sniper_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											goblin_hp_1 = goblin_hp;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= sniper_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											goblin_hp_2 = goblin_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= sniper_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "빈 공간";
											money += 150;
											thief_hp_1 = thief_hp;
										}
									} else if (j == 1) {
										thief_hp_2 -= sniper_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "빈 공간";
											money += 150;
											thief_hp_2 = thief_hp;thief_hp_2 = thief_hp;
										}
									}
								}
							}
						}
						if (arr1[4] == "저격병" || arr1[4] == "저격병(R)" || arr1[4] == "저격병(G)" || arr1[4] == "저격병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= sniper_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= sniper_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= sniper_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= sniper_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= sniper_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= sniper_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												money += 150;
												mutal_hp_5 = mutal_hp;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= sniper_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= sniper_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= sniper_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[0] == "thief") {
										if (j == 2) {
											thief_hp_3 -= sniper_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= sniper_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= sniper_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						} else if (arr1[4] == "소총병" || arr1[4] == "소총병(R)" || arr1[4] == "소총병(G)"
								|| arr1[4] == "소총병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= rifle_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= rifle_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= rifle_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= rifle_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= rifle_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= rifle_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= rifle_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= rifle_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= rifle_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= rifle_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= rifle_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												money += 150;
												thief_hp_4 = thief_hp;
											}
										} else if (j == 4) {
											thief_hp_5 -= rifle_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						} else if (arr1[4] == "  탱커" || arr1[4] == "탱커(R)" || arr1[4] == "탱커(G)"
								|| arr1[4] == "탱커(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= tanker_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= tanker_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= tanker_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}	
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= tanker_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= tanker_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= tanker_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= tanker_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= tanker_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= tanker_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= tanker_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= tanker_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= tanker_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						} else if (arr1[4] == "  칼병" || arr1[4] == "칼병(R)" || arr1[4] == "칼병(G)"
								|| arr1[4] == "칼병(B)") {
							if (arr6[0] == "빈 공간" && arr6[1] == "빈 공간") {
								if (arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") {
									j = (int) (Math.random() * 3) + 2;// 2~4까지
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= nife_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= nife_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= nife_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												hydra_hp_5 = hydra_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= nife_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= nife_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= nife_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= nife_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= nife_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												goblin_hp_4 = goblin_hp;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= nife_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "빈 공간";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[0] == "thief") {
										if (j == 2) {
											thief_hp_3 -= nife_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "빈 공간";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= nife_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "빈 공간";
												money += 150;
												thief_hp_4 = thief_hp;
											}
										} else if (j == 4) {
											thief_hp_5 -= nife_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												thief_hp_5 = thief_hp;
												arr6[4] = "빈 공간";
												money += 150;
											}
										}
									}
								}
							}
						}
					}
					if (ooooo != 2) {
						ooooo++;
					} else if (ooooo == 2) {
						ooooo = 0;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void inven() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = "빈 공간";
			}
		}
	}

	public void base() { // 전투 필드의 아군 기지 && 적군 기지
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == null) {
				arr1[i] = "빈 공간";
			}
		}
		for (int i = 0; i < arr6.length; i++) {
			if (arr6[i] == null) {
				arr6[i] = "빈 공간";
			}
		}
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.print("  ...          .\t\t\t\t\t\t\t\t\t\t\t              ~==\n"
				+ " -==-        -:=;~       \t\t\t\t\t\t\t\t\t\t\t      ,,,,,,,,,,,,,,,,,,,,.:==-\n"
				+ " ~==        ~=~.,*!      \t\t\t\t\t\t\t\t\t\t\t      ====================::===\n"
				+ "=*!!-====*~**-;!*-!*~    \t\t[3번 배치]\t\t\t\t\t\t\t[적:3번 배치]\t      ====================::===\n"
				+ "=*::;===!;=~~*- ,;::*:-  \t\t " + arr1[2] + "\t\t[1번 배치]\t\t      [적:1번 배치]\t\t " + arr6[2]
				+ "\t\t      ====================**===\n" + "=======.**.=~     ,=--=~ \t ");
		this.arr_2();
		System.out.print("\t " + arr1[0] + "\t\t\t" + arr6[0] + "\t  ");
		this.enemy_3();
		System.out.print("\t      *========================\n" + "=====*~*:,;:       ,;*~!!\t\t\t ");
		this.arr_0();
		System.out.print("  ");
		this.enemy_1();
		System.out.print("\t\t\t      ,*=======================\n"
				+ "======,-!:  -;   .;- -;- \t\t[4번 배치]\t\t\t     [VS]    \t\t\t[적:4번 배치]\t      *--------------------,-=\n"
				+ "::~~~~~:;   ~=   .=:  -~ " + "\t\t " + arr1[3] + "\t\t[2번 배치]\t\t      [적:2번 배치]\t\t " + arr6[3]
				+ "\t\t      *  ~;-    ,;;.    ,:;, =\n" + "=;;;;;;;-   -!   .!~  -~ " + "\t ");
		this.arr_3();
		System.out.print("\t " + arr1[1] + "\t\t\t" + arr6[1] + "\t  ");
		this.enemy_4();
		System.out.print("\t      *  :=-    -==,    -!!, =\n" + "*           .,    ,.  -~ \t\t\t ");
		this.arr_1();
		System.out.print("   ");
		this.enemy_2();
		System.out.print("\t\t\t      *  ;=-    -==,    -!!, =\n" + "*                     -~ " + "\t\t[5번 배치]"
				+ "\t\t\t\t\t\t\t[적:5번 배치]\t      *  ,~.    .-~.    .--. *\n" + "* ,-----    ,~  .---, -~ " + "\t\t "
				+ arr1[4] + "\t\t\t\t\t\t\t " + arr6[4] + "  " + "\t\t      *                      *\n"
				+ "* ;====*    :=  ~===: ,- \t ");
		this.arr_4();
		System.out.print("\t\t\t\t\t  ");
		this.enemy_5();
		System.out.print("\t      *                      =\n" + "* ;====*    ~=    =:  ,-." + "\t\t\t"
				+ "\t\t\t\t\t\t\t\t      *-===== .!*==!* .=====.=\n" + "* ;====*    ,:    =:  ,- " + "\t\t "
				+ "\t\t\t\t\t\t\t\t\t      *-=====   -==,:  **===.1=\n"
				+ "=!======!*******!!=*;!!- \t\t\t\t\t\t\t\t\t\t\t      *-=====   -=*,: .=====.=\n");
	}

	public Place_base_Easy() { // 쉬움을 선택했을 때의 기지의 상태이다.
		money = 2000;
		hp1 = 100;
		hp2 = 100;
		available_troops1 = 0;
	}

	public void inventory() { // 인벤토리의 모습이다. 상점에서 무기를 구매하면 인벤토리에 저장이 된다.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = "빈 공간";
			}
		}
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.println(" _____                             _                       \r\n"
				+ "|_   _|                           | |                      \r\n"
				+ "  | |   _ __  __   __  ___  _ __  | |_   ___   _ __  _   _ \r\n"
				+ "  | |  | '_ \\ \\ \\ / / / _ \\| '_ \\ | __| / _ \\ | '__|| | | |\r\n"
				+ " _| |_ | | | | \\ V / |  __/| | | || |_ | (_) || |   | |_| |\r\n"
				+ " \\___/ |_| |_|  \\_/   \\___||_| |_| \\__| \\___/ |_|    \\__, |\r\n"
				+ "                                                      __/ |\r\n"
				+ "                                                     |___/ ");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("1." + arr[0]);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("2." + arr[1]);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("3." + arr[2]);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("4." + arr[3]);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("5." + arr[4]);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("\t\t\t\t\t⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("\t\t\t\t\t0.이전 화면으로 이동ψ");
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}

	public void if_ston1() { // 인벤토리에서 있는 무기에 따라 특정 정보를 출력하기 위해 조건문을 사용했다.
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		if (arr[0] == "블루 스톤") {
			shop.blue_information();
		} else if (arr[0] == "레드 스톤") {
			shop.red_information();
		} else if (arr[0] == "그린 스톤") {
			shop.green_information();
		} else {
			shop.empty();
		}
	}

	public void if_ston2() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		if (arr[1] == "블루 스톤") {
			shop.blue_information();
		} else if (arr[1] == "레드 스톤") {
			shop.red_information();
		} else if (arr[1] == "그린 스톤") {
			shop.green_information();
		} else {
			shop.empty();
		}
	}

	public void if_ston3() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		if (arr[2] == "블루 스톤") {
			shop.blue_information();
		} else if (arr[2] == "레드 스톤") {
			shop.red_information();
		} else if (arr[2] == "그린 스톤") {
			shop.green_information();
		} else {
			shop.empty();
		}
	}

	public void if_ston4() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		if (arr[3] == "블루 스톤") {
			shop.blue_information();
		} else if (arr[3] == "레드 스톤") {
			shop.red_information();
		} else if (arr[3] == "그린 스톤") {
			shop.green_information();
		} else {
			shop.empty();
		}
	}

	public void if_ston5() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		if (arr[4] == "블루 스톤") {
			shop.blue_information();
		} else if (arr[4] == "레드 스톤") {
			shop.red_information();
		} else if (arr[4] == "그린 스톤") {
			shop.green_information();
		} else {
			shop.empty();
		}
	}

	void enemy_1() {
		if (arr6[0] == "빈 공간") {
			System.out.print("                    ");
		}
		if (arr6[0] == "mutal") {
			System.out.print("(hp:" + mutal_hp_1 + "/att:" + mutal_attack + "/def:" + mutal_defense + ")");
		} else if (arr6[0] == "thief") {
			System.out.print("(hp:" + thief_hp_1 + "/att:" + thief_attack + "/def:" + thief_defense + ")");
		} else if (arr6[0] == "goblin") {
			System.out.print("(hp:" + goblin_hp_1 + "/att:" + goblin_attack + "/def:" + goblin_defense + ")");
		} else if (arr6[0] == "hydra") {
			System.out.print("(hp:" + hydra_hp_1 + "/att:" + hydra_attack + "/def:" + hydra_defense + ")");
		}
	}

	public int mutal_hp_2 = mutal_hp;
	public int thief_hp_2 = thief_hp;
	public int goblin_hp_2 = goblin_hp;
	public int hydra_hp_2 = hydra_hp;

	void enemy_2() {
		if (arr6[1] == "빈 공간") {
			System.out.print("                    ");
		}
		if (arr6[1] == "mutal") {
			System.out.print("(hp:" + mutal_hp_2 + "/att:" + mutal_attack + "/def:" + mutal_defense + ")");
		} else if (arr6[1] == "thief") {
			System.out.print("(hp:" + thief_hp_2 + "/att:" + thief_attack + "/def:" + thief_defense + ")");
		} else if (arr6[1] == "goblin") {
			System.out.print("(hp:" + goblin_hp_2 + "/att:" + goblin_attack + "/def:" + goblin_defense + ")");
		} else if (arr6[1] == "hydra") {
			System.out.print("(hp:" + hydra_hp_2 + "/att:" + hydra_attack + "/def:" + hydra_defense + ")");
		}
	}

	public int mutal_hp_3 = mutal_hp;
	public int thief_hp_3 = thief_hp;
	public int goblin_hp_3 = goblin_hp;
	public int hydra_hp_3 = hydra_hp;

	void enemy_3() {
		if (arr6[2] == "빈 공간") {
			System.out.print("                    ");
		}
		if (arr6[2] == "mutal") {
			System.out.print("(hp:" + mutal_hp + "/att:" + mutal_attack + "/def:" + mutal_defense + ")");
		} else if (arr6[2] == "thief") {
			System.out.print("(hp:" + thief_hp + "/att:" + thief_attack + "/def:" + thief_defense + ")");
		} else if (arr6[2] == "goblin") {
			System.out.print("(hp:" + goblin_hp + "/att:" + goblin_attack + "/def:" + goblin_defense + ")");
		} else if (arr6[2] == "hydra") {
			System.out.print("(hp:" + hydra_hp + "/att:" + hydra_attack + "/def:" + hydra_defense + ")");
		}
	}

	public int mutal_hp_4 = mutal_hp;
	public int thief_hp_4 = thief_hp;
	public int goblin_hp_4 = goblin_hp;
	public int hydra_hp_4 = hydra_hp;

	void enemy_4() {
		if (arr6[3] == "빈 공간") {
			System.out.print("                    ");
		}
		if (arr6[3] == "mutal") {
			System.out.print("(hp:" + mutal_hp + "/att:" + mutal_attack + "/def:" + mutal_defense + ")");
		} else if (arr6[3] == "thief") {
			System.out.print("(hp:" + thief_hp + "/att:" + thief_attack + "/def:" + thief_defense + ")");
		} else if (arr6[3] == "goblin") {
			System.out.print("(hp:" + goblin_hp + "/att:" + goblin_attack + "/def:" + goblin_defense + ")");
		} else if (arr6[3] == "hydra") {
			System.out.print("(hp:" + hydra_hp + "/att:" + hydra_attack + "/def:" + hydra_defense + ")");
		}
	}

	public int mutal_hp_5 = mutal_hp;
	public int thief_hp_5 = thief_hp;
	public int goblin_hp_5 = goblin_hp;
	public int hydra_hp_5 = hydra_hp;

	void enemy_5() {
		if (arr6[4] == "빈 공간") {
			System.out.print("                    ");
		}
		if (arr6[4] == "mutal") {
			System.out.print("(hp:" + mutal_hp + "/att:" + mutal_attack + "/def:" + mutal_defense + ")");
		} else if (arr6[4] == "thief") {
			System.out.print("(hp:" + thief_hp + "/att:" + thief_attack + "/def:" + thief_defense + ")");
		} else if (arr6[4] == "goblin") {
			System.out.print("(hp:" + goblin_hp + "/att:" + goblin_attack + "/def:" + goblin_defense + ")");
		} else if (arr6[4] == "hydra") {
			System.out.print("(hp:" + hydra_hp + "/att:" + hydra_attack + "/def:" + hydra_defense + ")");
		}
	}

	void arr_0() {
		if (arr1[0] == "빈 공간") {
			System.out.print("                      ");
		}
		if (arr1[0] == "  탱커" || arr1[0] == "탱커(R)" || arr1[0] == "탱커(G)" || arr1[0] == "탱커(B)") {
			System.out.print("(hp:" + tanker_hp_1 + "/att:" + tanker_attack + "/def:" + tanker_defense + ")");
		} else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] == "칼병(B)") {
			System.out.print("(hp:" + nife_hp_1 + "/att:" + nife_attack + "/def:" + nife_defense + ")");
		} else if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] == "소총병(B)") {
			System.out.print("(hp:" + rifle_hp_1 + "/att:" + rifle_attack + "/def:" + rifle_defense + ")");
		} else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" || arr1[0] == "저격병(B)") {
			System.out.print("(hp:" + sniper_hp_1 + "/att:" + sniper_attack + "/def:" + sniper_defense + ")");
		}
	}

	void arr_1() {
		if (arr1[1] == "빈 공간") {
			System.out.print("                     ");
		}
		if (arr1[1] == "  탱커" || arr1[1] == "탱커(R)" || arr1[1] == "탱커(G)" || arr1[1] == "탱커(B)") {
			System.out.print("(hp:" + tanker_hp_2 + "/att:" + tanker_attack + "/def:" + tanker_defense + ")");
		} else if (arr1[1] == "  칼병" || arr1[1] == "칼병(R)" || arr1[1] == "칼병(G)" || arr1[1] == "칼병(B)") {
			System.out.print("(hp:" + nife_hp_2 + "/att:" + nife_attack + "/def:" + nife_defense + ")");
		} else if (arr1[1] == "소총병" || arr1[1] == "소총병(R)" || arr1[1] == "소총병(G)" || arr1[1] == "소총병(B)") {
			System.out.print("(hp:" + rifle_hp_2 + "/att:" + rifle_attack + "/def:" + rifle_defense + ")");
		} else if (arr1[1] == "저격병" || arr1[1] == "저격병(R)" || arr1[1] == "저격병(G)" || arr1[1] == "저격병(B)") {
			System.out.print("(hp:" + sniper_hp_2 + "/att:" + sniper_attack + "/def:" + sniper_defense + ")");
		}
	}

	void arr_2() {
		if (arr1[2] == "빈 공간") {
			System.out.print("                      ");
		}
		if (arr1[2] == "  탱커" || arr1[2] == "탱커(R)" || arr1[2] == "탱커(G)" || arr1[2] == "탱커(B)") {
			System.out.print("(hp:" + tanker_hp_3 + "/att:" + tanker_attack + "/def:" + tanker_defense + ")");
		} else if (arr1[2] == "  칼병" || arr1[2] == "칼병(R)" || arr1[2] == "칼병(G)" || arr1[2] == "칼병(B)") {
			System.out.print("(hp:" + nife_hp_3 + "/att:" + nife_attack + "/def:" + nife_defense + ")");
		} else if (arr1[2] == "소총병" || arr1[2] == "소총병(R)" || arr1[2] == "소총병(G)" || arr1[2] == "소총병(B)") {
			System.out.print("(hp:" + rifle_hp_3 + "/att:" + rifle_attack + "/def:" + rifle_defense + ")");
		} else if (arr1[2] == "저격병" || arr1[2] == "저격병(R)" || arr1[2] == "저격병(G)" || arr1[2] == "저격병(B)") {
			System.out.print("(hp:" + sniper_hp_3 + "/att:" + sniper_attack + "/def:" + sniper_defense + ")");
		}
	}

	void arr_3() {
		if (arr1[3] == "빈 공간") {
			System.out.print("                     ");
		}
		if (arr1[3] == "  탱커" || arr1[3] == "탱커(R)" || arr1[3] == "탱커(G)" || arr1[3] == "탱커(B)") {
			System.out.print("(hp:" + tanker_hp_4 + "/att:" + tanker_attack + "/def:" + tanker_defense + ")");
		} else if (arr1[3] == "  칼병" || arr1[3] == "칼병(R)" || arr1[3] == "칼병(G)" || arr1[3] == "칼병(B)") {
			System.out.print("(hp:" + nife_hp_4 + "/att:" + nife_attack + "/def:" + nife_defense + ")");
		} else if (arr1[3] == "소총병" || arr1[3] == "소총병(R)" || arr1[3] == "소총병(G)" || arr1[3] == "소총병(B)") {
			System.out.print("(hp:" + rifle_hp_4 + "/att:" + rifle_attack + "/def:" + rifle_defense + ")");
		} else if (arr1[3] == "저격병" || arr1[3] == "저격병(R)" || arr1[3] == "저격병(G)" || arr1[3] == "저격병(B)") {
			System.out.print("(hp:" + sniper_hp_4 + "/att:" + sniper_attack + "/def:" + sniper_defense + ")");
		}
	}

	void arr_4() {
		if (arr1[4] == "빈 공간") {
			System.out.print("                     ");
		}
		if (arr1[4] == "  탱커" || arr1[4] == "탱커(R)" || arr1[4] == "탱커(G)" || arr1[4] == "탱커(B)") {
			System.out.print("(hp:" + tanker_hp_5 + "/att:" + tanker_attack + "/def:" + tanker_defense + ")");
		} else if (arr1[4] == "  칼병" || arr1[4] == "칼병(R)" || arr1[4] == "칼병(G)" || arr1[4] == "칼병(B)") {
			System.out.print("(hp:" + nife_hp_5 + "/att:" + nife_attack + "/def:" + nife_defense + ")");
		} else if (arr1[4] == "소총병" || arr1[4] == "소총병(R)" || arr1[4] == "소총병(G)" || arr1[4] == "소총병(B)") {
			System.out.print("(hp:" + rifle_hp_5 + "/att:" + rifle_attack + "/def:" + rifle_defense + ")");
		} else if (arr1[4] == "저격병" || arr1[4] == "저격병(R)" || arr1[4] == "저격병(G)" || arr1[4] == "저격병(B)") {
			System.out.print("(hp:" + sniper_hp_5 + "/att:" + sniper_attack + "/def:" + sniper_defense + ")");
		}
	}

	public void buy_blue() { // 블루 스톤을 구매하게 될 때 조건이 맞다면 2천원을 지불하고 구매를 한다. 만약, 돈이 없을 경우에는 구매가 되지 않는다.
		if (money > 1999) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("블루 스톤을 구매하셨습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 2000;
			for (int i = 0; i < 5; i++) {
				if (arr[i] == "빈 공간") {
					arr[i] = "블루 스톤";
					break;
				}
			}
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_red() { // 레드 스톤을 구매하게 될 때 조건이 맞다면 3천원을 지불하고 구매를 한다. 만약, 돈이 없을 경우에는 구매가 되지 않는다.
		if (money > 2999) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("레드 스톤을 구매하셨습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 3000;
			for (int i = 0; i < 5; i++) {
				if (arr[i] == "빈 공간") {
					arr[i] = "레드 스톤";
					break;
				}
			}
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_green() { // 그린 스톤을 구매하게 될 때 조건이 맞다면 3천원을 지불하고 구매를 한다. 만약, 돈이 없을 경우에는 구매가 되지 않는다.
		if (money > 3999) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("그린 스톤을 구매하셨습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 4000;
			for (int i = 0; i < 5; i++) {
				if (arr[i] == "빈 공간") {
					arr[i] = "그린 스톤";
					break;
				}
			}
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void easy() { // 게임 난이도 쉬움을 선택했을 때의 아군 기지의 상태이다.
		String bar = "■";
		System.out.println();
		System.out.println("HP:" + hp1);
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t       HP:" + hp2);
		for (int i = 1; i <= hp1; i += 5) {
			System.out.print(bar);
		}
		System.out.println();
		System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t       ");
		for (int i = 1; i <= hp2; i += 5) {
			System.out.print(bar);
		}
		System.out.println();
		System.out
				.println("Money:" + money + "원" + "\t\t\t\t\t\t\t\t\t\t\t\t\t" /* 인구 수:" + available_troops2 + "/5" */);
		System.out.println("인구 수:" + available_troops1 + "/5");
		System.out.println(
				"⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("\t\t\t\t\t1.유닛 배치            2.상점            3.인벤토리       ");
		System.out.println(
				"⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}

	public String arr1[] = new String[5];

	public void character() {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == null) {
				arr1[i] = "빈 공간";
			}
		}
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.println(" _   _         _  _             ___              \r\n"
				+ "| | | |       (_)| |           / _ \\             \r\n"
				+ "| | | | _ __   _ | |_         / /_\\ \\ _ __  _ __ \r\n"
				+ "| | | || '_ \\ | || __|        |  _  || '__|| '__|\r\n"
				+ "| |_| || | | || || |_         | | | || |   | |   \r\n"
				+ " \\___/ |_| |_||_| \\__|        \\_| |_/|_|   |_|   \r\n"
				+ "                       ______                    \r\n"
				+ "                      |______|               ");
		System.out.println();
		System.out.println();
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("1." + arr1[0]);
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("2." + arr1[1]);
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("3." + arr1[2]);
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("4." + arr1[3]);
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("5." + arr1[4]);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("\t\t\t\t\t⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("\t\t\t\t\t0.이전 화면으로 이동ψ");
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}

	public void tanker1() { // 탱커의 대한 정보와 구매여부
		charge1.tanker();
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("1.구매 O     │     2.구매X");
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}

	public void nife1() { // 칼병의 대한 정보와 구매여부
		charge1.nife();
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("1.구매 O     │     2.구매X");
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}

	public void sniper1() { // 저격병의 대한 정보와 구매여부
		charge2.sniper();
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("1.구매 O     │     2.구매X");
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}

	public void rifle1() { // 소총병의 대한 정보와 구매여부
		charge2.rifle();
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("1.구매 O     │     2.구매X");
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}

	public void buy_tanker1() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 500;
			if (arr1[0] == "빈 공간") {
				available_troops1++;
			}
			arr1[0] = "  탱커";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_tanker2() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 500;
			if (arr1[1] == "빈 공간") {
				available_troops1++;
			}
			arr1[1] = "  탱커";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_tanker3() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 500;
			if (arr1[2] == "빈 공간") {
				available_troops1++;
			}
			arr1[2] = "  탱커";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_tanker4() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 500;
			if (arr1[3] == "빈 공간") {
				available_troops1++;
			}
			arr1[3] = "  탱커";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_tanker5() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 500;
			if (arr1[4] == "빈 공간") {
				available_troops1++;
			}
			arr1[4] = "  탱커";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_nife1() {
		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 400;
			if (arr1[0] == "빈 공간") {
				available_troops1++;
			}
			arr1[0] = "  칼병";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}

	}

	public void buy_nife2() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 400;
			if (arr1[1] == "빈 공간") {
				available_troops1++;
			}
			arr1[1] = "  칼병";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_nife3() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 400;
			if (arr1[2] == "빈 공간") {
				available_troops1++;
			}
			arr1[2] = "  칼병";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_nife4() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 400;
			if (arr1[3] == "빈 공간") {
				available_troops1++;
			}
			arr1[3] = "  칼병";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_nife5() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 400;
			if (arr1[4] == "빈 공간") {
				available_troops1++;
			}
			arr1[4] = "  칼병";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_rifle1() {
		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 400;
			if (arr1[0] == "빈 공간") {
				available_troops1++;
			}
			arr1[0] = "소총병";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_rifle2() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 400;
			if (arr1[1] == "빈 공간") {
				available_troops1++;
			}
			arr1[1] = "소총병";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_rifle3() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 400;
			if (arr1[2] == "빈 공간") {
				available_troops1++;
			}
			arr1[2] = "소총병";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_rifle4() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 400;
			if (arr1[3] == "빈 공간") {
				available_troops1++;
			}
			arr1[3] = "소총병";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_rifle5() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 400;
			if (arr1[4] == "빈 공간") {
				available_troops1++;
			}
			arr1[4] = "소총병";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_sniper1() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 500;
			if (arr1[0] == "빈 공간") {
				available_troops1++;
			}
			arr1[0] = "저격병";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_sniper2() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 500;
			if (arr1[1] == "빈 공간") {
				available_troops1++;
			}
			arr1[1] = "저격병";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_sniper3() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 500;
			if (arr1[2] == "빈 공간") {
				available_troops1++;
			}
			arr1[2] = "저격병";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_sniper4() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 500;
			if (arr1[3] == "빈 공간") {
				available_troops1++;
			}
			arr1[3] = "저격병";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void buy_sniper5() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("구매를 완료했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
			money -= 500;
			if (arr1[4] == "빈 공간") {
				available_troops1++;
			}
			arr1[4] = "저격병";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("돈이 부족합니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
	}

	public void war() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.println(
				"______                   _                ______                       _    _              \r\n"
						+ "| ___ \\                 | |               |  ___|                     | |  | |             \r\n"
						+ "| |_/ /  ___   __ _   __| | _   _         | |_     ___   _ __         | |  | |  __ _  _ __ \r\n"
						+ "|    /  / _ \\ / _` | / _` || | | |        |  _|   / _ \\ | '__|        | |/\\| | / _` || '__|\r\n"
						+ "| |\\ \\ |  __/| (_| || (_| || |_| |        | |    | (_) || |           \\  /\\  /| (_| || |   \r\n"
						+ "\\_| \\_| \\___| \\__,_| \\__,_| \\__, |        \\_|     \\___/ |_|            \\/  \\/  \\__,_||_|   \r\n"
						+ "                             __/ | ______                      ______                      \r\n"
						+ "                            |___/ |______|                    |______|                     ");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(
				"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("\t[5번 배치]\t\t\t[4번 배치]\t\t\t[3번 배치]\t\t\t[2번 배치]\t\t\t[1번 배치]");
		System.out.println(
				"⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("\t   " + arr1[4] + "\t\t\t   " + arr1[3] + "\t\t\t   " + arr1[2] + "\t\t\t   " + arr1[1]
				+ "\t\t\t   " + arr1[0]);
		System.out.println(
				"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println();
		System.out.println("\t\t\t\t\t            ψ진행하시겠습니까?ψ");
		System.out.println("\t\t\t\t\t               ⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("\t\t\t\t\t        1.진행 | 2.이전 화면으로 이동");
		System.out.println(
				"⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}

	String arr3[] = new String[1];
	int arr4[] = new int[1];

	public void arr2() { // 전투가 진행을 하게 되면 랜덤으로 적군 유닛을 소환하기 위해 배열에 넣는다.
		int a = (int) (Math.random() * 4);
		if (a == 0) {
			arr3[0] = "도적";
			arr4[0] = 30;
			arr5[0] = 1000;
			System.out.println("도적을 소환했습니다\n");
			e_charge1.thief();
		} else if (a == 1) {
			arr3[0] = "고블린";
			arr4[0] = 40;
			arr5[0] = 1500;
			System.out.println("고블린을 소환했습니다\n");
			e_charge1.goblin();
		} else if (a == 2) {
			arr3[0] = "뮤탈";
			arr4[0] = 50;
			arr5[0] = 1700;
			System.out.println("뮤탈을 소환했습니다\n");
			e_charge2.mutal();
		} else {
			arr3[0] = "히드라";
			arr4[0] = 40;
			arr5[0] = 2000;
			System.out.println("히드라를 소환했습니다\n");
			e_charge2.hydra();
		}
	}

	/*
	 * int thief_hp = 350; int mutal_hp = 150; int goblin_hp = 250; int hydra_hp =
	 * 230; int hp5;
	 */

	public void thief_c() {
		// int attack = 30;
		// int defense = 1;
		int hp = thief_hp + sum;
		if (hp < 0) {
			hp = 0;
		}
		/*
		 * hp5 = hp; System.out.println("〓〓〓〓〓〓〓〓〓〓"); System.out.println("도적");
		 * System.out.println("〓〓〓〓〓〓〓〓〓〓"); System.out.println();
		 * System.out.println("체력: " + hp5); System.out.println("공격력: " + attack);
		 * System.out.println("방어력: " + defense);
		 */
	}

	/*
	 * public void mutal_c() { int attack = 50; int defense = 2; int hp = mutal_hp +
	 * sum; if (hp < 0) { hp = 0; }
	 */
	/* hp5 = hp; */
	/*
	 * System.out.println("〓〓〓〓〓〓〓〓〓〓"); System.out.println("뮤탈");
	 * System.out.println("〓〓〓〓〓〓〓〓〓〓"); System.out.println();
	 * System.out.println("체력: " + hp5); System.out.println("공격력: " + attack);
	 * System.out.println("방어력: " + defense); }
	 */

	/*
	 * public void goblin_c() { int attack = 40; int defense = 3; int hp = goblin_hp
	 * + sum; if (hp < 0) { hp = 0; } hp5 = hp; System.out.println("〓〓〓〓〓〓〓〓〓〓");
	 * System.out.println("고블린"); System.out.println("〓〓〓〓〓〓〓〓〓〓");
	 * System.out.println(); System.out.println("체력: " + hp5);
	 * System.out.println("공격력: " + attack); System.out.println("방어력: " + defense);
	 * }
	 */

	public void hydra_c() {
		int attack = 40;
		int defense = 2;
		int hp = hydra_hp + sum;
		if (hp < 0) {
			hp = 0;
		}
		/* hp5 = hp; */
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println("히드라");
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		/* System.out.println("체력: " + hp5); */
		System.out.println("공격력: " + attack);
		System.out.println("방어력: " + defense);
	}

	public void tanker_c() {
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println("탱커");
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: " + tanker_hp);
		System.out.println("공격력: " + tanker_attack);
		System.out.println("방어력: " + tanker_defense);
	}

	public void nife_c() {
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println("칼병");
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: " + nife_hp);
		System.out.println("공격력: " + nife_attack);
		System.out.println("방어력: " + nife_defense);
	}

	public void rifle_c() {
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println("소총병");
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: " + rifle_hp);
		System.out.println("공격력: " + rifle_attack);
		System.out.println("방어력: " + rifle_defense);
	}

	public void sniper_c() {
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println("저격병");
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: " + sniper_hp);
		System.out.println("공격력: " + sniper_attack);
		System.out.println("방어력: " + sniper_defense);
	}

	public void battle() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.println("  #####      ##    ######   ######    ##       ##### \r\n"
				+ "   ## ##     ###      ##       ##      ##       ##    \r\n"
				+ "  ##  ##    ## ##     ##       ##      ##       ##    \r\n"
				+ " #####     ##  ##     ##       ##     ##       ####   \r\n"
				+ " ##  ##   #######    ##       ##      ##       ##     \r\n"
				+ "##  ##    ##   ##    ##       ##      ##       ##     \r\n"
				+ "#####     ##   ##    ##       ##      #####    #####  ");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("적이 ");
		this.arr2();
		System.out.println();
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("아무키나 입력하고, 엔터를 눌러주세요.");
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}

	public void battle1() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.println("  #####      ##    ######   ######    ##       ##### \r\n"
				+ "   ## ##     ###      ##       ##      ##       ##    \r\n"
				+ "  ##  ##    ## ##     ##       ##      ##       ##    \r\n"
				+ " #####     ##  ##     ##       ##     ##       ####   \r\n"
				+ " ##  ##   #######    ##       ##      ##       ##     \r\n"
				+ "##  ##    ##   ##    ##       ##      ##       ##     \r\n"
				+ "#####     ##   ##    ##       ##      #####    #####  ");
		System.out.println();
		System.out.println();
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != "빈 공간") {
				System.out.println(arr1[i] + "가(이) 공격을 했습니다.");
				if (arr1[i] == "  탱커") {
					System.out.println("   =>" + arr3[0] + "에게 10의 데미지를 주었습니다.");
					sum -= 10;
					System.out.println();
					System.out.println();
				} else if (arr1[i] == "  칼병") {
					System.out.println("   =>" + arr3[0] + "에게 35의 데미지를 주었습니다.");
					sum -= 35;
					System.out.println();
					System.out.println();
				} else if (arr1[i] == "저격병") {
					System.out.println("   =>" + arr3[0] + "에게 30의 데미지를 주었습니다.");
					sum -= 30;
					System.out.println();
					System.out.println();
				} else if (arr1[i] == "소총병") {
					System.out.println("   =>" + arr3[0] + "에게 20의 데미지를 주었습니다.");
					sum -= 20;
					System.out.println();
					System.out.println();
				}
			}
		}
		if (arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간" && arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
			System.out.println("적군에게 공격할 수 있는 유닛이 없습니다...");
		}
		System.out.println();
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("아무키나 입력하고, 엔터를 눌러주세요.");
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}

	/*
	 * public void battle2() { for (int i = 0; i < 100; i++) { System.out.println();
	 * } System.out.
	 * println("  #####      ##    ######   ######    ##       ##### \r\n" +
	 * "   ## ##     ###      ##       ##      ##       ##    \r\n" +
	 * "  ##  ##    ## ##     ##       ##      ##       ##    \r\n" +
	 * " #####     ##  ##     ##       ##     ##       ####   \r\n" +
	 * " ##  ##   #######    ##       ##      ##       ##     \r\n" +
	 * "##  ##    ##   ##    ##       ##      ##       ##     \r\n" +
	 * "#####     ##   ##    ##       ##      #####    #####  ");
	 * System.out.println(); System.out.println(); System.out.println();
	 */
	/*
	 * if (arr3[0] == "도적") { this.thief_c(); } else if (arr3[0] == "고블린") {
	 * this.goblin_c(); } else if (arr3[0] == "뮤탈") { this.mutal_c(); } else {
	 * this.hydra_c(); } System.out.println();
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
	 * System.out.println("아무키나 입력하고, 엔터를 눌러주세요.");
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔"); System.out.print("입력: "); }
	 */

	/*
	 * public void battle3() { for (int i = 0; i < 100; i++) { System.out.println();
	 * } System.out.
	 * println("  #####      ##    ######   ######    ##       ##### \r\n" +
	 * "   ## ##     ###      ##       ##      ##       ##    \r\n" +
	 * "  ##  ##    ## ##     ##       ##      ##       ##    \r\n" +
	 * " #####     ##  ##     ##       ##     ##       ####   \r\n" +
	 * " ##  ##   #######    ##       ##      ##       ##     \r\n" +
	 * "##  ##    ##   ##    ##       ##      ##       ##     \r\n" +
	 * "#####     ##   ##    ##       ##      #####    #####  ");
	 * System.out.println(); System.out.println(); System.out.println();
	 */
	/*
	 * if (hp5 < 1) { System.out.println(arr3[0] + "이(가) 죽었습니다.\n아군이 적 기지를 공격합니다.");
	 * System.out.println(arr3[0] + "가죽에서  " + arr5[0] + "원을 얻었습니다."); money +=
	 * arr5[0]; System.out.println(); System.out.println(); for (int i = 0; i <
	 * arr1.length; i++) { if (arr1[i] != "빈 공간") { System.out.println(arr1[i] +
	 * "이 공격을 했습니다."); if (arr1[i] == "  탱커") {
	 * System.out.println("   =>10의 데미지를 주었습니다."); hp2 -= 10; System.out.println();
	 * System.out.println(); } else if (arr1[i] == "  칼병") {
	 * System.out.println("   =>35의 데미지를 주었습니다."); hp2 -= 35; System.out.println();
	 * System.out.println(); } else if (arr1[i] == "저격병") {
	 * System.out.println("   =>30의 데미지를 주었습니다."); hp2 -= 30; System.out.println();
	 * System.out.println(); } else if (arr1[i] == "소총병") {
	 * System.out.println("   =>20의 데미지를 주었습니다."); hp2 -= 20; System.out.println();
	 * System.out.println(); } } } System.out.println();
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
	 * System.out.println("아무키나 입력하고, 엔터를 눌러주세요.");
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔"); System.out.print("입력: "); sum1 =
	 * 0; } else { // 상대 유닛이 죽지 않았을 경우, 적이 공격함 System.out.println(arr3[0] +
	 * "이(가) 공격합니다."); System.out.println(); System.out.println(); for (int i = 0; i
	 * < arr1.length; i++) { if (arr1[i] != "빈 공간") { if (arr1[i] == "  탱커") { int j
	 * = i + 1; System.out.println("   =>" + j + "번 " + "탱커에게 " + arr4[0] +
	 * "의 데미지를 주었습니다."); tanker_hp -= arr4[0]; if (tanker_hp < 1) {
	 * System.out.println(j + "번 " + "탱커가 " + arr4[0] + "전사했습니다."); arr1[i] =
	 * "빈 공간"; available_troops1--; } System.out.println(); System.out.println();
	 * System.out.println(); System.out.println(); System.out.println();
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
	 * System.out.println("아무키나 입력하고, 엔터를 눌러주세요.");
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔"); System.out.print("입력: "); sum1 =
	 * 0; if (arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간" && arr1[3]
	 * == "빈 공간" && arr1[4] == "빈 공간") { sc.next(); for (int k = 0; k < 100; k++) {
	 * System.out.println(); } System.out.println("필드에 존재하는 유닛이 없습니다.");
	 * System.out.println("아군 기지를 공격합니다!!!!!"); System.out.println();
	 * System.out.println("적의 공격으로 인해 아군의 기지 피해 " + arr4[0] + "을(를) 입었습니다."); hp1 -=
	 * arr4[0]; System.out.println(); System.out.println();
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
	 * System.out.println("아무키나 입력하고, 엔터를 눌러주세요.");
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔"); System.out.print("입력: "); sum1 =
	 * 0;
	 * 
	 * if (hp1 > 1) { break; } else { for (j = 0; j < 100; j++) {
	 * System.out.println(); } System.out.println("#####   ##   #### ##    \r\n" +
	 * "##      ##    ##  ##    \r\n" + "##     # ##   ##  ##    \r\n" +
	 * "####   # ##   ##  ##    \r\n" + "##    ######  ##  ##    \r\n" +
	 * "##    #   ##  ##  ##    \r\n" + "##    #   ## #### ##### ");
	 * System.out.println("\n패배하셨습니다."); System.exit(0); } } break; } else if
	 * (arr1[i] == "  칼병") { int j = i + 1; System.out.println("   =>" + j + "번 " +
	 * "칼병에게 " + arr4[0] + "의 데미지를 주었습니다."); nife_hp -= arr4[0]; if (nife_hp < 1) {
	 * System.out.println(j + "번 " + "칼병이 " + arr4[0] + "전사했습니다."); arr1[i] =
	 * "빈 공간"; available_troops1--; } System.out.println(); System.out.println();
	 * System.out.println(); System.out.println(); System.out.println();
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
	 * System.out.println("아무키나 입력하고, 엔터를 눌러주세요.");
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔"); System.out.print("입력: "); sum1 =
	 * 0; if (arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간" && arr1[3]
	 * == "빈 공간" && arr1[4] == "빈 공간") { sc.next(); for (int k = 0; k < 100; k++) {
	 * System.out.println(); } System.out.println("필드에 존재하는 유닛이 없습니다.");
	 * System.out.println("아군 기지를 공격합니다!!!!!"); System.out.println();
	 * System.out.println("적의 공격으로 인해 아군의 기지 피해 " + arr4[0] + "을(를) 입었습니다."); hp1 -=
	 * arr4[0]; System.out.println(); System.out.println();
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
	 * System.out.println("아무키나 입력하고, 엔터를 눌러주세요.");
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔"); System.out.print("입력: "); sum1 =
	 * 0;
	 * 
	 * if (hp1 > 1) { break; } else { for (j = 0; j < 100; j++) {
	 * System.out.println(); } System.out.println("#####   ##   #### ##    \r\n" +
	 * "##      ##    ##  ##    \r\n" + "##     # ##   ##  ##    \r\n" +
	 * "####   # ##   ##  ##    \r\n" + "##    ######  ##  ##    \r\n" +
	 * "##    #   ##  ##  ##    \r\n" + "##    #   ## #### ##### ");
	 * System.out.println("\n패배하셨습니다."); System.exit(0); } } break; } else if
	 * (arr1[i] == "저격병") { int j = i + 1; System.out.println("   =>" + j + "번 " +
	 * "저격병에게 " + arr4[0] + "의 데미지를 주었습니다."); sniper_hp -= arr4[0]; if (sniper_hp <
	 * 1) { System.out.println(j + "번 " + "저격병이 " + arr4[0] + "전사했습니다."); arr1[i] =
	 * "빈 공간"; available_troops1--; } System.out.println(); System.out.println();
	 * System.out.println(); System.out.println(); System.out.println();
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
	 * System.out.println("아무키나 입력하고, 엔터를 눌러주세요.");
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔"); System.out.print("입력: "); sum1 =
	 * 0; if (arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간" && arr1[3]
	 * == "빈 공간" && arr1[4] == "빈 공간") { sc.next(); for (int k = 0; k < 100; k++) {
	 * System.out.println(); } System.out.println("필드에 존재하는 유닛이 없습니다.");
	 * System.out.println("아군 기지를 공격합니다!!!!!"); System.out.println();
	 * System.out.println("적의 공격으로 인해 아군의 기지 피해 " + arr4[0] + "을(를) 입었습니다."); hp1 -=
	 * arr4[0]; System.out.println(); System.out.println();
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
	 * System.out.println("아무키나 입력하고, 엔터를 눌러주세요.");
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔"); System.out.print("입력: "); sum1 =
	 * 0;
	 * 
	 * if (hp1 > 1) { break; } else { for (j = 0; j < 100; j++) {
	 * System.out.println(); } System.out.println("#####   ##   #### ##    \r\n" +
	 * "##      ##    ##  ##    \r\n" + "##     # ##   ##  ##    \r\n" +
	 * "####   # ##   ##  ##    \r\n" + "##    ######  ##  ##    \r\n" +
	 * "##    #   ##  ##  ##    \r\n" + "##    #   ## #### ##### ");
	 * System.out.println("\n패배하셨습니다."); System.exit(0); } } break; } else if
	 * (arr1[i] == "소총병") { int j = i + 1; System.out.println("   =>" + j + "번 " +
	 * "소총병에게 " + arr4[0] + "의 데미지를 주었습니다."); rifle_hp -= arr4[0]; if (rifle_hp < 1)
	 * { System.out.println(j + "번 " + "소총병이 " + arr4[0] + "전사했습니다."); arr1[i] =
	 * "빈 공간"; available_troops1--; } System.out.println(); System.out.println();
	 * System.out.println(); System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
	 * System.out.println("아무키나 입력하고, 엔터를 눌러주세요.");
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔"); System.out.print("입력: "); sum1 =
	 * 0; if (arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간" && arr1[3]
	 * == "빈 공간" && arr1[4] == "빈 공간") { sc.next(); for (int k = 0; k < 100; k++) {
	 * System.out.println(); } System.out.println("필드에 존재하는 유닛이 없습니다.");
	 * System.out.println("아군 기지를 공격합니다!!!!!"); System.out.println();
	 * System.out.println("적의 공격으로 인해 아군의 기지 피해 " + arr4[0] + "을(를) 입었습니다."); hp1 -=
	 * arr4[0]; System.out.println(); System.out.println();
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
	 * System.out.println("아무키나 입력하고, 엔터를 눌러주세요.");
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔"); System.out.print("입력: "); sum1 =
	 * 0;
	 * 
	 * if (hp1 > 1) { break; } else { for (j = 0; j < 100; j++) {
	 * System.out.println(); } System.out.println("#####   ##   #### ##    \r\n" +
	 * "##      ##    ##  ##    \r\n" + "##     # ##   ##  ##    \r\n" +
	 * "####   # ##   ##  ##    \r\n" + "##    ######  ##  ##    \r\n" +
	 * "##    #   ##  ##  ##    \r\n" + "##    #   ## #### ##### ");
	 * System.out.println("\n패배하셨습니다."); System.exit(0); } } break; } } else {
	 * 
	 * }
	 */
	/*
	 * if (arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간" && arr1[3] ==
	 * "빈 공간" && arr1[4] == "빈 공간") { System.out.println("필드에 존재하는 유닛이 없습니다.");
	 * System.out.println("아군 기지를 공격합니다!!!!!"); System.out.println();
	 * System.out.println("적의 공격으로 인해 아군의 기지 피해 " + arr4[0] + "을(를) 입었습니다."); hp1 -=
	 * arr4[0]; System.out.println(); System.out.println();
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
	 * System.out.println("아무키나 입력하고, 엔터를 눌러주세요.");
	 * System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔"); System.out.print("입력: "); sum1 =
	 * 0; if (hp1 > 1) { break; } else { for (int j = 0; j < 100; j++) {
	 * System.out.println(); } System.out.println("#####   ##   #### ##    \r\n" +
	 * "##      ##    ##  ##    \r\n" + "##     # ##   ##  ##    \r\n" +
	 * "####   # ##   ##  ##    \r\n" + "##    ######  ##  ##    \r\n" +
	 * "##    #   ##  ##  ##    \r\n" + "##    #   ## #### ##### ");
	 * System.out.println("\n패배하셨습니다."); System.exit(0); } } } } }
	 */

	public void add_blue1(int num) { // 인벤토리에서 블루스톤을 클릭하면 착용할 수 있다.(체력)
		if (arr[0] == "블루 스톤") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("블루 스톤(체력)을 착용했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
		if (num == 1 && arr1[0] == "  탱커" && arr[0] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[0] = "탱커(B)";
			arr[0] = "빈 공간";
		} else if (num == 1 && arr1[0] == "  칼병" && arr[0] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[0] = "칼병(B)";
			arr[0] = "빈 공간";
		} else if (num == 1 && arr1[0] == "소총병" && arr[0] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[0] = "소총병(B)";
			arr[0] = "빈 공간";
		} else if (num == 1 && arr1[0] == "저격병" && arr[0] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[0] = "저격병(B)";
			arr[0] = "빈 공간";
		}

		if (num == 2 && arr1[1] == "  탱커" && arr[0] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[1] = "탱커(B)";
			arr[0] = "빈 공간";
		} else if (num == 2 && arr1[1] == "  칼병" && arr[0] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[1] = "칼병(B)";
			arr[0] = "빈 공간";
		} else if (num == 2 && arr1[1] == "소총병" && arr[0] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[1] = "소총병(B)";
			arr[0] = "빈 공간";
		} else if (num == 2 && arr1[1] == "저격병" && arr[0] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[1] = "저격병(B)";
			arr[0] = "빈 공간";
		}
		if (num == 3 && arr1[2] == "  탱커" && arr[0] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[2] = "탱커(B)";
			arr[0] = "빈 공간";
		} else if (num == 3 && arr1[2] == "  칼병" && arr[0] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[2] = "칼병(B)";
			arr[0] = "빈 공간";
		} else if (num == 3 && arr1[2] == "소총병" && arr[0] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[2] = "소총병(B)";
			arr[0] = "빈 공간";
		} else if (num == 3 && arr1[2] == "저격병" && arr[0] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[2] = "저격병(B)";
			arr[0] = "빈 공간";
		}
		if (num == 4 && arr1[3] == "  탱커" && arr[0] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[3] = "탱커(B)";
			arr[0] = "빈 공간";
		} else if (num == 4 && arr1[3] == "  칼병" && arr[0] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[3] = "칼병(B)";
			arr[0] = "빈 공간";
		} else if (num == 4 && arr1[3] == "소총병" && arr[0] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[3] = "소총병(B)";
			arr[0] = "빈 공간";
		} else if (num == 4 && arr1[3] == "저격병" && arr[0] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[3] = "저격병(B)";
			arr[0] = "빈 공간";
		}
		if (num == 5 && arr1[4] == "  탱커" && arr[0] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[4] = "탱커(B)";
			arr[0] = "빈 공간";
		} else if (num == 5 && arr1[4] == "  칼병" && arr[0] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[4] = "칼병(B)";
			arr[0] = "빈 공간";
		} else if (num == 5 && arr1[4] == "소총병" && arr[0] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[4] = "소총병(B)";
			arr[0] = "빈 공간";
		} else if (num == 5 && arr1[4] == "저격병" && arr[0] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[4] = "저격병(B)";
			arr[0] = "빈 공간";
		}
	}

	public void add_blue2(int num) { // 인벤토리에서 블루스톤을 클릭하면 착용할 수 있다.(체력)
		if (arr[1] == "블루 스톤") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("블루 스톤(체력)을 착용했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
		if (num == 1 && arr1[0] == "  탱커" && arr[1] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[0] = "탱커(B)";
			arr[1] = "빈 공간";
		} else if (num == 1 && arr1[0] == "  칼병" && arr[1] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[0] = "칼병(B)";
			arr[1] = "빈 공간";
		} else if (num == 1 && arr1[0] == "소총병" && arr[1] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[0] = "소총병(B)";
			arr[1] = "빈 공간";
		} else if (num == 1 && arr1[0] == "저격병" && arr[1] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[0] = "저격병(B)";
			arr[1] = "빈 공간";
		}

		if (num == 2 && arr1[1] == "  탱커" && arr[1] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[1] = "탱커(B)";
			arr[1] = "빈 공간";
		} else if (num == 2 && arr1[1] == "  칼병" && arr[1] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[1] = "칼병(B)";
			arr[1] = "빈 공간";
		} else if (num == 2 && arr1[1] == "소총병" && arr[1] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[1] = "소총병(B)";
			arr[1] = "빈 공간";
		} else if (num == 2 && arr1[1] == "저격병" && arr[1] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[1] = "저격병(B)";
			arr[1] = "빈 공간";
		}
		if (num == 3 && arr1[2] == "  탱커" && arr[1] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[2] = "탱커(B)";
			arr[1] = "빈 공간";
		} else if (num == 3 && arr1[2] == "  칼병" && arr[1] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[2] = "칼병(B)";
			arr[1] = "빈 공간";
		} else if (num == 3 && arr1[2] == "소총병" && arr[1] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[2] = "소총병(B)";
			arr[1] = "빈 공간";
		} else if (num == 3 && arr1[2] == "저격병" && arr[1] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[2] = "저격병(B)";
			arr[1] = "빈 공간";
		}
		if (num == 4 && arr1[3] == "  탱커" && arr[1] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[3] = "탱커(B)";
			arr[1] = "빈 공간";
		} else if (num == 4 && arr1[3] == "  칼병" && arr[1] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[3] = "칼병(B)";
			arr[1] = "빈 공간";
		} else if (num == 4 && arr1[3] == "소총병" && arr[1] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[3] = "소총병(B)";
			arr[1] = "빈 공간";
		} else if (num == 4 && arr1[3] == "저격병" && arr[1] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[3] = "저격병(B)";
			arr[1] = "빈 공간";
		}
		if (num == 5 && arr1[4] == "  탱커" && arr[1] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[4] = "탱커(B)";
			arr[1] = "빈 공간";
		} else if (num == 5 && arr1[4] == "  칼병" && arr[1] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[4] = "칼병(B)";
			arr[1] = "빈 공간";
		} else if (num == 5 && arr1[4] == "소총병" && arr[1] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[4] = "소총병(B)";
			arr[1] = "빈 공간";
		} else if (num == 5 && arr1[4] == "저격병" && arr[1] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[4] = "저격병(B)";
			arr[1] = "빈 공간";
		}
	}

	public void add_blue3(int num) { // 인벤토리에서 블루스톤을 클릭하면 착용할 수 있다.(체력)
		if (arr[2] == "블루 스톤") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("블루 스톤(체력)을 착용했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
		if (num == 1 && arr1[0] == "  탱커" && arr[2] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[0] = "탱커(B)";
			arr[2] = "빈 공간";
		} else if (num == 1 && arr1[0] == "  칼병" && arr[2] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[0] = "칼병(B)";
			arr[2] = "빈 공간";
		} else if (num == 1 && arr1[0] == "소총병" && arr[2] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[0] = "소총병(B)";
			arr[2] = "빈 공간";
		} else if (num == 1 && arr1[0] == "저격병" && arr[2] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[0] = "저격병(B)";
			arr[2] = "빈 공간";
		}

		if (num == 2 && arr1[1] == "  탱커" && arr[2] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[1] = "탱커(B)";
			arr[2] = "빈 공간";
		} else if (num == 2 && arr1[1] == "  칼병" && arr[2] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[1] = "칼병(B)";
			arr[2] = "빈 공간";
		} else if (num == 2 && arr1[1] == "소총병" && arr[2] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[1] = "소총병(B)";
			arr[2] = "빈 공간";
		} else if (num == 2 && arr1[1] == "저격병" && arr[2] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[1] = "저격병(B)";
			arr[2] = "빈 공간";
		}
		if (num == 3 && arr1[2] == "  탱커" && arr[2] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[2] = "탱커(B)";
			arr[2] = "빈 공간";
		} else if (num == 3 && arr1[2] == "  칼병" && arr[2] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[2] = "칼병(B)";
			arr[2] = "빈 공간";
		} else if (num == 3 && arr1[2] == "소총병" && arr[2] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[2] = "소총병(B)";
			arr[2] = "빈 공간";
		} else if (num == 3 && arr1[2] == "저격병" && arr[2] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[2] = "저격병(B)";
			arr[2] = "빈 공간";
		}
		if (num == 4 && arr1[3] == "  탱커" && arr[2] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[3] = "탱커(B)";
			arr[2] = "빈 공간";
		} else if (num == 4 && arr1[3] == "  칼병" && arr[2] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[3] = "칼병(B)";
			arr[2] = "빈 공간";
		} else if (num == 4 && arr1[3] == "소총병" && arr[2] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[3] = "소총병(B)";
			arr[2] = "빈 공간";
		} else if (num == 4 && arr1[3] == "저격병" && arr[2] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[3] = "저격병(B)";
			arr[2] = "빈 공간";
		}
		if (num == 5 && arr1[4] == "  탱커" && arr[2] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[4] = "탱커(B)";
			arr[2] = "빈 공간";
		} else if (num == 5 && arr1[4] == "  칼병" && arr[2] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[4] = "칼병(B)";
			arr[2] = "빈 공간";
		} else if (num == 5 && arr1[4] == "소총병" && arr[2] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[4] = "소총병(B)";
			arr[2] = "빈 공간";
		} else if (num == 5 && arr1[4] == "저격병" && arr[2] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[4] = "저격병(B)";
			arr[2] = "빈 공간";
		}
	}

	public void add_blue4(int num) { // 인벤토리에서 블루스톤을 클릭하면 착용할 수 있다.(체력)
		if (arr[3] == "블루 스톤") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("블루 스톤(체력)을 착용했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
		if (num == 1 && arr1[0] == "  탱커" && arr[3] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[0] = "탱커(B)";
			arr[3] = "빈 공간";
		} else if (num == 1 && arr1[0] == "  칼병" && arr[3] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[0] = "칼병(B)";
			arr[3] = "빈 공간";
		} else if (num == 1 && arr1[0] == "소총병" && arr[3] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[0] = "소총병(B)";
			arr[3] = "빈 공간";
		} else if (num == 1 && arr1[0] == "저격병" && arr[3] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[0] = "저격병(B)";
			arr[3] = "빈 공간";
		}

		if (num == 2 && arr1[1] == "  탱커" && arr[3] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[1] = "탱커(B)";
			arr[3] = "빈 공간";
		} else if (num == 2 && arr1[1] == "  칼병" && arr[3] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[1] = "칼병(B)";
			arr[3] = "빈 공간";
		} else if (num == 2 && arr1[1] == "소총병" && arr[3] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[1] = "소총병(B)";
			arr[3] = "빈 공간";
		} else if (num == 2 && arr1[1] == "저격병" && arr[3] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[1] = "저격병(B)";
			arr[3] = "빈 공간";
		}
		if (num == 3 && arr1[2] == "  탱커" && arr[3] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[2] = "탱커(B)";
			arr[3] = "빈 공간";
		} else if (num == 3 && arr1[2] == "  칼병" && arr[3] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[2] = "칼병(B)";
			arr[3] = "빈 공간";
		} else if (num == 3 && arr1[2] == "소총병" && arr[3] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[2] = "소총병(B)";
			arr[3] = "빈 공간";
		} else if (num == 3 && arr1[2] == "저격병" && arr[3] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[2] = "저격병(B)";
			arr[3] = "빈 공간";
		}
		if (num == 4 && arr1[3] == "  탱커" && arr[3] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[3] = "탱커(B)";
			arr[3] = "빈 공간";
		} else if (num == 4 && arr1[3] == "  칼병" && arr[3] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[3] = "칼병(B)";
			arr[3] = "빈 공간";
		} else if (num == 4 && arr1[3] == "소총병" && arr[3] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[3] = "소총병(B)";
			arr[0] = "빈 공간";
		} else if (num == 4 && arr1[3] == "저격병" && arr[0] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[3] = "저격병(B)";
			arr[3] = "빈 공간";
		}
		if (num == 5 && arr1[4] == "  탱커" && arr[3] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[4] = "탱커(B)";
			arr[3] = "빈 공간";
		} else if (num == 5 && arr1[4] == "  칼병" && arr[3] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[4] = "칼병(B)";
			arr[3] = "빈 공간";
		} else if (num == 5 && arr1[4] == "소총병" && arr[3] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[4] = "소총병(B)";
			arr[3] = "빈 공간";
		} else if (num == 5 && arr1[4] == "저격병" && arr[3] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[4] = "저격병(B)";
			arr[3] = "빈 공간";
		}
	}

	public void add_blue5(int num) { // 인벤토리에서 블루스톤을 클릭하면 착용할 수 있다.(체력)
		if (arr[4] == "블루 스톤") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("블루 스톤(체력)을 착용했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
		if (num == 1 && arr1[0] == "  탱커" && arr[4] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[0] = "탱커(B)";
			arr[4] = "빈 공간";
		} else if (num == 1 && arr1[0] == "  칼병" && arr[4] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[0] = "칼병(B)";
			arr[4] = "빈 공간";
		} else if (num == 1 && arr1[0] == "소총병" && arr[4] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[0] = "소총병(B)";
			arr[4] = "빈 공간";
		} else if (num == 1 && arr1[0] == "저격병" && arr[4] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[0] = "저격병(B)";
			arr[4] = "빈 공간";
		}

		if (num == 2 && arr1[1] == "  탱커" && arr[4] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[1] = "탱커(B)";
			arr[4] = "빈 공간";
		} else if (num == 2 && arr1[1] == "  칼병" && arr[4] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[1] = "칼병(B)";
			arr[4] = "빈 공간";
		} else if (num == 2 && arr1[1] == "소총병" && arr[4] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[1] = "소총병(B)";
			arr[4] = "빈 공간";
		} else if (num == 2 && arr1[1] == "저격병" && arr[4] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[1] = "저격병(B)";
			arr[4] = "빈 공간";
		}
		if (num == 3 && arr1[2] == "  탱커" && arr[4] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[2] = "탱커(B)";
			arr[4] = "빈 공간";
		} else if (num == 3 && arr1[2] == "  칼병" && arr[4] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[2] = "칼병(B)";
			arr[4] = "빈 공간";
		} else if (num == 3 && arr1[2] == "소총병" && arr[4] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[2] = "소총병(B)";
			arr[4] = "빈 공간";
		} else if (num == 3 && arr1[2] == "저격병" && arr[4] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[2] = "저격병(B)";
			arr[4] = "빈 공간";
		}
		if (num == 4 && arr1[3] == "  탱커" && arr[4] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[3] = "탱커(B)";
			arr[4] = "빈 공간";
		} else if (num == 4 && arr1[3] == "  칼병" && arr[4] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[3] = "칼병(B)";
			arr[4] = "빈 공간";
		} else if (num == 4 && arr1[3] == "소총병" && arr[4] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[3] = "소총병(B)";
			arr[4] = "빈 공간";
		} else if (num == 4 && arr1[3] == "저격병" && arr[4] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[3] = "저격병(B)";
			arr[4] = "빈 공간";
		}
		if (num == 5 && arr1[4] == "  탱커" && arr[4] == "블루 스톤") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[4] = "탱커(B)";
			arr[4] = "빈 공간";
		} else if (num == 5 && arr1[4] == "  칼병" && arr[4] == "블루 스톤") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[4] = "칼병(B)";
			arr[4] = "빈 공간";
		} else if (num == 5 && arr1[4] == "소총병" && arr[4] == "블루 스톤") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[4] = "소총병(B)";
			arr[4] = "빈 공간";
		} else if (num == 5 && arr1[4] == "저격병" && arr[4] == "블루 스톤") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[4] = "저격병(B)";
			arr[4] = "빈 공간";
		}
	}

	public void add_red1(int num) { // 인벤토리에서 레드 스톤을 클릭하면 착용할 수 있다.(공격력)
		if (arr[0] == "레드 스톤") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("레드 스톤(공격력)을 착용했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
		if (num == 1 && arr1[0] == "  탱커" && arr[0] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[0] = "탱커(R)";
			arr[0] = "빈 공간";
		} else if (num == 1 && arr1[0] == "  칼병" && arr[0] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[0] = "칼병(R)";
			arr[0] = "빈 공간";
		} else if (num == 1 && arr1[0] == "소총병" && arr[0] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[0] = "소총병(R)";
			arr[0] = "빈 공간";
		} else if (num == 1 && arr1[0] == "저격병" && arr[0] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[0] = "저격병(R)";
			arr[0] = "빈 공간";
		}
		if (num == 2 && arr1[1] == "  탱커" && arr[0] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[1] = "탱커(R)";
			arr[0] = "빈 공간";
		} else if (num == 2 && arr1[1] == "  칼병" && arr[0] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[1] = "칼병(R)";
			arr[0] = "빈 공간";
		} else if (num == 2 && arr1[1] == "소총병" && arr[0] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[1] = "소총병(R)";
			arr[0] = "빈 공간";
		} else if (num == 2 && arr1[1] == "저격병" && arr[0] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[1] = "저격병(R)";
			arr[0] = "빈 공간";
		}
		if (num == 3 && arr1[2] == "  탱커" && arr[0] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[2] = "탱커(R)";
			arr[0] = "빈 공간";
		} else if (num == 3 && arr1[2] == "  칼병" && arr[0] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[2] = "칼병(R)";
			arr[0] = "빈 공간";
		} else if (num == 3 && arr1[2] == "소총병" && arr[0] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[2] = "소총병(R)";
			arr[0] = "빈 공간";
		} else if (num == 3 && arr1[2] == "저격병" && arr[0] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[2] = "저격병(R)";
			arr[0] = "빈 공간";
		}
		if (num == 4 && arr1[3] == "  탱커" && arr[0] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[3] = "탱커(R)";
			arr[0] = "빈 공간";
		} else if (num == 4 && arr1[3] == "  칼병" && arr[0] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[3] = "칼병(R)";
			arr[0] = "빈 공간";
		} else if (num == 4 && arr1[3] == "소총병" && arr[0] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[3] = "소총병(R)";
			arr[0] = "빈 공간";
		} else if (num == 4 && arr1[3] == "저격병" && arr[0] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[3] = "저격병(R)";
			arr[0] = "빈 공간";
		}
		if (num == 5 && arr1[4] == "  탱커" && arr[0] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[4] = "탱커(R)";
			arr[0] = "빈 공간";
		} else if (num == 5 && arr1[4] == "  칼병" && arr[0] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[4] = "칼병(R)";
			arr[0] = "빈 공간";
		} else if (num == 5 && arr1[4] == "소총병" && arr[0] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[4] = "소총병(R)";
			arr[0] = "빈 공간";
		} else if (num == 5 && arr1[4] == "저격병" && arr[0] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[4] = "저격병(R)";
			arr[0] = "빈 공간";
		}
	}

	public void add_red2(int num) { // 인벤토리에서 레드 스톤을 클릭하면 착용할 수 있다.(공격력)
		if (arr[1] == "레드 스톤") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("레드 스톤(공격력)을 착용했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
		if (num == 1 && arr1[0] == "  탱커" && arr[1] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[0] = "탱커(R)";
			arr[1] = "빈 공간";
		} else if (num == 1 && arr1[0] == "  칼병" && arr[1] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[0] = "칼병(R)";
			arr[1] = "빈 공간";
		} else if (num == 1 && arr1[0] == "소총병" && arr[1] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[0] = "소총병(R)";
			arr[1] = "빈 공간";
		} else if (num == 1 && arr1[0] == "저격병" && arr[1] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[0] = "저격병(R)";
			arr[1] = "빈 공간";
		}
		if (num == 2 && arr1[1] == "  탱커" && arr[1] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[1] = "탱커(R)";
			arr[1] = "빈 공간";
		} else if (num == 2 && arr1[1] == "  칼병" && arr[1] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[1] = "칼병(R)";
			arr[1] = "빈 공간";
		} else if (num == 2 && arr1[1] == "소총병" && arr[1] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[1] = "소총병(R)";
			arr[1] = "빈 공간";
		} else if (num == 2 && arr1[1] == "저격병" && arr[1] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[1] = "저격병(R)";
			arr[1] = "빈 공간";
		}
		if (num == 3 && arr1[2] == "  탱커" && arr[1] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[2] = "탱커(R)";
			arr[1] = "빈 공간";
		} else if (num == 3 && arr1[2] == "  칼병" && arr[1] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[2] = "칼병(R)";
			arr[1] = "빈 공간";
		} else if (num == 3 && arr1[2] == "소총병" && arr[1] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[2] = "소총병(R)";
			arr[1] = "빈 공간";
		} else if (num == 3 && arr1[2] == "저격병" && arr[1] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[2] = "저격병(R)";
			arr[1] = "빈 공간";
		}
		if (num == 4 && arr1[3] == "  탱커" && arr[1] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[3] = "탱커(R)";
			arr[1] = "빈 공간";
		} else if (num == 4 && arr1[3] == "  칼병" && arr[1] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[3] = "칼병(R)";
			arr[1] = "빈 공간";
		} else if (num == 4 && arr1[3] == "소총병" && arr[1] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[3] = "소총병(R)";
			arr[1] = "빈 공간";
		} else if (num == 4 && arr1[3] == "저격병" && arr[1] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[3] = "저격병(R)";
			arr[1] = "빈 공간";
		}
		if (num == 5 && arr1[4] == "  탱커" && arr[1] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[4] = "탱커(R)";
			arr[1] = "빈 공간";
		} else if (num == 5 && arr1[4] == "  칼병" && arr[1] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[4] = "칼병(R)";
			arr[1] = "빈 공간";
		} else if (num == 5 && arr1[4] == "소총병" && arr[1] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[4] = "소총병(R)";
			arr[1] = "빈 공간";
		} else if (num == 5 && arr1[4] == "저격병" && arr[1] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[4] = "저격병(R)";
			arr[1] = "빈 공간";
		}
	}

	public void add_red3(int num) { // 인벤토리에서 레드 스톤을 클릭하면 착용할 수 있다.(공격력)
		if (arr[2] == "레드 스톤") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("레드 스톤(공격력)을 착용했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
		if (num == 1 && arr1[0] == "  탱커" && arr[2] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[0] = "탱커(R)";
			arr[2] = "빈 공간";
		} else if (num == 1 && arr1[0] == "  칼병" && arr[2] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[0] = "칼병(R)";
			arr[2] = "빈 공간";
		} else if (num == 1 && arr1[0] == "소총병" && arr[2] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[0] = "소총병(R)";
			arr[2] = "빈 공간";
		} else if (num == 1 && arr1[0] == "저격병" && arr[2] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[0] = "저격병(R)";
			arr[2] = "빈 공간";
		}
		if (num == 2 && arr1[1] == "  탱커" && arr[2] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[1] = "탱커(R)";
			arr[2] = "빈 공간";
		} else if (num == 2 && arr1[1] == "  칼병" && arr[2] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[1] = "칼병(R)";
			arr[2] = "빈 공간";
		} else if (num == 2 && arr1[1] == "소총병" && arr[2] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[1] = "소총병(R)";
			arr[2] = "빈 공간";
		} else if (num == 2 && arr1[1] == "저격병" && arr[2] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[1] = "저격병(R)";
			arr[2] = "빈 공간";
		}
		if (num == 3 && arr1[2] == "  탱커" && arr[2] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[2] = "탱커(R)";
			arr[2] = "빈 공간";
		} else if (num == 3 && arr1[2] == "  칼병" && arr[2] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[2] = "칼병(R)";
			arr[2] = "빈 공간";
		} else if (num == 3 && arr1[2] == "소총병" && arr[2] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[2] = "소총병(R)";
			arr[2] = "빈 공간";
		} else if (num == 3 && arr1[2] == "저격병" && arr[2] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[2] = "저격병(R)";
			arr[2] = "빈 공간";
		}
		if (num == 4 && arr1[3] == "  탱커" && arr[2] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[3] = "탱커(R)";
			arr[2] = "빈 공간";
		} else if (num == 4 && arr1[3] == "  칼병" && arr[2] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[3] = "칼병(R)";
			arr[2] = "빈 공간";
		} else if (num == 4 && arr1[3] == "소총병" && arr[2] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[3] = "소총병(R)";
			arr[2] = "빈 공간";
		} else if (num == 4 && arr1[3] == "저격병" && arr[2] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[3] = "저격병(R)";
			arr[2] = "빈 공간";
		}
		if (num == 5 && arr1[4] == "  탱커" && arr[2] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[4] = "탱커(R)";
			arr[2] = "빈 공간";
		} else if (num == 5 && arr1[4] == "  칼병" && arr[2] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[4] = "칼병(R)";
			arr[2] = "빈 공간";
		} else if (num == 5 && arr1[4] == "소총병" && arr[2] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[4] = "소총병(R)";
			arr[2] = "빈 공간";
		} else if (num == 5 && arr1[4] == "저격병" && arr[2] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[4] = "저격병(R)";
			arr[2] = "빈 공간";
		}
	}

	public void add_red4(int num) { // 인벤토리에서 레드 스톤을 클릭하면 착용할 수 있다.(공격력)
		if (arr[3] == "레드 스톤") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("레드 스톤(공격력)을 착용했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
		if (num == 1 && arr1[0] == "  탱커" && arr[3] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[0] = "탱커(R)";
			arr[3] = "빈 공간";
		} else if (num == 1 && arr1[0] == "  칼병" && arr[3] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[0] = "칼병(R)";
			arr[3] = "빈 공간";
		} else if (num == 1 && arr1[0] == "소총병" && arr[3] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[0] = "소총병(R)";
			arr[3] = "빈 공간";
		} else if (num == 1 && arr1[0] == "저격병" && arr[3] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[0] = "저격병(R)";
			arr[3] = "빈 공간";
		}
		if (num == 2 && arr1[1] == "  탱커" && arr[3] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[1] = "탱커(R)";
			arr[3] = "빈 공간";
		} else if (num == 2 && arr1[1] == "  칼병" && arr[3] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[1] = "칼병(R)";
			arr[3] = "빈 공간";
		} else if (num == 2 && arr1[1] == "소총병" && arr[3] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[1] = "소총병(R)";
			arr[3] = "빈 공간";
		} else if (num == 2 && arr1[1] == "저격병" && arr[3] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[1] = "저격병(R)";
			arr[3] = "빈 공간";
		}
		if (num == 3 && arr1[2] == "  탱커" && arr[3] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[2] = "탱커(R)";
			arr[3] = "빈 공간";
		} else if (num == 3 && arr1[2] == "  칼병" && arr[3] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[2] = "칼병(R)";
			arr[3] = "빈 공간";
		} else if (num == 3 && arr1[2] == "소총병" && arr[3] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[2] = "소총병(R)";
			arr[3] = "빈 공간";
		} else if (num == 3 && arr1[2] == "저격병" && arr[3] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[2] = "저격병(R)";
			arr[3] = "빈 공간";
		}
		if (num == 4 && arr1[3] == "  탱커" && arr[3] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[3] = "탱커(R)";
			arr[3] = "빈 공간";
		} else if (num == 4 && arr1[3] == "  칼병" && arr[3] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[3] = "칼병(R)";
			arr[3] = "빈 공간";
		} else if (num == 4 && arr1[3] == "소총병" && arr[3] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[3] = "소총병(R)";
			arr[3] = "빈 공간";
		} else if (num == 4 && arr1[3] == "저격병" && arr[3] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[3] = "저격병(R)";
			arr[3] = "빈 공간";
		}
		if (num == 5 && arr1[4] == "  탱커" && arr[3] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[4] = "탱커(R)";
			arr[3] = "빈 공간";
		} else if (num == 5 && arr1[4] == "  칼병" && arr[3] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[4] = "칼병(R)";
			arr[3] = "빈 공간";
		} else if (num == 5 && arr1[4] == "소총병" && arr[3] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[4] = "소총병(R)";
			arr[3] = "빈 공간";
		} else if (num == 5 && arr1[4] == "저격병" && arr[3] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[4] = "저격병(R)";
			arr[3] = "빈 공간";
		}
	}

	public void add_red5(int num) { // 인벤토리에서 레드 스톤을 클릭하면 착용할 수 있다.(공격력)
		if (arr[4] == "레드 스톤") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("레드 스톤(공격력)을 착용했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
		if (num == 1 && arr1[0] == "  탱커" && arr[4] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[0] = "탱커(R)";
			arr[4] = "빈 공간";
		} else if (num == 1 && arr1[0] == "  칼병" && arr[4] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[0] = "칼병(R)";
			arr[4] = "빈 공간";
		} else if (num == 1 && arr1[0] == "소총병" && arr[4] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[0] = "소총병(R)";
			arr[4] = "빈 공간";
		} else if (num == 1 && arr1[0] == "저격병" && arr[4] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[0] = "저격병(R)";
			arr[4] = "빈 공간";
		}
		if (num == 2 && arr1[1] == "  탱커" && arr[4] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[1] = "탱커(R)";
			arr[4] = "빈 공간";
		} else if (num == 2 && arr1[1] == "  칼병" && arr[4] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[1] = "칼병(R)";
			arr[4] = "빈 공간";
		} else if (num == 2 && arr1[1] == "소총병" && arr[4] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[1] = "소총병(R)";
			arr[4] = "빈 공간";
		} else if (num == 2 && arr1[1] == "저격병" && arr[4] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[1] = "저격병(R)";
			arr[4] = "빈 공간";
		}
		if (num == 3 && arr1[2] == "  탱커" && arr[4] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[2] = "탱커(R)";
			arr[4] = "빈 공간";
		} else if (num == 3 && arr1[2] == "  칼병" && arr[4] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[2] = "칼병(R)";
			arr[4] = "빈 공간";
		} else if (num == 3 && arr1[2] == "소총병" && arr[4] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[2] = "소총병(R)";
			arr[4] = "빈 공간";
		} else if (num == 3 && arr1[2] == "저격병" && arr[4] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[2] = "저격병(R)";
			arr[4] = "빈 공간";
		}
		if (num == 4 && arr1[3] == "  탱커" && arr[4] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[3] = "탱커(R)";
			arr[4] = "빈 공간";
		} else if (num == 4 && arr1[3] == "  칼병" && arr[4] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[3] = "칼병(R)";
			arr[4] = "빈 공간";
		} else if (num == 4 && arr1[3] == "소총병" && arr[4] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[3] = "소총병(R)";
			arr[4] = "빈 공간";
		} else if (num == 4 && arr1[3] == "저격병" && arr[4] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[3] = "저격병(R)";
			arr[4] = "빈 공간";
		}
		if (num == 5 && arr1[4] == "  탱커" && arr[4] == "레드 스톤") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[4] = "탱커(R)";
			arr[4] = "빈 공간";
		} else if (num == 5 && arr1[4] == "  칼병" && arr[4] == "레드 스톤") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[4] = "칼병(R)";
			arr[4] = "빈 공간";
		} else if (num == 5 && arr1[4] == "소총병" && arr[4] == "레드 스톤") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[4] = "소총병(R)";
			arr[4] = "빈 공간";
		} else if (num == 5 && arr1[4] == "저격병" && arr[4] == "레드 스톤") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[4] = "저격병(R)";
			arr[4] = "빈 공간";
		}
	}

	public void add_green1(int num) {
		if (arr[0] == "그린 스톤") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("그린 스톤(방어력)을 착용했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
		if (num == 1 && arr1[0] == "  탱커" && arr[0] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[0] = "탱커(G)";
			arr[0] = "빈 공간";
		} else if (num == 1 && arr1[0] == "  칼병" && arr[0] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[0] = "칼병(G)";
			arr[0] = "빈 공간";
		} else if (num == 1 && arr1[0] == "소총병" && arr[0] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[0] = "소총병(G)";
			arr[0] = "빈 공간";
		} else if (num == 1 && arr1[0] == "저격병" && arr[0] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[0] = "저격병(G)";
			arr[0] = "빈 공간";
		}
		if (num == 2 && arr1[1] == "  탱커" && arr[0] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[1] = "탱커(G)";
			arr[0] = "빈 공간";
		} else if (num == 2 && arr1[1] == "  칼병" && arr[0] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[1] = "칼병(G)";
			arr[0] = "빈 공간";
		} else if (num == 2 && arr1[1] == "소총병" && arr[0] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[1] = "소총병(G)";
			arr[0] = "빈 공간";
		} else if (num == 2 && arr1[1] == "저격병" && arr[0] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[1] = "저격병(G)";
			arr[0] = "빈 공간";
		}
		if (num == 3 && arr1[2] == "  탱커" && arr[0] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[2] = "탱커(G)";
			arr[0] = "빈 공간";
		} else if (num == 3 && arr1[2] == "  칼병" && arr[0] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[2] = "칼병(G)";
			arr[0] = "빈 공간";
		} else if (num == 3 && arr1[2] == "소총병" && arr[0] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[2] = "소총병(G)";
			arr[0] = "빈 공간";
		} else if (num == 3 && arr1[2] == "저격병" && arr[0] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[2] = "저격병(G)";
			arr[0] = "빈 공간";
		}
		if (num == 4 && arr1[3] == "  탱커" && arr[0] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[3] = "탱커(G)";
			arr[0] = "빈 공간";
		} else if (num == 4 && arr1[3] == "  칼병" && arr[0] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[3] = "칼병(G)";
			arr[0] = "빈 공간";
		} else if (num == 4 && arr1[3] == "소총병" && arr[0] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[3] = "소총병(G)";
			arr[0] = "빈 공간";
		} else if (num == 4 && arr1[3] == "저격병" && arr[0] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[3] = "저격병(G)";
			arr[0] = "빈 공간";
		}
		if (num == 5 && arr1[4] == "  탱커" && arr[0] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[4] = "탱커(G)";
			arr[0] = "빈 공간";
		} else if (num == 5 && arr1[4] == "  칼병" && arr[0] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[4] = "칼병(G)";
			arr[0] = "빈 공간";
		} else if (num == 5 && arr1[4] == "소총병" && arr[0] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[4] = "소총병(G)";
			arr[0] = "빈 공간";
		} else if (num == 5 && arr1[4] == "저격병" && arr[0] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[4] = "저격병(G)";
			arr[0] = "빈 공간";
		}
	}

	public void add_green2(int num) {
		if (arr[1] == "그린 스톤") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("그린 스톤(방어력)을 착용했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
		if (num == 1 && arr1[0] == "  탱커" && arr[1] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[0] = "탱커(G)";
			arr[1] = "빈 공간";
		} else if (num == 1 && arr1[0] == "  칼병" && arr[1] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[0] = "칼병(G)";
			arr[1] = "빈 공간";
		} else if (num == 1 && arr1[0] == "소총병" && arr[1] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[0] = "소총병(G)";
			arr[1] = "빈 공간";
		} else if (num == 1 && arr1[0] == "저격병" && arr[1] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[0] = "저격병(G)";
			arr[1] = "빈 공간";
		}
		if (num == 2 && arr1[1] == "  탱커" && arr[1] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[1] = "탱커(G)";
			arr[1] = "빈 공간";
		} else if (num == 2 && arr1[1] == "  칼병" && arr[1] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[1] = "칼병(G)";
			arr[1] = "빈 공간";
		} else if (num == 2 && arr1[1] == "소총병" && arr[1] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[1] = "소총병(G)";
			arr[1] = "빈 공간";
		} else if (num == 2 && arr1[1] == "저격병" && arr[1] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[1] = "저격병(G)";
			arr[1] = "빈 공간";
		}
		if (num == 3 && arr1[2] == "  탱커" && arr[1] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[2] = "탱커(G)";
			arr[1] = "빈 공간";
		} else if (num == 3 && arr1[2] == "  칼병" && arr[1] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[2] = "칼병(G)";
			arr[1] = "빈 공간";
		} else if (num == 3 && arr1[2] == "소총병" && arr[1] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[2] = "소총병(G)";
			arr[1] = "빈 공간";
		} else if (num == 3 && arr1[2] == "저격병" && arr[1] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[2] = "저격병(G)";
			arr[1] = "빈 공간";
		}
		if (num == 4 && arr1[3] == "  탱커" && arr[1] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[3] = "탱커(G)";
			arr[1] = "빈 공간";
		} else if (num == 4 && arr1[3] == "  칼병" && arr[1] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[3] = "칼병(G)";
			arr[1] = "빈 공간";
		} else if (num == 4 && arr1[3] == "소총병" && arr[1] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[3] = "소총병(G)";
			arr[1] = "빈 공간";
		} else if (num == 4 && arr1[3] == "저격병" && arr[1] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[3] = "저격병(G)";
			arr[1] = "빈 공간";
		}
		if (num == 5 && arr1[4] == "  탱커" && arr[1] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[4] = "탱커(G)";
			arr[1] = "빈 공간";
		} else if (num == 5 && arr1[4] == "  칼병" && arr[1] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[4] = "칼병(G)";
			arr[1] = "빈 공간";
		} else if (num == 5 && arr1[4] == "소총병" && arr[1] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[4] = "소총병(G)";
			arr[1] = "빈 공간";
		} else if (num == 5 && arr1[4] == "저격병" && arr[1] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[4] = "저격병(G)";
			arr[1] = "빈 공간";
		}
	}

	public void add_green3(int num) {
		if (arr[2] == "그린 스톤") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("그린 스톤(방어력)을 착용했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
		if (num == 1 && arr1[0] == "  탱커" && arr[2] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[0] = "탱커(G)";
			arr[2] = "빈 공간";
		} else if (num == 1 && arr1[0] == "  칼병" && arr[2] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[0] = "칼병(G)";
			arr[2] = "빈 공간";
		} else if (num == 1 && arr1[0] == "소총병" && arr[2] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[0] = "소총병(G)";
			arr[2] = "빈 공간";
		} else if (num == 1 && arr1[0] == "저격병" && arr[2] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[0] = "저격병(G)";
			arr[2] = "빈 공간";
		}
		if (num == 2 && arr1[1] == "  탱커" && arr[2] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[1] = "탱커(G)";
			arr[2] = "빈 공간";
		} else if (num == 2 && arr1[1] == "  칼병" && arr[2] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[1] = "칼병(G)";
			arr[2] = "빈 공간";
		} else if (num == 2 && arr1[1] == "소총병" && arr[2] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[1] = "소총병(G)";
			arr[2] = "빈 공간";
		} else if (num == 2 && arr1[1] == "저격병" && arr[2] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[1] = "저격병(G)";
			arr[2] = "빈 공간";
		}
		if (num == 3 && arr1[2] == "  탱커" && arr[2] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[2] = "탱커(G)";
			arr[2] = "빈 공간";
		} else if (num == 3 && arr1[2] == "  칼병" && arr[2] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[2] = "칼병(G)";
			arr[2] = "빈 공간";
		} else if (num == 3 && arr1[2] == "소총병" && arr[2] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[2] = "소총병(G)";
			arr[2] = "빈 공간";
		} else if (num == 3 && arr1[2] == "저격병" && arr[2] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[2] = "저격병(G)";
			arr[2] = "빈 공간";
		}
		if (num == 4 && arr1[3] == "  탱커" && arr[2] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[3] = "탱커(G)";
			arr[2] = "빈 공간";
		} else if (num == 4 && arr1[3] == "  칼병" && arr[2] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[3] = "칼병(G)";
			arr[2] = "빈 공간";
		} else if (num == 4 && arr1[3] == "소총병" && arr[2] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[3] = "소총병(G)";
			arr[2] = "빈 공간";
		} else if (num == 4 && arr1[3] == "저격병" && arr[2] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[3] = "저격병(G)";
			arr[2] = "빈 공간";
		}
		if (num == 5 && arr1[4] == "  탱커" && arr[2] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[4] = "탱커(G)";
			arr[2] = "빈 공간";
		} else if (num == 5 && arr1[4] == "  칼병" && arr[2] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[4] = "칼병(G)";
			arr[2] = "빈 공간";
		} else if (num == 5 && arr1[4] == "소총병" && arr[2] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[4] = "소총병(G)";
			arr[2] = "빈 공간";
		} else if (num == 5 && arr1[4] == "저격병" && arr[2] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[4] = "저격병(G)";
			arr[2] = "빈 공간";
		}
	}

	public void add_green4(int num) {
		if (arr[3] == "그린 스톤") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("그린 스톤(방어력)을 착용했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
		if (num == 1 && arr1[0] == "  탱커" && arr[3] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[0] = "탱커(G)";
			arr[3] = "빈 공간";
		} else if (num == 1 && arr1[0] == "  칼병" && arr[3] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[0] = "칼병(G)";
			arr[3] = "빈 공간";
		} else if (num == 1 && arr1[0] == "소총병" && arr[3] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[0] = "소총병(G)";
			arr[3] = "빈 공간";
		} else if (num == 1 && arr1[0] == "저격병" && arr[3] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[0] = "저격병(G)";
			arr[3] = "빈 공간";
		}
		if (num == 2 && arr1[1] == "  탱커" && arr[3] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[1] = "탱커(G)";
			arr[3] = "빈 공간";
		} else if (num == 2 && arr1[1] == "  칼병" && arr[3] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[1] = "칼병(G)";
			arr[3] = "빈 공간";
		} else if (num == 2 && arr1[1] == "소총병" && arr[3] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[1] = "소총병(G)";
			arr[3] = "빈 공간";
		} else if (num == 2 && arr1[1] == "저격병" && arr[3] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[1] = "저격병(G)";
			arr[3] = "빈 공간";
		}
		if (num == 3 && arr1[2] == "  탱커" && arr[3] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[2] = "탱커(G)";
			arr[3] = "빈 공간";
		} else if (num == 3 && arr1[2] == "  칼병" && arr[3] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[2] = "칼병(G)";
			arr[3] = "빈 공간";
		} else if (num == 3 && arr1[2] == "소총병" && arr[3] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[2] = "소총병(G)";
			arr[3] = "빈 공간";
		} else if (num == 3 && arr1[2] == "저격병" && arr[3] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[2] = "저격병(G)";
			arr[3] = "빈 공간";
		}
		if (num == 4 && arr1[3] == "  탱커" && arr[3] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[3] = "탱커(G)";
			arr[3] = "빈 공간";
		} else if (num == 4 && arr1[3] == "  칼병" && arr[3] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[3] = "칼병(G)";
			arr[3] = "빈 공간";
		} else if (num == 4 && arr1[3] == "소총병" && arr[3] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[3] = "소총병(G)";
			arr[3] = "빈 공간";
		} else if (num == 4 && arr1[3] == "저격병" && arr[3] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[3] = "저격병(G)";
			arr[3] = "빈 공간";
		}
		if (num == 5 && arr1[4] == "  탱커" && arr[3] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[4] = "탱커(G)";
			arr[3] = "빈 공간";
		} else if (num == 5 && arr1[4] == "  칼병" && arr[3] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[4] = "칼병(G)";
			arr[3] = "빈 공간";
		} else if (num == 5 && arr1[4] == "소총병" && arr[3] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[4] = "소총병(G)";
			arr[3] = "빈 공간";
		} else if (num == 5 && arr1[4] == "저격병" && arr[3] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[4] = "저격병(G)";
			arr[3] = "빈 공간";
		}
	}

	public void add_green5(int num) {
		if (arr[4] == "그린 스톤") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("그린 스톤(방어력)을 착용했습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.println("아무 키나 입력하시고 엔터키를 눌러누십시오.");
			System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
			System.out.print("입력: ");
		}
		if (num == 1 && arr1[0] == "  탱커" && arr[4] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[0] = "탱커(G)";
			arr[4] = "빈 공간";
		} else if (num == 1 && arr1[0] == "  칼병" && arr[4] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[0] = "칼병(G)";
			arr[4] = "빈 공간";
		} else if (num == 1 && arr1[0] == "소총병" && arr[4] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[0] = "소총병(G)";
			arr[4] = "빈 공간";
		} else if (num == 1 && arr1[0] == "저격병" && arr[4] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[0] = "저격병(G)";
			arr[4] = "빈 공간";
		}
		if (num == 2 && arr1[1] == "  탱커" && arr[4] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[1] = "탱커(G)";
			arr[4] = "빈 공간";
		} else if (num == 2 && arr1[1] == "  칼병" && arr[4] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[1] = "칼병(G)";
			arr[4] = "빈 공간";
		} else if (num == 2 && arr1[1] == "소총병" && arr[4] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[1] = "소총병(G)";
			arr[4] = "빈 공간";
		} else if (num == 2 && arr1[1] == "저격병" && arr[4] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[1] = "저격병(G)";
			arr[4] = "빈 공간";
		}
		if (num == 3 && arr1[2] == "  탱커" && arr[4] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[2] = "탱커(G)";
			arr[4] = "빈 공간";
		} else if (num == 3 && arr1[2] == "  칼병" && arr[4] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[2] = "칼병(G)";
			arr[4] = "빈 공간";
		} else if (num == 3 && arr1[2] == "소총병" && arr[4] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[2] = "소총병(G)";
			arr[4] = "빈 공간";
		} else if (num == 3 && arr1[2] == "저격병" && arr[4] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[2] = "저격병(G)";
			arr[4] = "빈 공간";
		}
		if (num == 4 && arr1[3] == "  탱커" && arr[4] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[3] = "탱커(G)";
			arr[4] = "빈 공간";
		} else if (num == 4 && arr1[3] == "  칼병" && arr[4] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[3] = "칼병(G)";
			arr[4] = "빈 공간";
		} else if (num == 4 && arr1[3] == "소총병" && arr[4] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[3] = "소총병(G)";
			arr[4] = "빈 공간";
		} else if (num == 4 && arr1[3] == "저격병" && arr[4] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[3] = "저격병(G)";
			arr[4] = "빈 공간";
		}
		if (num == 5 && arr1[4] == "  탱커" && arr[4] == "그린 스톤") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[4] = "탱커(G)";
			arr[4] = "빈 공간";
		} else if (num == 5 && arr1[4] == "  칼병" && arr[4] == "그린 스톤") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[4] = "칼병(G)";
			arr[4] = "빈 공간";
		} else if (num == 5 && arr1[4] == "소총병" && arr[4] == "그린 스톤") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[4] = "소총병(G)";
			arr[4] = "빈 공간";
		} else if (num == 5 && arr1[4] == "저격병" && arr[4] == "그린 스톤") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[4] = "저격병(G)";
			arr[4] = "빈 공간";
		}
	}

	/*
	 * int add_red(int x, int y, int z) { //인벤토리에서 레드스톤을 구매하면 착용이 된다.(공격력) hp6+=10;
	 * attack+=35; defense+=1; return 0; } int add_green(int x, int y, int z) {
	 * //인벤토리에서 그린스톤을 구매하면 착용이 된다.(방어력) hp6+=10; attack+=10; defense+=5; return 0; }
	 */
	public void defeat() {
		for (int j = 0; j < 100; j++) {
			System.out.println();
		}
		System.out.println("                     ####                       #     \r\n"
				+ " #####              #                           #     \r\n"
				+ " #    #             #                           #     \r\n"
				+ " #     #   #####   ####      #####    ######  ######  \r\n"
				+ " #     #  #     #   #       #     #  #     #    #     \r\n"
				+ " #     #  #######   #       #######  #     #    #     \r\n"
				+ " #    #   #         #       #        #    ##    #     \r\n"
				+ " #####     #####    #        #####    #### #     ###  ");
		System.out.println("\n패배하셨습니다.");
		System.exit(0);
	}

	public void win() {
		if (hp2 < 0) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println(":::       ::: ::::::::::: ::::    ::: ::::    ::: :::::::::: :::::::::  \r\n"
					+ ":+:       :+:     :+:     :+:+:   :+: :+:+:   :+: :+:        :+:    :+: \r\n"
					+ "+:+       +:+     +:+     :+:+:+  +:+ :+:+:+  +:+ +:+        +:+    +:+ \r\n"
					+ "+#+  +:+  +#+     +#+     +#+ +:+ +#+ +#+ +:+ +#+ +#++:++#   +#++:++#:  \r\n"
					+ "+#+ +#+#+ +#+     +#+     +#+  +#+#+# +#+  +#+#+# +#+        +#+    +#+ \r\n"
					+ " #+#+# #+#+#      #+#     #+#   #+#+# #+#   #+#+# #+#        #+#    #+# \r\n"
					+ "  ###   ###   ########### ###    #### ###    #### ########## ###    ### ");
			System.out.println("\n축하합니다.\n적군 기지가 파괴되었습니다.\n게임에서 승리하였습니다.");
			System.exit(0);
		}
	}

	/*
	 * public void war1() { this.battle(); // 적 소환 sc.next(); while (true) {
	 * this.battle1(); // 적을 선제 공격 sc.next(); this.battle2(); // 적의 남은 체력 sc.next();
	 * this.battle3(); // 적의 체력이 없으면 적의 기지를 공격하고, 턴이 넘어간다. 만약 아군 기지 체력이 0이 되면 게임이 종료
	 * 된다. sc.next(); if (arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] ==
	 * "빈 공간" && arr1[3] == "빈 공간" && arr1[4] == "빈 공간") { break; } this.win(); //
	 * 적의 기지가 부숴지면 게임이 끝남. /*if (hp5 == 0) { break; }
	 */
	/*
	 * } }
	 */

	public void reset() {
		sum = 0;
	}

	/*
	 * public void on() { if (arr1[0] != "빈 공간") { // arr1[0]에 유닛이 있을 경우 if (o == 2)
	 * { // o가 2이면 공격 if (arr1[0] == "  탱커" || arr1[0] == "탱커(R)" || arr1[0] ==
	 * "탱커(G)" || arr1[0] == "탱커(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" &&
	 * arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * tanker_attack; } else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0]
	 * == "칼병(G)" || arr1[0] == "칼병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" &&
	 * arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * nife_attack; } else if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] ==
	 * "소총병(G)" || arr1[0] == "소총병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" &&
	 * arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * rifle_attack; } else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0]
	 * == "저격병(G)" || arr1[0] == "저격병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간"
	 * && arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * sniper_attack; } else if (arr1[0] == "  탱커" || arr1[0] == "탱커(R)" || arr1[0]
	 * == "탱커(G)" || arr1[0] == "탱커(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
	 * j = (int) (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0)
	 * { hydra_hp_1 -= tanker_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= tanker_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= tanker_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= tanker_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= tanker_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2
	 * -= tanker_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= tanker_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { thief_hp_2 -= tanker_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } }
	 * else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" ||
	 * arr1[0] == "칼병(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") { j = (int)
	 * (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= nife_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= nife_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= nife_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= nife_attack; mutal_hp_2 += mutal_defense; if
	 * (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin") {
	 * if (j == 0) { goblin_hp_1 -= nife_attack; goblin_hp_1 += goblin_defense; if
	 * (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2 -=
	 * nife_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) { arr6[1] =
	 * "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) { thief_hp_1 -=
	 * nife_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0) { arr6[0] =
	 * "빈 공간"; } } else if (j == 1) { thief_hp_2 -= nife_attack; thief_hp_2 +=
	 * thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } } else if
	 * (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] ==
	 * "소총병(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") { j = (int)
	 * (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= rifle_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= rifle_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= rifle_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= rifle_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= rifle_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2
	 * -= rifle_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= rifle_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0)
	 * { arr6[0] = "빈 공간"; } } else if (j == 1) { thief_hp_2 -= rifle_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } }
	 * else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" ||
	 * arr1[0] == "저격병(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") { j = (int)
	 * (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= sniper_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= sniper_attack;
	 * hydra_hp_2 += hydra_defense; if (tanker_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= sniper_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= sniper_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= sniper_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2
	 * -= sniper_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= sniper_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { thief_hp_2 -= sniper_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * // 시작끝 } else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] ==
	 * "저격병(G)" || arr1[0] == "저격병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" ||
	 * arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4까지 if (arr6[0] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= sniper_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <=
	 * 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= sniper_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { hydra_hp_5 -= sniper_attack; hydra_hp_5 += hydra_defense;
	 * if (hydra_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "mutal") {
	 * if (j == 2) { mutal_hp_3 -= sniper_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -=
	 * sniper_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { mutal_hp_5 -= sniper_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if
	 * (arr6[0] == "goblin") { if (j == 2) { goblin_hp_3 -= sniper_attack;
	 * goblin_hp_3 += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } }
	 * else if (j == 3) { goblin_hp_4 -= sniper_attack; goblin_hp_4 +=
	 * goblin_defense; if (goblin_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j ==
	 * 4) { goblin_hp_5 -= sniper_attack; goblin_hp_5 += goblin_defense; if
	 * (goblin_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "thief") {
	 * if (j == 2) { thief_hp_3 -= sniper_attack; thief_hp_3 += thief_defense; if
	 * (thief_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { thief_hp_4 -=
	 * sniper_attack; thief_hp_4 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { thief_hp_5 -= sniper_attack; thief_hp_5 +=
	 * thief_defense; if (thief_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } } else if
	 * (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] ==
	 * "소총병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" || arr6[2] != "빈 공간" ||
	 * arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int) (Math.random() * 3) +
	 * 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * rifle_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= rifle_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4)
	 * { hydra_hp_5 -= rifle_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= rifle_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <= 0)
	 * { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -= rifle_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { mutal_hp_5 -= rifle_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= rifle_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { goblin_hp_4
	 * -= rifle_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "빈 공간"; } } else if (j == 4) { goblin_hp_5 -= rifle_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "빈 공간"; } }
	 * } else if (arr6[0] == "thief") { if (j == 2) { thief_hp_3 -= rifle_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "빈 공간"; } }
	 * else if (j == 3) { thief_hp_4 -= rifle_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4) { thief_hp_5 -=
	 * rifle_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <= 0) { arr6[4] =
	 * "빈 공간"; } } } } else if (arr1[0] == "  탱커" || arr1[0] == "탱커(R)" || arr1[0]
	 * == "탱커(G)" || arr1[0] == "탱커(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" ||
	 * arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= tanker_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <=
	 * 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= tanker_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { hydra_hp_5 -= tanker_attack; hydra_hp_5 += hydra_defense;
	 * if (hydra_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "mutal") {
	 * if (j == 2) { mutal_hp_3 -= tanker_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -=
	 * tanker_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { mutal_hp_5 -= tanker_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if
	 * (arr6[0] == "goblin") { if (j == 2) { goblin_hp_3 -= tanker_attack;
	 * goblin_hp_3 += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } }
	 * else if (j == 3) { goblin_hp_4 -= tanker_attack; goblin_hp_4 +=
	 * goblin_defense; if (goblin_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j ==
	 * 4) { goblin_hp_5 -= tanker_attack; goblin_hp_5 += goblin_defense; if
	 * (goblin_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "thief") {
	 * if (j == 2) { thief_hp_3 -= tanker_attack; thief_hp_3 += thief_defense; if
	 * (thief_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { thief_hp_4 -=
	 * tanker_attack; thief_hp_4 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { thief_hp_5 -= tanker_attack; thief_hp_5 +=
	 * thief_defense; if (thief_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } } else if
	 * (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] ==
	 * "칼병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" || arr6[2] != "빈 공간" ||
	 * arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int) (Math.random() * 3) +
	 * 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -= nife_attack;
	 * hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] = "빈 공간"; } }
	 * else if (j == 3) { hydra_hp_4 -= nife_attack; hydra_hp_4 += hydra_defense; if
	 * (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4) { hydra_hp_5 -=
	 * nife_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <= 0) { arr6[4] =
	 * "빈 공간"; } } } else if (arr6[0] == "mutal") { if (j == 2) { mutal_hp_3 -=
	 * nife_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <= 0) { arr6[2] =
	 * "빈 공간"; } } else if (j == 3) { mutal_hp_4 -= nife_attack; mutal_hp_4 +=
	 * mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4)
	 * { mutal_hp_5 -= nife_attack; mutal_hp_5 += mutal_defense; if (mutal_hp_5 <=
	 * 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "goblin") { if (j == 2) {
	 * goblin_hp_3 -= nife_attack; goblin_hp_3 += goblin_defense; if (goblin_hp_3 <=
	 * 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { goblin_hp_4 -= nife_attack;
	 * goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { goblin_hp_5 -= nife_attack; goblin_hp_5 += goblin_defense;
	 * if (goblin_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "thief")
	 * { if (j == 2) { thief_hp_3 -= nife_attack; thief_hp_3 += thief_defense; if
	 * (thief_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { thief_hp_4 -=
	 * nife_attack; thief_hp_4 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { thief_hp_5 -= nife_attack; thief_hp_5 +=
	 * thief_defense; if (thief_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } } } if (o != 2)
	 * { o++; } else if (o == 2) { o = 0; } } // arr6[0] 끝 // arr6[1] 시작 if (arr1[1]
	 * != "빈 공간") { // arr6[1]에 유닛이 있을 경우 if (oo == 2) { // oo가 2이면 공격 if (arr1[1]
	 * == "  탱커" || arr1[1] == "탱커(R)" || arr1[1] == "탱커(G)" || arr1[1] == "탱커(B)"
	 * && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] ==
	 * "빈 공간" && arr6[4] == "빈 공간") { hp2 -= tanker_attack; } else if (arr1[1] ==
	 * "  칼병" || arr1[1] == "칼병(R)" || arr1[1] == "칼병(G)" || arr1[1] == "칼병(B)" &&
	 * arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] ==
	 * "빈 공간" && arr6[4] == "빈 공간") { hp2 -= nife_attack; } else if (arr1[1] ==
	 * "소총병" || arr1[1] == "소총병(R)" || arr1[1] == "소총병(G)" || arr1[1] == "소총병(B)" &&
	 * arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] ==
	 * "빈 공간" && arr6[4] == "빈 공간") { hp2 -= rifle_attack; } else if (arr1[1] ==
	 * "저격병" || arr1[1] == "저격병(R)" || arr1[1] == "저격병(G)" || arr1[1] == "저격병(B)" &&
	 * arr6[0] == "빈 공간" && arr6[1] == "빈 공간" && arr6[2] == "빈 공간" && arr6[3] ==
	 * "빈 공간" && arr6[4] == "빈 공간") { hp2 -= sniper_attack; } else if (arr1[1] ==
	 * "  탱커" || arr1[1] == "탱커(R)" || arr1[1] == "탱커(G)" || arr1[1] == "탱커(B)" &&
	 * arr6[0] != "빈 공간" || arr6[1] != "빈 공간") { j = (int) (Math.random() * 2);//
	 * 0~1까지 if (arr6[j] == "hydra") { if (j == 0) { hydra_hp_1 -= tanker_attack;
	 * hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { hydra_hp_2 -= tanker_attack; hydra_hp_2 += hydra_defense;
	 * if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "mutal") {
	 * if (j == 0) { mutal_hp_1 -= tanker_attack; mutal_hp_1 += mutal_defense; if
	 * (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { mutal_hp_2 -=
	 * tanker_attack; mutal_hp_2 += mutal_defense; if (mutal_hp_2 <= 0) { arr6[1] =
	 * "빈 공간"; } } } else if (arr6[j] == "goblin") { if (j == 0) { goblin_hp_1 -=
	 * tanker_attack; goblin_hp_1 += goblin_defense; if (goblin_hp_1 <= 0) { arr6[0]
	 * = "빈 공간"; } } else if (j == 1) { goblin_hp_2 -= tanker_attack; goblin_hp_2 +=
	 * goblin_defense; if (goblin_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if
	 * (arr6[j] == "thief") { if (j == 0) { thief_hp_1 -= tanker_attack; thief_hp_1
	 * += thief_defense; if (thief_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j ==
	 * 1) { thief_hp_2 -= tanker_attack; thief_hp_2 += thief_defense; if (thief_hp_2
	 * <= 0) { arr6[1] = "빈 공간"; } } } } else if (arr1[1] == "  칼병" || arr1[1] ==
	 * "칼병(R)" || arr1[1] == "칼병(G)" || arr1[1] == "칼병(B)" && arr6[0] != "빈 공간" ||
	 * arr6[1] != "빈 공간") { j = (int) (Math.random() * 2);// 0~1까지 if (arr6[j] ==
	 * "hydra") { if (j == 0) { hydra_hp_1 -= nife_attack; hydra_hp_1 +=
	 * hydra_defense; if (hydra_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1)
	 * { hydra_hp_2 -= nife_attack; hydra_hp_2 += hydra_defense; if (hydra_hp_2 <=
	 * 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "mutal") { if (j == 0) {
	 * mutal_hp_1 -= nife_attack; mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0)
	 * { arr6[0] = "빈 공간"; } } else if (j == 1) { mutal_hp_2 -= nife_attack;
	 * mutal_hp_2 += mutal_defense; if (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "goblin") { if (j == 0) { goblin_hp_1 -= nife_attack;
	 * goblin_hp_1 += goblin_defense; if (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { goblin_hp_2 -= nife_attack; goblin_hp_2 += goblin_defense;
	 * if (goblin_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "thief")
	 * { if (j == 0) { thief_hp_1 -= nife_attack; thief_hp_1 += thief_defense; if
	 * (thief_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { thief_hp_2 -=
	 * nife_attack; thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] =
	 * "빈 공간"; } } } } else if (arr1[1] == "소총병" || arr1[1] == "소총병(R)" || arr1[1]
	 * == "소총병(G)" || arr1[1] == "소총병(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간")
	 * { j = (int) (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j ==
	 * 0) { hydra_hp_1 -= rifle_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1
	 * <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= rifle_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= rifle_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= rifle_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= rifle_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2
	 * -= rifle_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_1 <= 0) {
	 * arr6[1] = "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= rifle_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0)
	 * { arr6[0] = "빈 공간"; } } else if (j == 1) { thief_hp_2 -= rifle_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } }
	 * else if (arr1[1] == "저격병" || arr1[1] == "저격병(R)" || arr1[1] == "저격병(G)" ||
	 * arr1[1] == "저격병(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") { j = (int)
	 * (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= sniper_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= sniper_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= sniper_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= sniper_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= sniper_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2
	 * -= sniper_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= sniper_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { thief_hp_2 -= sniper_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * // 시작끝1 } else if (arr1[1] == "저격병" || arr1[1] == "저격병(R)" || arr1[1] ==
	 * "저격병(G)" || arr1[1] == "저격병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" ||
	 * arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= sniper_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <=
	 * 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= sniper_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { hydra_hp_5 -= sniper_attack; hydra_hp_5 += hydra_defense;
	 * if (hydra_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[j] == "mutal") {
	 * if (j == 2) { mutal_hp_3 -= sniper_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -=
	 * sniper_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { mutal_hp_5 -= sniper_attack; mutal_hp_5 +=
	 * mutal_defense; if (nife_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[j]
	 * == "goblin") { if (j == 2) { goblin_hp_3 -= sniper_attack; goblin_hp_3 +=
	 * goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j ==
	 * 3) { goblin_hp_4 -= sniper_attack; goblin_hp_4 += goblin_defense; if
	 * (goblin_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4) { goblin_hp_5 -=
	 * sniper_attack; goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4]
	 * = "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 2) { thief_hp_3 -=
	 * sniper_attack; thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] =
	 * "빈 공간"; } } else if (j == 3) { thief_hp_4 -= sniper_attack; thief_hp_4 +=
	 * thief_defense; if (thief_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4)
	 * { thief_hp_5 -= sniper_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <=
	 * 0) { arr6[4] = "빈 공간"; } } } } else if (arr1[1] == "소총병" || arr1[1] ==
	 * "소총병(R)" || arr1[1] == "소총병(G)" || arr1[1] == "소총병(B)" && arr6[0] == "빈 공간"
	 * && arr6[1] == "빈 공간" || arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] !=
	 * "빈 공간") { j = (int) (Math.random() * 3) + 2;// 2~4까지 if (arr6[j] == "hydra")
	 * { if (j == 2) { hydra_hp_3 -= rifle_attack; hydra_hp_3 += hydra_defense; if
	 * (hydra_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { hydra_hp_4 -=
	 * rifle_attack; hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { hydra_hp_5 -= rifle_attack; hydra_hp_5 +=
	 * hydra_defense; if (hydra_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if
	 * (arr6[j] == "mutal") { if (j == 2) { mutal_hp_3 -= rifle_attack; mutal_hp_3
	 * += mutal_defense; if (mutal_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j ==
	 * 3) { mutal_hp_4 -= rifle_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4
	 * <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4) { mutal_hp_5 -= rifle_attack;
	 * mutal_hp_5 += mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } }
	 * else if (arr6[j] == "goblin") { if (j == 2) { goblin_hp_3 -= rifle_attack;
	 * goblin_hp_3 += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } }
	 * else if (j == 3) { goblin_hp_4 -= rifle_attack; goblin_hp_4 +=
	 * goblin_defense; if (goblin_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j ==
	 * 4) { goblin_hp_5 -= rifle_attack; goblin_hp_5 += goblin_defense; if
	 * (goblin_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[j] == "thief") {
	 * if (j == 2) { thief_hp_3 -= rifle_attack; thief_hp_3 += thief_defense; if
	 * (thief_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { thief_hp_4 -=
	 * rifle_attack; thief_hp_4 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { thief_hp_5 -= rifle_attack; thief_hp_5 +=
	 * thief_defense; if (thief_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } } else if
	 * (arr1[1] == "  탱커" || arr1[1] == "탱커(R)" || arr1[1] == "탱커(G)" || arr1[1] ==
	 * "탱커(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" || arr6[2] != "빈 공간" ||
	 * arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int) (Math.random() * 3) +
	 * 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * tanker_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= tanker_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4)
	 * { hydra_hp_5 -= tanker_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "빈 공간"; } } } else if (arr6[j] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= tanker_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <=
	 * 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -= tanker_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { mutal_hp_5 -= tanker_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= tanker_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { goblin_hp_4
	 * -= tanker_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "빈 공간"; } } else if (j == 4) { goblin_hp_5 -= tanker_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "빈 공간"; } }
	 * } else if (arr6[j] == "thief") { if (j == 2) { thief_hp_3 -= tanker_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "빈 공간"; } }
	 * else if (j == 3) { thief_hp_4 -= tanker_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4) { thief_hp_5 -=
	 * tanker_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <= 0) { arr6[4] =
	 * "빈 공간"; } } } } else if (arr1[1] == "  칼병" || arr1[1] == "칼병(R)" || arr1[1]
	 * == "칼병(G)" || arr1[1] == "칼병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" ||
	 * arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= nife_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0)
	 * { arr6[2] = "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= nife_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { hydra_hp_5 -= nife_attack; hydra_hp_5 += hydra_defense; if
	 * (hydra_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[j] == "mutal") { if
	 * (j == 2) { mutal_hp_3 -= nife_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -=
	 * nife_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { mutal_hp_5 -= nife_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if
	 * (arr6[j] == "goblin") { if (j == 2) { goblin_hp_3 -= nife_attack; goblin_hp_3
	 * += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j
	 * == 3) { goblin_hp_4 -= nife_attack; goblin_hp_4 += goblin_defense; if
	 * (goblin_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4) { goblin_hp_5 -=
	 * nife_attack; goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] =
	 * "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 2) { thief_hp_3 -=
	 * nife_attack; thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] =
	 * "빈 공간"; } } else if (j == 3) { thief_hp_4 -= nife_attack; thief_hp_4 +=
	 * thief_defense; if (thief_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4)
	 * { thief_hp_5 -= nife_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <=
	 * 0) { arr6[4] = "빈 공간"; } } } } } if (oo != 2) { oo++; } else if (oo == 2) {
	 * oo = 0; } } // arr6[1]끝 // arr6[2]시작 if (arr1[2] != "빈 공간") { if (ooo == 2) {
	 * // ooo가 2이면 공격 if (arr1[2] == "  탱커" || arr1[2] == "탱커(R)" || arr1[2] ==
	 * "탱커(G)" || arr1[2] == "탱커(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" &&
	 * arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * tanker_attack; } else if (arr1[2] == "  칼병" || arr1[2] == "칼병(R)" || arr1[2]
	 * == "칼병(G)" || arr1[2] == "칼병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" &&
	 * arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * nife_attack; } else if (arr1[2] == "소총병" || arr1[2] == "소총병(R)" || arr1[2] ==
	 * "소총병(G)" || arr1[2] == "소총병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" &&
	 * arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * rifle_attack; } else if (arr1[2] == "저격병" || arr1[2] == "저격병(R)" || arr1[2]
	 * == "저격병(G)" || arr1[2] == "저격병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간"
	 * && arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * sniper_attack; } else if (arr1[2] == "  탱커" || arr1[2] == "탱커(R)" || arr1[2]
	 * == "탱커(G)" || arr1[2] == "탱커(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
	 * j = (int) (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0)
	 * { hydra_hp_1 -= tanker_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= tanker_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= tanker_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= tanker_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= tanker_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2
	 * -= tanker_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= tanker_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { thief_hp_2 -= tanker_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } }
	 * else if (arr1[2] == "  칼병" || arr1[2] == "칼병(R)" || arr1[2] == "칼병(G)" ||
	 * arr1[2] == "칼병(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") { j = (int)
	 * (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= nife_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= nife_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= nife_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= nife_attack; mutal_hp_2 += mutal_defense; if
	 * (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin") {
	 * if (j == 0) { goblin_hp_1 -= nife_attack; goblin_hp_1 += goblin_defense; if
	 * (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2 -=
	 * nife_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) { arr6[1] =
	 * "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) { thief_hp_1 -=
	 * nife_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0) { arr6[0] =
	 * "빈 공간"; } } else if (j == 1) { thief_hp_2 -= nife_attack; thief_hp_2 +=
	 * thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } } else if
	 * (arr1[2] == "소총병" || arr1[2] == "소총병(R)" || arr1[2] == "소총병(G)" || arr1[2] ==
	 * "소총병(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") { j = (int)
	 * (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= rifle_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= rifle_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= rifle_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= rifle_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= rifle_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2
	 * -= rifle_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= rifle_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0)
	 * { arr6[0] = "빈 공간"; } } else if (j == 1) { thief_hp_2 -= rifle_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } }
	 * else if (arr1[2] == "저격병" || arr1[2] == "저격병(R)" || arr1[2] == "저격병(G)" ||
	 * arr1[2] == "저격병(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") { j = (int)
	 * (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= sniper_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= sniper_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= sniper_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= sniper_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= sniper_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2
	 * -= sniper_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= sniper_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { thief_hp_2 -= sniper_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } }
	 * else if (arr1[2] == "저격병" || arr1[2] == "저격병(R)" || arr1[2] == "저격병(G)" ||
	 * arr1[2] == "저격병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" || arr6[2] !=
	 * "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int) (Math.random()
	 * * 3) + 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * sniper_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= sniper_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4)
	 * { hydra_hp_5 -= sniper_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "빈 공간"; } } } else if (arr6[j] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= sniper_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <=
	 * 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -= sniper_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { mutal_hp_5 -= sniper_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= sniper_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { goblin_hp_4
	 * -= sniper_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "빈 공간"; } } else if (j == 4) { goblin_hp_5 -= sniper_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "빈 공간"; } }
	 * } else if (arr6[j] == "thief") { if (j == 2) { thief_hp_3 -= sniper_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "빈 공간"; } }
	 * else if (j == 3) { thief_hp_4 -= sniper_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4) { thief_hp_5 -=
	 * sniper_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <= 0) { arr6[4] =
	 * "빈 공간"; } } } } else if (arr1[2] == "소총병" || arr1[2] == "소총병(R)" || arr1[2]
	 * == "소총병(G)" || arr1[2] == "소총병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간"
	 * || arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= rifle_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0)
	 * { arr6[2] = "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= rifle_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { hydra_hp_5 -= rifle_attack; hydra_hp_5 += hydra_defense;
	 * if (hydra_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[j] == "mutal") {
	 * if (j == 2) { mutal_hp_3 -= rifle_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -=
	 * rifle_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { mutal_hp_5 -= rifle_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if
	 * (arr6[j] == "goblin") { if (j == 2) { goblin_hp_3 -= rifle_attack;
	 * goblin_hp_3 += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } }
	 * else if (j == 3) { goblin_hp_4 -= rifle_attack; goblin_hp_4 +=
	 * goblin_defense; if (goblin_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j ==
	 * 4) { goblin_hp_5 -= rifle_attack; goblin_hp_5 += goblin_defense; if
	 * (goblin_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[j] == "thief") {
	 * if (j == 2) { thief_hp_3 -= rifle_attack; thief_hp_3 += thief_defense; if
	 * (thief_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { thief_hp_4 -=
	 * rifle_attack; thief_hp_4 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { thief_hp_5 -= rifle_attack; thief_hp_5 +=
	 * thief_defense; if (thief_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } } else if
	 * (arr1[2] == "  탱커" || arr1[2] == "탱커(R)" || arr1[2] == "탱커(G)" || arr1[2] ==
	 * "탱커(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" || arr6[2] != "빈 공간" ||
	 * arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int) (Math.random() * 3) +
	 * 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * tanker_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= tanker_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4)
	 * { hydra_hp_5 -= tanker_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "빈 공간"; } } } else if (arr6[j] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= tanker_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <=
	 * 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -= tanker_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { mutal_hp_5 -= tanker_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= tanker_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { goblin_hp_4
	 * -= tanker_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "빈 공간"; } } else if (j == 4) { goblin_hp_5 -= tanker_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "빈 공간"; } }
	 * } else if (arr6[j] == "thief") { if (j == 2) { thief_hp_3 -= tanker_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "빈 공간"; } }
	 * else if (j == 3) { thief_hp_4 -= tanker_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4) { thief_hp_5 -=
	 * tanker_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <= 0) { arr6[4] =
	 * "빈 공간"; } } } } else if (arr1[2] == "  칼병" || arr1[2] == "칼병(R)" || arr1[2]
	 * == "칼병(G)" || arr1[2] == "칼병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" ||
	 * arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= nife_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0)
	 * { arr6[2] = "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= nife_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { hydra_hp_5 -= nife_attack; hydra_hp_5 += hydra_defense; if
	 * (hydra_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[j] == "mutal") { if
	 * (j == 2) { mutal_hp_3 -= nife_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -=
	 * nife_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { mutal_hp_5 -= nife_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if
	 * (arr6[j] == "goblin") { if (j == 2) { goblin_hp_3 -= nife_attack; goblin_hp_3
	 * += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j
	 * == 3) { goblin_hp_4 -= nife_attack; goblin_hp_4 += goblin_defense; if
	 * (goblin_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4) { goblin_hp_5 -=
	 * nife_attack; goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] =
	 * "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 2) { thief_hp_3 -=
	 * nife_attack; thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] =
	 * "빈 공간"; } } else if (j == 3) { thief_hp_4 -= nife_attack; thief_hp_4 +=
	 * thief_defense; if (thief_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4)
	 * { thief_hp_5 -= nife_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <=
	 * 0) { arr6[4] = "빈 공간"; } } } } } if (ooo != 2) { ooo++; } else if (ooo == 2)
	 * { ooo = 0; } } // arr6[2] 끝 if (arr1[3] != "빈 공간") { if (oooo == 2) { //
	 * oooo가 2이면 공격 if (arr1[3] == "  탱커" || arr1[3] == "탱커(R)" || arr1[3] ==
	 * "탱커(G)" || arr1[3] == "탱커(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" &&
	 * arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * tanker_attack; } else if (arr1[3] == "  칼병" || arr1[3] == "칼병(R)" || arr1[3]
	 * == "칼병(G)" || arr1[3] == "칼병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" &&
	 * arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * nife_attack; } else if (arr1[3] == "소총병" || arr1[3] == "소총병(R)" || arr1[3] ==
	 * "소총병(G)" || arr1[3] == "소총병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" &&
	 * arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * rifle_attack; } else if (arr1[3] == "저격병" || arr1[3] == "저격병(R)" || arr1[3]
	 * == "저격병(G)" || arr1[3] == "저격병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간"
	 * && arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * sniper_attack; } else if (arr1[3] == "  탱커" || arr1[3] == "탱커(R)" || arr1[3]
	 * == "탱커(G)" || arr1[3] == "탱커(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
	 * j = (int) (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0)
	 * { hydra_hp_1 -= tanker_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= tanker_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= tanker_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= tanker_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= tanker_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2
	 * -= tanker_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= tanker_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { thief_hp_2 -= tanker_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } }
	 * else if (arr1[3] == "  칼병" || arr1[3] == "칼병(R)" || arr1[3] == "칼병(G)" ||
	 * arr1[3] == "칼병(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") { j = (int)
	 * (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= nife_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= nife_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= nife_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= nife_attack; mutal_hp_2 += mutal_defense; if
	 * (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin") {
	 * if (j == 0) { goblin_hp_1 -= nife_attack; goblin_hp_1 += goblin_defense; if
	 * (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2 -=
	 * nife_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) { arr6[1] =
	 * "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) { thief_hp_1 -=
	 * nife_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0) { arr6[0] =
	 * "빈 공간"; } } else if (j == 1) { thief_hp_2 -= nife_attack; thief_hp_2 +=
	 * thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } } else if
	 * (arr1[3] == "소총병" || arr1[3] == "소총병(R)" || arr1[3] == "소총병(G)" || arr1[3] ==
	 * "소총병(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") { j = (int)
	 * (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= rifle_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= rifle_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= rifle_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= rifle_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= rifle_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2
	 * -= rifle_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= rifle_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0)
	 * { arr6[0] = "빈 공간"; } } else if (j == 1) { thief_hp_2 -= rifle_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } }
	 * else if (arr1[3] == "저격병" || arr1[3] == "저격병(R)" || arr1[3] == "저격병(G)" ||
	 * arr1[3] == "저격병(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") { j = (int)
	 * (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= sniper_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= sniper_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= sniper_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= sniper_attack; mutal_hp_2 += mutal_defense;
	 * if (nife_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin") {
	 * if (j == 0) { goblin_hp_1 -= sniper_attack; goblin_hp_1 += goblin_defense; if
	 * (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2 -=
	 * sniper_attack; goblin_hp_2 += goblin_defense; if (rifle_hp_2 <= 0) { arr6[1]
	 * = "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) { thief_hp_1 -=
	 * sniper_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0) { arr6[0] =
	 * "빈 공간"; } } else if (j == 1) { thief_hp_2 -= sniper_attack; thief_hp_2 +=
	 * thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } } else if
	 * (arr1[3] == "저격병" || arr1[3] == "저격병(R)" || arr1[3] == "저격병(G)" || arr1[3] ==
	 * "저격병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" || arr6[2] != "빈 공간" ||
	 * arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int) (Math.random() * 3) +
	 * 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * sniper_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= sniper_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4)
	 * { hydra_hp_5 -= sniper_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= sniper_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <=
	 * 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -= sniper_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { mutal_hp_5 -= sniper_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= sniper_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { goblin_hp_4
	 * -= sniper_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "빈 공간"; } } else if (j == 4) { goblin_hp_5 -= sniper_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "빈 공간"; } }
	 * } else if (arr6[0] == "thief") { if (j == 2) { thief_hp_3 -= sniper_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "빈 공간"; } }
	 * else if (j == 3) { thief_hp_4 -= sniper_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4) { thief_hp_5 -=
	 * sniper_attack; thief_hp_5 += thief_defense; if (sniper_hp_5 <= 0) { arr6[4] =
	 * "빈 공간"; } } } } else if (arr1[3] == "소총병" || arr1[3] == "소총병(R)" || arr1[3]
	 * == "소총병(G)" || arr1[3] == "소총병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간"
	 * || arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= rifle_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0)
	 * { arr6[2] = "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= rifle_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { hydra_hp_5 -= rifle_attack; hydra_hp_5 += hydra_defense;
	 * if (hydra_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "mutal") {
	 * if (j == 2) { mutal_hp_3 -= rifle_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -=
	 * rifle_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { mutal_hp_5 -= rifle_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if
	 * (arr6[0] == "goblin") { if (j == 2) { goblin_hp_3 -= rifle_attack;
	 * goblin_hp_3 += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } }
	 * else if (j == 3) { goblin_hp_4 -= rifle_attack; goblin_hp_4 +=
	 * goblin_defense; if (goblin_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j ==
	 * 4) { goblin_hp_5 -= rifle_attack; goblin_hp_5 += goblin_defense; if
	 * (goblin_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "thief") {
	 * if (j == 2) { thief_hp_3 -= rifle_attack; thief_hp_3 += thief_defense; if
	 * (thief_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { thief_hp_4 -=
	 * rifle_attack; thief_hp_4 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { thief_hp_5 -= rifle_attack; thief_hp_5 +=
	 * thief_defense; if (thief_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } } else if
	 * (arr1[3] == "  탱커" || arr1[3] == "탱커(R)" || arr1[3] == "탱커(G)" || arr1[3] ==
	 * "탱커(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" || arr6[2] != "빈 공간" ||
	 * arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int) (Math.random() * 3) +
	 * 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * tanker_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= tanker_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4)
	 * { hydra_hp_5 -= tanker_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= tanker_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <=
	 * 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -= tanker_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { mutal_hp_5 -= tanker_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= tanker_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { goblin_hp_4
	 * -= tanker_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "빈 공간"; } } else if (j == 4) { goblin_hp_5 -= tanker_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "빈 공간"; } }
	 * } else if (arr6[0] == "thief") { if (j == 2) { thief_hp_3 -= tanker_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "빈 공간"; } }
	 * else if (j == 3) { thief_hp_4 -= tanker_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4) { thief_hp_5 -=
	 * tanker_attack; thief_hp_5 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } } } else if (arr1[3] == "  칼병" || arr1[3] == "칼병(R)" || arr1[3]
	 * == "칼병(G)" || arr1[3] == "칼병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" ||
	 * arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= nife_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0)
	 * { arr6[2] = "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= nife_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { hydra_hp_5 -= nife_attack; hydra_hp_5 += hydra_defense; if
	 * (hydra_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "mutal") { if
	 * (j == 2) { mutal_hp_3 -= nife_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -=
	 * nife_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { mutal_hp_5 -= nife_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if
	 * (arr6[0] == "goblin") { if (j == 2) { goblin_hp_3 -= nife_attack; goblin_hp_3
	 * += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j
	 * == 3) { goblin_hp_4 -= nife_attack; goblin_hp_4 += goblin_defense; if
	 * (goblin_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4) { goblin_hp_5 -=
	 * nife_attack; goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] =
	 * "빈 공간"; } } } else if (arr6[0] == "thief") { if (j == 2) { thief_hp_3 -=
	 * nife_attack; thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] =
	 * "빈 공간"; } } else if (j == 3) { thief_hp_4 -= nife_attack; thief_hp_4 +=
	 * thief_defense; if (thief_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4)
	 * { thief_hp_5 -= nife_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <=
	 * 0) { arr6[4] = "빈 공간"; } } } } } if (oooo != 2) { oooo++; } else if (oooo ==
	 * 2) { oooo = 0; } } // arr1[3] 끝 if (arr1[4] != "빈 공간") { if (ooooo == 2) { //
	 * ooooo가 2이면 공격 if (arr1[4] == "  탱커" || arr1[4] == "탱커(R)" || arr1[4] ==
	 * "탱커(G)" || arr1[4] == "탱커(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" &&
	 * arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * tanker_attack; } else if (arr1[4] == "  칼병" || arr1[4] == "칼병(R)" || arr1[4]
	 * == "칼병(G)" || arr1[4] == "칼병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" &&
	 * arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * nife_attack; } else if (arr1[4] == "소총병" || arr1[4] == "소총병(R)" || arr1[4] ==
	 * "소총병(G)" || arr1[4] == "소총병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" &&
	 * arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * rifle_attack; } else if (arr1[4] == "저격병" || arr1[4] == "저격병(R)" || arr1[4]
	 * == "저격병(G)" || arr1[4] == "저격병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간"
	 * && arr6[2] == "빈 공간" && arr6[3] == "빈 공간" && arr6[4] == "빈 공간") { hp2 -=
	 * sniper_attack; } else if (arr1[4] == "  탱커" || arr1[4] == "탱커(R)" || arr1[4]
	 * == "탱커(G)" || arr1[4] == "탱커(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") {
	 * j = (int) (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0)
	 * { hydra_hp_1 -= tanker_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= tanker_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= tanker_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= tanker_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= tanker_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2
	 * -= tanker_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= tanker_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { thief_hp_2 -= tanker_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } }
	 * else if (arr1[4] == "  칼병" || arr1[4] == "칼병(R)" || arr1[4] == "칼병(G)" ||
	 * arr1[4] == "칼병(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") { j = (int)
	 * (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= nife_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= nife_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= nife_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= mutal_attack; mutal_hp_2 += mutal_defense;
	 * if (nife_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin") {
	 * if (j == 0) { goblin_hp_1 -= nife_attack; goblin_hp_1 += goblin_defense; if
	 * (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2 -=
	 * nife_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) { arr6[1] =
	 * "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) { thief_hp_1 -=
	 * nife_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0) { arr6[0] =
	 * "빈 공간"; } } else if (j == 1) { thief_hp_2 -= nife_attack; thief_hp_2 +=
	 * thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } } else if
	 * (arr1[4] == "소총병" || arr1[4] == "소총병(R)" || arr1[4] == "소총병(G)" || arr1[4] ==
	 * "소총병(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") { j = (int)
	 * (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= rifle_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= rifle_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= rifle_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= rifle_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= rifle_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2
	 * -= rifle_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= rifle_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0)
	 * { arr6[0] = "빈 공간"; } } else if (j == 1) { thief_hp_2 -= rifle_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } }
	 * else if (arr1[4] == "저격병" || arr1[4] == "저격병(R)" || arr1[4] == "저격병(G)" ||
	 * arr1[4] == "저격병(B)" && arr6[0] != "빈 공간" || arr6[1] != "빈 공간") { j = (int)
	 * (Math.random() * 2);// 0~1까지 if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= sniper_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { hydra_hp_2 -= sniper_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "빈 공간"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= sniper_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "빈 공간"; } }
	 * else if (j == 1) { mutal_hp_2 -= sniper_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= sniper_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { goblin_hp_2
	 * -= sniper_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "빈 공간"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= sniper_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "빈 공간"; } } else if (j == 1) { thief_hp_2 -= sniper_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "빈 공간"; } } } }
	 * else if (arr1[4] == "저격병" || arr1[4] == "저격병(R)" || arr1[4] == "저격병(G)" ||
	 * arr1[4] == "저격병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" || arr6[2] !=
	 * "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int) (Math.random()
	 * * 3) + 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * sniper_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= sniper_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4)
	 * { hydra_hp_5 -= sniper_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= sniper_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <=
	 * 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -= sniper_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { mutal_hp_5 -= sniper_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= sniper_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { goblin_hp_4
	 * -= sniper_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "빈 공간"; } } else if (j == 4) { goblin_hp_5 -= sniper_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "빈 공간"; } }
	 * } else if (arr6[0] == "thief") { if (j == 2) { thief_hp_3 -= sniper_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "빈 공간"; } }
	 * else if (j == 3) { thief_hp_4 -= sniper_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4) { thief_hp_5 -=
	 * sniper_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <= 0) { arr6[4] =
	 * "빈 공간"; } } } } else if (arr1[4] == "소총병" || arr1[4] == "소총병(R)" || arr1[4]
	 * == "소총병(G)" || arr1[4] == "소총병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간"
	 * || arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= rifle_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0)
	 * { arr6[2] = "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= rifle_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { hydra_hp_5 -= rifle_attack; hydra_hp_5 += hydra_defense;
	 * if (hydra_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "mutal") {
	 * if (j == 2) { mutal_hp_3 -= rifle_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -=
	 * rifle_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { mutal_hp_5 -= rifle_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if
	 * (arr6[0] == "goblin") { if (j == 2) { goblin_hp_3 -= rifle_attack;
	 * goblin_hp_3 += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } }
	 * else if (j == 3) { goblin_hp_4 -= rifle_attack; goblin_hp_4 +=
	 * goblin_defense; if (goblin_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j ==
	 * 4) { goblin_hp_5 -= rifle_attack; goblin_hp_5 += goblin_defense; if
	 * (goblin_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "thief") {
	 * if (j == 2) { thief_hp_3 -= rifle_attack; thief_hp_3 += thief_defense; if
	 * (thief_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { thief_hp_4 -=
	 * rifle_attack; thief_hp_4 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { thief_hp_5 -= rifle_attack; thief_hp_5 +=
	 * thief_defense; if (thief_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } } else if
	 * (arr1[4] == "  탱커" || arr1[4] == "탱커(R)" || arr1[4] == "탱커(G)" || arr1[4] ==
	 * "탱커(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" || arr6[2] != "빈 공간" ||
	 * arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int) (Math.random() * 3) +
	 * 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * tanker_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= tanker_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4)
	 * { hydra_hp_5 -= tanker_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= tanker_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <=
	 * 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -= tanker_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { mutal_hp_5 -= tanker_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= tanker_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { goblin_hp_4
	 * -= tanker_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "빈 공간"; } } else if (j == 4) { goblin_hp_5 -= tanker_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "빈 공간"; } }
	 * } else if (arr6[0] == "thief") { if (j == 2) { thief_hp_3 -= tanker_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "빈 공간"; } }
	 * else if (j == 3) { thief_hp_4 -= tanker_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4) { thief_hp_5 -=
	 * tanker_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <= 0) { arr6[4] =
	 * "빈 공간"; } } } } else if (arr1[4] == "  칼병" || arr1[4] == "칼병(R)" || arr1[4]
	 * == "칼병(G)" || arr1[4] == "칼병(B)" && arr6[0] == "빈 공간" && arr6[1] == "빈 공간" ||
	 * arr6[2] != "빈 공간" || arr6[3] != "빈 공간" || arr6[4] != "빈 공간") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4까지 if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= nife_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0)
	 * { arr6[2] = "빈 공간"; } } else if (j == 3) { hydra_hp_4 -= nife_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "빈 공간"; } }
	 * else if (j == 4) { hydra_hp_5 -= nife_attack; hydra_hp_5 += hydra_defense; if
	 * (hydra_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if (arr6[0] == "mutal") { if
	 * (j == 2) { mutal_hp_3 -= nife_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j == 3) { mutal_hp_4 -=
	 * nife_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "빈 공간"; } } else if (j == 4) { mutal_hp_5 -= nife_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "빈 공간"; } } } else if
	 * (arr6[0] == "goblin") { if (j == 2) { goblin_hp_3 -= nife_attack; goblin_hp_3
	 * += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "빈 공간"; } } else if (j
	 * == 3) { goblin_hp_4 -= nife_attack; goblin_hp_4 += goblin_defense; if
	 * (goblin_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4) { goblin_hp_5 -=
	 * nife_attack; goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] =
	 * "빈 공간"; } } } else if (arr6[0] == "thief") { if (j == 2) { thief_hp_3 -=
	 * nife_attack; thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] =
	 * "빈 공간"; } } else if (j == 3) { thief_hp_4 -= nife_attack; thief_hp_4 +=
	 * thief_defense; if (thief_hp_4 <= 0) { arr6[3] = "빈 공간"; } } else if (j == 4)
	 * { thief_hp_5 -= nife_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <=
	 * 0) { arr6[4] = "빈 공간"; } } } } } if (ooooo != 2) { ooooo++; } else if (ooooo
	 * == 2) { ooooo = 0; } } }
	 */
	public void off() {
		if (arr6[0] != "빈 공간") { // arr6[0]에 유닛이 있을 경우
			if (z == 2) { // z가 2이면 공격
				if (arr6[0] == "hydra" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= hydra_attack;
				} else if (arr6[0] == "goblin" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= goblin_attack;
				} else if (arr6[0] == "mutal" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= mutal_attack;
				} else if (arr6[0] == "thief" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= thief_attack;
				} else if (arr6[0] == "hydra" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= hydra_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= hydra_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= hydra_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= hydra_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= hydra_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								rifle_hp_1 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= hydra_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								rifle_hp_2 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= hydra_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								sniper_hp_1 = sniper_hp;
								available_troops1--;
								arr1[0] = "빈 공간";
							}
						} else if (j == 1) {
							sniper_hp_2 -= hydra_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					}
				} else if (arr6[0] == "goblin" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= goblin_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= goblin_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= goblin_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= goblin_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= goblin_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "빈 공간";
							}
						} else if (j == 1) {
							rifle_hp_2 -= goblin_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								rifle_hp_2 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= goblin_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								sniper_hp_1 = sniper_hp;
							}
						} else if (j == 1) {
							sniper_hp_2 -= goblin_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "빈 공간";
							}
						}
					}
				} else if (arr6[0] == "mutal" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= mutal_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= mutal_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= mutal_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= mutal_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= mutal_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "빈 공간";
							}
						} else if (j == 1) {
							rifle_hp_2 -= mutal_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= mutal_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= mutal_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "빈 공간";
								available_troops1--;
							}
						}
					}
				} else if (arr6[0] == "thief" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= thief_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= thief_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= thief_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= thief_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= thief_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								arr1[0] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= thief_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								rifle_hp_2 = rifle_hp;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= thief_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								sniper_hp_1 = sniper_hp;
								available_troops1--;
								arr1[0] = "빈 공간";
							}
						} else if (j == 1) {
							sniper_hp_2 -= thief_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								sniper_hp_2 = sniper_hp;
							}
						}
					}
				} else if (arr6[0] == "thief" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= thief_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= thief_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "빈 공간";
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= thief_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= thief_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								nife_hp_3 = nife_hp;
								arr1[2] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= thief_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								available_troops1--;
								arr1[3] = "빈 공간";
							}
						} else if (j == 4) {
							nife_hp_5 -= thief_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								available_troops1--;
								arr1[4] = "빈 공간";
								nife_hp_5 = nife_hp;
							}
						}
					} else if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= thief_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								rifle_hp_3 = rifle_hp;
							}
						} else if (j == 3) {
							rifle_hp_4 -= thief_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								rifle_hp_4 = rifle_hp;
							}
						} else if (j == 4) {
							rifle_hp_5 -= thief_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								rifle_hp_5 = rifle_hp;
								arr1[4] = "빈 공간";
								available_troops1--;
							}
						}
					} else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" || arr1[0] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= thief_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								sniper_hp_3 = sniper_hp;
							}
						} else if (j == 3) {
							sniper_hp_4 -= thief_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= thief_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								available_troops1--;
								arr1[4] = "빈 공간";
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[0] == "mutal" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= mutal_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= mutal_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "빈 공간";
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= mutal_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= mutal_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= mutal_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								nife_hp_4 = nife_hp;
							}
						} else if (j == 4) {
							nife_hp_5 -= mutal_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								nife_hp_5 = nife_hp;
							}
						}
					} else if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= mutal_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= mutal_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= mutal_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								rifle_hp_5 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" || arr1[0] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= mutal_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "빈 공간";
							}
						} else if (j == 3) {
							sniper_hp_4 -= mutal_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= mutal_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								available_troops1--;
								arr1[4] = "빈 공간";
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[0] == "hydra" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= hydra_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= hydra_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "빈 공간";
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= hydra_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= hydra_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								nife_hp_3 = nife_hp;
							}
						} else if (j == 3) {
							nife_hp_4 -= hydra_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								nife_hp_4 = nife_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= hydra_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								nife_hp_5 = nife_hp;
							}
						}
					} else if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= hydra_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= hydra_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= hydra_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								rifle_hp_5 = rifle_hp;
								available_troops1--;
								arr1[4] = "빈 공간";
							}
						}
					} else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" || arr1[0] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= hydra_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "빈 공간";
							}
						} else if (j == 3) {
							sniper_hp_4 -= hydra_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "빈 공간";
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= hydra_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[0] == "goblin" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= goblin_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= goblin_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= goblin_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= goblin_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= goblin_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								available_troops1--;
								nife_hp_4 = nife_hp;
								arr1[3] = "빈 공간";
							}
						} else if (j == 4) {
							nife_hp_5 -= goblin_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								available_troops1--;
								arr1[4] = "빈 공간";
								nife_hp_5 = nife_hp;
							}
						}
					} else if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= goblin_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= goblin_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= goblin_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" || arr1[0] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= goblin_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								sniper_hp_3 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							sniper_hp_4 -= goblin_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= goblin_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				}
			}
			if (z != 2) {
				z++;
			} else if (z == 2) {
				z = 0;
			}
		} // arr6[0] 끝
			// arr6[1] 시작
		if (arr6[1] != "빈 공간") { // arr6[1]에 유닛이 있을 경우
			if (zz == 2) { // zz가 2이면 공격
				if (arr6[1] == "hydra" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= hydra_attack;
				} else if (arr6[1] == "goblin" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= goblin_attack;
				} else if (arr6[1] == "mutal" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= mutal_attack;
				} else if (arr6[1] == "thief" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= thief_attack;
				} else if (arr6[1] == "hydra" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= hydra_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= hydra_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								tanker_hp_2 = tanker_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= hydra_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= hydra_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								nife_hp_2 = nife_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= hydra_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "빈 공간";
							}
						} else if (j == 1) {
							rifle_hp_2 -= hydra_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								arr1[1] = "빈 공간";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= hydra_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								sniper_hp_1 = sniper_hp;
							}
						} else if (j == 1) {
							sniper_hp_2 -= hydra_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					}
				} else if (arr6[1] == "goblin" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= goblin_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= goblin_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= goblin_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= goblin_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								available_troops1--;
								arr1[1] = "빈 공간";
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= goblin_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								rifle_hp_1 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= goblin_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= goblin_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= goblin_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "빈 공간";
								available_troops1--;
							}
						}
					}
				} else if (arr6[1] == "mutal" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= mutal_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= mutal_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= mutal_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= mutal_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= mutal_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "빈 공간";
							}
						} else if (j == 1) {
							rifle_hp_2 -= mutal_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								arr1[1] = "빈 공간";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= mutal_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= mutal_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "빈 공간";
								available_troops1--;
							}
						}
					}
				} else if (arr6[1] == "thief" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= thief_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= thief_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= thief_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= thief_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= thief_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								arr1[0] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= thief_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= thief_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								sniper_hp_1 = sniper_hp;
								arr1[0] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= thief_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					}
				} else if (arr6[1] == "thief" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= thief_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								tanker_hp_3 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							tanker_hp_4 -= thief_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= thief_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= thief_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= thief_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= thief_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								nife_hp_5 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= thief_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= thief_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= thief_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								rifle_hp_5 = rifle_hp;
								available_troops1--;
								arr1[4] = "빈 공간";
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= thief_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "빈 공간";
							}
						} else if (j == 3) {
							sniper_hp_4 -= thief_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= thief_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								available_troops1--;
								arr1[4] = "빈 공간";
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[1] == "mutal" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= mutal_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= mutal_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= mutal_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= mutal_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= mutal_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								nife_hp_4 = nife_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= mutal_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								nife_hp_5 = nife_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= mutal_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= mutal_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								available_troops1--;
								arr1[3] = "빈 공간";
							}
						} else if (j == 4) {
							rifle_hp_5 -= mutal_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								rifle_hp_5 = rifle_hp;
								available_troops1--;
								arr1[4] = "빈 공간";
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= mutal_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								sniper_hp_3 = sniper_hp;
							}
						} else if (j == 3) {
							sniper_hp_4 -= mutal_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= mutal_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[1] == "hydra" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= hydra_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= hydra_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= hydra_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= hydra_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								nife_hp_3 = nife_hp;
								arr1[2] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= hydra_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								nife_hp_4 = nife_hp;
							}
						} else if (j == 4) {
							nife_hp_5 -= hydra_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								available_troops1--;
								arr1[4] = "빈 공간";
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= hydra_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= hydra_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								available_troops1--;
								arr1[3] = "빈 공간";
							}
						} else if (j == 4) {
							rifle_hp_5 -= hydra_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								rifle_hp_5 = rifle_hp;
								available_troops1--;
								arr1[4] = "빈 공간";
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= hydra_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "빈 공간";
							}
						} else if (j == 3) {
							sniper_hp_4 -= hydra_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= hydra_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[1] == "goblin" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= goblin_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= goblin_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "빈 공간";
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= goblin_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= goblin_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= goblin_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								nife_hp_4 = nife_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= goblin_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								nife_hp_5 = nife_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= goblin_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= goblin_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= goblin_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								rifle_hp_5 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= goblin_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "빈 공간";
							}
						} else if (j == 3) {
							sniper_hp_4 -= goblin_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= goblin_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								sniper_hp_5 = sniper_hp;
								available_troops1--;
							}
						}
					}
				}
			}
			if (zz != 2) {
				zz++;
			} else if (zz == 2) {
				zz = 0;
			}
		}
		// arr6[1]끝
		// arr6[2]시작
		if (arr6[2] != "빈 공간") {
			if (zzz == 2) { // zzzz가 2이면 공격
				if (arr6[2] == "hydra" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= hydra_attack;
				} else if (arr6[2] == "goblin" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= goblin_attack;
				} else if (arr6[2] == "mutal" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= mutal_attack;
				} else if (arr6[2] == "thief" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= thief_attack;
				} else if (arr6[2] == "hydra" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= hydra_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= hydra_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= hydra_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= hydra_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								available_troops1--;
								arr1[1] = "빈 공간";
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= hydra_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "빈 공간";
							}
						} else if (j == 1) {
							rifle_hp_2 -= hydra_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								arr1[1] = "빈 공간";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= hydra_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= hydra_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					}
				} else if (arr6[2] == "goblin" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= goblin_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= goblin_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= goblin_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= goblin_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= goblin_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "빈 공간";
							}
						} else if (j == 1) {
							rifle_hp_2 -= goblin_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= goblin_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= goblin_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					}
				} else if (arr6[2] == "mutal" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= mutal_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= mutal_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= mutal_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= mutal_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= mutal_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "빈 공간";
							}
						} else if (j == 1) {
							rifle_hp_2 -= mutal_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= mutal_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= mutal_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "빈 공간";
								available_troops1--;
							}
						}
					}
				} else if (arr6[2] == "thief" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= thief_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= thief_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= thief_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= thief_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= thief_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								arr1[0] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= thief_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								arr1[1] = "빈 공간";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= thief_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								sniper_hp_1 = sniper_hp;
								available_troops1--;
								arr1[0] = "빈 공간";
							}
						} else if (j == 1) {
							sniper_hp_2 -= thief_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					}
				} else if (arr6[2] == "thief" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= thief_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= thief_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= thief_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= thief_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= thief_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								nife_hp_4 = nife_hp;
							}
						} else if (j == 4) {
							nife_hp_5 -= thief_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								arr1[4] = "빈 공간";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= thief_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								rifle_hp_3 = rifle_hp;
								available_troops1--;
								arr1[2] = "빈 공간";
							}
						} else if (j == 3) {
							rifle_hp_4 -= thief_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								available_troops1--;
								arr1[3] = "빈 공간";
							}
						} else if (j == 4) {
							rifle_hp_5 -= thief_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= thief_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "빈 공간";
							}
						} else if (j == 3) {
							sniper_hp_4 -= thief_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= thief_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								sniper_hp_5 = sniper_hp;
								available_troops1--;
							}
						}
					}
				} else if (arr6[2] == "mutal" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= mutal_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= mutal_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "빈 공간";
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= mutal_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= mutal_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= mutal_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								nife_hp_4 = nife_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= mutal_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								arr1[4] = "빈 공간";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= mutal_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								rifle_hp_3 = rifle_hp;
							}
						} else if (j == 3) {
							rifle_hp_4 -= mutal_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								rifle_hp_4 = rifle_hp;
							}
						} else if (j == 4) {
							rifle_hp_5 -= mutal_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= mutal_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "빈 공간";
							}
						} else if (j == 3) {
							sniper_hp_4 -= mutal_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= mutal_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								sniper_hp_5 = sniper_hp;
								available_troops1--;
							}
						}
					}
				} else if (arr6[2] == "hydra" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= hydra_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= hydra_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= hydra_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= hydra_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								nife_hp_3 = nife_hp;
								arr1[2] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= hydra_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								nife_hp_4 = nife_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= hydra_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								available_troops1--;
								arr1[4] = "빈 공간";
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= hydra_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= hydra_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= hydra_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= hydra_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								arr1[2] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 3) {
							sniper_hp_4 -= hydra_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								sniper_hp_4 = sniper_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= hydra_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[2] == "goblin" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= goblin_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= goblin_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "빈 공간";
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= goblin_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= goblin_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								nife_hp_3 = nife_hp;
								available_troops1--;
								arr1[2] = "빈 공간";
							}
						} else if (j == 3) {
							nife_hp_4 -= goblin_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								available_troops1--;
								arr1[3] = "빈 공간";
							}
						} else if (j == 4) {
							nife_hp_5 -= goblin_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								arr1[4] = "빈 공간";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= goblin_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= goblin_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								rifle_hp_4 = rifle_hp;
							}
						} else if (j == 4) {
							rifle_hp_5 -= goblin_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								rifle_hp_5 = rifle_hp;
								available_troops1--;
								arr1[4] = "빈 공간";
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= goblin_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "빈 공간";
							}
						} else if (j == 3) {
							sniper_hp_4 -= goblin_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= goblin_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								sniper_hp_5 = sniper_hp;
								available_troops1--;
							}
						}
					}
				}
			}
			if (zzz != 2) {
				zzz++;
			} else if (zzz == 2) {
				zzz = 0;
			}
		}
		// arr6[2] 끝
		if (arr6[3] != "빈 공간") {
			if (zzzz == 2) { // zzzzz가 2이면 공격
				if (arr6[3] == "hydra" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= hydra_attack;
				} else if (arr6[3] == "goblin" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= goblin_attack;
				} else if (arr6[3] == "mutal" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= mutal_attack;
				} else if (arr6[3] == "thief" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= thief_attack;
				} else if (arr6[3] == "hydra" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= hydra_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= hydra_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= hydra_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= hydra_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								nife_hp_2 = nife_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= hydra_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								arr1[0] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= hydra_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								arr1[1] = "빈 공간";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= hydra_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								sniper_hp_1 = sniper_hp;
							}
						} else if (j == 1) {
							sniper_hp_2 -= hydra_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								available_troops1--;
								sniper_hp_2 = sniper_hp;
								arr1[1] = "빈 공간";
							}
						}
					}
				} else if (arr6[3] == "goblin" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= goblin_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= goblin_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= goblin_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= goblin_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								nife_hp_2 = nife_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= goblin_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								rifle_hp_1 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= goblin_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= goblin_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								sniper_hp_1 = sniper_hp;
								available_troops1--;
								arr1[0] = "빈 공간";
							}
						} else if (j == 1) {
							sniper_hp_2 -= goblin_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					}
				} else if (arr6[3] == "mutal" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= mutal_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= mutal_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= mutal_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= mutal_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								available_troops1--;
								arr1[1] = "빈 공간";
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= mutal_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								rifle_hp_1 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= mutal_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								rifle_hp_2 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= mutal_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= mutal_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					}
				} else if (arr6[3] == "thief" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= thief_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= thief_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= thief_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= thief_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								available_troops1--;
								nife_hp_2 = nife_hp;
								arr1[1] = "빈 공간";
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= thief_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								arr1[0] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= thief_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								rifle_hp_2 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= thief_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= thief_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "빈 공간";
								available_troops1--;
							}
						}
					}
				} else if (arr6[3] == "thief" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= thief_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= thief_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= thief_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= thief_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								nife_hp_3 = nife_hp;
								arr1[2] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= thief_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= thief_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								arr1[4] = "빈 공간";
								available_troops1--;
							}
						}
					} else if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= thief_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								rifle_hp_3 = rifle_hp;
							}
						} else if (j == 3) {
							rifle_hp_4 -= thief_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= thief_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" || arr1[0] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= thief_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								sniper_hp_3 = sniper_hp;
							}
						} else if (j == 3) {
							sniper_hp_4 -= thief_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= thief_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[3] == "mutal" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= mutal_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= mutal_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= mutal_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= mutal_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= mutal_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= mutal_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								arr1[4] = "빈 공간";
								available_troops1--;
							}
						}
					} else if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= mutal_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= mutal_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								available_troops1--;
								arr1[3] = "빈 공간";
							}
						} else if (j == 4) {
							rifle_hp_5 -= mutal_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								rifle_hp_5 = rifle_hp;
								available_troops1--;
								arr1[4] = "빈 공간";
							}
						}
					} else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" || arr1[0] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= mutal_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								arr1[2] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 3) {
							sniper_hp_4 -= mutal_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= mutal_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								sniper_hp_5 = sniper_hp;
								available_troops1--;
							}
						}
					}
				} else if (arr6[3] == "hydra" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= hydra_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= hydra_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= hydra_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= hydra_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								nife_hp_3 = nife_hp;
							}
						} else if (j == 3) {
							nife_hp_4 -= hydra_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= hydra_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								available_troops1--;
								arr1[4] = "빈 공간";
							}
						}
					} else if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= hydra_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= hydra_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= hydra_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" || arr1[0] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= hydra_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								sniper_hp_3 = sniper_hp;
							}
						} else if (j == 3) {
							sniper_hp_4 -= hydra_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								sniper_hp_4 = sniper_hp;
								available_troops1--;
								arr1[3] = "빈 공간";
							}
						} else if (j == 4) {
							sniper_hp_5 -= hydra_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[3] == "goblin" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= goblin_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= goblin_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= goblin_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= goblin_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= goblin_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= goblin_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								nife_hp_5 = nife_hp;
							}
						}
					} else if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= goblin_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= goblin_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								available_troops1--;
								arr1[3] = "빈 공간";
							}
						} else if (j == 4) {
							rifle_hp_5 -= goblin_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" || arr1[0] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= goblin_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								available_troops1--;
								sniper_hp_3 = sniper_hp;
								arr1[2] = "빈 공간";
							}
						} else if (j == 3) {
							sniper_hp_4 -= goblin_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								sniper_hp_4 = sniper_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= goblin_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				}
			}
			if (zzzz != 2) {
				zzzz++;
			} else if (zzzz == 2) {
				zzzz = 0;
			}
		}
		// arr6[3] 끝
		if (arr6[4] != "빈 공간") {
			if (zzzzz == 2) { // zzzzzz가 2이면 공격
				if (arr6[4] == "hydra" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= hydra_attack;
				} else if (arr6[4] == "goblin" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= goblin_attack;
				} else if (arr6[4] == "mutal" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= mutal_attack;
				} else if (arr6[4] == "thief" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" && arr1[2] == "빈 공간"
						&& arr1[3] == "빈 공간" && arr1[4] == "빈 공간") {
					hp1 -= thief_attack;
				} else if (arr6[4] == "hydra" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= hydra_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= hydra_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= hydra_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= hydra_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								available_troops1--;
								arr1[1] = "빈 공간";
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= hydra_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								arr1[0] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= hydra_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								rifle_hp_2 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= hydra_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								sniper_hp_1 = sniper_hp;
							}
						} else if (j == 1) {
							sniper_hp_2 -= hydra_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					}
				} else if (arr6[4] == "goblin" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= goblin_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= goblin_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= goblin_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= goblin_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= goblin_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								arr1[0] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= goblin_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								rifle_hp_2 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= goblin_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= goblin_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "빈 공간";
								available_troops1--;
							}
						}
					}
				} else if (arr6[4] == "mutal" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= mutal_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= mutal_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= mutal_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= mutal_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								available_troops1--;
								arr1[1] = "빈 공간";
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= mutal_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "빈 공간";
							}
						} else if (j == 1) {
							rifle_hp_2 -= mutal_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								available_troops1--;
								arr1[1] = "빈 공간";
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= mutal_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								available_troops1--;
								arr1[0] = "빈 공간";
								sniper_hp_1 = sniper_hp;
							}
						} else if (j == 1) {
							sniper_hp_2 -= mutal_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "빈 공간";
								available_troops1--;
							}
						}
					}
				} else if (arr6[4] == "thief" && arr1[0] != "빈 공간" || arr1[1] != "빈 공간") {
					j = (int) (Math.random() * 2);// 0~1까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 0) {
							tanker_hp_1 -= thief_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= thief_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  칼병" || arr1[j] == "칼병(R)" || arr1[j] == "칼병(G)" || arr1[j] == "칼병(B)") {
						if (j == 0) {
							nife_hp_1 -= thief_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= thief_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "소총병" || arr1[j] == "소총병(R)" || arr1[j] == "소총병(G)" || arr1[j] == "소총병(B)") {
						if (j == 0) {
							rifle_hp_1 -= thief_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "빈 공간";
							}
						} else if (j == 1) {
							rifle_hp_2 -= thief_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								rifle_hp_2 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "저격병" || arr1[j] == "저격병(R)" || arr1[j] == "저격병(G)" || arr1[j] == "저격병(B)") {
						if (j == 0) {
							sniper_hp_1 -= thief_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "빈 공간";
								available_troops1--;
								sniper_hp_1 = sniper_hp;
							}
						} else if (j == 1) {
							sniper_hp_2 -= thief_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								arr1[1] = "빈 공간";
								available_troops1--;
								sniper_hp_2 = sniper_hp;
							}
						}
					}
				} else if (arr6[4] == "thief" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= thief_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= thief_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= thief_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= thief_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								nife_hp_3 = nife_hp;
							}
						} else if (j == 3) {
							nife_hp_4 -= thief_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								nife_hp_4 = nife_hp;
							}
						} else if (j == 4) {
							nife_hp_5 -= thief_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								nife_hp_5 = nife_hp;
							}
						}
					} else if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= thief_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= thief_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								available_troops1--;
								rifle_hp_4 = rifle_hp;
								arr1[3] = "빈 공간";
							}
						} else if (j == 4) {
							rifle_hp_5 -= thief_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" || arr1[0] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= thief_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								sniper_hp_3 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							sniper_hp_4 -= thief_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= thief_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[4] == "mutal" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= mutal_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= mutal_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= mutal_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= mutal_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= mutal_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								nife_hp_4 = nife_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= mutal_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								available_troops1--;
								arr1[4] = "빈 공간";
							}
						}
					} else if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= mutal_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								rifle_hp_3 = rifle_hp;
							}
						} else if (j == 3) {
							rifle_hp_4 -= mutal_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								rifle_hp_4 = rifle_hp;
							}
						} else if (j == 4) {
							rifle_hp_5 -= mutal_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" || arr1[0] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= mutal_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								arr1[2] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 3) {
							sniper_hp_4 -= mutal_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= mutal_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[4] == "hydra" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= hydra_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= hydra_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= hydra_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								available_troops1--;
								arr1[4] = "빈 공간";
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= hydra_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= hydra_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								available_troops1--;
								arr1[3] = "빈 공간";
							}
						} else if (j == 4) {
							nife_hp_5 -= hydra_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								available_troops1--;
								arr1[4] = "빈 공간";
							}
						}
					} else if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= hydra_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= hydra_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "빈 공간";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= hydra_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								rifle_hp_5 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" || arr1[0] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= hydra_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								sniper_hp_3 = sniper_hp;
							}
						} else if (j == 3) {
							sniper_hp_4 -= hydra_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								sniper_hp_4 = sniper_hp;
								available_troops1--;
								arr1[3] = "빈 공간";
							}
						} else if (j == 4) {
							sniper_hp_5 -= hydra_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								sniper_hp_5 = sniper_hp;
								available_troops1--;
							}
						}
					}
				} else if (arr6[4] == "goblin" && arr1[0] == "빈 공간" && arr1[1] == "빈 공간" || arr1[2] != "빈 공간"
						|| arr1[3] != "빈 공간" || arr1[4] != "빈 공간") {
					j = (int) (Math.random() * 3) + 2;// 2~4까지
					if (arr1[j] == "  탱커" || arr1[j] == "탱커(R)" || arr1[j] == "탱커(G)" || arr1[j] == "탱커(B)") {
						if (j == 2) {
							tanker_hp_3 -= goblin_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= goblin_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= goblin_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								tanker_hp_5 -= tanker_hp;
							}
						}
					} else if (arr1[0] == "  칼병" || arr1[0] == "칼병(R)" || arr1[0] == "칼병(G)" || arr1[0] == "칼병(B)") {
						if (j == 2) {
							nife_hp_3 -= goblin_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								available_troops1--;
								nife_hp_3 = nife_hp;
							}
						} else if (j == 3) {
							nife_hp_4 -= goblin_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "빈 공간";
								nife_hp_4 = nife_hp;
							}
						} else if (j == 4) {
							nife_hp_5 -= goblin_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								available_troops1--;
								nife_hp_5 = nife_hp;
								arr1[4] = "빈 공간";
							}
						}
					} else if (arr1[0] == "소총병" || arr1[0] == "소총병(R)" || arr1[0] == "소총병(G)" || arr1[0] == "소총병(B)") {
						if (j == 2) {
							rifle_hp_3 -= goblin_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "빈 공간";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= goblin_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								rifle_hp_4 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= goblin_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[0] == "저격병" || arr1[0] == "저격병(R)" || arr1[0] == "저격병(G)" || arr1[0] == "저격병(B)") {
						if (j == 2) {
							sniper_hp_3 -= goblin_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "빈 공간";
							}
						} else if (j == 3) {
							sniper_hp_4 -= goblin_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "빈 공간";
								available_troops1--;
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= goblin_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "빈 공간";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				}
			}
			if (zzzzz != 2) {
				zzzzz++;
			} else if (zzzzz == 2) {
				zzzzz = 0;
			}
		}
	}
}
