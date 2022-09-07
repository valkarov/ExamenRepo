/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.Tienda.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author eXtreme PC
 */
@Entity
@Table(name="productos")
public class Productos implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto;
    private int precio_producto;
    private String nombre_producto;
    private String marca_producto;
    private int disponibilidad_producto;

    public Productos() {
    }

    public Productos(int id_producto, int precio_producto, String nombre_producto, String marca_producto, int disponibilidad_producto) {
        this.id_producto = id_producto;
        this.precio_producto = precio_producto;
        this.nombre_producto = nombre_producto;
        this.marca_producto = marca_producto;
        this.disponibilidad_producto = disponibilidad_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(int precio_producto) {
        this.precio_producto = precio_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getMarca_producto() {
        return marca_producto;
    }

    public void setMarca_producto(String marca_producto) {
        this.marca_producto = marca_producto;
    }

    public int getDisponibilidad_producto() {
        return disponibilidad_producto;
    }

    public void setDisponibilidad_producto(int disponibilidad_producto) {
        this.disponibilidad_producto = disponibilidad_producto;
    }
    
    
    
}
