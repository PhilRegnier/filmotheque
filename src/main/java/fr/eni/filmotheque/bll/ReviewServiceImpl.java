package fr.eni.filmotheque.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Review;
import fr.eni.filmotheque.dao.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {

	private ReviewRepository reviewRepository;
	
	@Autowired
	public ReviewServiceImpl(ReviewRepository reviewRepository) 
	{
		this.reviewRepository = reviewRepository;
	}
	
	@Override
	public List<Review> getReviews() {
		return this.reviewRepository.findAll();
	}

	@Override
	public Review getReviewById(Integer id) {
		return this.reviewRepository.getById(id);
	}

	@Override
	public void insert(Review review) {
		this.reviewRepository.save(review);		
	}

}
