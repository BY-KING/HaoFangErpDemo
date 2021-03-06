package com.jdragon.haoerpdemo.haofangerp.production.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: Jdragon
 * @email: 1061917196@qq.com
 * @Date: 2020.03.18 23:02
 * @Description: 权限实体类
 */
@Data
@ToString
@TableName("system_power")
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Power extends Model<Power> {
    @TableId(type = IdType.AUTO)
    private int id;

    private String apiName;

    private String apiUrl;

    private String apiMethod;

    private int apiSort;

    private int pid;

    private String describe;

    @Override
    protected Serializable pkVal(){
        return this.id;
    }
}
