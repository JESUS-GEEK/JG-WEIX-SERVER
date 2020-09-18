package com.jg.wx.hy.service;

import com.jg.wx.domain.DtsRegion;
import com.jg.wx.service.DtsRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>Title: GetRegionService</p>
 * <p>Description:
 * 描述：
 * </p>
 *
 * @author jinpu.shi
 * @version v1.0.0
 * @since 2020-09-18 10:33
 */
@Component
public class GetRegionService {
    @Autowired
    private DtsRegionService regionService;

    private static List<DtsRegion> DtsRegions;

    protected List<DtsRegion> getDtsRegions() {
        if (DtsRegions == null) {
            createRegion();
        }
        return DtsRegions;
    }

    private synchronized void createRegion() {
        if (DtsRegions == null) {
            DtsRegions = regionService.getAll();
        }
    }
}
