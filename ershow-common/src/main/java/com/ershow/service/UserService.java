package com.ershow.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * Created by Administrator on 2017/12/7.
 */
public interface UserService {

    JSONObject userLogin(Map<String,Object> params);
}
