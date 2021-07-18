package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.SysOrderEntity;

import java.util.Map;

public interface SysOrderService extends IService<SysOrderEntity> {
    PageUtils queryPage(Map<String, Object> params);
}
