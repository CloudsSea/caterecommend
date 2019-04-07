package edu.njtu.service.impl;

import edu.njtu.httpbody.review.*;
import edu.njtu.service.ReviewService;
import org.springframework.stereotype.Service;
@Service("reviewService")
public class ReviewServiceImpl implements ReviewService{

    @Override
    public ReviewListDBody getReviewList(ReviewListABody reviewListABody) {
        return null;
    }

    @Override
    public ReviewDetailDBody reviewDetail(ReviewDetailABody reviewDetailABody) {
        return null;
    }

    @Override
    public ReviewInsertDBody reviewInsert(ReviewInsertABody reviewInsertABody) {
        return null;
    }

    @Override
    public ReviewUpdateDBody reviewUpdate(ReviewUpdateABody reviewUpdateABody) {
        return null;
    }
}
