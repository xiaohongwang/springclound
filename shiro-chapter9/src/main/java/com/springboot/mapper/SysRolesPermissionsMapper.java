package com.springboot.mapper;

import com.springboot.model.SysRolesPermissionsKey;

public interface SysRolesPermissionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_roles_permissions
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(SysRolesPermissionsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_roles_permissions
     *
     * @mbggenerated
     */
    int insert(SysRolesPermissionsKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_roles_permissions
     *
     * @mbggenerated
     */
    int insertSelective(SysRolesPermissionsKey record);
}