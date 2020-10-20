package com.software.service;

import com.software.entity.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/10/19
 * @description
 */
@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        // 构建角色列表
        List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
        SysRole sysRole = new SysRole();
        sysRole.setRoleName("ROLE_USER");
        sysRole.setRoleName("ROLE_ADMIN");
        grantedAuths.add(sysRole);



        return new User("admin",passwordEncoder.encode("123456"), grantedAuths);
    }
}
