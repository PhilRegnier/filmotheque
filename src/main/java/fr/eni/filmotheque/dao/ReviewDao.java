package fr.eni.filmotheque.dao;

import java.util.List;

import fr.eni.filmotheque.bo.Review;

public interface ReviewDao 
{
	public List<Review>	selectReviews();	
	public Review 		selectReviewById(long id);	
	public void 		insertReview(Review review);
}
