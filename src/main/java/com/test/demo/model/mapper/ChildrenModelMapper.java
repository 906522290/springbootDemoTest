package com.test.demo.model.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;
import com.test.demo.model.po.ChildrenPo;
import com.test.demo.model.dto.ChildrenDto;
import com.test.demo.model.po.ChildrenPo;
import com.test.demo.model.vo.ChildrenVo;

/**
 * (Children)实体转换工具类
 *
 * @author makejava
 * @since 2022-11-08 14:57:17
 */
@Mapper
public interface ChildrenModelMapper {
    ChildrenModelMapper INSTANCE = Mappers.getMapper(ChildrenModelMapper.class);
    
    ChildrenDto changePO2DTO(ChildrenPo childrenPo);
    ChildrenPo changeDTO2PO(ChildrenDto childrenDto);
    ChildrenVo changeDTO2VO(ChildrenDto childrenDto);
    ChildrenDto changeVO2DTO(ChildrenVo childrenVo);

    List<ChildrenDto> childrenPOs2ChildrenDTOs(List<ChildrenPo> childrenPoList);
    List<ChildrenPo> childrenDTOs2ChildrenPOs(List<ChildrenDto> childrenDtoList);
    List<ChildrenDto> childrenVOs2ChildrenDTOs(List<ChildrenVo> childrenVoList);
    List<ChildrenVo> childrenDTOs2ChildrenVOs(List<ChildrenDto> childrenDtoList);
}
