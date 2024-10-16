package com.yash.parkingallocationsystem.model;

public class Feedback {
	private int id;                     // Unique identifier for the feedback
	private int userId;                 // ID of the user who provided the feedback
	private String comments;             // User's comments
	private int rating;                  // Rating given by the user (1-5)

	// Constructor
	public Feedback() {}

	public Feedback(int id, int userId, String comments, int rating) {
		this.id = id;
		this.userId = userId;
		this.comments = comments;
		this.rating = rating;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Feedback{" +
				"id=" + id +
				", userId=" + userId +
				", comments='" + comments + '\'' +
				", rating=" + rating +
				'}';
	}
}
