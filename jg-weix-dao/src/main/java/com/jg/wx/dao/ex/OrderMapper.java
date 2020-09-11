package com.jg.wx.dao.ex;

import com.jg.wx.domain.DtsOrder;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;

public interface OrderMapper {
	int updateWithOptimisticLocker(@Param("lastUpdateTime") LocalDateTime lastUpdateTime,
                                   @Param("order") DtsOrder order);
}