package com.cyf.ui;


import com.cyf.dao.AccountDao;
import com.cyf.service.Accountservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//表现层 获取spring ioc 核心容器
//ApplicationC... 立即加载
public class client {
    public static void main(String[] args) {
        //1.获取容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Accountservice as = (Accountservice) ac.getBean("accountservice");
        //AccountDao ad=ac.getBean("accountdao",AccountDao.class);
        System.out.println(as);
        //System.out.println(ad);
        as.saveaccount();
    }
}
