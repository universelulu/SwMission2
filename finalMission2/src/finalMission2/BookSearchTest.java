package finalMission2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookSearchTest {

   @Test
   void testSearch_bs() {
      
	  // Junit test를 위한 Book 클래스 객체 배열 생성
      Book[] bookArray = {
            new Book(1,"잠 못드는 밤"),
            new Book(2,"한 여름밤의 꿈"),
            new Book(3,"잘자요 굿나잇"),
            new Book(4,"뉴페이스"),
            new Book(5,"라라라")
      };
      
      System.out.println("함수 테스트 시작");
      
      Book book1 = BookSearch.search_bs(bookArray,2); // 범위 내에 있는 id 2 검색 (검색 성공)
      assertNotNull(book1);
      assertEquals(2,book1.GetId());
      assertEquals("한 여름밤의 꿈",book1.GetTitle());
      System.out.println(book1 + " 검색 성공!");
      
      Book failbook = BookSearch.search_bs(bookArray,6); // 범위를 벗어난 id 6 검색 (검색 실패)
      assertNull(failbook);
      System.out.println("검색 실패!");
   }
}
