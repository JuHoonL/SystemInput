package com.biz.input;

import java.util.Scanner;

public class SystemIn03 {

	public static void main(String[] args) {
        // InputStream input = System.in;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("제발 ..숫자입력 >> ");
		String strInput = scanner.nextLine();
		System.out.println(strInput);
	}

}
