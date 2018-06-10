package com.dubbo.consumer.consumerserver.controller;

import com.dubbo.api.dto.UserDto;
import com.dubbo.api.service.email.EmailService;
import com.dubbo.api.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sam199510 273045049@qq.com
 * @version Created Time:2018/3/30 20:26:15
 */
@RestController
public class ConsumerController {

    @Resource
    private UserService userService;

    @Resource
    private EmailService emailService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloUser() {
        UserDto userDto = new UserDto();

        userDto.setUsername("sam");
        userDto.setUserage(24);


        return this.userService.userToString(userDto);
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public String helloEmail(
            String email
    ) {
        return this.emailService.readEmail(email);
    }


}
