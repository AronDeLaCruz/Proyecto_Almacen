package com.prueba.prototipo.Modelos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author Aron
 */

@Entity
@Data
@Table(name ="solicitud_entrada")
public class SolicitudEntrada implements Serializable{
    
    private final static Long serialVersionUID=1L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected String codSolicitud;
    
    @NotEmpty
    protected int fechaSolicitud;
   
    protected Long dniEmpleado;
    
    protected int dniEmisor;
    
    @NotEmpty
    @OneToMany
    @JoinColumn(name = "cod_solicitud")
    protected List<ProdSolEntr> codigoProducto;
    
    //asi se hace, es onetomany para que los agrupe a todos xd
    
}
