package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException {
		
		/*
		 * * 에러 종류
		 * - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 => 스스로 해결 안됨 => 심각한 에러
		 * - 컴파일 에러 : 소스코드 문법상 오류 => 빨간줄로 애초에 오류로 알려줌 (개발자의 실수)
		 * - 런타임 에러 : 코드 상으로 문제가 없는데 프로그램 실행중에 발생하는 에러 (사용자의 실수일 수도 있고, 개발자의 실수일 수도 있다 (예외처리))
		 * 
		 * - 논리 에러 : 문법적으로 문제없고 실행했을 때도 굳이 문제는 없지만 프로그램 의도상 맞지 않는 것
		 * 
		 * 시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리 에러와 같은 비교적 덜 심각한 것들
		 * 이런 것들을 "예외"라고 함!!! => Exception
		 * 
		 * 이런 "예외"가 "발생"했을 경우에 대해서 "처리"하는 방법을 "예외처리"라고 함!!
		 * 
		 * * 예외처리를 하는 목적
		 * - 예외처리를 하지 않고 그대로 예외가 발생되는 경우 프로그램이 비정상적으로 종료될 수 있음
		 * 
		 * * 예외처리 방법
		 * 1. try ~ catch 문을 이용 (try ~ with ~ resource)
		 * 2. throws를 이용 (떠넘기기 == 위임한다)
		 */
		
		A_UncheckedException a = new A_UncheckedException();
		//a.method1();
		//a.method2();
		//a.method3();
		//a.method4();
		
		B_CheckedException b = new B_CheckedException();
		b.method1();

	}

}
