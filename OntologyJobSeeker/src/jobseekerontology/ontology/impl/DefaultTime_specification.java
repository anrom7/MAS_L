package jobseekerontology.ontology.impl;


import jade.util.leap.*;
import jobseekerontology.ontology.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Time_specification
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:43:39
*/
public class DefaultTime_specification implements Time_specification {

  private static final long serialVersionUID = -1973973912326510515L;

  private String _internalInstanceName = null;

  public DefaultTime_specification() {
    this._internalInstanceName = "";
  }

  public DefaultTime_specification(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#belongs_to_end_date
   */
   private List belongs_to_end_date = new ArrayList();
   public void addBelongs_to_end_date(Vacancy elem) { 
     belongs_to_end_date.add(elem);
   }
   public boolean removeBelongs_to_end_date(Vacancy elem) {
     boolean result = belongs_to_end_date.remove(elem);
     return result;
   }
   public void clearAllBelongs_to_end_date() {
     belongs_to_end_date.clear();
   }
   public Iterator getAllBelongs_to_end_date() {return belongs_to_end_date.iterator(); }
   public List getBelongs_to_end_date() {return belongs_to_end_date; }
   public void setBelongs_to_end_date(List l) {belongs_to_end_date = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#belongs_to_begin_date
   */
   private List belongs_to_begin_date = new ArrayList();
   public void addBelongs_to_begin_date(Vacancy elem) { 
     belongs_to_begin_date.add(elem);
   }
   public boolean removeBelongs_to_begin_date(Vacancy elem) {
     boolean result = belongs_to_begin_date.remove(elem);
     return result;
   }
   public void clearAllBelongs_to_begin_date() {
     belongs_to_begin_date.clear();
   }
   public Iterator getAllBelongs_to_begin_date() {return belongs_to_begin_date.iterator(); }
   public List getBelongs_to_begin_date() {return belongs_to_begin_date; }
   public void setBelongs_to_begin_date(List l) {belongs_to_begin_date = l; }

}
