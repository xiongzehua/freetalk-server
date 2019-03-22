package com.xiongzehua.zhifou.dao;

import com.xiongzehua.zhifou.pojo.UserStarTalk;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserStarTalkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserStarTalk record);

    int insertSelective(UserStarTalk record);

    UserStarTalk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserStarTalk record);

    int updateByPrimaryKey(UserStarTalk record);
}