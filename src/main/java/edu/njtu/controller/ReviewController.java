package edu.njtu.controller;


import edu.njtu.httpbody.review.*;
import edu.njtu.service.ReviewService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@RequestMapping("/review")
@Controller
public class ReviewController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    public ReviewService reviewService;

    @RequestMapping("/index")
    public String login() {
        return "index";
    }

    @ResponseBody
    @RequestMapping("/getlist")
    public ReviewListDBody getReviewList(ReviewListABody reviewListABody) {
        ReviewListDBody reviewListDBody = new ReviewListDBody();
        try {
            reviewListDBody= reviewService.getReviewList(reviewListABody);

        }catch (Exception e){
            logger.error("获取评论列表错误:",e);
            //FIXME  抽象出一个过滤器,捕捉错误
            reviewListDBody.setCode("40000");
            reviewListDBody.setMsg("获取评论列表错误");
            reviewListDBody.setSubCode(e.getMessage());
            reviewListDBody.setSubMsg(e.getMessage());
        }
        return reviewListDBody;
    }

    @ResponseBody
    @RequestMapping("/detail")
    public ReviewDetailDBody reviewDetail(ReviewDetailABody reviewDetailABody) {
        ReviewDetailDBody reviewDetailDBody = reviewService.reviewDetail(reviewDetailABody);
        return null;
    }

    @ResponseBody
    @RequestMapping("/insert")
    public ReviewInsertDBody reviewInsert(ReviewInsertABody reviewInsertABody) {
        ReviewInsertDBody reviewInsertDBody = reviewService.reviewInsert(reviewInsertABody);
        return null;
    }

    @ResponseBody
    @RequestMapping("/update")
    public ReviewUpdateDBody reviewUpdate(ReviewUpdateABody reviewUpdateABody) {
        ReviewUpdateDBody reviewUpdateDBody =  reviewService.reviewUpdate(reviewUpdateABody);
        return null;
    }

}
