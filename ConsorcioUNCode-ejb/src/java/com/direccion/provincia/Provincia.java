package com.direccion.provincia;

import com.direccion.pais.Pais;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Provincia implements Serializable {
    @Id
    private String id;
    private String nombre;
    private boolean eliminado;
    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;

    public Provincia(String id, String nombre, boolean eliminado , Pais pais) {
        this.id = id;
        this.nombre = nombre;
        this.eliminado = eliminado;
        this.pais = pais;
    }

    public Provincia() {
    }
    
    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Provincia)) {
            return false;
        }
        Provincia other = (Provincia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.direccion.provincia.Provincia[ id=" + id + " ]";
    }
    
}
