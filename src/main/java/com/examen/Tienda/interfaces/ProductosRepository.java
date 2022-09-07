/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.Tienda.interfaces;

import com.examen.Tienda.modelo.Productos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eXtreme PC
 */
@Repository
public interface ProductosRepository extends CrudRepository<Productos, Integer>{
    
}
