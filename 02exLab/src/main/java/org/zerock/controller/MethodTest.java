package org.zerock.controller;

import java.util.Scanner;
import org.zerock.controller.ShowName;

public class MethodTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요. :");
		String name = sc.next();
		
		ShowName a = new ShowName();
		

		System.out.println(a.showName(name));
	}
}
