package com.senati.NORKYS.repository;


//IMPORTAMOS
import com.senati.NORKYS.model.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface AsistenciaRepository extends JpaRepository <Asistencia, Long> {
    void deleteByEmpleadoId(Long empleadoId);

    //Esto busca asistencias por fecha
    List<Asistencia> findByFecha(LocalDate fecha);

    //Esto verifica si ya se tomo asistencia hoy
    boolean existsByFecha(LocalDate fecha);

    //Esto cuenta las asitencias de hoy
    long countByFecha(LocalDate fecha);

    //Contar los que llegaron tarde
    @Query("SELECT COUNT(a) FROM Asistencia a WHERE a.fecha = :fecha AND a.estado = 'Tardanza'")
    long countTardanzasByFecha(@Param("fecha") LocalDate fecha);
}

