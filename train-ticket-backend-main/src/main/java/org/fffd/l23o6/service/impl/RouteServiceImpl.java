package org.fffd.l23o6.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import io.github.lyc8503.spring.starter.incantation.exception.BizException;
import org.fffd.l23o6.dao.RouteDao;
import org.fffd.l23o6.exception.BizError;
import org.fffd.l23o6.mapper.RouteMapper;
import org.fffd.l23o6.pojo.entity.RouteEntity;
import org.fffd.l23o6.pojo.vo.route.RouteVO;
import org.fffd.l23o6.service.RouteService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RouteServiceImpl implements RouteService {
    private final RouteDao routeDao;
    @Override
    public void addRoute(String name, List<Long> stationIds) {
        // TODO: 2023/5/26
        RouteEntity entity = routeDao.findRouteByName(name);
        if (entity != null){
            throw new BizException(BizError.ROUTENAME_EXISTS);
        }
        routeDao.save(RouteEntity.builder().name(name).stationIds(stationIds).build());
    }

    @Override
    public List<RouteVO> listRoutes() {
        // TODO: 2023/6/4
        return routeDao.findAll(Sort.by(Sort.Direction.ASC, "name")).stream().map(RouteMapper.INSTANCE::toRouteVO).collect(Collectors.toList());
    }

    @Override
    public RouteVO getRoute(Long id) {
        // TODO: 2023/5/26
        return RouteMapper.INSTANCE.toRouteVO(routeDao.findRouteById(id));
    }

    @Override
    public void editRoute(Long id, String name, List<Long> stationIds) {
        // TODO: 2023/5/26
        RouteEntity entity = routeDao.findRouteById(id);
        entity.setName(name).setStationIds(stationIds);
        routeDao.save(entity);
    }
}
