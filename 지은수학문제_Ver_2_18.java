import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
/**
 *  2026.03.01 집		Ver.2.18 덧셈7_ : 세자리 + 세자리 = 세자리 (올림 랜덤있음, 합1000 미만) 빈칸채우기 추가, add6_2(); // 덧셈6_2 : 두자리 +- 두자리 +- 두자리 = x (올림 랜덤있음) 추가
 *  2026.02.22 집		Ver.2.17 곱셈1 곱하는 수 1안나오게 수정, 매개변수 수정, sdan <= 단 < edan
 *  2025.12.29 집		Ver.2.16 덧셈7,8 행2줄 추가,답추가, 뺄셈6 행1줄 추가, 뺄셈7,8 행2줄 추가,답추가 
 *  2025.10.19 집		Ver.2.15 뺄셈가르기1(), 뺄셈가르기2() 추가 
 *  2025.09.14 집		Ver.2.14 정리
 *  2025.08.15 집		Ver.2.13 sub6() => sub6_() // 뺄셈6_ 수정 행 한줄 늘림
 *  2025.06.28 집		Ver.2.12 divide4_2(); // 나눗셈4_2 추가
 *  2025.06.12 집		Ver.2.11 sub4_() // 뺄셈4_ 수정 (기능추가)
 *  2025.05.27 집		Ver.2.10 add4() => add4_() // 덧셈 가로를 세로로 변경
 *  2025.02.16 집		Ver.2.9	divide1,2,3,4(); // 나눗셈1,2,3,4 추가
 *  2025.01.12 집		Ver.2.8	mul2(), mul3(); // 곱셈2, 곱셈3 추가
 *  2024.07.29 집		Ver.2.7	add2_3_sub3(); // 덧셈2,3,뺄셈3 추가 (섞어서)
 *  2024.04.18 집		Ver.2.6	한자리덧뺄셈 추가 add_sub1() 추가 (옆으로, 덧뺄셈)
 *  2024.02.27 집		Ver.2.5	한자리덧셈 두열로 추가 add1() 수정 
 *  						한자리뺄셈 두열로 sub1_1() 추가
 * 	2023.09.25 멀캠	Ver.2.4	세자리, 두자리 뺄셈 sub8() 추가
 * 					Ver.2.3	세자리, 두자리 덧셈 add8() 추가
 * 					Ver.2.2	가르기 추가
 *					Ver.2.1	세로 연산으로 변경
 *							구구단 곱셈
 */
public class 지은수학문제_Ver_2_18 {
	private static Random ran = new Random();
	private static int num = 10; // 문제수
	private static String s = ""; // 출력용
	public static void main(String[] args) {
//		add_sub1(); // 덧뺄셈1 : (가로) 한자리 + 한자리, 한자리 - 한자리, 겹치지 않도록
//		add1(); // 덧셈1 : 한자리 + 한자리 = 한자리 2~5 
//		add2(); // 덧셈2 : 한자리 + 한자리 = 한자리 2~10 
//		add3(); // 덧셈3 : 한자리 + 한자리 = 두자리 10~20 
//		add3_(); // 덧셈3 : 한자리 + 한자리 = 두자리 10~20 
//		add2_3_sub3(); // 덧셈2,3,뺄셈3 : 한자리 + 한자리 = 두자리 7~20, 10 - 한자리 = 한자리 (10의 보수)
// 		add4_(); // 덧셈4 : 두자리 + 한자리 = 두자리 (1의자리합 10미만, 올림없음)
//		add5(); // 덧셈5 : 두자리 + 한자리 = 두자리 (1의자리합 두자리, 올림), 매개변수 : 십의 자리 더해줄값
// /**/	add6(); // 덧셈6 : 두자리 + 두자리 = 두자리 (올림 랜덤있음)
// /**/	add6_2(); // 덧셈6_2 : 두자리 +- 두자리 +- 두자리 = x (올림 랜덤있음)
// /**/	add7_(); // 덧셈7_ : 세자리 + 세자리 = 세자리 (올림 랜덤있음, 합1000 미만) 빈칸채우기
// /**/	add7(); // 덧셈7 : 세자리 + 세자리 = 세자리 (올림 랜덤있음, 합1000 미만)
// /**/	add8(); // 덧셈8 : 세자리 + 두자리 = 세자리 (올림 랜덤있음, 합1000 미만)
//		sub1_1(); // 뺄셈1_1 : 한자리 - 한자리 = 한자리, 옆으로
//		sub1(); // 뺄셈1 : 한자리 2~5 - 한자리 = 한자리
//		sub2(); // 뺄셈2 : 한자리 2~10 - 한자리 = 한자리
//		sub3(); // 뺄셈3 : 10 - 한자리 = 한자리 (10의 보수)
//		sub4(); // 뺄셈4 : 1* - 한자리 = 한자리
//		sub4_(); // 뺄셈4_ : 1* - 한자리 = 한자리, 세로연산, 5열x7행=35문
// /**/	sub6_(); // 뺄셈6 : 두자리 - 두자리 = 두자리 (내림 랜덤있음)
// /**/	sub7(); // 뺄셈7 : 세자리 - 세자리 (내림 랜덤있음)
// /**/	sub8(); // 뺄셈8 : 세자리 - 두자리 = 세자리 (내림 랜덤있음)
//		com6_add6_sub6(); // 조합 : 덧셈6 + 뺄셈6
//		com7_add7_sub7(); // 조합 : 덧셈7 + 뺄셈7
//		gogodan(2); // 구구단 : dan 순서대로 출력 
		multi1(2, 10); // 곱셈1 : 한자리 곱셈, sdan <= 단 < edan
// 		mul2(); // 곱셈2 : 두자리 * 두자리, 세로연산 
///**/	mul3(); // 곱셈3 : 세자리 * 두자리, 세로연산
//		divide1(); // 나눗셈1 : 두자리 / 한자리
//		divide2(); // 나눗셈2 : 세자리 / 한자리
//		divide3(); // 나눗셈3 : 두자리 / 두자리 = 한자리
//		divide4(); // 나눗셈4 : 세자리 / 두자리 = 두자리
///**/	divide4_2(); // 나눗셈4_2 : 세자리 / 두자리 = 두자리, 나머지
//		덧셈가르기12(); 	// 덧셈가르기1.덧셈 앞 숫자를 (두 수의 합으로) 가르기
						// 덧셈가르기2.덧셈 뒷 숫자를 (두 수의 합으로) 가르기
//		덧셈가르기3();		// 덧셈가르기3.덧셈 앞 숫자를 (두 수의 차로) 가르기
//		덧셈가르기4();		// 덧셈가르기4.덧셈 뒷 숫자를 (두 수의 차로) 가르기
//		뺄셈가르기1(); 	// 뺄셈가르기1.뺄셈 앞 숫자를 (두 수의 합으로) 가르기
//		뺄셈가르기2();		// 뺄셈가르기2.뺄셈 뒷 숫자를 (두 뺄셈으로) 가르기
	} // end of main
		
	/** 덧뺄셈1 : (가로) 한자리 + 한자리, 한자리 - 한자리, 겹치지 않도록 */
	private static void add_sub1() {
		List<Integer> l1 = new ArrayList<Integer>();
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9 && i + j <= 10; j++) {
				l1.add(i*100+j);
			}
		}
		Collections.shuffle(l1);
		List<Integer> l2 = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10 && i - j > 0; j++) {
				l2.add(i*100+j);
			}
		}
		Collections.shuffle(l2);
		String result = "";
		for (int i = 0, x = 0; i < 10; i++) {
			int index = l1.get(i);
			int a = index / 100;
			int b = index % 100;
			result += a+"\t+\t"+b+"\t=\t";
			if (x == 0) {
				result += "\t\t\t\t";
				x++;
			} else {
				result += "\n\n";
				x = 0;
			}
		}
		for (int i = 0, x = 0; i < 12; i++) {
			int index = l2.get(i);
			int a = index / 100;
			int b = index % 100;
			result += a+"\t-\t"+b+"\t=\t";
			if (x == 0) {
				result += "\t\t\t\t";
				x++;
			} else {
				result += "\n\n";
				x = 0;
			}
		}
		System.out.println(result.substring(0, result.length()-2));
	}
	/** 덧셈가르기1.덧셈 앞 숫자를 (두 수의 합으로) 가르기
	 * 	덧셈가르기2.덧셈 뒷 숫자를 (두 수의 합으로) 가르기  */ // 완료
	private static void 덧셈가르기12() {
		HashMap<Integer, int[]> hm = new HashMap<Integer, int[]>();
		while(hm.size() < 8) {
			int ten1 = 1; // ran.nextInt(7)+1;
			int one1 = ran.nextInt(9)+1;
			int ten2 = 0; // ran.nextInt(7)+1;
			int one2 = ran.nextInt(7)+3;
			if (one1 + one2 < 11 || one1 >= one2
					|| ten1*10+one1 + ten2*10+one2 >= 100) continue;
			hm.put((ten1*10+one1)*100 + ten2*10+one2, new int[] {ten1*10+one1, ten2*10+one2});
		}
		ArrayList<int[]> al = new ArrayList<int[]>(hm.values());
		String result =
				"		"+al.get(0)[0]+"	+	"+al.get(0)[1]+"						"+al.get(1)[0]+"	+	"+al.get(1)[1]+"		\r\n" + 
				"														\r\n" + 
				"=		+		+				=		+		+		\r\n" + 
				"														\r\n" + 
				"=		+						=		+				\r\n" + 
				"=								=						\r\n" + 
				"														\r\n" + 
				"		"+al.get(2)[0]+"	+	"+al.get(2)[1]+"						"+al.get(3)[0]+"	+	"+al.get(3)[1]+"		\r\n" + 
				"														\r\n" + 
				"=		+		+				=		+		+		\r\n" + 
				"														\r\n" + 
				"=		+						=		+				\r\n" + 
				"=								=						\r\n" + 
				"														\r\n" + 
				"		"+al.get(4)[0]+"	+	"+al.get(4)[1]+"						"+al.get(5)[0]+"	+	"+al.get(5)[1]+"		\r\n" + 
				"\n														\r\n\n" + 
				"														\r\n" + 
				"														\r\n" + 
				"														\r\n" + 
				"		"+al.get(6)[0]+"	+	"+al.get(6)[1]+"						"+al.get(7)[0]+"	+	"+al.get(7)[1]+"		\r\n" + 
				"\n														\r\n\n" + 
				"														\r\n" + 
				"														";
		System.out.println(result);
	}
	/** 덧셈가르기3.덧셈 앞 숫자를 (두 수의 차로) 가르기	 */ // 자른시트보고 수정하기 (기호도 쓰도록)
	private static void 덧셈가르기3() {
		ArrayList<int[]> al = new ArrayList<int[]>();
		while(al.size() < 8) {
			int ten1 = ran.nextInt(7)+1;
			int one1 = ran.nextInt(8)+2;
			int ten2 = ran.nextInt(7)+1;
			int one2 = ran.nextInt(8)+2;
			if (one1 + one2 < 11 
					|| ten1*10+one1 + ten2*10+one2 >= 100) continue;
			al.add(new int[] {ten1*10+one1, ten2*10+one2});
		}
		String result = "		"+al.get(0)[0]+"	+	"+al.get(0)[1]+"						"+al.get(1)[0]+"	+	"+al.get(1)[1]+"		\r\n" + 
				"														\r\n" + 
				"=		-		+				=		-		+		\r\n" + 
				"														\r\n" + 
				"=		-						=		-				\r\n" + 
				"=								=						\r\n" + 
				"														\r\n" + 
				"		"+al.get(2)[0]+"	+	"+al.get(2)[1]+"						"+al.get(3)[0]+"	+	"+al.get(3)[1]+"		\r\n" + 
				"														\r\n" + 
				"=		-		+				=		-		+		\r\n" + 
				"														\r\n" + 
				"=		-						=		-				\r\n" + 
				"=								=						\r\n" + 
				"														\r\n" + 
				"		"+al.get(4)[0]+"	+	"+al.get(4)[1]+"						"+al.get(5)[0]+"	+	"+al.get(5)[1]+"		\r\n" + 
				"\n=		-		+				=		-		+		\r\n\n" + 
				"=		-						=		-				\r\n" + 
				"=								=						\r\n" + 
				"														\r\n" + 
				"		"+al.get(6)[0]+"	+	"+al.get(6)[1]+"						"+al.get(7)[0]+"	+	"+al.get(7)[1]+"		\r\n" + 
				"\n=		-		+				=		-		+		\r\n\n" + 
				"=		-						=		-				\r\n" + 
				"=								=						";
		System.out.println(result);
	}
	/** 덧셈가르기4.덧셈 뒷 숫자를 (두 수의 차로) 가르기	 */ // 자른시트보고 수정하기 (기호도 쓰도록)
	private static void 덧셈가르기4() {
		ArrayList<int[]> al = new ArrayList<int[]>();
		while(al.size() < 8) {
			int ten1 = ran.nextInt(7)+1;
			int one1 = ran.nextInt(8)+2;
			int ten2 = ran.nextInt(7)+1;
			int one2 = ran.nextInt(8)+2;
			if (one1 + one2 < 11 
					|| ten1*10+one1 + ten2*10+one2 >= 100) continue;
			al.add(new int[] {ten1*10+one1, ten2*10+one2});
		}
		String result = "		"+al.get(0)[0]+"	+	"+al.get(0)[1]+"						"+al.get(1)[0]+"	+	"+al.get(1)[1]+"		\r\n" + 
				"														\r\n" + 
				"=		+		-				=		+		-		\r\n" + 
				"														\r\n" + 
				"=		-						=		-				\r\n" + 
				"=								=						\r\n" + 
				"														\r\n" + 
				"		"+al.get(2)[0]+"	+	"+al.get(2)[1]+"						"+al.get(3)[0]+"	+	"+al.get(3)[1]+"		\r\n" + 
				"														\r\n" + 
				"=		+		-				=		+		-		\r\n" + 
				"														\r\n" + 
				"=		-						=		-				\r\n" + 
				"=								=						\r\n" + 
				"														\r\n" + 
				"		"+al.get(4)[0]+"	+	"+al.get(4)[1]+"						"+al.get(5)[0]+"	+	"+al.get(5)[1]+"		\r\n" + 
				"\n=		+		-				=		+		-		\r\n\n" + 
				"=		-						=		-				\r\n" + 
				"=								=						\r\n" + 
				"														\r\n" + 
				"		"+al.get(6)[0]+"	+	"+al.get(6)[1]+"						"+al.get(7)[0]+"	+	"+al.get(7)[1]+"		\r\n" + 
				"\n=		+		-				=		+		-		\r\n\n" + 
				"=		-						=		-				\r\n" + 
				"=								=						";
		System.out.println(result);
	}
	/** 뺄셈가르기1.뺄셈 앞 숫자를 (두 수의 합으로) 가르기  */ // 완료
	private static void 뺄셈가르기1() {
		HashMap<Integer, int[]> hm = new HashMap<Integer, int[]>();
		while(hm.size() < 8) {
			int ten1 = 1; // ran.nextInt(7)+1;
			int one1 = ran.nextInt(9)+1;
			int ten2 = 0; // ran.nextInt(7)+1;
			int one2 = ran.nextInt(7)+3;
			if (one1 + one2 < 11 || one1 >= one2
					|| ten1*10+one1 + ten2*10+one2 >= 100) continue;
			hm.put((ten1*10+one1)*100 + ten2*10+one2, new int[] {ten1*10+one1, ten2*10+one2});
		}
		ArrayList<int[]> al = new ArrayList<int[]>(hm.values());
		String result = 
				"		"+al.get(0)[0]+"	-	"+al.get(0)[1]+"						"+al.get(1)[0]+"	-	"+al.get(1)[1]+"		\r\n" + 
				"														\r\n" + 
				"=		+		-				=		+		-		\r\n" + 
				"														\r\n" + 
				"=		+						=		+				\r\n" + 
				"=								=						\r\n" + 
				"														\r\n" + 
				"		"+al.get(2)[0]+"	-	"+al.get(2)[1]+"						"+al.get(3)[0]+"	-	"+al.get(3)[1]+"		\r\n" + 
				"														\r\n" + 
				"=		+		-				=		+		-		\r\n" + 
				"														\r\n" + 
				"=		+						=		+				\r\n" + 
				"=								=						\r\n" + 
				"														\r\n" + 
				"		"+al.get(4)[0]+"	-	"+al.get(4)[1]+"						"+al.get(5)[0]+"	-	"+al.get(5)[1]+"		\r\n" + 
				"\n														\r\n\n" + 
				"														\r\n" + 
				"														\r\n" + 
				"														\r\n" + 
				"		"+al.get(6)[0]+"	-	"+al.get(6)[1]+"						"+al.get(7)[0]+"	-	"+al.get(7)[1]+"		\r\n" + 
				"\n														\r\n\n" + 
				"														\r\n" + 
				"														";
		System.out.println(result);
	}
	/** 뺄셈가르기2.뺄셈 뒷 숫자를 (두 뺄셈으로) 가르기  */ // 완료
	private static void 뺄셈가르기2() {
		HashMap<Integer, int[]> hm = new HashMap<Integer, int[]>();
		while(hm.size() < 8) {
			int ten1 = 1; // ran.nextInt(7)+1;
			int one1 = ran.nextInt(9)+1;
			int ten2 = 0; // ran.nextInt(7)+1;
			int one2 = ran.nextInt(7)+3;
			if (one1 + one2 < 11 || one1 >= one2
					|| ten1*10+one1 + ten2*10+one2 >= 100) continue;
			hm.put((ten1*10+one1)*100 + ten2*10+one2, new int[] {ten1*10+one1, ten2*10+one2});
		}
		ArrayList<int[]> al = new ArrayList<int[]>(hm.values());
		String result = 
				"		"+al.get(0)[0]+"	-	"+al.get(0)[1]+"						"+al.get(1)[0]+"	-	"+al.get(1)[1]+"		\r\n" + 
				"														\r\n" + 
				"=		-		-				=		-		-		\r\n" + 
				"														\r\n" + 
				"=		-						=		-				\r\n" + 
				"=								=						\r\n" + 
				"														\r\n" + 
				"		"+al.get(2)[0]+"	-	"+al.get(2)[1]+"						"+al.get(3)[0]+"	-	"+al.get(3)[1]+"		\r\n" + 
				"														\r\n" + 
				"=		-		-				=		-		-		\r\n" + 
				"														\r\n" + 
				"=		-						=		-				\r\n" + 
				"=								=						\r\n" + 
				"														\r\n" + 
				"		"+al.get(4)[0]+"	-	"+al.get(4)[1]+"						"+al.get(5)[0]+"	-	"+al.get(5)[1]+"		\r\n" + 
				"\n														\r\n\n" + 
				"														\r\n" + 
				"														\r\n" + 
				"														\r\n" + 
				"		"+al.get(6)[0]+"	-	"+al.get(6)[1]+"						"+al.get(7)[0]+"	-	"+al.get(7)[1]+"		\r\n" + 
				"\n														\r\n\n" + 
				"														\r\n" + 
				"														";
		System.out.println(result);
	}

	/** 나눗셈1 : 두자리 / 한자리 */
	public static void divide1() {
		String result = "";
		String sol = "";
		int a, b, mul;
		for (int r = 0; r < 6; r++) {
			result += "\n";
			for (int c = 0; c < 6; c++) {
				while(true) {
					a = ran.nextInt(9) + 1; // 1자리 제수
					if (a == 1 && ran.nextInt(10) > 0) continue;
					if (a == 2 && ran.nextInt(10) > 8) continue;
					b = ran.nextInt(99) + 1; // 1~2자리 몫
					mul = a * b;
					if (mul < 100 && mul >= 10) break; // 2자리 피제수
				}
				result += a + "\t" + mul/10 + "\t" + mul%10 + "\t\t";
				sol += b + ",";
			}
			result += "\n\n\n";
			sol = sol.substring(0, sol.length()-1)+"   ";
//			if (r==2 || r == 5) sol += "\n";
//			else 				sol += " / ";
		}
		result = result.substring(0, result.length()-1) + sol;
		System.out.print(result);
	}
	
	/** 나눗셈2 : 세자리 / 한자리 */
	public static void divide2() {
		String result = "";
		String sol = "";
		int a, b, mul;
		for (int r = 0; r < 5; r++) {
			result += "\n";
			for (int c = 0; c < 5; c++) {
				while(true) {
					a = ran.nextInt(9) + 1; // 1자리 제수
					b = ran.nextInt(99) + 1; // 1~2자리 몫
					mul = a * b;
					if (mul < 1000 && mul >= 100) break; // 3자리 피제수
				}
				result += a + "\t" + mul/100 + "\t" + mul%100/10 + "\t" + mul%10 + "\t\t";
				sol += b + ",";
			}
			result += "\n\n\n";
			sol = sol.substring(0, sol.length()-1)+"   ";
//			if (r==2 || r == 5) sol += "\n";
//			else 				sol += " / ";
		}
		result = result.substring(0, result.length()-1) + sol;
		System.out.print(result);
	}
	
	/** 나눗셈3 : 두자리 / 두자리 = 한자리 */
	public static void divide3() {
		String result = "";
		String sol = "";
		int a, b, mul;
		for (int r = 0; r < 6; r++) {
			result += "\n";
			for (int c = 0; c < 5; c++) {
				while(true) {
					a = ran.nextInt(90) + 10; // 2자리 제수
					b = ran.nextInt(8) + 2; // 2자리 몫
					mul = a * b;
					if (mul < 100 && mul >= 10) break; // 2자리 피제수
				}
				result += a/10 + "\t" + a%10 + "\t" + mul/10 + "\t" + mul%10 + "\t\t";
				sol += b + ",";
			}
			result += "\n\n\n";
			sol = sol.substring(0, sol.length()-1)+"   ";
//			if (r==2 || r == 5) sol += "\n";
//			else 				sol += " / ";
		}
		result = result.substring(0, result.length()-1) + sol;
		System.out.print(result);
	}
	
	/** 나눗셈4_2 : 세자리 / 두자리 = 두자리, 나머지 */
	public static void divide4_2() {
		String result = "";
		String sol = "";
		int a, b, rest, mul;
		for (int r = 0; r < 5; r++) {
			result += "\n";
			for (int c = 0; c < 4; c++) {
				while(true) {
					a = ran.nextInt(90) + 10; // 2자리 제수
					b = ran.nextInt(99) + 1; // 2자리 몫
					rest = ran.nextInt(a-1)+1; // 나머지
					mul = a * b + rest;
					if (mul < 1000 && mul >= 100) break; // 3자리 피제수
				}
				result += a/10 + "\t" + a%10 + "\t" + mul/100 + "\t" + mul%100/10 + "\t" + mul%10 + "\t\t";
				sol += b + "_" + rest + ", ";
			}
			result += "\n\n\n";
			sol = sol.substring(0, sol.length()-1)+"   ";
			if (r==2) sol += "\n";
		}
		result = result.substring(0, result.length()-1) + sol;
		System.out.print(result);
	}
	
	/** 나눗셈4 : 세자리 / 두자리 = 두자리 */
	public static void divide4() {
		String result = "";
		String sol = "";
		int a, b, mul;
		for (int r = 0; r < 5; r++) {
			result += "\n";
			for (int c = 0; c < 4; c++) {
				while(true) {
					a = ran.nextInt(90) + 10; // 2자리 제수
					b = ran.nextInt(90) + 10; // 2자리 몫
					mul = a * b;
					if (mul < 1000 && mul >= 100) break; // 3자리 피제수
				}
				result += a/10 + "\t" + a%10 + "\t" + mul/100 + "\t" + mul%100/10 + "\t" + mul%10 + "\t\t";
				sol += b + ",";
			}
			result += "\n\n\n";
			sol = sol.substring(0, sol.length()-1)+"   ";
		}
		result = result.substring(0, result.length()-1) + sol;
		System.out.print(result);
	}
	
	/** 곱셈3 : 세자리 * 두자리, 세로연산, 4열x6행=24문 */
	public static void mul3() {
		String result = "";
		String sol = "";
		for (int i = 0; i < 6; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 4; j++) {
				int a = ran.nextInt(900)+100; // 3자리
				int b = ran.nextInt(90)+10; // 2자리
				row1 += "\t" + a/100 + " " + a%100/10 + " " + a%10 + "\t\t";
				row2 += "x\t" + b/10 + " " + b%10 + "\t\t";
				sol += a * b + ", ";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
			sol = sol.substring(0, sol.length()-2);
			if (i==2 || i == 5) sol += "\n";
			else 				sol += " / ";
		}
		result += sol;
		System.out.print(result);
	} // end of mul3()
		
	/** 곱셈2 : 두자리 * 두자리, 세로연산, 5열x6행=30문 */
	public static void mul2() {
		String result = "";
		String sol = "";
		for (int i = 0; i < 6; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				int a = ran.nextInt(90)+10; // 2자리
				int b = ran.nextInt(90)+10; // 2자리
				row1 += "\t" + a/10 + " " + a%10 + "\t\t";
				row2 += "x\t" + b/10 + " " + b%10 + "\t\t";
				sol += a * b + ",";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
			sol = sol.substring(0, sol.length()-1);
			if (i==2 || i == 5) sol += "\n";
			else 				sol += " / ";
		}
		result += sol;
		System.out.print(result);
	} // end of mul2()
	
	/** 곱셈1 : 한자리 곱셈 , sdan <= 단 < edan */
	public static void multi1(int sdan, int edan) {
		String result = "";
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 2; j++) {
				int dan = ran.nextInt(edan-sdan)+sdan;
				int num = ran.nextInt(8)+2;
				result += String.format("%d\tX\t%d\t=\t\t\t\t\t", dan,num);
			} 
			result += "\n\n";
		}
		System.out.print(result.substring(0, result.length()-1));
	}
	
	/** 구구단 : dan 순서대로 출력 */
	public static void gogodan(int dan) {
		String result = "";
		for (int i = 1; i <= 9; i++) {
			result += String.format("%d  X  %d  = %2d\n", dan,i,dan*i);
		}
		System.out.print(result.substring(0, result.length()-1));
	}
	/** 조합 : 덧셈6 + 뺄셈6 */
	public static void com6_add6_sub6() {
		String result = "";
		for (int i = 0; i < 3; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				int a = 0;
				int b = 0;
				while(true) {
					a = ran.nextInt(90) + 10; // 2자리
					b = ran.nextInt(90) + 10; // 2자리
					if (a+b < 100) break;
				}
				row1 += "\t" + a + "\t\t";
				row2 += "+\t" + b + "\t\t";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
		}
		System.out.print(result);
		
		result = "";
		for (int i = 0; i < 3; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				int a = 0;
				int b = 0;
				while(true) {
					a = ran.nextInt(90) + 10; // 2자리
					b = ran.nextInt(90) + 10; // 2자리
					if (a-b >= 10) break;
				}
				row1 += "\t" + a + "\t\t";
				row2 += "-\t" + b + "\t\t";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
		}
		System.out.print(result);
	}
	/** 조합 : 덧셈7 + 뺄셈7 */
	public static void com7_add7_sub7() {
		String result = "";
		for (int i = 0; i < 3; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				int a = 0;
				int b = 0;
				while(true) {
					a = ran.nextInt(900) + 100; // 3자리
					b = ran.nextInt(900) + 100; // 3자리
					if (a+b < 1000) break;
				}
				row1 += "\t" + a + "\t\t";
				row2 += "+\t" + b + "\t\t";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
		}
		System.out.print(result);
		
		result = "";
		for (int i = 0; i < 4; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				int a = 0;
				int b = 0;
				while(true) {
					a = ran.nextInt(900) + 100; // 3자리
					b = ran.nextInt(900) + 100; // 3자리
					if (a-b >= 100) break;
				}
				row1 += "\t" + a + "\t\t";
				row2 += "-\t" + b + "\t\t";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
		}
		System.out.print(result);
	}

	/** 뺄셈8 : 세자리 - 두(세)자리 = 세자리 (내림 랜덤있음) */
	public static void sub8() {
		String result = "";
		String sol = "";
		for (int i = 0; i < 4; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				int a = 0;
				int b = 0;
				while(true) {
					a = ran.nextInt(900) + 100; // 3자리
					b = ran.nextInt(900) + 100; // 3자리
					if (a+b < 1000 && a>b) break;
				}
				row1 += "\t" + a + "\t\t";
				row2 += "-\t" + b + "\t\t";
				sol  += a-b+",";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
			row1 = "";
			row2 = "";
			sol += " / ";
			for (int j = 0; j < 5; j++) {
				int a = 0;
				int b = 0;
				while(true) {
					a = ran.nextInt(900) + 100; // 3자리
					b = ran.nextInt(90) + 10; // 2자리
					if (a+b < 1000) break;
				}
				row1 += "\t" + a + "\t\t";
				row2 += "-\t " + b + "\t\t";
				sol  += a-b+",";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
			sol = sol.substring(0, sol.length()-1);
			if (i==1) 	sol += "\n";
			else 		sol += " / ";
		}
		result = result.substring(0, result.length()-2);
		sol = sol.substring(0, sol.length()-2);
		System.out.println(result);
		System.out.print(sol);
	} // end of sub8()
	
	/** 뺄셈7 : 세자리 - 세자리 (내림 랜덤있음), 세로연산, 5열x6행=30문  */
	public static void sub7() {
		String result = "";
		String sol = "";
		for (int i = 0; i < 8; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				int a = 0;
				int b = 0;
				while(true) {
					a = ran.nextInt(900) + 100; // 3자리
					b = ran.nextInt(900) + 100; // 3자리
					if (a-b >= 100) break;
				}
				row1 += "\t" + a + "\t\t";
				row2 += "-\t" + b + "\t\t";
				sol += a - b + ",";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
			sol = sol.substring(0, sol.length()-1);
			if (i == 3) sol += "\n";  
			else 		sol += " / ";
		}
		result = result.substring(0, result.length()-2);
		sol = sol.substring(0, sol.length()-2);
		System.out.println(result);
		System.out.print(sol);
	}
	
	/** 뺄셈6 : 두자리 - 두자리 = 두자리 (내림 랜덤있음), 세로연산, 5열x7행=30문  */
	public static void sub6_() {
		String result = "";
		for (int i = 0; i < 8; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				int a = 0;
				int b = 0;
				while(true) {
					a = ran.nextInt(90) + 10; // 2자리
					b = ran.nextInt(90) + 10; // 2자리
					if (a-b >= 10) break;
				}
				row1 += "\t" + a + "\t\t";
				row2 += "-\t" + b + "\t\t";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
		}
		result = result.substring(0, result.length()-1);
		System.out.print(result);
	}
	
	/** 뺄셈4 : 1* - 한자리 = 한자리, 세로연산, 5열x6행=30문  */
	public static void sub4() {
		String result = "";
		for (int i = 0; i < 6; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				int a = ran.nextInt(9)+1; // 1자리 1~9
				int b = ran.nextInt(9)+1; // 1자리 1~9
				if (a >= b) {
					j--;
					continue;
				}
				row1 += "\t"  + "1" + a + "\t\t";
				row2 += "-\t" + " " + b + "\t\t";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
		}
		System.out.print(result);
	} // end of sub4()
	
	/** 뺄셈4_ : 1* - 한자리 = 한자리, 세로연산, 5열x7행=35문  */
	public static void sub4_() {
		String result = "";
		int w = ran.nextInt(9)+1;
		for (int i = 0; i < 7; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				int a = ran.nextInt(9)+1; // 1자리 1~9
				int b = ran.nextInt(9)+1; // 1자리 1~9
				if (a >= b) {
					j--;
					continue;
				}
//				row1 += "\t"  + (ran.nextInt(9)+1) + a + "\t\t";
				row1 += "\t"  + w + a + "\t\t";
				row2 += "-\t" + " " + b + "\t\t";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
		}
		System.out.print(result);
	} // end of sub4()
	
	/** 뺄셈3 : 10 - 한자리 = 한자리 (10의 보수), 세로연산, 5열x6행=30문  */
	public static void sub3() {
		String result = "";
		String row1 = "";
		String row2 = "";
		int cnt = 0;
		for (int k = 0; k < 4; k++) {
			int[] arr = new int[10];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i;
			}
			for (int i = 0; i < arr.length*3; i++) {
				int n1 = ran.nextInt(arr.length);
				int n2 = ran.nextInt(arr.length);
				int temp = arr[n1];
				arr[n1] = arr[n2];
				arr[n2] = temp;
			}
			for (int i = 0; i < arr.length; i++) {
				row1 += "\t" + 11 + "\t\t";
				row2 += "-\t" + arr[i] + "\t\t";
				cnt++;
				if (cnt == 5) {
					cnt = 0;
					result += row1 + "\n" + row2 + "\n\n\n";
					row1 = row2 = "";
					if (k==3) break;
				}
			}
		}
		System.out.print(result);
	} // end of sub3()
	
	/** 뺄셈2 : 한자리 2~10 - 한자리 = 한자리, 세로연산, 5열x6행=30문 */
	public static void sub2() {
		String result = "";
		int max = 10; // 합한 결과의 최대값
		int min = 2; // 합한 결과의 최소값
		for (int i = 0; i < 6; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				while(true) {
					int a = ran.nextInt(9)+1; // 1자리 1~9
					int b = ran.nextInt(9)+1; // 1자리 1~9
					int sum = a + b;
					if (min <= sum && sum <= max) {
						row1 += "\t" + sum + "\t\t";
						row2 += "-\t" + a + "\t\t";
						break;
					}
				}
			}
			result += row1 + "\n" + row2 + "\n\n\n";
		}
		System.out.print(result);
	} // end of sub2()
	
	/** 뺄셈1 : 한자리 2~5 - 한자리 = 한자리, 세로연산, 5열x6행=30문 */
	public static void sub1() {
		String result = "";
		int max = 5; // 합한 결과의 최대값
		int min = 2; // 합한 결과의 최소값
		for (int i = 0; i < 6; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				while(true) {
					int a = ran.nextInt(4)+1; // 1자리 1~4
					int b = ran.nextInt(4)+1; // 1자리 1~4
					int sum = a + b;
					if (min <= sum && sum <= max) {
						row1 += "\t" + sum + "\t\t";
						row2 += "-\t" + a + "\t\t";
						break;
					}
				}
			}
			result += row1 + "\n" + row2 + "\n\n\n";
		}
		System.out.print(result);
	} // end of sub1()

	/** 뺄셈1 : 한자리 - 한자리 = 한자리, 옆으로*/
	public static void sub1_1() {
		num *= 2; // 두 줄로 할려고
		HashSet<Integer> hs = new HashSet<>();
		while(0 < num) {
			int a = ran.nextInt(9)+1; // 1자리
			int b = ran.nextInt(9)+1; // 1자리
			if (a > b) {
				int val = a*10 + b; 
				if (hs.contains(val)) {
					continue;
				}
				hs.add(val);
				if (num % 2 == 0) System.out.print(a+"\t-\t"+b+"\t=\t\t\t\t\t");
				else System.out.println(a+"\t-\t"+b+"\t=\n");
				num--;
			}
		}
	} // end of add1()

	/** 덧셈8 : 세자리 + 두자리 = 세자리 (올림 랜덤있음, 합1000 미만)
	 * 4줄 세+두, 4줄 두+세 */
	public static void add8() {
		String result = "";
		String sol = "";
		for (int i = 0; i < 4; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				int a = 0;
				int b = 0;
				while(true) {
					a = ran.nextInt(900) + 100; // 3자리
					b = ran.nextInt(90) + 10; // 2자리
					if (a+b < 1000) break;
				}
				row1 += "\t" + a + "\t\t";
				row2 += "+\t " + b + "\t\t";
				sol += (a + b) + ",";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
			sol = sol.substring(0, sol.length()-1);
			if (i==3) 	sol += "\n";
			else 		sol += " / ";
		}
		for (int i = 0; i < 4; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				int a = 0;
				int b = 0;
				while(true) {
					a = ran.nextInt(90) + 10; // 2자리
					b = ran.nextInt(900) + 100; // 3자리
					if (a+b < 1000) break;
				}
				row1 += "\t " + a + "\t\t";
				row2 += "+\t" + b + "\t\t";
				sol += (a + b) + ",";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
			sol = sol.substring(0, sol.length()-1);
			if (i==3) 	sol += "\n";
			else 		sol += " / ";
		}
		result = result.substring(0, result.length()-2);
		sol = sol.substring(0, sol.length()-1);
		System.out.println(result);
		System.out.println(sol);
	} // end of add8()
	
	/** 덧셈7 : 세자리 + 세자리 = 세자리 (올림 랜덤있음, 합1000 미만) 빈칸채우기 (7행 4열) */ 
	public static void add7_() {
		String result = "";
		String sol = "";
		for (int i = 0; i < 7; i++) { // 행
			String row1 = "";
			String row2 = "";
			String row3 = "";
			{ // 1열
				int a = 0;
				int b = 0;
				int c = 0;
				while(true) {
					a = ran.nextInt(900) + 100; // 3자리
					b = ran.nextInt(900) + 100; // 3자리
					c = a + b;
					if (a+b < 1000) break;
				}
				row1 +=  "\t" + a/100 + "\t" + a/10%10 + "\t" + a%10 + "\t\t";
				row2 += "+\t" + b/100 + "\t" + b/10%10 + "\t" + b%10 + "\t\t";
				row3 +=  "\t" + c/100 + "\t" + c/10%10 + "\t" + c%10 + "\t\t";
				sol += b/100+" "+a/10%10+" "+c%10 +", ";
			}
			{ // 2열
				int a = 0;
				int b = 0;
				int c = 0;
				while(true) {
					a = ran.nextInt(900) + 100; // 3자리
					b = ran.nextInt(900) + 100; // 3자리
					c = a + b;
					if (a+b < 1000) break;
				}
				row1 +=  "\t" + a/100 + "\t" + a/10%10 + "\t" + a%10 + "\t\t";
				row2 += "+\t" + b/100 + "\t" + b/10%10 + "\t" + b%10 + "\t\t";
				row3 +=  "\t" + c/100 + "\t" + c/10%10 + "\t" + c%10 + "\t\t";
				sol += a/100+" "+c/10%10+" "+b%10 +", ";
			}
			{ // 3열
				int a = 0;
				int b = 0;
				int c = 0;
				while(true) {
					a = ran.nextInt(900) + 100; // 3자리
					b = ran.nextInt(900) + 100; // 3자리
					c = a + b;
					if (a+b < 1000) break;
				}
				row1 +=  "\t" + a/100 + "\t" + a/10%10 + "\t" + a%10 + "\t\t";
				row2 += "+\t" + b/100 + "\t" + b/10%10 + "\t" + b%10 + "\t\t";
				row3 +=  "\t" + c/100 + "\t" + c/10%10 + "\t" + c%10 + "\t\t";
				sol += b/100+" "+c/10%10+" "+a%10 +", ";
			}
			{ // 4열
				int a = 0;
				int b = 0;
				int c = 0;
				while(true) {
					a = ran.nextInt(900) + 100; // 3자리
					b = ran.nextInt(900) + 100; // 3자리
					c = a + b;
					if (a+b < 1000) break;
				}
				row1 +=  "\t" + a/100 + "\t" + a/10%10 + "\t" + a%10;
				row2 += "+\t" + b/100 + "\t" + b/10%10 + "\t" + b%10;
				row3 +=  "\t" + c/100 + "\t" + c/10%10 + "\t" + c%10;
				sol += a/100+" "+b/10%10+" "+b%10 +"    ";
			}
			result += row1 + "\n" + row2 + "\n" + row3 + "\n\n";
			if (i==2 || i == 5) sol += "\n";
		}
		System.out.print(result);
		System.out.println(sol);
	} // end of add7()
	
	/** 덧셈7 : 세자리 + 세자리 = 세자리 (올림 랜덤있음, 합1000 미만) */
	public static void add7() {
		String result = "";
		String sol = "";
		for (int i = 0; i < 8; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				int a = 0;
				int b = 0;
				while(true) {
					a = ran.nextInt(900) + 100; // 3자리
					b = ran.nextInt(900) + 100; // 3자리
					if (a+b < 1000) break;
				}
				row1 += "\t" + a + "\t\t";
				row2 += "+\t" + b + "\t\t";
				sol += (a + b) + ",";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
			sol = sol.substring(0, sol.length()-1);
			if (i==3 || i == 7) sol += "\n";
			else 				sol += " / ";
		}
		result = result.substring(0, result.length()-1);
		sol = sol.substring(0, sol.length()-1);
		System.out.print(result);
		System.out.println(sol);
	} // end of add7()
	
	/** 덧셈6_2 : 두자리 +- 두자리 +- 두자리 = x (올림 랜덤있음), 가로연산, 2열x8행=40문  */
	public static void add6_2() {
		String result = "";
		String sol = "";
		for (int i = 0; i < 8; i++) {
			{ // 1열
				int a = 0;
				int b = 0;
				int c = 0;
				while(true) {
					a = ran.nextInt(90) + 10; // 두자리수
					b = ran.nextInt(90) + 10; // 두자리수
					c = ran.nextInt(90) + 10; // 두자리수
					if (a+b > c) break;
				}
				result += a + "\t+\t" + b + "\t-\t" + c + "\t=\t\t";
				sol += a+b-c+", ";
			}
			{ // 2열
				int a = 0;
				int b = 0;
				int c = 0;
				while(true) {
					a = ran.nextInt(90) + 10; // 두자리수
					b = ran.nextInt(90) + 10; // 두자리수
					c = ran.nextInt(90) + 10; // 두자리수
					if (a > b) break;
				}
				result += a + "\t-\t" + b + "\t+\t" + c + "\t=\n\n";
				sol += a-b+c+", ";
			}
			if      (i == 3) sol = sol.substring(0, sol.length()-1) + "\n";
			else if (i == 7) sol = sol.substring(0, sol.length()-1);
		}
		System.out.print(result);
		System.out.println(sol);
	} // end of add6()
	
	/** 덧셈6 : 두자리 + 두자리 = 두자리 (올림 랜덤있음), 세로연산, 5열x8행=40문  */
	public static void add6() {
		String result = "";
		for (int i = 0; i < 8; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				int a = 0;
				int b = 0;
				int x = 0;
				while(true) {
					x = ran.nextInt(9) + 1; // 두자리수의 십에자리 숫자
					a = ran.nextInt(8) + 2; // 1자리 0~9
					b = ran.nextInt(90) + 10; // 2자리
					if (a+b < 100) break;
				}
				row1 += "\t" + x + a + "\t\t";
				row2 += "+\t" + b + "\t\t";
			}
			result += row1 + "\n" + row2 + "\n\n\n";
		}
		System.out.print(result);
	} // end of add6()
	
	/** 덧셈5 : 두자리 + 한자리 = 두자리 (1의자리합 두자리, 올림) */
	public static void add5() {
		int max = 20; // 합한 결과의 최대값
		int min = 10; // 합한 결과의 최소값
		int x = (ran.nextInt(8)+1)*10; // 두자리수의 십에자리 숫자, 올림할꺼라서 10~80 으로 범위조정, 덧셈후 세자리 안되도록 
		while(0 < num) {
			int a = ran.nextInt(10); // 1자리
			int b = ran.nextInt(9)+1; // 1자리
			int sum = a + b;
			if (min <= sum && sum <= max) {
				a += x; // 앞숫자의 십의 자리
				System.out.println(a+"\t+\t"+b+"\t=\n");
				num--;
			}
		}
	} // end of add5()
	
	/** 덧셈4 : 두자리 + 한자리 = 두자리 (1의자리합 10미만, 올림없음,있음 섞임), 세로연산, 5열x6행=30문 */
	public static void add4_() {
		String result = "";
		int max = 9; // 합한 결과의 최대값
		int min = 1; // 합한 결과의 최소값
//		int x = (ran.nextInt(9)+1); // 두자리수의 십에자리 숫자
		for (int i = 0; i < 7; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				while(true) {
					int x = (ran.nextInt(9)+1); // 두자리수의 십에자리 숫자
					int a = ran.nextInt(10); // 1자리 0~9
					int b = ran.nextInt(8)+2; // 1자리 1~9
					int sum = a + b;
//					if (min <= sum && sum <= max) {
						row1 += "\t"  + x   + a + "\t\t";
						row2 += "+\t" + " " + b + "\t\t";
						break;
//					}
				}
			}
			result += row1 + "\n" + row2 + "\n\n\n";
		}
		System.out.print(result);
	} // end of add4()
	
	/** 덧셈2,3,뺄셈3 : 한자리 + 한자리 = 두자리 7~20, 10 - 한자리 = 한자리 (10의 보수), 5열x6행=30문 */
	public static void add2_3_sub3() {
		String result = "";
		int max = 20; // 합한 결과의 최대값
		int min = 7; // 합한 결과의 최소값
		for (int i = 0; i < 3; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				while(true) {
					int a = ran.nextInt(9)+1; // 1자리 1~9
					int b = ran.nextInt(9)+1; // 1자리 1~9
					int sum = a + b;
					if (min <= sum && sum <= max) {
						row1 += "\t" + a + "\t\t";
						row2 += "+\t" + b + "\t\t";
						break;
					}
				}
			}
			result += row1 + "\n" + row2 + "\n\n\n";
		}
		System.out.print(result);
		
		result = "";
		String row1 = "";
		String row2 = "";
		int cnt = 0;
		for (int k = 0; k < 2; k++) {
			int[] arr = new int[10];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i;
			}
			for (int i = 0; i < arr.length*3; i++) {
				int n1 = ran.nextInt(arr.length);
				int n2 = ran.nextInt(arr.length);
				int temp = arr[n1];
				arr[n1] = arr[n2];
				arr[n2] = temp;
			}
			for (int i = 0; i < arr.length; i++) {
				row1 += "\t" + 10 + "\t\t";
				row2 += "-\t" + arr[i] + "\t\t";
				cnt++;
				if (cnt == 5) {
					cnt = 0;
					result += row1 + "\n" + row2 + "\n\n\n";
					row1 = row2 = "";
				}
				if (k==1 && i == 5) break;
			}
		}
		System.out.print(result);
		
	} // end of add2_3_sub3()
	
	/** 덧셈3_ : 한자리 + 한자리 = 두자리 10~20, 세로연산, 5열x7행=35문 */
	public static void add3_() {
		String result = "";
		int max = 20; // 합한 결과의 최대값
		int min = 10; // 합한 결과의 최소값
		for (int i = 0; i < 7; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				while(true) {
					int a = ran.nextInt(9)+1; // 1자리 1~9
					int b = ran.nextInt(9)+1; // 1자리 1~9
					int sum = a + b;
					if (min <= sum && sum <= max) {
						row1 += "\t" + a + "\t\t";
						row2 += "+\t" + b + "\t\t";
						break;
					}
				}
			}
			result += row1 + "\n" + row2 + "\n\n\n";
		}
		System.out.print(result);
	} // end of add3()
	
	/** 덧셈3 : 한자리 + 한자리 = 두자리 10~20, 세로연산, 5열x6행=30문 */
	public static void add3() {
		String result = "";
		int max = 20; // 합한 결과의 최대값
		int min = 10; // 합한 결과의 최소값
		for (int i = 0; i < 6; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				while(true) {
					int a = ran.nextInt(9)+1; // 1자리 1~9
					int b = ran.nextInt(9)+1; // 1자리 1~9
					int sum = a + b;
					if (min <= sum && sum <= max) {
						row1 += "\t" + a + "\t\t";
						row2 += "+\t" + b + "\t\t";
						break;
					}
				}
			}
			result += row1 + "\n" + row2 + "\n\n\n";
		}
		System.out.print(result);
	} // end of add3()
	
	/** 덧셈2 : 한자리 + 한자리 = 한자리 2~10, 세로연산, 5열x6행=30문 */
	public static void add2() {
		String result = "";
		int max = 10; // 합한 결과의 최대값
		int min = 5; // 합한 결과의 최소값
		for (int i = 0; i < 6; i++) {
			String row1 = "";
			String row2 = "";
			for (int j = 0; j < 5; j++) {
				while(true) {
					int a = ran.nextInt(9)+1; // 1자리 1~9
					int b = ran.nextInt(9)+1; // 1자리 1~9
					int sum = a + b;
					if (min <= sum && sum <= max) {
						row1 += "\t" + a + "\t\t";
						row2 += "+\t" + b + "\t\t";
						break;
					}
				}
			}
			result += row1 + "\n" + row2 + "\n\n\n";
		}
		System.out.print(result);
	} // end of add2()
	
	/** 덧셈1 : 한자리 + 한자리 = 한자리 2~5 */
	public static void add1() {
		int max = 15; // 합한 결과의 최대값
		int min = 4; // 합한 결과의 최소값
		num *= 2; // 두 줄로 할려고
		while(0 < num) {
			int a = ran.nextInt(9)+1; // 1자리
			int b = ran.nextInt(9)+1; // 1자리
			int sum = a + b;
			if (min <= sum && sum <= max) {
				if (num % 2 == 0) System.out.print(a+"\t+\t"+b+"\t=\t\t\t\t\t");
				else System.out.println(a+"\t+\t"+b+"\t=\n");
				num--;
			}
		}
	} // end of add1()
} // end of class
