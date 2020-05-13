package Main;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int unit;

		Referense.Referense_Main re_m = new Referense.Referense_Main(); // Referense/Logo에 있는 메소드를 사용하기 위해 선언
		Referense.Referense_Base re_b = new Referense.Referense_Base();
		Place.Place_Shop shop = new Place.Place_Shop();
		Place.Place_base_Easy easy = new Place.Place_base_Easy();
		Th.Reference thread = new Th.Reference();
		Music.Music m1 = new Music.Music("king.wav");
		Music.Music2 m2 = new Music.Music2();

		thread.roading();
		m1.Play();
		a: while (true) { // 게임 오버가 되었거나 메인 화면에서 '게임 방법'을 선택하고 되돌아 왔을 때 다시 메인 화면이 출력되게 하기 위해서 반복문으로 선언

			/*
			 * 게임 메인 화면에서 1.게임 시작 2.게임 방법 3.게임 종료 버튼 각각의 버튼을 선택했을 때 특정 결과가 출력될 수 있게 작업이 진행
			 */
			re_m.main(); // Referense/Logo에서 초기 메인 화면
			num = sc.nextInt();

			while (num > 2 || num < 1) { // 1~3외의 값을 입력했을 경우에 다른 곳을 클릭했다고 생각하고 다시 메인 화면을 출력되어 인식인 안된 것처럼 보여주기 위해 반복문으로
											// 선언
				re_m.main();
				num = sc.nextInt();
			}
			if (num == 1) { // 게임 시작 난이도 선택창이 나옵니다.
				re_m.start();
				num = sc.nextInt();

				while (num > 2 || num < 1) {
					re_m.start();
					num = sc.nextInt();
				}
				m1.Stop();
				thread.roading();
				if (num == 1) { // 난이도 쉬움을 선택했을 경우
					m2.start();
					Thread T = new Thread(easy);
					T.start();
					while (true) {
						num = sc.nextInt();
						while (num > 3 || num < 1) {
							easy.base();
							easy.easy();
							num = sc.nextInt();
						}
						if (num == 1) { // 유닛 배치를 선택했을 경우
							T.suspend();
							easy.t = false;
							b: while (true) {
								easy.character();
								unit = sc.nextInt();
								while (num > 5 || num < 0) {
									easy.character();
									unit = sc.nextInt();
								}
								if (unit == 0) { // 다시 대기 전투 화면으로 전환된다.
									T.resume();
									easy.t = true;
									break;
								} else if (unit < 6) { // 1번부터 5번 중의 값을 입력하면 유닛을 선택할 수 있는 창으로 넘어간다.
									while (true) {
										re_b.unit();
										num = sc.nextInt();
										while (num < 0 || num > 4) {
											re_b.unit();
											num = sc.nextInt();
										}
										if (num == 0) { // 다시 유닛 배치 화면으로 전환된다.
											break;
										} else if (num == 1) {
											while (true) {
												easy.tanker1();
												num = sc.nextInt();
												while (num < 1 || num > 2) {
													easy.tanker1();
													num = sc.nextInt();
												}
												if (num == 1) { // 탱커를 구매하기 위한 창이 나오며, 구매 조건에 충족되면 배치 목록에 올라간다.
													if (unit == 1) {
														easy.buy_tanker1();
														sc.next();
														continue b;
													} else if (unit == 2) {
														easy.buy_tanker2();
														sc.next();
														continue b;
													} else if (unit == 3) {
														easy.buy_tanker3();
														sc.next();
														continue b;
													} else if (unit == 4) {
														easy.buy_tanker4();
														sc.next();
														continue b;
													} else {
														easy.buy_tanker5();
														sc.next();
														continue b;
													}
												} else {
													break;
												}
											}
										} else if (num == 2) { // 칼병 구매하기 위한 창이 나오며, 구매 조건에 충족되면 배치 목록에 올라간다.
											while (true) {
												easy.nife1();
												num = sc.nextInt();
												while (num < 1 || num > 2) {
													easy.nife1();
													num = sc.nextInt();
												}
												if (num == 1) {
													if (unit == 1) {
														easy.buy_nife1();
														sc.next();
														continue b;
													} else if (unit == 2) {
														easy.buy_nife2();
														sc.next();
														continue b;
													} else if (unit == 3) {
														easy.buy_nife3();
														sc.next();
														continue b;
													} else if (unit == 4) {
														easy.buy_nife4();
														sc.next();
														continue b;
													} else {
														easy.buy_nife5();
														sc.next();
														continue b;
													}
												} else {
													break;
												}
											}
										} else if (num == 3) { // 소총병을 구매하기 위한 창이 나오며, 구매 조건에 충족되면 배치 목록에 올라간다.
											while (true) {
												easy.rifle1();
												num = sc.nextInt();
												while (num < 1 || num > 2) {
													easy.rifle1();
													num = sc.nextInt();
												}
												if (num == 1) {
													if (unit == 1) {
														easy.buy_rifle1();
														sc.next();
														continue b;
													} else if (unit == 2) {
														easy.buy_rifle2();
														sc.next();
														continue b;
													} else if (unit == 3) {
														easy.buy_rifle3();
														sc.next();
														continue b;
													} else if (unit == 4) {
														easy.buy_rifle4();
														sc.next();
														continue b;
													} else {
														easy.buy_rifle5();
														sc.next();
														continue b;
													}
												} else {
													break;
												}
											}
										} else { // 저격병을 구매하기 위한 창이 나오며, 구매 조건에 충족되면 배치 목록에 올라간다.
											while (true) {
												easy.sniper1();
												num = sc.nextInt();
												while (num < 1 || num > 2) {
													easy.sniper1();
													num = sc.nextInt();
												}
												if (num == 1) {
													if (unit == 1) {
														easy.buy_sniper1();
														sc.next();
														continue b;
													} else if (unit == 2) {
														easy.buy_sniper2();
														sc.next();
														continue b;
													} else if (unit == 3) {
														easy.buy_sniper3();
														sc.next();
														continue b;
													} else if (unit == 4) {
														easy.buy_sniper4();
														sc.next();
														continue b;
													} else {
														easy.buy_sniper5();
														sc.next();
														continue b;
													}
												} else {
													break;
												}
											}
										}
									}
								}
							}
						} else if (num == 2) { // 상점을 선택했을 경우
							T.suspend();
							easy.t = false;
							while (true) {
								easy.inven();
								shop.component();
								num = sc.nextInt();
								while (num > 3 || num < 0) {
									shop.component();
									num = sc.nextInt();
								}
								if (num == 0) {
									T.resume();
									easy.t = true;
									break;
								} else if (num == 1) { // 상점에서 블루 스톤을 선택했을 경우 블루 스톤의 상세 정보가 나온다.
									shop.blue();
									num = sc.nextInt();
									while (num > 2 || num < 1) {
										shop.blue();
										num = sc.nextInt();
									}
									while (true) {
										if (num == 1) { // 블루 스톤의 구매 여부를 물어보고 구매하게 되면 인벤토리로 장비가 이동된다.
											easy.buy_blue();
											sc.next();
											break;
										} else {
											break;
										}
									}
								} else if (num == 2) { // 상점에서 레드 스톤을 선택했을 경우 블루 스톤의 상세 정보가 나온다.
									shop.red();
									num = sc.nextInt();
									while (num > 2 || num < 1) {
										shop.red();
										num = sc.nextInt();
									}
									while (true) {
										if (num == 1) { // 레드 스톤의 구매 여부를 물어보고 구매하게 되면 인벤토리로 장비가 이동된다.
											easy.buy_red();
											sc.next();
											break;
										} else {
											break;
										}
									}
								} else { // 상점에서 그린 스톤을 선택했을 경우 블루 스톤의 상세 정보가 나온다.
									shop.green();
									num = sc.nextInt();
									while (num > 2 || num < 1) {
										shop.green();
										num = sc.nextInt();
									}
									while (true) {
										if (num == 1) { // 그린 스톤의 구매 여부를 물어보고 구매하게 되면 인벤토리로 장비가 이동된다.
											easy.buy_green();
											sc.next();
											break;
										} else {
											break;
										}
									}
								}
							}
						} else if (num == 3) { // 인벤토리를 선택했을 경우
							T.suspend();
							easy.t = false;
							while (true) {
								easy.inventory();
								num = sc.nextInt();
								while (num < 0 || num > 5) {
									easy.inventory();
									num = sc.nextInt();
								}
								if (num == 0) { // 인벤토리에서 다시 초기 화면으로 이동
									T.resume();
									easy.t = true;
									break;
								} else if (num == 1) { // 인벤토리에서 1번을 선택했을 경우
									while (true) {
										easy.if_ston1();
										num = sc.nextInt();
										while (num > 2 || num < 1) {
											easy.if_ston1();
											num = sc.nextInt();
										}
										if (num == 1) { // 스톤 착용을 누르면 현재 존재하는 필드에 원하는 유닛에 착용할 수 있게 선택할 수 있다.
											easy.character();
											num = sc.nextInt();
											while (num > 5 || num < 0) {
												easy.character();
												num = sc.nextInt();
											}
											if (num == 1) {
												easy.add_blue1(1);
												easy.add_red1(1);
												easy.add_green1(1);
												sc.next();
												break;
											} else if (num == 2) {
												easy.add_blue1(2);
												easy.add_red1(2);
												easy.add_green1(2);
												sc.next();
												break;
											} else if (num == 3) {
												easy.add_blue1(3);
												easy.add_red1(3);
												easy.add_green1(3);
												sc.next();
												break;
											} else if (num == 4) {
												easy.add_blue1(4);
												easy.add_red1(4);
												easy.add_green1(4);
												sc.next();
												break;
											} else if (num == 5) {
												easy.add_blue1(5);
												easy.add_red1(5);
												easy.add_green1(5);
												sc.next();
												break;
											} else {
												break;
											}
										} else {
											break;
										}
									}
								} else if (num == 2) { // 2번을 선택했을 경우
									while (true) {
										easy.if_ston2();
										num = sc.nextInt();
										while (num > 2 || num < 1) {
											easy.if_ston2();
											num = sc.nextInt();
										}
										if (num == 1) {
											easy.character();
											num = sc.nextInt();
											while (num > 5 || num < 0) {
												easy.character();
												num = sc.nextInt();
											}
											if (num == 1) {
												easy.add_blue2(1);
												easy.add_red2(1);
												easy.add_green2(1);
												sc.next();
												break;
											} else if (num == 2) {
												easy.add_blue2(2);
												easy.add_red2(2);
												easy.add_green2(2);
												sc.next();
												break;
											} else if (num == 3) {
												easy.add_blue2(3);
												easy.add_red2(3);
												easy.add_green2(3);
												sc.next();
												break;
											} else if (num == 4) {
												easy.add_blue2(4);
												easy.add_red2(4);
												easy.add_green2(4);
												sc.next();
												break;
											} else if (num == 5) {
												easy.add_blue2(5);
												easy.add_red2(5);
												easy.add_green2(5);
												sc.next();
												break;
											} else {
												break;
											}
										} else {
											break;
										}
									}
								} else if (num == 3) { // 3번을 선택했을 경우
									while (true) {
										easy.if_ston3();
										num = sc.nextInt();
										while (num > 2 || num < 1) {
											easy.if_ston3();
											num = sc.nextInt();
										}
										if (num == 1) {
											easy.character();
											num = sc.nextInt();
											while (num > 5 || num < 0) {
												easy.character();
												num = sc.nextInt();
											}
											if (num == 1) {
												easy.add_blue3(1);
												easy.add_red3(1);
												easy.add_green3(1);
												sc.next();
												break;
											} else if (num == 2) {
												easy.add_blue3(2);
												easy.add_red3(2);
												easy.add_green3(2);
												sc.next();
												break;
											} else if (num == 3) {
												easy.add_blue3(3);
												easy.add_red3(3);
												easy.add_green3(3);
												sc.next();
												break;
											} else if (num == 4) {
												easy.add_blue3(4);
												easy.add_red3(4);
												easy.add_green3(4);
												sc.next();
												break;
											} else if (num == 5) {
												easy.add_blue3(5);
												easy.add_red3(5);
												easy.add_green3(5);
												sc.next();
												break;
											} else {
												break;
											}
										} else {
											break;
										}
									}
								} else if (num == 4) { // 4번을 선택했을 경우
									while (true) {
										easy.if_ston4();
										num = sc.nextInt();
										while (num > 2 || num < 1) {
											easy.if_ston4();
											num = sc.nextInt();
										}
										if (num == 1) {
											re_b.unit1();
											num = sc.nextInt();
											while (num > 5 || num < 0) {
												re_b.unit1();
												num = sc.nextInt();
											}
											if (num == 1) {
												easy.add_blue4(1);
												easy.add_red4(1);
												easy.add_green4(1);
												sc.next();
												break;
											} else if (num == 2) {
												easy.add_blue4(2);
												easy.add_red4(2);
												easy.add_green4(2);
												sc.next();
												break;
											} else if (num == 3) {
												easy.add_blue4(3);
												easy.add_red4(3);
												easy.add_green4(3);
												sc.next();
												break;
											} else if (num == 4) {
												easy.add_blue4(4);
												easy.add_red4(4);
												easy.add_green4(4);
												sc.next();
												break;
											} else if (num == 5) {
												easy.add_blue4(5);
												easy.add_red4(5);
												easy.add_green4(5);
												sc.next();
												break;
											} else {
												break;
											}
										} else {
											break;
										}
									}
								} else { // 5번을 선택했을 경우
									while (true) {
										easy.if_ston5();
										num = sc.nextInt();
										while (num > 2 || num < 1) {
											easy.if_ston5();
											num = sc.nextInt();
										}
										if (num == 1) {
											re_b.unit1();
											num = sc.nextInt();
											while (num > 5 || num < 0) {
												re_b.unit1();
												num = sc.nextInt();
											}
											if (num == 1) {
												easy.add_blue5(1);
												easy.add_red5(1);
												easy.add_green5(1);
												sc.next();
												break;
											} else if (num == 2) {
												easy.add_blue5(2);
												easy.add_red5(2);
												easy.add_green5(2);
												sc.next();
												break;
											} else if (num == 3) {
												easy.add_blue5(3);
												easy.add_red5(3);
												easy.add_green5(3);
												sc.next();
												break;
											} else if (num == 4) {
												easy.add_blue5(4);
												easy.add_red5(4);
												easy.add_green5(4);
												sc.next();
												break;
											} else if (num == 5) {
												easy.add_blue5(5);
												easy.add_red5(5);
												easy.add_green5(5);
												sc.next();
												break;
											} else {
												break;
											}
										} else {
											break;
										}
									}
								}
							}
						} else { // 유닛 배치 완료를 선택했을 경우
							while (true) {
								easy.war();
								num = sc.nextInt();
								while (num < 1 || num > 2) {
									easy.war();
									num = sc.nextInt();
								}
								if (num == 1) {
									easy.reset();
									break;
								} else {
									break;
								}
							}
						}
					}

				}  else { // 난이도 어려움을 선택했을 경우
					 // 게임 방법이 나옵니다.
					while (true) { // 게임 방법의 1페이지
						re_m.how_to_play1();
						num = sc.nextInt();
						while (num > 2 || num < 1) {
							re_m.how_to_play1();
							num = sc.nextInt();
						}
						if (num == 1) { // 초기 메인 화면으로 이동한다.
							break;
						} else {
							while (true) { // 게임 방법의 2페이지
								re_m.how_to_play2();
								num = sc.nextInt();
								while (num > 2 || num < 1) {
									re_m.how_to_play1();
									num = sc.nextInt();
								}
								if (num == 1) { // 초기 메인 화면으로 이동한다.
									continue a;
								} else { // 게임 방법의 1페이지로 전환이 된다.
									break;
								}
							}
						}
					}
				}

			} else { // 3.게임 종료를 선택했을 때 초기 메인 화면을 빠져나오고 게임 종료 메시지 출력되면서 프로세스 종료된다.
				break;
			}
		}
		re_m.end();
	}
}
