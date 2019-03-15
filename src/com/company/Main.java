package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    number z = new number();
	    operation count = new operation();

		Scanner in = new Scanner(System.in);

		System.out.println("Введіть математичну операцію: ");

		String a = in.next();
		String x = in.next();
		String b = in.next();

		int a1 = z.get_number(a);
		int a2 = z.get_number(b);

		int res = count.math_operation(a1,a2,x);

	    System.out.println("Результат:\n"+res);
    }
}
