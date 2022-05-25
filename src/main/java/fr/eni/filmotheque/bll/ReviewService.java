package fr.eni.filmotheque.bll;

import java.util.List;

import fr.eni.filmotheque.bo.Review;

public interface ReviewService 
{
	public List<Review> 	getReviews();
	public Review 			getReviewById(Integer id);
	public void 			insert(Review review);
}
