/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.Tienda.services;

import com.examen.Tienda.interfaces.ProductosRepository;
import com.examen.Tienda.modelo.Productos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author eXtreme PC
 */
@Service
public class ProductosService implements IProductosServices{
    
    @Autowired
    private ProductosRepository data;

    @Override
    public List<Productos> listar() {
        return (List<Productos>)data.findAll();
    }

    @Override
    public int save(Productos p) {
        int res=0;
        Productos producto=data.save(p);
        if(!producto.equals(null)){
            res =1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
       data.deleteById(id);
    }
}
