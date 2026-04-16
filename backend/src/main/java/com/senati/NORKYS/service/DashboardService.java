package com.senati.NORKYS.service;


import com.senati.NORKYS.model.Dashboard;
import com.senati.NORKYS.repository.AsistenciaRepository;
import com.senati.NORKYS.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DashboardService {


    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private AsistenciaRepository asistenciaRepository;


    public Dashboard getEstadisticasDashboard(){
        LocalDate hoy = LocalDate.now();

        //Obtenemos el total de empleados incluso si no hay asitencias
        long totalEmpleados = empleadoRepository.count();

        //Vereficamos si ya se tomo la asistencia hoy
        boolean asistenciaTomada  = asistenciaRepository.existsByFecha(hoy);

        // Si NO se ha tomado asistencia hoy
        if (!asistenciaTomada) {
            return new Dashboard(
                    totalEmpleados,
                    0, 0, 0,
                    false,
                    "Aún no se ha tomado la asistencia de hoy. Registra la asistencia para ver estadísticas."
            );
        }

        // Si YA se tomó asistencia hoy → calcular todo
        long asistieron = asistenciaRepository.countByFecha(hoy);
        long llegaronTarde = asistenciaRepository.countTardanzasByFecha(hoy);
        long faltaron = totalEmpleados - asistieron;

        return new Dashboard(
                totalEmpleados,
                asistieron,
                faltaron,
                llegaronTarde,
                true,
                "Estadísticas del día " + hoy.toString()
        );
    }
}
