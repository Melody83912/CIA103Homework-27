package hw2;

public class Homework2_1 {
	public static void main(String[] args) {
		//阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		   
		  int lottery = 0,count= 0;
		  for(lottery = 1;lottery <= 49;lottery++) {
		    
		   if(lottery %10 == 4 || lottery /10 == 4) {
		    continue;
		   }else {
		    count++;
		   }
		  }
		   System.out.println("共有"+count+"個");
		//請設計一隻Java程式，輸出結果為以下：
		//1 2 3 4 5 6 7 8 9 10
		//1 2 3 4 5 6 7 8 9
		//1 2 3 4 5 6 7 8
		//1 2 3 4 5 6 7
		//1 2 3 4 5 6
		//1 2 3 4 5
		//1 2 3 4
		//1 2 3
		//1 2
		//1
		   
		  int a = 0,b = 0;
		  for(a = 10;a >= 0;a--) {
		   for(b = 1;b <= a;b++) {
		    System.out.print(b+" ");
		   }
		   System.out.println();
		  }
		  
		//請設計一隻Java程式，輸出結果為以下：
		//A
		//BB
		//CCC
		//DDDD
		//EEEEE
		//FFFFFF
		  
		  
		//1.
		  int c = 0;
		  char d = '\u0040';
		  
		  for(c = 1;c <= 6;c++) {
		   ++d;
		   for( int e = 1;e <= c;e++) {
		    System.out.print(d);
		   }
		   System.out.println();
		   }
		//2.   
		  int p = 6;
		  for(int row = 0;row < p;row++) {
		   char q = (char)(row + 65);
		   for(int col = row +1;col > 0;col--) {
		    System.out.print(q);
		   }System.out.println();
		  }
	}
}