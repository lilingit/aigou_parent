package com.mrsll.aigou.controller;

import com.mrsll.aigou.domain.Employee;
import com.mrsll.aigou.util.AJaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping(value = "login",method = RequestMethod.POST)
    //向前台传递数据都用json数据[],{}，向后台传递用@RequestBody
    public AJaxResult login(@RequestBody Employee employee){
        //判断用户名或者密码是否都正确才能确定是否登陆成功
        if ("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return AJaxResult.getAJaxResult();//默认返回的是成功，因为设置了默认值
        }
        return AJaxResult.getAJaxResult().setSuccess(false).setMessage("用户名或者密码错误");
    }
}
