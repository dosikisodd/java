package classes;

import java.util.Date;

import users.User;

public class Comment {
	User author;
	String text;
	Date date;
	public Comment(User author, String text, Date date) {
		super();
		this.author = author;
		this.text = text;
		this.date = date;
	}
	
	
	
}
