package hw1;

public class Homework1 {

//      1.請設計一隻Java程式,計算12,6這兩個數值的和與積
	
	    public static void main(String[] args) {
		int num1 = 12;
		int num2 = 6;
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);

//      2.請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
		
		int egg = 200;
		int dozen = 12;
		int num3 = egg / dozen;
		int num4 = egg % dozen;
		System.out.println("雞蛋共" + num3);
		System.out.println("雞蛋餘數" + num4);

//      3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒	

		// 輸入的秒數
		int totalSeconds = 256559;

		// 計算每天的秒數
		int secondsInDay = 86400; // 24 * 60 * 60
		int days = totalSeconds / secondsInDay;

		// 計算剩餘秒數
		int remainingSecondsAfterDays = totalSeconds % secondsInDay;

		// 計算小時數
		int secondsInHour = 3600; // 60 * 60
		int hours = remainingSecondsAfterDays / secondsInHour;

		// 計算剩餘秒數
		int remainingSecondsAfterHours = remainingSecondsAfterDays % secondsInHour;

		// 計算分鐘數
		int secondsInMinute = 60;
		int minutes = remainingSecondsAfterHours / secondsInMinute;

		// 計算剩餘秒數
		int seconds = remainingSecondsAfterHours % secondsInMinute;

		// 輸出結果
		System.out.println(totalSeconds + "秒等於 " + days + " 天 " + hours + " 小時 " + minutes + " 分鐘 " + seconds + " 秒");

//      4.請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		
		double r = 5;
		double pi = 3.1415;
		System.out.println("圓面積" + r * r * pi);
		System.out.println("圓周長" + r * 2 * pi);

//      5.某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//      金加利息共有多少錢 (用複利計算，公式請自行google)
//		【複利公式】FV ＝ PV×（1 ＋ R）n 次方FV 為期末本利和，PV 為期初本金，R 為每期利率，n 為期數
//		　　也就是--期末本利和＝期初本金×（1＋利率）期數次方。
		 double pv= 1500000;
		 double r1 = 0.02;
		 double n = 10 ;
		 double fv;
		 fv = pv * Math.pow(1+r1,n);
		 System.out.println ("10年後本金加利息共多少錢" + fv);
		 
//		 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		 5 + 5
//		 5 + ‘5’
//		 5 + “5” 
		 
		 int a=5;
		 String b = "5";
		 
		 //宣告數字a為五加五，所以答案為10。
		 System.out.println(a+a);
		 //'5'是字符類型，因此實際在Unicode表格的值是53,53加五等於58。
		 System.out.println(a+'5');
		 //"5"用文字串接的方式，因此5+"5"=55。
		 System.out.println(a + b);
		 
		
		
	}

}