package com.sangeng.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sangeng.domain.entity.Role;
import com.sangeng.mapper.RoleMapper;
import com.sangeng.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * 角色信息表(Role)表服务实现类
 *
 * @author makejava
 * @since 2023-04-30 17:13:23
 */
@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {


}
