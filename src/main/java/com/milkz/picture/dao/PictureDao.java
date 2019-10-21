package com.milkz.picture.dao;

import com.milkz.picture.bean.SavePicBean2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PictureDao {

    @Select("insert into t_image (brand,type,keyType,time,value,result,url,version) "
            + "VALUES(#{brand},#{type},#{keyType},#{time},"
            + "#{value},#{result},#{url},#{version}) ")
    void insertData(SavePicBean2 savePicBean2);

}
