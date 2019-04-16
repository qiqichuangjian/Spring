package com.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

//不属于dao,service,controller层就写
@Component
public class TransactionUtil {
    @Autowired
    private DataSourceTransactionManager txManager;
    // 事务开启   操作数据之前
    public TransactionStatus begin(){
        //开启事务，需要new一个DefaultTransactionDefinition默认的事务处理器
        TransactionStatus transaction = txManager.getTransaction(new DefaultTransactionDefinition());
        return transaction;
    }
    // 事务提交   操作数据之后
    public void commit(TransactionStatus transaction){
        txManager.commit(transaction);
    }
    // 事务回滚   操作数据错误之后
    public void rollback(TransactionStatus transaction){
        txManager.rollback(transaction);
    }
}
