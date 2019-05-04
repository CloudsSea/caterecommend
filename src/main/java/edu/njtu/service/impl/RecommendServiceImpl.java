package edu.njtu.service.impl;

import com.github.pagehelper.PageHelper;
import edu.njtu.mapper.RecommendDefaultMapper;
import edu.njtu.mapper.RecommendUserMapper;
import edu.njtu.model.RecommendDefault;
import edu.njtu.model.RecommendDefaultExample;
import edu.njtu.model.RecommendUser;
import edu.njtu.model.RecommendUserExample;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("recommedService")
public class RecommendServiceImpl {

    public static List<RecommendDefault> getRecommandDefaultRestaurant(RecommendDefaultMapper recommendDefaultMapper,int pageNo, int pageSize) {
        RecommendDefaultExample recommendDefaultExample = new RecommendDefaultExample();
        recommendDefaultExample.setOrderByClause("recommend_value desc");

        PageHelper.startPage(pageNo,pageSize,false);
        return recommendDefaultMapper.selectByExample(recommendDefaultExample);
    }
    public static List<RecommendUser> getRecommandUserRestaurant(RecommendUserMapper recommendUserMapper,Long userId,int pageNo, int pageSize) {

        RecommendUserExample recommendUserExample = new RecommendUserExample();
        recommendUserExample.setOrderByClause("recommend_value desc");
        recommendUserExample.createCriteria().andUserIdIntEqualTo(userId);
        PageHelper.startPage(pageNo,pageSize,false);
        return recommendUserMapper.selectByExample(recommendUserExample);
    }
}
