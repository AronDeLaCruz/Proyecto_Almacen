/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prototipo.Modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author Aron
 */

@Entity
@Data
@Table(name ="solicitud")
public class Solicitud implements Serializable{
    
    private final static Long serialVersionUID=1L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected String codSolicitud;
    
    @NotEmpty
    protected int fechaSolicitud;
    
    
    protected Long dniEmpleado;
}
