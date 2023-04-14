package com.yangzhuo.service.impl;

import com.yangzhuo.controller.Code;
import com.yangzhuo.dao.BookDao;
import com.yangzhuo.domain.Book;
import com.yangzhuo.exception.BusinessException;
import com.yangzhuo.exception.SystemException;
import com.yangzhuo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public boolean save(Book book) {
        return bookDao.save(book)>0;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id)>0;
    }

    @Override
    public Book getById(Integer id) {
        if(id==2){
            throw new BusinessException(Code.BUSINESS_ERR,"您的输入有误!");
        }
//        //将可能出现的异常进行包装，转换成自定义异常
//        try{
//            int i=1/0;
//        }catch (ArithmeticException e){
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试!",e);
//        }
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
