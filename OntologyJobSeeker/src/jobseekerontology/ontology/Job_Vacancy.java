package jobseekerontology.ontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Job_Vacancy
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:43:39
*/
public interface Job_Vacancy extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#anonymous
   */
   public void addAnonymous(boolean elem);
   public boolean removeAnonymous(boolean elem);
   public void clearAllAnonymous();
   public Iterator getAllAnonymous();
   public List getAnonymous();
   public void setAnonymous(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_vacancy
   */
   public void addHas_vacancy(Vacancy elem);
   public boolean removeHas_vacancy(Vacancy elem);
   public void clearAllHas_vacancy();
   public Iterator getAllHas_vacancy();
   public List getHas_vacancy();
   public void setHas_vacancy(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#employment_agent
   */
   public void addEmployment_agent(String elem);
   public boolean removeEmployment_agent(String elem);
   public void clearAllEmployment_agent();
   public Iterator getAllEmployment_agent();
   public List getEmployment_agent();
   public void setEmployment_agent(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#how_to_apply
   */
   public void addHow_to_apply(How_To_Apply elem);
   public boolean removeHow_to_apply(How_To_Apply elem);
   public void clearAllHow_to_apply();
   public Iterator getAllHow_to_apply();
   public List getHow_to_apply();
   public void setHow_to_apply(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#publication_date
   */
   public void addPublication_date(Time_DateTimeDescription elem);
   public boolean removePublication_date(Time_DateTimeDescription elem);
   public void clearAllPublication_date();
   public Iterator getAllPublication_date();
   public List getPublication_date();
   public void setPublication_date(List l);

}
