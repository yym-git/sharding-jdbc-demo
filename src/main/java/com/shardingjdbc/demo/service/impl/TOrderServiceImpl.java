package com.shardingjdbc.demo.service.impl;

import com.shardingjdbc.demo.entity.TOrder;
import com.shardingjdbc.demo.mapper.TOrderMapper;
import com.shardingjdbc.demo.service.TOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yym
 * @since 2024-11-24
 */
@Service
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder> implements TOrderService {

}
