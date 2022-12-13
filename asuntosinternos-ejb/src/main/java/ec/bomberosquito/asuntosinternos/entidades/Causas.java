/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.bomberosquito.asuntosinternos.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author danielhwang
 */
@Entity
@Table(name = "causas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Causas.findAll", query = "SELECT c FROM Causas c"),
    @NamedQuery(name = "Causas.findById", query = "SELECT c FROM Causas c WHERE c.id = :id"),
    @NamedQuery(name = "Causas.findByDescripcion", query = "SELECT c FROM Causas c WHERE c.descripcion = :descripcion")})
public class Causas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "causa")
    private List<Casos> casosList;

    public Causas() {
    }

    public Causas(Integer id) {
        this.id = id;
    }

    public Causas(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Casos> getCasosList() {
        return casosList;
    }

    public void setCasosList(List<Casos> casosList) {
        this.casosList = casosList;
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
        if (!(object instanceof Causas)) {
            return false;
        }
        Causas other = (Causas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.bomberosquito.asuntosinternos.entidades.Causas[ id=" + id + " ]";
    }
    
}
