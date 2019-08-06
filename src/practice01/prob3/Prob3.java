package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		int sum = 0;
		
		// 입력 받은 숫자가 홀수인 경우에는, 0 부터 입력 값까지 홀수의 합을 출력
		if(num%2==0) {
			for(int i=2; i<=num; i+=2) {
				sum+=i;
			}
			System.out.println("결과 값 : " + sum);
		}
		// 입력 받은 숫자가 짝수인 경우에는, 0 부터 입력 값까지 짝수의 합을 출력합니다.
		else {
			for(int i=1; i<=num; i+=2) {
				sum+=i;
			}
			System.out.println("결과 값 : " + sum);
		}
		
	}
}
