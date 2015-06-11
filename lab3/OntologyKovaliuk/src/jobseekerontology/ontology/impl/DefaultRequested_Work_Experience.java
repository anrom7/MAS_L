package jobseekerontology.ontology.impl;


import jade.util.leap.*;
import jobseekerontology.ontology.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Requested_Work_Experience
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:43:39
*/
public class DefaultRequested_Work_Experience implements Requested_Work_Experience {

  private static final long serialVersionUID = -1973973912326510515L;

  private String _internalInstanceName = null;

  public DefaultRequested_Work_Experience() {
    this._internalInstanceName = "";
  }

  public DefaultRequested_Work_Experience(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#is_associated_with
   */
   private List is_associated_with = new ArrayList();
   public void addIs_associated_with(Vacancy elem) { 
     is_associated_with.add(elem);
   }
   public boolean removeIs_associated_with(Vacancy elem) {
     boolean result = is_associated_with.remove(elem);
     return result;
   }
   public void clearAllIs_associated_with() {
     is_associated_with.clear();
   }
   public Iterator getAllIs_associated_with() {return is_associated_with.iterator(); }
   public List getIs_associated_with() {return is_associated_with; }
   public void setIs_associated_with(List l) {is_associated_with = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Years
   */
   private List years = new ArrayList();
   public void addYears(Time_Year elem) { 
     years.add(elem);
   }
   public boolean removeYears(Time_Year elem) {
     boolean result = years.remove(elem);
     return result;
   }
   public void clearAllYears() {
     years.clear();
   }
   public Iterator getAllYears() {return years.iterator(); }
   public List getYears() {return years; }
   public void setYears(List l) {years = l; }

}
