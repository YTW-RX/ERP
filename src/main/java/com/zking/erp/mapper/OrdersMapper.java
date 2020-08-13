package com.zking.erp.mapper;

import com.zking.erp.model.Orders;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersMapper {

    /**
     * 录入订单
     *
     * @param orders
     * @return
     */
    int insertOrders(Orders orders);

    /**
     * 根据订单oid查询单个订单
     *
     * @param oid
     * @return
     */
    Orders selectOrders(Integer oid);

    /**
     * 查询所有采购订单
     *
     * @param oType
     * @return
     */
    List<Orders> queryOrdersAllPager(Integer oType);

    /**
     * 查询未审核的采购订单
     *
     * @param oState
     * @return
     */
    List<Orders> queryOrdersPager(@Param("oState") String oState);

    /**
     * 修改采购订单状态
     *
     * @param orders
     * @return
     */
    int updateOrdersState(Orders orders);

    /*int deleteByPrimaryKey(Integer oid);

    int insertSelective(Orders record);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);*/
}