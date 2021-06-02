package com.example.springbpgsql.service;

import com.example.springbpgsql.dao.SuixinluDao;
import com.example.springbpgsql.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author suixinlu
 */
@Service
public class SuixinluServiceImpl implements SuixinluService{

    @Autowired
    SuixinluDao suixinluDao;

    @Override
    public Company getString() {
        int id = 2;
        Company company = suixinluDao.getString(id);
        return company;
    }
}
