/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservices;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import com.modelo.mequipo;
/**
 *
 * @author limbe
 */
@Stateless 
@Path("/addEquipo")
public class wequipo {
    // link de ingreso
    // http://localhost:8080/wsVisor/webresources/addEquipo?nombre=inocente&codigo=mptow1
    @GET
    public String addEquipo(@QueryParam("nombre") String nombre, @QueryParam("codigo") String codigo){
        // aqui llamamos al los modelos
        mequipo m = new mequipo();
        m.setNombre(nombre);
        m.setCodigo(codigo);
        
        if(m.add())
            return "Adicionado correctamente";
        else
            return "No se inserto correctamente";
        
    }
}
