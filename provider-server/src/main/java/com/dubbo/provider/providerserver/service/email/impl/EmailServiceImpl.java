package com.dubbo.provider.providerserver.service.email.impl;

import com.dubbo.api.service.email.EmailService;
import org.apache.commons.lang3.StringUtils;

/**
 * @author sam199510 273045049@qq.com
 * @version Created Time:2018/3/30 21:56:17
 */
public class EmailServiceImpl implements EmailService {

    @Override
    public String readEmail(String email) {
        if (StringUtils.isBlank(email)){
            return "";
        } else {
            return email;
        }
    }
}
