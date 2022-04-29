package com.example.multiple.mapper.primary;

import com.example.multiple.dto.PrimaryDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PrimaryMapper {

    List<PrimaryDTO> getOracleList();
}
