package com.anqi.service;

import com.anqi.dataobject.SellerInfo;

/**
 * 卖家端
 * Created by SqMax on 2018/4/1.
 */
public interface SellerService {

    /**
     * 通过openid查询
     *
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
