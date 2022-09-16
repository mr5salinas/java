package project;

public class Practice0 {
	public static void main(String[] args) {
		String name = "John", name2 = "alva";
		// Se pueden declarar dos variables tal que así:
		// IMPORTANT TO DECLARE NUMBERS USE INT AND FOR TEXT, STRING
		System.out.println(name2);
		System.out.println(name);
		int myNum = 15;
		System.out.println(myNum);
		/*
		 * Para declarar una variable númerica, ponemos int en vez de string.
		 */
		int myNum0;

		myNum0 = 1800;
		System.out.println(myNum0);
		/*
		 * También existe la posibilidad de usar final int, en caso de ser un número
		 * absoluto
		 */
		System.out.println("Hello " + name);
		String firstName = "Miguel";
		String lastName = " Doe";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		int x = 8;
		int y = 5;
		System.out.println(x + y);
		// Declarar el mismo valor a muchas variables
		int x0, y0, z;
		x0 = y0 = z = 50;
		System.out.println(x0 + y0 + z);
		// Byte es una variable númerica para números entre -128 y 127
		byte myByteNum = 127;
		System.out.println(myByteNum);
		// Short is for numbers between -32768 to 32767
		short myShortNum = 8500;
		System.out.println(myShortNum);
		// Int is for numbers between -2147483648 to 2147483647
		int myIntNum = 100000;
		System.out.println(myIntNum);
		// Long is for numbers between -9223372036854775808 to 9223372036854775807
		long myLongNum = 150000000L;
		System.out.println(myLongNum);
		// Float and double variables are for decimals
		float myFloatNum = 5.75f;
		System.out.println(myFloatNum);
		double myDoubleNum = 19.99d;
		System.out.println(myDoubleNum);
		// For scientist numbers
		float f1 = 35e3f;
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);
		// Boolean values are used for conditional testing, what I don't know right now
		// but well
		// The char data type is used to store a single character. The character must be
		// surrounded by single quotes, like 'A' or 'c':
		char myGrade = 'B';
		System.out.println(myGrade);
		// A simple math methods
		int sum1 = 100 + 50; // 150 (100 + 50)
		int sum2 = sum1 + 250; // 400 (150 + 250)
		int sum3 = sum2 + sum2; // 800 (400 + 400)
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		// For calculating the lenght of the text
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		String txt0 = "Hello World";
		System.out.println(txt0.toUpperCase()); // Outputs "HELLO WORLD"
		System.out.println(txt0.toLowerCase()); // Outputs "hello world"
		// indexOf() returns the position of the first case of a specified text in a
		// string, including whitespaces
		// Also, Java start counting positions from zero, I mean, 0 is the first
		// position in a string
		String txt1 = "Please locate where 'locate' occurs!";
		System.out.println(txt1.indexOf("locate")); // Outputs 7
		// You can put just a whitespace in the string
		String firstName0 = "John";
		String lastName0 = "Doe";
		System.out.println(firstName0 + " " + lastName0);
		// Also, you can concatenate two strings
		System.out.println(firstName0.concat(lastName0));
		// Another type of concatenate
		int num10 = 80;
		if (num10 < 18) {
			System.out.println("Falva");

		} else {
			System.out.println("Not Falva");
		}
		// Here we have declare the one of the if's or won't work
		if (num10 < 10) {
			System.out.println("Qalva");
		} else if (num10 < 20) {
			System.out.println("Not Qalva");
		} else {
			System.out.println("The last two if's aren't complying, so else gets returned");
			// We put if, else if and else, if and ifelse aren't complying, else gets
			// returned
			// There's a form to simply if and else:
		}
		String result = (num10 < 20) ? "Good Alva." : "Good Falva.";
		System.out.println(result);
		int day = 4;
		// We've to remember, the numbers are declared with int
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 5);
		// By some reason, 'xx' means a constant addition until a number behind the one
		// you put it in the while
		for (int i0 = 0; i0 < 5; i0++) {
			System.out.println(i0);
		}
		// A for, it's an if simplify
		// Other example for 'for'
		for (int i1 = 0; i1 <= 10; i1 = i1 + 2) {
			System.out.println(i1);
		}
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String i2 : cars) {
			System.out.println(i2);
		}
		// At the moment, I don't understand this (???)
		for (int i3 = 0; i3 < 10; i3++) {
			if (i3 == 4) {
				break;
			}
			System.out.println(i3);
		}
		// With this, we put a for and a if, so the number will stop at what we put in
		// the if, in this case 4
		for (int i4 = 0; i4 < 10; i4++) {
			if (i4 == 4) {
				continue;
			}
			System.out.println(i4);
		}
		// Exactly the same, but the "continue" let the operation continues excepting
		// the number that I specify
		String[] cars1 = { "Volvo", "BMW", "Ford", "Mazda" };
		System.out.println(cars1[0]);
		// Outputs Volvo
		String[] cars11 = { "Volvo", "BMW", "Ford", "Mazda" };
		System.out.println(cars11.length);
		// Outputs 4
	}
}
/*
 * Otros ejemplos de variables son int myNum = 5; float myFloatNum = 5.99f; char
 * myLetter = 'D'; boolean myBool = true; String myText = "Hello"; Los cuales ya
 * veré como se hacen
 */