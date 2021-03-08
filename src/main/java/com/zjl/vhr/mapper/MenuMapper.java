package com.zjl.vhr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjl.vhr.entity.Menu;
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
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> getMenuByHrId(Integer hrid);

    List<Menu> getAllMenuWithRole();

    List<Menu> getAllMenus();

    List<Integer> getMidsByRid(Integer rid);
}
