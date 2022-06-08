package collection_framwork;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		/*
		 * Set 계열 객체를 활용하여 로또 번호 생성기 작성(정렬은 선택)
		 * 1. Set 타입 객체 myLotto 생성
		 * 2. 1 ~ 45 사이의 중복되지 않는 난수(로또번호) 6개를 Set 객체에 저장
		 *    => ex) "나의 로또 번호 : 10 11 15 23 41 43" 출력
		 * ----------------------------------------------------------------
		 * 3. 이번주 로또 1등 당첨 번호를 Set 객체 thisWeekLotto 에 저장
		 *    => ex) "이번주 1등 당첨번호 : 7 8 11 13 15 23" 출력
		 * 4. 기존의 myLotto 에 저장된 번호와 1등 당첨번호를 비교하여
		 *    일치하는 번호 개수와 등수 출력
		 *    => ex) 번호가 3개(11, 15, 23) 일치 시
		 *           "일치하는 번호 개수 : 3개(4등)"
		 *    => 6개 일치: 1등, 5개: 2등, 4개: 3등, 3개: 4등, 나머지는 꽝
		 */
		
		// Set 객체(myLotto, thisWeekLotto) 생성
		// => 만약, 정렬까지 수행하려면 TreeSet 객체 생성
		// ------------------------------------------------------------------
		// < thisWeekLotto 생성 시 참고 >
		// 1) 객체 생성 후 add() 메서드 활용
		// 2) 객체 생성 시 파라미터값 으로 "Arrays.asList(1,2 ...)" 활용
		// ------------------------------------------------------------------
		// < myLotto 생성 시 참고 >
		// - 난수 생성 시 java.util.Random 활용
		// - 주의할 점! 난수 생성 시 중복값이 있을 수 있음. 여기에 대한 해결 필요.
		//   힌트) 반복을 통해서 난수를 생성 시 중복이 발생하면 반복 횟수를 +1회가 되지 않도록 설정
		
//		Set<Integer> thisWeekLotto = new TreeSet<Integer>();
//		thisWeekLotto.add(7);
//		thisWeekLotto.add(8);
//		thisWeekLotto.add(11);
//		thisWeekLotto.add(13);
//		thisWeekLotto.add(15);
//		thisWeekLotto.add(23));
		
		Set<Integer> thisWeekLotto = new TreeSet<Integer>(Arrays.asList(7, 8, 11, 13, 15, 23));
		System.out.println("이번주 로또 1등 번호 : " + thisWeekLotto);
		
		Set<Integer> myLotto = new TreeSet<Integer>();
		
		// 1 ~ 45 사이의 난수(로또번호) 6개를 중복되지 않는 범위에서 저장
		Random r = new Random();
		for(int i = 1; i <= 6; i++) {
			int rNum = r.nextInt(45) + 1;
						
//			if(myLotto.contains(rNum)) { // myLotto 객체에 난수 rNum이 있으면
//				System.out.println("중복되는 번호 발생! - " + rNum);
//				// 중복 번호가 발생했으므로 카운팅을 하지 않도록 i를 1 감소
//				i--;
//			} else {
//				myLotto.add(rNum);
//			}
			
			if(!myLotto.add(rNum)) { // add() 메서드의 리턴값이 boolean, 추가되면 true 중복이면 false
				System.out.println("중복되는 번호 발생! - " + rNum);
				i--;
			} 
			
		}
		
		System.out.println("나의 로또 번호 : " + myLotto);
		
		/* 4. 기존의 myLotto 에 저장된 번호와 1등 당첨번호를 비교하여
		 *    일치하는 번호 개수와 등수 출력
		 *    => ex) 번호가 3개(11, 15, 23) 일치 시
		 *           "일치하는 번호 개수 : 3개(4등)"
		 *    => 6개 일치: 1등, 5개: 2등, 4개: 3등, 3개: 4등, 나머지는 꽝
		 */
		// 당첨번호가 일치하면 증가시킬 count 변수 선언 및 초기화
		int count = 0;
//		// 1. 향상된 for문 사용
//		for(int num : myLotto) { // 나의 로또 번호에서 번호 1개 꺼내기
//			// 꺼낸 번호와 1등 당첨 번호를 비교
//			if(myLotto.contains(num)) {
//				count++;
//			}
//		}
		
		// 2. Iterator 사용
		// 1) Iterator 객체 생성
		// 2) while문 사용 .hasNext(), .next() 메서드 활용
		Iterator<Integer> ite = myLotto.iterator();
		while(ite.hasNext()) {
			int num = ite.next();
			
			// 꺼낸 번호가 1등 당첨 번호를 비교
			if(thisWeekLotto.contains(num)) {
				count++;
			}
		}
		
		System.out.println(count);
		
		// ================================================================
		// 카운팅 결과에 따른 로또 추첨 결과 출력
		switch(count) {
			case 6 : System.out.println("1등!"); break;
			case 5 : System.out.println("2등!"); break;
			case 4 : System.out.println("3등!"); break;
			case 3 : System.out.println("4등!"); break;
			default : System.out.println("꽝!");
			
		}

		
		
		
		
		
		
	}

}
