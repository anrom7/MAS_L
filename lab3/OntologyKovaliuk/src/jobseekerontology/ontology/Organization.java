package jobseekerontology.ontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Organization
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:43:39
*/
public interface Organization extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Postal_Code
   */
   public void addPostal_Code(String elem);
   public boolean removePostal_Code(String elem);
   public void clearAllPostal_Code();
   public Iterator getAllPostal_Code();
   public List getPostal_Code();
   public void setPostal_Code(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Telephone
   */
   public void addTelephone(String elem);
   public boolean removeTelephone(String elem);
   public void clearAllTelephone();
   public Iterator getAllTelephone();
   public List getTelephone();
   public void setTelephone(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#contact_person
   */
   public void addContact_person(String elem);
   public boolean removeContact_person(String elem);
   public void clearAllContact_person();
   public Iterator getAllContact_person();
   public List getContact_person();
   public void setContact_person(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Address
   */
   public void addAddress(String elem);
   public boolean removeAddress(String elem);
   public void clearAllAddress();
   public Iterator getAllAddress();
   public List getAddress();
   public void setAddress(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#number_workers
   */
   public void addNumber_workers(int elem);
   public boolean removeNumber_workers(int elem);
   public void clearAllNumber_workers();
   public Iterator getAllNumber_workers();
   public List getNumber_workers();
   public void setNumber_workers(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Full_Name
   */
   public void addFull_Name(String elem);
   public boolean removeFull_Name(String elem);
   public void clearAllFull_Name();
   public Iterator getAllFull_Name();
   public List getFull_Name();
   public void setFull_Name(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_job_vacancy
   */
   public void addHas_job_vacancy(Job_Vacancy elem);
   public boolean removeHas_job_vacancy(Job_Vacancy elem);
   public void clearAllHas_job_vacancy();
   public Iterator getAllHas_job_vacancy();
   public List getHas_job_vacancy();
   public void setHas_job_vacancy(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Fax
   */
   public void addFax(String elem);
   public boolean removeFax(String elem);
   public void clearAllFax();
   public Iterator getAllFax();
   public List getFax();
   public void setFax(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#email
   */
   public void addEmail(String elem);
   public boolean removeEmail(String elem);
   public void clearAllEmail();
   public Iterator getAllEmail();
   public List getEmail();
   public void setEmail(List l);

}
