package finalMission2;

import java.util.Arrays;

public class BookSearch {
   
   public static Book search_bs(Book[] books, int BookId)
   {
      Arrays.sort(books,(b1,b2) -> Integer.compare(b1.GetId(), b2.GetId())); // 이진 탐색을 위해 id를 기준으로 오름차순 정렬
      int left= 0;
      int right= books.length-1;
      
      while(left<=right)
      {
         int midIndex = (right-left) / 2;
         
         if(books[midIndex].GetId() == BookId)
         {
            return books[midIndex];
         }
         
         else if(books[midIndex].GetId() < BookId)
         {
            left++;
         }
         
         else
         {
            right--;
         }
      }
      
      return null; // 찾지 못하였으면 null 값 반환
   }

}

