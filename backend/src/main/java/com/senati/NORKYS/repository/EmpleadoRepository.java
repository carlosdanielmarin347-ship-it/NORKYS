package com.senati.NORKYS.repository; //Esta capa se encarga de entrar a la DB

import com.senati.NORKYS.model.Empleado;//Importamos la entidad empleado
import org.springframework.data.jpa.repository.JpaRepository; //Importamos repository con sus metodos
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository; //Marca esta interfaz como accseso a la base de datos

import java.util.List;

@Repository // Indica que esta interfaz es un componente de persistencia.
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> { //Aca creamos una interfas no una clase

    // Agrega este método para traer empleados con sus turnos cargados
    @Query("SELECT e FROM Empleado e LEFT JOIN FETCH e.turno")
    List<Empleado> findAllWithTurno();

}