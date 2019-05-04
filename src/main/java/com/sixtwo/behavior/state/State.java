package com.sixtwo.behavior.state;

/**
 * @author zhangshuaifei
 * @description 状态接口，统一定义与Context的一种状态对应的行为
 *              实例：酒店房间状态    空闲   已预订   已入住
 * @date 2019/5/4 20:44
 */
public interface State {
    void handle();
}
