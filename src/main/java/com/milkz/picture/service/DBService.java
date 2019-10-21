package com.milkz.picture.service;

import com.milkz.picture.bean.SavePicBean2;
import org.springframework.stereotype.Service;

@Service
public interface DBService {

    void insert(SavePicBean2 savePicBean2);

}
