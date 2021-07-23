package com.prueba.prototipo.Modelos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;


@Entity
@Data
@Table(name ="solicitud_salida")
public class SolicitudSalida implements Serializable{
    
    private final static Long serialVersionUID=1L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected String codSolicitud;
    
    @NotEmpty
    protected int fechaSolicitud;
    
    
    protected int dniReceptor;
    
    @NotEmpty
    @OneToMany
    @JoinColumn(name = "cod_solicitud")
    protected List<ProdSolSal> codigoProducto;
    
}
