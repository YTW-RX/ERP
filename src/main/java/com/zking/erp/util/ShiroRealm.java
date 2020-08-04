package com.zking.erp.util;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class ShiroRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
  /*  @Autowired
    private ISysUserService sysUserService;

    *//**
     * 授权
     * @param principalCollection
     * @return
     *//*
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username=principalCollection.getPrimaryPrincipal().toString();
        //根据username获取对应的角色
        Set<String> roles=sysUserService.findRoles(username);
        //根据Username获取对应的权限
        Set<String> permissions=sysUserService.findPermissions(username);

        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(roles);
        simpleAuthorizationInfo.setStringPermissions(permissions);

        return simpleAuthorizationInfo;
    }

    *//**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     *//*
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取token令牌中的账号密码
        String username = authenticationToken.getPrincipal().toString();
        String password = authenticationToken.getCredentials().toString();

        //根据登录账号进行验证登录
        SysUser sysUser = sysUserService.login(username);

        if(null==sysUser){
            throw  new UnknownAccountException("账号不存在");
        }

        SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(sysUser.getUsername(),sysUser.getPassword(), ByteSource.Util.bytes(sysUser.getSalt()),this.getName());

        return simpleAuthenticationInfo;
    }*/
}
