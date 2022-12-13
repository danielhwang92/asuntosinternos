/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.bomberosquito.asuntosinternos.facades;

import ec.bomberosquito.asuntosinternos.entidades.Eventos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author danielhwang
 */
@Stateless
public class EventosFacade extends AbstractFacade<Eventos> {

    @PersistenceContext(unitName = "primary")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EventosFacade() {
        super(Eventos.class);
    }
    
}
