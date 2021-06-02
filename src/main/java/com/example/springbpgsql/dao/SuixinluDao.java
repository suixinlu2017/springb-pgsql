package com.example.springbpgsql.dao;

import com.example.springbpgsql.entity.Company;
import org.springframework.stereotype.Repository;

/**
 * @author suixinlu
 */

@Repository
public interface SuixinluDao {
    /**
     * Gets string.
     *
     * @param id the id
     * @return the string
     */
    Company getString(int id);
}
