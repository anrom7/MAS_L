package jobofferontology.ontology.impl;


import jade.util.leap.*;
import jobofferontology.ontology.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#How_To_Apply
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:31:16
*/
public class DefaultHow_To_Apply implements How_To_Apply {

  private static final long serialVersionUID = 1989109886661307945L;

  private String _internalInstanceName = null;

  public DefaultHow_To_Apply() {
    this._internalInstanceName = "";
  }

  public DefaultHow_To_Apply(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#description
   */
   private List description = new ArrayList();
   public void addDescription(String elem) { 
     description.add(elem);
   }
   public boolean removeDescription(String elem) {
     boolean result = description.remove(elem);
     return result;
   }
   public void clearAllDescription() {
     description.clear();
   }
   public Iterator getAllDescription() {return description.iterator(); }
   public List getDescription() {return description; }
   public void setDescription(List l) {description = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Id
   */
   private List id = new ArrayList();
   public void addId(int elem) { 
     id.add(elem);
   }
   public boolean removeId(int elem) {
     boolean result = (boolean) id.remove(elem);
     return result;
   }
   public void clearAllId() {
     id.clear();
   }
   public Iterator getAllId() {return id.iterator(); }
   public List getId() {return id; }
   public void setId(List l) {id = l; }

}
