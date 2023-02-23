/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plf.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LMC Alumno
 */
public class Libreria {
    private String nombre;
    private List<Libro> acervo;
    private List<Vendedor> vendedores;
    
    public Libreria (String nombre){
        this.nombre = nombre;
        acervo = new ArrayList<>();
        vendedores = new ArrayList<>();
    }
    public boolean agregarLibro(Libro libro){
       return acervo.add(libro);
    }
    public boolean agregarVendedor(Vendedor vendedor){
        return vendedores.add(vendedor);
    }
}
