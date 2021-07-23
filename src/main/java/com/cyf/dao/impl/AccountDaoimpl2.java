package com.cyf.dao.impl;

import com.cyf.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountdao2")
public class AccountDaoimpl2 implements AccountDao {
    public void saveaccount() {
        System.out.println("保存了22222");
    }
}
