package com.senati.NORKYS.controller;

import com.senati.NORKYS.model.Dashboard;
import com.senati.NORKYS.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin("*")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("estadisticas")
    public ResponseEntity<Dashboard> obtenerEstadisticas(){
        return ResponseEntity.ok(dashboardService.getEstadisticasDashboard());
    }


}
