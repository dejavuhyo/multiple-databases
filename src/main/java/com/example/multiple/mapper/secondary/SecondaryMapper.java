package com.example.multiple.mapper.secondary;

import com.example.multiple.dto.SecondaryDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SecondaryMapper {

    List<SecondaryDTO> getPostgresqlList();
}
