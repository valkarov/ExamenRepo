/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.Tienda.services;

import com.examen.Tienda.modelo.Productos;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author eXtreme PC
 */
public interface IProductosServices {
    public List<Productos>listar();
    public int save(Productos p);
    public void delete(int id);
}
