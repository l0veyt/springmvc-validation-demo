package com.xinlee.demo.controller.validation;

/**
 * 校验分组一
 */
@SuppressWarnings("unused")
public interface ValidGroup1 {
    /**
     * 在pojo中定义校验规则，而pojo是被多个controller所共用
     * 当不同的controller方法对同一个pojo进行校验，但是每个controller方法需要不同的校验
     *
     * 则定义多个校验分组（其实是一个java接口）
     * 每个controller方法使用不同的校验分组
     */
	//接口中不需要定义任何方法，仅是对不同的校验规则进行分组
}
