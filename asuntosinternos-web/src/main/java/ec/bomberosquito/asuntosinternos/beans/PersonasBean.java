/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.bomberosquito.asuntosinternos.beans;

import ec.bomberosquito.asuntosinternos.entidades.Personas;
import ec.bomberosquito.asuntosinternos.facades.PersonasFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author danielhwang
 */
@Named
@ViewScoped
public class PersonasBean implements Serializable{
    
    private Personas persona;
    @EJB
    private PersonasFacade ejbPersonas;
    
    @PostConstruct
    public void iniciar(){
        persona = new Personas();
    }
    
    public String crear () {
        ejbPersonas.create(persona);
        return null;
    }

    /**
     * @return the persona
     */
    public Personas getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(Personas persona) {
        this.persona = persona;
    }
    
}
