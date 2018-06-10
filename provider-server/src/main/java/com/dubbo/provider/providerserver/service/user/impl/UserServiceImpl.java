package com.dubbo.provider.providerserver.service.user.impl;

import com.dubbo.api.dto.UserDto;
import com.dubbo.api.service.user.UserService;

/**
 * @author sam199510 273045049@qq.com
 * @version Created Time:2018/3/30 20:15:32
 */
public class UserServiceImpl implements UserService {

    @Override
    public String userToString(UserDto userDto) {
        return userDto.toString();
    }
}
