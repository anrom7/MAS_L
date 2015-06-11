package jobofferontology.ontology.impl;


import jade.util.leap.*;
import jobofferontology.ontology.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#JV_List
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:31:16
*/
public class DefaultJV_List implements JV_List {

  private static final long serialVersionUID = 1989109886661307945L;

  private String _internalInstanceName = null;

  public DefaultJV_List() {
    this._internalInstanceName = "";
  }

  public DefaultJV_List(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_elems
   */
   private List has_elems = new ArrayList();
   public void addHas_elems(Elem elem) { 
     has_elems.add(elem);
   }
   public boolean removeHas_elems(Elem elem) {
     boolean result = has_elems.remove(elem);
     return result;
   }
   public void clearAllHas_elems() {
     has_elems.clear();
   }
   public Iterator getAllHas_elems() {return has_elems.iterator(); }
   public List getHas_elems() {return has_elems; }
   public void setHas_elems(List l) {has_elems = l; }

}
