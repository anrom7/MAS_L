package jobofferontology.ontology.impl;


import jade.util.leap.*;
import jobofferontology.ontology.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Elem
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:31:16
*/
public class DefaultElem implements Elem {

  private static final long serialVersionUID = 1989109886661307945L;

  private String _internalInstanceName = null;

  public DefaultElem() {
    this._internalInstanceName = "";
  }

  public DefaultElem(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_value
   */
   private List has_value = new ArrayList();
   public void addHas_value(Job_Vacancy elem) { 
     has_value.add(elem);
   }
   public boolean removeHas_value(Job_Vacancy elem) {
     boolean result = has_value.remove(elem);
     return result;
   }
   public void clearAllHas_value() {
     has_value.clear();
   }
   public Iterator getAllHas_value() {return has_value.iterator(); }
   public List getHas_value() {return has_value; }
   public void setHas_value(List l) {has_value = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_pos
   */
   private List has_pos = new ArrayList();
   public void addHas_pos(int elem) { 
     has_pos.add(elem);
   }
   public boolean removeHas_pos(int elem) {
     boolean result = (boolean) has_pos.remove(elem);
     return result;
   }
   public void clearAllHas_pos() {
     has_pos.clear();
   }
   public Iterator getAllHas_pos() {return has_pos.iterator(); }
   public List getHas_pos() {return has_pos; }
   public void setHas_pos(List l) {has_pos = l; }

}
