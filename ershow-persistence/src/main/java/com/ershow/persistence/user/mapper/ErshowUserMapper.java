package com.ershow.persistence.user.mapper;

import com.ershow.persistence.user.model.ErshowUser;
import com.ershow.persistence.user.model.ErshowUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErshowUserMapper {
    int countByExample(ErshowUserExample example);

    int deleteByExample(ErshowUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ErshowUser record);

    int insertSelective(ErshowUser record);

    List<ErshowUser> selectByExample(ErshowUserExample example);

    ErshowUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ErshowUser record, @Param("example") ErshowUserExample example);

    int updateByExample(@Param("record") ErshowUser record, @Param("example") ErshowUserExample example);

    int updateByPrimaryKeySelective(ErshowUser record);

    int updateByPrimaryKey(ErshowUser record);
}