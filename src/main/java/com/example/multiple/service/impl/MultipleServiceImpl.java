package com.example.multiple.service.impl;

import com.example.multiple.dto.PrimaryDTO;
import com.example.multiple.dto.SecondaryDTO;
import com.example.multiple.mapper.primary.PrimaryMapper;
import com.example.multiple.mapper.secondary.SecondaryMapper;
import com.example.multiple.service.MultipleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultipleServiceImpl implements MultipleService {

    @Autowired
    PrimaryMapper primaryMapper;

    @Autowired
    SecondaryMapper secondaryMapper;

    @Override
    public List<PrimaryDTO> getOracleList() {
        return primaryMapper.getOracleList();
    }

    @Override
    public List<SecondaryDTO> getPostgresqlList() {
        return secondaryMapper.getPostgresqlList();
    }
}
