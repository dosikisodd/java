package classes;

import java.util.Vector;

import enums.NewsType;

public class News {
	String title;
	NewsType type;
	Vector<Comment> comments = new Vector<Comment>();
	
	public News(String title, NewsType type, Vector<Comment> comments) {
		this.title = title;
		this.type = type;
		this.comments = comments;
	}
}
