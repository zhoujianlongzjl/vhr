package com.zjl.vhr.mapper;

import com.zjl.vhr.entity.Hr;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjl.vhr.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 周建龙
 * @since 2020-08-31
 */
@Repository
public interface HrMapper extends BaseMapper<Hr> {

    Hr loadUserByUsername(String username);

    List<Role> getRolesById(Integer id);
}
