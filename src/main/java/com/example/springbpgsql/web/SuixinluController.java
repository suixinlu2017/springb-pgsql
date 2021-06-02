package com.example.springbpgsql.web;

import com.example.springbpgsql.entity.Company;
import com.example.springbpgsql.service.SuixinluService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suixinlu
 */
@RestController
@RequestMapping("/api")
public class SuixinluController {

    @Autowired
    SuixinluService suixinluService;

    @RequestMapping("/suixinlu")
    public String getString() {
        Company company = suixinluService.getString();
        return company.toString();
    }
}
