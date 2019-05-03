package edu.njtu.httpbody.review;

import edu.njtu.httpbody.PageDBody;
import edu.njtu.model.Review;

import java.util.List;

public class ReviewListDBody extends PageDBody {
    List<Review> reviewList;

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }
}
