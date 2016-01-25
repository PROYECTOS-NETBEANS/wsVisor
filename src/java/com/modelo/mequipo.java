/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoException ;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
/**
 *
 * @author limbe
 */
public class mequipo extends conexion{
    
    private int     _id;
    private String  nombre;
    private String  codigo;
    
    
    
    public mequipo(){
        this.conectar();
    }
    public boolean add(){
        try {
            MongoCollection collection = this.getCollection("equipo");
            collection.insertOne( this.toEquipo() );
            return true;
        } catch (MongoException e) {
            System.out.println("com.modelo.mequipo.add()");
            return false;
        }

    }
   
    private Document toEquipo(){
        
        Document documento = new Document();
        documento.append("nombre", nombre);
        documento.append("codigo", codigo);
        
        return documento;
        
    }
    
    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
