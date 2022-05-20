package fr.eni.filmotheque.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.filmotheque.bo.Review;

@Repository
public class ReviewDaoImpl implements ReviewDao 
{
	private List<Review> reviews;
	
	public ReviewDaoImpl() 
	{
		reviews = new ArrayList<Review>();
				
		Review reviewsTmp;
		
		reviewsTmp = new Review("Super Film", 4, LocalDateTime.of(1990, 1, 10, 11, 12));
		reviewsTmp.setId(1l);
		reviews.add(reviewsTmp);
		
		reviewsTmp = new Review("Bof un bon gros navet", 1, LocalDateTime.of(1992, 2, 22, 12, 13));
		reviewsTmp.setId(2l);
		reviews.add(reviewsTmp);
		
		reviewsTmp = new Review("Trop cool", 3, LocalDateTime.of(1993, 3, 23, 13, 14));
		reviewsTmp.setId(3l);
		reviews.add(reviewsTmp);
		
		reviewsTmp = new Review("bien, à revoir", 2, LocalDateTime.of(1994, 4, 24, 14, 15));
		reviewsTmp.setId(4l);
		reviews.add(reviewsTmp);
	}

	@Override
	public List<Review> selectReviews() 
	{
		return this.reviews;
	}

	@Override
	public Review selectReviewById(long id) 
	{
		return reviews.get(((int)id));
	}

	@Override
	public void insertReview(Review review) 
	{
		this.reviews.add(review);
	}
}
