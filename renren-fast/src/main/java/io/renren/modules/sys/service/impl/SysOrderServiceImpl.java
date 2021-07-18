package io.renren.modules.sys.service.impl;

import com.atguigu.common.utils.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.dao.SysOrderDao;
import io.renren.modules.sys.entity.SysOrderEntity;
import io.renren.modules.sys.service.SysOrderService;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service("SysOrderService")
public class SysOrderServiceImpl extends ServiceImpl<SysOrderDao, SysOrderEntity> implements SysOrderService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysOrderEntity> page = this.page(
                new Query<SysOrderEntity>().getPage(params),
                new QueryWrapper<SysOrderEntity>()
        );

        return new PageUtils(page);
    }
}
