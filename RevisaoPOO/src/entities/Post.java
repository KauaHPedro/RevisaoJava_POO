package entities;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import utilitaries.ConversoresDataHora;

public class Post {
	
	private Instant moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post(Instant moment, String title, String content, Integer likes) {
		
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	
	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		if (comments.contains(comment)) {
			comments.remove(comment);
		} else {
			System.out.println("Comentário não encontrado");
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes + " Likes - ");
		sb.append(LocalDateTime.ofInstant(moment, ZoneId.systemDefault()).
				format(ConversoresDataHora.diaMesAnoHora()) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		
		for (Comment comment : comments) {
			sb.append(comment.getText() + "\n");
		}
		
		return sb.toString();
	}


}
