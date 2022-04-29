package com.example.multiple.service;

import com.example.multiple.dto.PrimaryDTO;
import com.example.multiple.dto.SecondaryDTO;

import java.util.List;

public interface MultipleService {

    List<PrimaryDTO> getOracleList();

    List<SecondaryDTO> getPostgresqlList();
}
