package io.renren.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.sys.entity.SysOrderEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysOrderDao extends BaseMapper<SysOrderEntity> {
}
