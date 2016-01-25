/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoException;

/**
 *
 * @author limbe
 */

public class conexion {
    
    private MongoClientURI uri;
    private MongoClient mongo;
    private MongoDatabase db;
    
    
    public void conectar(){
        try {                           // mongodb://user:pass@host:port/d
            uri  = new MongoClientURI("mongodb://limbert:200221094@ds027479.mongolab.com:27479/dblimbert");
            mongo = new MongoClient(uri);
            db = mongo.getDatabase(uri.getDatabase());
        } catch (MongoException e) {
            System.err.println("Error : " + e.getMessage());
        }
    }
    
    public MongoCollection getCollection(String nombre){
        return  db.getCollection(nombre);
    }

}
