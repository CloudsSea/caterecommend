package edu.njtu.service.impl;

import com.github.pagehelper.PageHelper;
import edu.njtu.httpbody.review.*;
import edu.njtu.mapper.ReviewMapper;
import edu.njtu.model.Review;
import edu.njtu.model.ReviewExample;
import edu.njtu.service.ReviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("reviewService")
public class ReviewServiceImpl implements ReviewService{
    @Resource
    private ReviewMapper reviewMapper;

    @Override
    public ReviewListDBody getReviewList(ReviewListABody reviewListABody) {
        ReviewExample example = new ReviewExample();
        PageHelper.startPage(reviewListABody.getPageNo(),reviewListABody.getPageSize(),false);
        List<Review> reviewList =  reviewMapper.selectByExample(example);
        ReviewListDBody dBody = new ReviewListDBody();
        dBody.setReviewList(reviewList);
        return dBody;
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
