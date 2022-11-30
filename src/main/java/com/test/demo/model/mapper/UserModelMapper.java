package com.test.demo.model.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import java.util.List;
import com.test.demo.model.po.UserPo;
import com.test.demo.model.dto.UserDto;
import com.test.demo.model.po.UserPo;
import com.test.demo.model.vo.UserVo;

/**
 * (User)实体转换工具类
 *
 * @author makejava
 * @since 2022-11-08 14:57:17
 */
@Mapper
public interface UserModelMapper {
    UserModelMapper INSTANCE = Mappers.getMapper(UserModelMapper.class);
    @Mappings({
            @Mapping(source = "id", target = "id"), // 把user中的id绑定到目标对象的userId属性中
            @Mapping(source = "name", target = "name"), // 把user中的username绑定到目标对象的name属性中
            @Mapping(source = "age", target = "age") // 把role对象的roleName属性值绑定到目标对象的roleName中
    })
    UserDto changePO2DTO(UserPo userPo);
    UserPo changeDTO2PO(UserDto userDto);
    UserVo changeDTO2VO(UserDto userDto);
    UserDto changeVO2DTO(UserVo userVo);

    List<UserDto> userPOs2UserDTOs(List<UserPo> userPoList);
    List<UserPo> userDTOs2UserPOs(List<UserDto> userDtoList);
    List<UserDto> userVOs2UserDTOs(List<UserVo> userVoList);
    List<UserVo> userDTOs2UserVOs(List<UserDto> userDtoList);


}
