package com.mmall.service;

/**
 * @author 占超群
 * @data 2018/12/30 16:02
 */
public interface IOrderService {
    //hour个小时以内未付款的订单，进行关闭
    void closeOrder(int hour);
}
