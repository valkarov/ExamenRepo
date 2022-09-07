/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.Tienda.controler;

import com.examen.Tienda.modelo.Productos;
import com.examen.Tienda.services.IProductosServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author eXtreme PC
 */

@Controller
public class Controlador {
    
    @Autowired
    private IProductosServices serviceProductos;
    
    //RUTA INDEX
    @GetMapping("/")
    public String inicio(Model model){
        List<Productos>producto = serviceProductos.listar();
        model.addAttribute("productos",producto);
        return "index";
    }
    
    //RUTA AGREGAR
    @GetMapping("/Agregar")
    public String Agregar (Model model){
        model.addAttribute("producto", new Productos());
        return "FormAgregar";
    }
    
    //RUTA GENERAR PRODUCTO
    @PostMapping("/crear_producto")
    public String crear_producto( @Validated Productos p ,Model model){
        serviceProductos.save(p);
        return "redirect:/";
    }
    
    //RUTA ELIMINAR PRODUCTO
    
    @GetMapping("/Eliminar/{id}")
    public String delete(Model model, @PathVariable int id){
        serviceProductos.delete(id);
        return "redirect:/";
    }
}
