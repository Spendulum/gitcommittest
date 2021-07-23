package com.cyf.dao.impl;

import com.cyf.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountdao1")
public class AccountDaoimpl implements AccountDao {
    public void saveaccount() {
        System.out.println("保存了1111");
    }
}
