package view;

import model.Data;

public class StartView {

	public static void main(String[] args) {
		Data data = new Data();
		EndView view = new EndView();
		view.print(data.setBookTitle("별나라"));
		view.print(data.setBookAuthor("차왕현"));
		view.print(data.setBookBirthDay(2020));
	}
}