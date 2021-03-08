package com.zjl.vhr.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjl.vhr.entity.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 周建龙
 * @since 2020-08-31
 */
public interface MenuService extends IService<Menu> {

    List<Menu> getMenuByHrId();

    List<Menu> getAllMenuWithRole();

    List<Menu> getAllMenus();

    List<Integer> getMidsByRid(Integer rid);
}
