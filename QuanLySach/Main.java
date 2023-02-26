import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ManegerBook cards = new ManegerBook();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Tuỳ chọn phím tương ứng với menu :");			
			System.out.println("1.Nhập vào thông tin thẻ mới : ");
			System.out.println("2.Xoá thông tin thẻ qua Id ");
			System.out.println("3.Hiện danh sách thẻ hiện tại  ");
			
			System.out.println("----------------------");
			System.out.println("nhập vào phím tương ứng :");
			String line = sc.nextLine();
			switch (line) {
			case "1": {
				System.out.println("nhap vao ten hoc sinh: "); String name = sc.nextLine();
				System.out.println("nhap vao tuoi hoc sinh "); int age = sc.nextInt(); 
				sc.nextLine();
				System.out.println("nhap vao lop cua hoc sinh "); String school = sc.nextLine();
				
				Student student = new Student(name, age, school);
				System.out.println("nhap vao ma card:"); String id = sc.nextLine();
				System.out.println("nhap vao ma sach");String bookId = sc.nextLine();
				System.out.println("nhap vao ngay muon: "); int borrow = sc.nextInt();
				System.out.println("nhap vao ngay tra: "); int payment = sc.nextInt();
				
				Card card = new Card(student, borrow, payment, bookId, id);
				
				cards.addCard(card);
				
			}case "2": {
				System.out.println("nhap vao id Card de xoa the");
				String id = sc.nextLine();
				cards.delCard(id);
			}case "3": {
				System.out.println("danh sach the: ");
				cards.show();
			}
			default:
				System.out.println("không đúng chức năng ");
				continue;
			}
			
			
		}
	}
}
