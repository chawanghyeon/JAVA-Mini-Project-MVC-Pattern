package view;

import model.Data;

public class StartView {

	public static void main(String[] args) {
		Data data = new Data();
		EndView view = new EndView();
		view.print(data.setBookTitle("������"));
		view.print(data.setBookAuthor("������"));
		view.print(data.setBookBirthDay(2020));
	}
}