/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plf.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author LMC Alumno
 */
public class Autor {
    private String nombre;
    private String apellidos;
    private String sexo;
    private LocalDate fechaNac;
    
    public int getEdad(){
        return (int) ChronoUnit.YEARS.between(fechaNac, LocalDate.now());
    }
}
