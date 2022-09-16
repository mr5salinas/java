package project;

public class Practice1 {
	public static void main(String[] args) {
		// For quote words between quotation marks, you have to use slashes
		String txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);
		// For put a new line, I see there's different methods, so I use \r\n
		String txt0 = "Ho\r\nla";
		System.out.println(txt0);
		// There are different methods to find the highest or lowest value between some
		// numbers
		// For find the highest
		System.out.println(Math.max(5, 10));
		// The lowest
		System.out.println(Math.min(5, 10));
		// Sqrt is the meaning of square root, so this gives us the sqrt of a number
		System.out.println(Math.sqrt(62));
		// With Math.abs, a negative numbers returns positive
		System.out.println(Math.abs(-4.7));
		// With Math.random, a random number appears between 0,1 and 0,99
		System.out.println(Math.random());
		// To solve this, we declare the random number and multiply it by 101
		int randomNum = (int) (Math.random() * 101); // 0 to 100
		System.out.println(randomNum);
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun); // Outputs true
		System.out.println(isFishTasty); // Outputs false
		int x = 10;
		int y = 9;
		System.out.println(x > y); // returns true, because 10 is higher than 9
		System.out.println(10 == 15); // returns false, because 10 is not equal to 15
	}
}