package com.zjl.vhr.service.impl;

import com.zjl.vhr.entity.Hr;
import com.zjl.vhr.mapper.HrMapper;
import com.zjl.vhr.service.HrService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 周建龙
 * @since 2020-08-31
 */
@Service
public class HrServiceImpl extends ServiceImpl<HrMapper, Hr> implements HrService, UserDetailsService {

    @Autowired
    HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(username);
        if (hr == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        hr.setRoles(hrMapper.getRolesById(hr.getId()));
        return hr;
    }
}
