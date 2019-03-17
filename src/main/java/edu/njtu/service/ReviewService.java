package edu.njtu.service;

import edu.njtu.httpbody.login.*;
import edu.njtu.httpbody.review.*;
import edu.njtu.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface ReviewService {
    ReviewListDBody getReviewList(ReviewListABody reviewListABody);

    ReviewDetailDBody reviewDetail(ReviewDetailABody reviewDetailABody);

    ReviewInsertDBody reviewInsert(ReviewInsertABody reviewInsertABody);

    ReviewUpdateDBody reviewUpdate(ReviewUpdateABody reviewUpdateABody);
}
