package com.shardingjdbc.demo;

import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shardingjdbc.demo.entity.TArea;
import com.shardingjdbc.demo.entity.TOrder;
import com.shardingjdbc.demo.entity.TOrderItem;
import com.shardingjdbc.demo.mapper.TAreaMapper;
import com.shardingjdbc.demo.mapper.TOrderItemMapper;
import com.shardingjdbc.demo.mapper.TOrderMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.geom.Area;
import java.math.BigDecimal;
import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
class ShardingJdbcDemoApplicationTests {
    @Autowired
    private TAreaMapper areaMapper;
    @Autowired
    private TOrderItemMapper orderItemMapper;
    @Autowired
    private TOrderMapper orderMapper;
    @Test
    public void test(){
        System.out.println(1%2);
    }

    @Test
    public void addArea(){
        TArea tArea = new TArea();
        tArea.setId(10010);
        tArea.setCityName("上海");
        areaMapper.insert(tArea);
    }


    @Test
    public void addOrder(){
        TOrder order = new TOrder();
        order.setUserId(1000);
        order.setOrderId(8);
        order.setAmount(new BigDecimal("120"));
        orderMapper.insert(order);
    }

    @Test
    public void queryOrder(){
        QueryWrapper<TOrder> query = new QueryWrapper<>();
        query.eq("order_id", 1);
        List<TOrder> tOrders = orderMapper.selectList(query);
        log.info("查询结果:{}", JSONUtil.toJsonStr(tOrders));
    }


    @Test
    public void addOrderItem(){
        TOrderItem orderItem = new TOrderItem();
        orderItem.setUserId(100);
        orderItem.setOderId(3);
        orderItem.setId(5);
        orderItem.setProductName("帽子");
        orderItem.setNum(20);
        orderItemMapper.insert(orderItem);
    }

    @Test
    public void test2(){
        System.out.println((6%2));
    }
}
