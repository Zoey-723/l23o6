package org.fffd.l23o6.controller;

import io.github.lyc8503.spring.starter.incantation.pojo.CommonResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.fffd.l23o6.pojo.vo.route.AddRouteRequest;
import org.fffd.l23o6.pojo.vo.route.RouteVO;
import org.fffd.l23o6.service.RouteService;
import org.fffd.l23o6.service.impl.RouteServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/v1/")
@RequiredArgsConstructor
public class RouteController {
    private final RouteService routeService;
    @PostMapping("admin/addRoute")
    public CommonResponse<?> addRoute(@Valid @RequestBody AddRouteRequest request) {
        // There should be something, and so do the following methods.
        // TODO: 2023/5/26
        routeService.addRoute(request.getName(), request.getStationIds());
        return CommonResponse.success();
    }

    @GetMapping("admin/getRoutes")
    public CommonResponse<List<RouteVO>> getRoutes() {
//        routeService.listRoutes();
//        return CommonResponse.success();
        List<RouteVO> routes = routeService.listRoutes();
        return CommonResponse.success(routes);
    }

    @GetMapping("admin/getRoute/{routeId}")
    public CommonResponse<RouteVO> getRoute(@PathVariable("routeId") Long routeId) {
        RouteVO route = routeService.getRoute(routeId);
        return CommonResponse.success(route);
    }

    @PutMapping("admin/editRoute/{routeId}")
    public CommonResponse<?> editRoute(@PathVariable("routeId") Long routeId, @Valid @RequestBody AddRouteRequest request) {
        routeService.editRoute(routeId, request.getName(), request.getStationIds());
        return CommonResponse.success();
    }
}