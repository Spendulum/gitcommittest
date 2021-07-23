package com.cyf.service.impl;

import com.cyf.dao.AccountDao;

import com.cyf.dao.impl.AccountDaoimpl;

import com.cyf.service.Accountservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

// 业务层实现类
//   <bean id="Accountservice" class="com.cyf.service.impl.Accountserviceimpl"></bean>
/*
 *@Component 把当前类对象存入容器 value属性用于指定id 不写默认类名且首字母小写
 *三层@Controller 表现层@Repository 持久层@Service 业务层
 *@Autowired 自动按照类型注入数据 配套@Qualifier使用
 *也可以使用@Resource 但是属性是name
 *@Value() 注入基本类型和String 可以使用el表达式 ${表达式}
 *
 *
 */

@Service(value = "accountservice")
public class Accountserviceimpl implements Accountservice {


    @Resource(name = "accountdao2")
    private AccountDao accountDao1;

    public void saveaccount() {
        accountDao1.saveaccount();
    }
}
