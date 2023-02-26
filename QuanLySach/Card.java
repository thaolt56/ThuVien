
public class Card {
	
	private	Student student;
	private int borrowDay;
	private int paymentDay;
	private String bookId;
	private String id;
	
	public Card(Student student, int borrowDay, int paymentDay, String bookId, String id) {
		
		this.student = student;
		this.borrowDay = borrowDay;
		this.paymentDay = paymentDay;
		this.bookId = bookId;
		this.id= id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getBorrowDay() {
		return borrowDay;
	}

	public void setBorrowDay(int borrowDay) {
		this.borrowDay = borrowDay;
	}

	public int getPaymentDay() {
		return paymentDay;
	}

	public void setPaymentDay(int paymentDay) {
		this.paymentDay = paymentDay;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id= id;
	}

	@Override
	public String toString() {
		return "Card [student=" + student + ", borrowDay=" + borrowDay + ", paymentDay=" + paymentDay + ", bookId="
				+ bookId + ", book=" + id + "]";
	}
	
	
}
