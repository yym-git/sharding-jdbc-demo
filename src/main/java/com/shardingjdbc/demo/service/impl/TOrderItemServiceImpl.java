package com.shardingjdbc.demo.service.impl;

import com.shardingjdbc.demo.entity.TOrderItem;
import com.shardingjdbc.demo.mapper.TOrderItemMapper;
import com.shardingjdbc.demo.service.TOrderItemService;
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
public class TOrderItemServiceImpl extends ServiceImpl<TOrderItemMapper, TOrderItem> implements TOrderItemService {

}
