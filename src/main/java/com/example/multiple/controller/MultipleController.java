package com.example.multiple.controller;

import com.example.multiple.dto.PrimaryDTO;
import com.example.multiple.dto.SecondaryDTO;
import com.example.multiple.service.MultipleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MultipleController {

    @Resource
    private MultipleService multipleService;

    @GetMapping("/oracleList")
    public ResponseEntity getOracleList() {

        List<PrimaryDTO> getOracleList = multipleService.getOracleList();

        if (getOracleList == null) {
            return new ResponseEntity("Oracle 조회 실패", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(getOracleList, HttpStatus.OK);
    }

    @GetMapping("/postgresqlList")
    public ResponseEntity getPostgresqlList() {

        List<SecondaryDTO> getPostgresqlList = multipleService.getPostgresqlList();

        if (getPostgresqlList == null) {
            return new ResponseEntity("PostgreSQL 조회 실패", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(getPostgresqlList, HttpStatus.OK);
    }

}
