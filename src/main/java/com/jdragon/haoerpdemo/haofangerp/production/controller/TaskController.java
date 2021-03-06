package com.jdragon.haoerpdemo.haofangerp.production.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jdragon.haoerpdemo.haofangerp.commons.response.Result;
import com.jdragon.haoerpdemo.haofangerp.production.domain.vo.TaskVo;
import com.jdragon.haoerpdemo.haofangerp.production.domain.entity.Task;
import com.jdragon.haoerpdemo.haofangerp.production.service.TaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


/**
 * @Author: Jdragon
 * @email: 1061917196@qq.com
 * @Date: 2020.03.18 17:17
 * @Description: 生产任务相关接口
 */
@RestController
@RequestMapping("task")
@Api(tags = "生产任务相关")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("list/{page}")
    @ApiOperation("获取生产任务列表")
    public Result getList(@PathVariable int page){
        IPage<Task> taskIPage = taskService.list(new Page<>(page,20));
        return Result.success(Result.SUCCESS_MESSAGE).setResult(taskIPage);
    }

    @PostMapping("/create")
    @ApiOperation("创建生产任务")
    public Result create(@RequestBody TaskVo taskVo){
        return Result.success(Optional.ofNullable(taskService.save(taskVo)).isPresent()?"创建成功":"创建失败");
    }

    @PostMapping("/update")
    @ApiOperation("更改生产任务")
    public Result update(@RequestBody TaskVo taskVo){
        return Result.success(taskService.update(taskVo)?"更改成功":"更改失败");
    }

    @PostMapping("/delete")
    @ApiOperation("删除生产任务")
    public Result update(@RequestBody Long taskId){
        return Result.success(taskService.delete(taskId)?"删除成功":"删除失败");
    }
}
