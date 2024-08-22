package hw2;

public class Homework2 {


//• 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
	public static void main(String[] args) {
	int a, sum1 = 0;
	for (a = 2; a <= 1000; a++) {
	if (a % 2 == 0) {sum1 += a;
			        }
	 }
	System.out.println("1～1000的偶數和=" + sum1);
	
//• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
	int b, sum2 = 1;
	for (b = 1; b <= 10; b++) {
		sum2 *= b;
	}
	System.out.println("1～10的連乘積=" + sum2);
		
//• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
	int c = 1, sum3 = 1;
	while (c <= 10) {
		sum3 *= c;
		c++;
	}
	System.out.println("1～10的連乘積=" + sum3);
//• 請設計一隻Java程式，輸出結果為以下：
//  1 4 9 16 25 36 49 64 81 100
	int x, y=1;
	for (x=1; y<100; x++) {
		y = (int) Math.pow(x,2);
		System.out.print(y + " ");
	}
	
	System.out.println();

	}
	
	
}


