package fr.eni.filmotheque.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Review;
import fr.eni.filmotheque.dao.ReviewRepository;

@Service
public class ReviewsServiceImpl implements ReviewService
{
	private ReviewRepository ReviewDao;
	
	@Autowired
	public ReviewsServiceImpl(ReviewRepository filmsDao) {
		this.ReviewDao = filmsDao;
	}

	@Override
	public List<Review> getReviews() {
		return this.ReviewDao.findAll();
	}

	@Override
	public Review getReviewById(Integer id) {
		return this.ReviewDao.getById(id);
	}

	@Override
	public void insert(Review review) {
		this.ReviewDao.save(review);		
	}	
}
