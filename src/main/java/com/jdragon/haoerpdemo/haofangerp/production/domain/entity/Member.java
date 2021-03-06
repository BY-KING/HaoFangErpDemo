package com.jdragon.haoerpdemo.haofangerp.production.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Date;

/**
 * @Author: Jdragon
 * @email: 1061917196@qq.com
 * @Date: 2020.03.18 23:00
 * @Description: 用户表实体类
 */
@Data
@ToString
@TableName("system_member")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Member extends Model<Member> {

    @TableId(type = IdType.AUTO)
    private int id;

    private String employeeNo;

    private String password;

    private String name;

    private Date birth;

    private Date entryTime;

    @Override
    protected Serializable pkVal(){
        return this.id;
    }
}
