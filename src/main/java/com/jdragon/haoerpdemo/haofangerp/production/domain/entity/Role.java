package com.jdragon.haoerpdemo.haofangerp.production.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: Jdragon
 * @email: 1061917196@qq.com
 * @Date: 2020.03.18 23:01
 * @Description: 角色实体类
 */
@Data
@ToString
@TableName("system_role")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Role extends Model<Role> {
    @TableId(type = IdType.AUTO)
    private int id;

    private String roleName;

    private String describe;

    @Override
    protected Serializable pkVal(){
        return this.id;
    }
}
