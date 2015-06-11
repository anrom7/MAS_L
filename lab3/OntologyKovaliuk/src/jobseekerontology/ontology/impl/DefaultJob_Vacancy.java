package jobseekerontology.ontology.impl;


import jade.util.leap.*;
import jobseekerontology.ontology.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Job_Vacancy
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:43:39
*/
public class DefaultJob_Vacancy implements Job_Vacancy {

  private static final long serialVersionUID = -1973973912326510515L;

  private String _internalInstanceName = null;

  public DefaultJob_Vacancy() {
    this._internalInstanceName = "";
  }

  public DefaultJob_Vacancy(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#anonymous
   */
   private List anonymous = new ArrayList();
   public void addAnonymous(boolean elem) { 
     anonymous.add(elem);
   }
   public boolean removeAnonymous(boolean elem) {
     boolean result = anonymous.remove(elem);
     return result;
   }
   public void clearAllAnonymous() {
     anonymous.clear();
   }
   public Iterator getAllAnonymous() {return anonymous.iterator(); }
   public List getAnonymous() {return anonymous; }
   public void setAnonymous(List l) {anonymous = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_vacancy
   */
   private List has_vacancy = new ArrayList();
   public void addHas_vacancy(Vacancy elem) { 
     has_vacancy.add(elem);
   }
   public boolean removeHas_vacancy(Vacancy elem) {
     boolean result = has_vacancy.remove(elem);
     return result;
   }
   public void clearAllHas_vacancy() {
     has_vacancy.clear();
   }
   public Iterator getAllHas_vacancy() {return has_vacancy.iterator(); }
   public List getHas_vacancy() {return has_vacancy; }
   public void setHas_vacancy(List l) {has_vacancy = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#employment_agent
   */
   private List employment_agent = new ArrayList();
   public void addEmployment_agent(String elem) { 
     employment_agent.add(elem);
   }
   public boolean removeEmployment_agent(String elem) {
     boolean result = employment_agent.remove(elem);
     return result;
   }
   public void clearAllEmployment_agent() {
     employment_agent.clear();
   }
   public Iterator getAllEmployment_agent() {return employment_agent.iterator(); }
   public List getEmployment_agent() {return employment_agent; }
   public void setEmployment_agent(List l) {employment_agent = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#how_to_apply
   */
   private List how_to_apply = new ArrayList();
   public void addHow_to_apply(How_To_Apply elem) { 
     how_to_apply.add(elem);
   }
   public boolean removeHow_to_apply(How_To_Apply elem) {
     boolean result = how_to_apply.remove(elem);
     return result;
   }
   public void clearAllHow_to_apply() {
     how_to_apply.clear();
   }
   public Iterator getAllHow_to_apply() {return how_to_apply.iterator(); }
   public List getHow_to_apply() {return how_to_apply; }
   public void setHow_to_apply(List l) {how_to_apply = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#publication_date
   */
   private List publication_date = new ArrayList();
   public void addPublication_date(Time_DateTimeDescription elem) { 
     publication_date.add(elem);
   }
   public boolean removePublication_date(Time_DateTimeDescription elem) {
     boolean result = publication_date.remove(elem);
     return result;
   }
   public void clearAllPublication_date() {
     publication_date.clear();
   }
   public Iterator getAllPublication_date() {return publication_date.iterator(); }
   public List getPublication_date() {return publication_date; }
   public void setPublication_date(List l) {publication_date = l; }

}
