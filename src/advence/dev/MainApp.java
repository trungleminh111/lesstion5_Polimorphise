package advence.dev;

import java.util.Scanner;

import advence.dev.models.students;
import advence.dev.models.teacher;

public class MainApp {
	public static void main(String[] args) {
		Person arr[] = new Person[5];
		Scanner sc = new Scanner(System.in);
		int n =3;
		System.out.println("nhap vao hoc sinh");
		for (int i = 0; i <=5; i++) {
			System.out.println("nhap vao sinh vien thu:"+ (i+1));
			System.out.println("nhap ten");
			String name = sc.nextLine();
			System.out.println("nhap tuoi");
			int old = sc.nextInt();
			sc.nextLine();
			arr[i]= new teacher(name, old);
		}
		//nhap 3 sinh vien
		for (int i = 2; i < 5;i++) {
			System.out.println("nhap ten sinh vien thu");
			System.out.println("nhap ten");
			String name = sc.nextLine();
			System.out.println("nhap tuoi");
			int old = sc.nextInt();
			sc.nextLine();
			arr[i] = new students(name, old);
	}

}
}