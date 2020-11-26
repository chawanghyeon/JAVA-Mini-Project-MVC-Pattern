package model.domain;

public class Book {
	String title;
	String author;
	int birthDay;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		if(birthDay > 2019) {
			this.birthDay = birthDay;
		}else {
			System.out.println("무효한 출판년도");
		}
	}
	public String toString() {
		return title + " " + author + " " + birthDay;
	}
}
