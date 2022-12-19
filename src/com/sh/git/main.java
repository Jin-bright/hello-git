package com.sh.git;

/**
 * 되돌리기 
 * - revert : 지정한 커밋의 작업내용을 취소한 버전을 새로운 커밋으로 만든다.  (충돌날수있음 )   
 * - reset : 지정한 커밋으로 돌아간다.
 * 	 -hard : 지정커밋이후 변경사항 버림 
 * 	 -mixed : 지정커밋이후변경사항을 unstaging area에 보관. 재추가 후 커밋 가능  
 *   -soft : 지정 커밋이후 변경사항을 staging area에 보관 (즉시커밋가능) 
 *
 */

public class main { 
	public void master() {  // 이러면 feature랑 충돌안날거같은데 
		System.out.println("master !!! ");
	}

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Hello git");
	}
	
	public void feature() { //충돌나는 상황 
		System.out.println("feeeeeture !!!!!!!! ");
	}

}
