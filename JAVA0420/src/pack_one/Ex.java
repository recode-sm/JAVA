package pack_one;

import java.util.Random;
import pack_two.*;
import pack_two.ExPack;
import pack_three.*;

public class Ex {

	public static void main(String[] args) {
		/*
		 * package(패키지)
		 * - 윈도우의 폴더, 리눅스의 디렉터리에 해당하는 개념
		 * - 자바의 클래스 파일들을 모아놓은 공간
		 *   => 서로 다른 패키지에는 같은 이름의 클래스가 각각 따로 존재 가능
		 *     (같은 이름의 파일이 서로 다른 폴더에 존재할 수 있는 것과 같음)
		 *      = 같은 이름의 클래스가 같은 패키지에 존재할 수 없음!!
		 * - 자바에서 패키지를 생성하면, 실제 폴더 구조로 된 패키지가 생성됨
		 * - 특정 클래스 파일은 하나의 패키지'만' 소속될 수 있음
		 * - 자바의 모든 클래스는 클래스명 앞에 패키지명을 기술하여 표기
		 *   => 상위패키지명.하위패키지명.클래스명 형태로 지정
		 *   => 패키지명이 중복되지 않도록 하려면 도메인 네임을 사용
		 *     (단, 도메인 네임을 최상위도메인부터 역순으로 지정)
		 *     
		 * package 키워드
		 * - 특정 클래스 파일 첫 번째 라인에 해당 클래스가 소속된 패키지명 명시
		 * - 실제 클래스 파일의 위치와 패키지명이 다를 경우 오류 발생
		 * - 반드시 주석을 제외한 첫 번째 라인에서 사용
		 *   => 클래스 내에서 단 한 번만 사용 가능    
		 * - 패키지 키워드 사용 기본 문법
		 *   소스코드 첫 번째 라인에서
		 *   package 패키지명;
		 *    
		 * import 키워드
		 * - 원래 클래스 이름 지정 시 패키지명.클래스명 형태로 지정해야 하지만
		 *   특정 패키지를 자주 사용하는 경우 import 문을 사용하여
		 *   해당 패키지와 클래스명을 지정할 경우 패키지명을 생략 가능함.
		 *   (단, 같은 패키지 내의 클래스는 패키지명을 생략 가능!)   
		 * - java.lang 패키지는 유일하게 import 없이도 생략 가능한 패키지
		 *   => 그 외의 모든 패키지는 반드시 위치 정보가 필요함.
		 * - import 문은 패키지명보다 아래쪽, 클래스 선언부보다 윗쪽에 위치하며
		 *   package 문과 달리 여러번 작성 가능
		 * - import 문 뒤에 패키지명과 클래스명을 지정하여 등록하며,
		 *   클래스명 대신 만능문자(*) 를 지정할 경우
		 *   해당 패키지 내의 모든 클래스를 다 포함시킴
		 * - 자동 import 단축기 : Ctrl + Shift + O
		 *   => 만약, 중복되는 이름이 서로 다른 패키지에 존재할 경우
		 *      클래스를 선택하는 창이 표시되므로 클래스 선택하면 됨!
		 *      
		 * < import 키워드 사용 기본 문법 >
		 * 1. import 패키지명.클래스명;
		 * 2. import 패키지명.*;     
		 *  
		 */
		
		// java.lang 패키지에 위치한 String 클래스를 지정하는 방법(정석)
		// => 패키지명을 명시하고 마침표(.)를 붙인 뒤 클래스명을 지정함
		java.lang.String str; // java.lang 패키지의 String 클래스 선언
		// java.lang 패키지는 생략 가능한 패키지 이름이므로 클래스명만 지정 가능
		String str2; // java.lang 패키지명 생략 가능
		
		// java.lang 패키지 외의 나머지 패키지명을 생략할 경우
//		Random r; // 컴파일 에러 발생!
		// Random cannot be resolved to a type
		// java.util 패키지의 Random 클래스는 생략 불가능한 패키지명이므로
		// 1. 클래스명 앞에 java.util 패지키명을 명시
		java.util.Random r;
		
		// 2. 클래스가 포함된 패키지를 import 문으로 지정할 경우
		// 패지명을 생략하고 클래스명만 사용 가능
		Random r2;
		
		Ex ex = new Ex();
		
		// 만약, 서로 다른 패키지에 동일한 클래스가 존재할 경우
		// import 문을 통해 포함시키더라도 각 클래스 구분을 위해
		// 최소 하나의 클래스는 패키지명까지 명시해야 한다!
		// => 단, 실제 작성 시 명확한 구분을 위해 둘 다 패키지명을 명시하는게 좋음
		ExPack ex2 = new ExPack();
		pack_three.ExPack ex3;
		
		// import pack_two.*;
		// import pack_three.*;
		// 모든 클래스를 뜻하는 *로 import 하면 The type ExPack is ambiguous
		// => ambiguous : 애매모호한 
		
		Person p = new Person();
		p.setName("홍길동");
		System.out.println(p.getName());
 
				
	}

}






