package com.milkz.picture.service;

import com.milkz.picture.bean.SavePicBean2;
import com.milkz.picture.dao.PictureDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DBServiceImpl implements DBService {

    @Resource
    private PictureDao pictureDao;

    @Override
    public void insert(SavePicBean2 savePicBean2) {
        pictureDao.insertData(savePicBean2);
    }
}
