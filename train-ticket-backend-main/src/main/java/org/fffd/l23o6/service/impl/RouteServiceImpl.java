package org.fffd.l23o6.service.impl;

import java.util.List;
import org.fffd.l23o6.pojo.vo.route.RouteVO;
import org.fffd.l23o6.service.RouteService;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RouteServiceImpl implements RouteService {
    
    @Override
    public void addRoute(String name, List<Long> stationIds) {
        // TODO: 2023/5/26
        
    }

    @Override
    public List<RouteVO> listRoutes() {
        // TODO: 2023/5/26
        return null;
    }

    @Override
    public RouteVO getRoute(Long id) {

        // TODO: 2023/5/26
        return null;
    }

    @Override
    public void editRoute(Long id, String name, List<Long> stationIds) {
        // TODO: 2023/5/26
    }
}
