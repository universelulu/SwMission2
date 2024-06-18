package finalMission2;

import java.util.Arrays;

public class PerformanceTest {

	public static void main(String[] args) {
		
		Book[] test_BookArray = new Book[1000000]; // 100만개의 원소를 갖는 객체 배열 생성
		
		for(int i=0;i<test_BookArray.length;i++) // index와 동일한 id를 책마다 부여
		{
			test_BookArray[i] = new Book(i,"Book " + i)
		}
		
		
		long StartTime = System.currentTimeMillis();  // 시작 시간
		BookSearch.search_bs(test_BookArray, 300000); // id가 300000인 Book 객체를 이진 탐색하는 search_bs() 함수 실행
		long EndTime = System.currentTimeMillis();    // 마감 시간
		
		long DiffTime = EndTime - StartTime; // 실행 시간 계산
		
		System.out.println("실행 시간(ms): " + DiffTime);
	}

}
