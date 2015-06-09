package jobofferontology.ontology.impl;


import jade.util.leap.*;
import jobofferontology.ontology.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Organization
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:31:16
*/
public class DefaultOrganization implements Organization {

  private static final long serialVersionUID = 1989109886661307945L;

  private String _internalInstanceName = null;

  public DefaultOrganization() {
    this._internalInstanceName = "";
  }

  public DefaultOrganization(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Postal_Code
   */
   private List postal_Code = new ArrayList();
   public void addPostal_Code(String elem) { 
     postal_Code.add(elem);
   }
   public boolean removePostal_Code(String elem) {
     boolean result = postal_Code.remove(elem);
     return result;
   }
   public void clearAllPostal_Code() {
     postal_Code.clear();
   }
   public Iterator getAllPostal_Code() {return postal_Code.iterator(); }
   public List getPostal_Code() {return postal_Code; }
   public void setPostal_Code(List l) {postal_Code = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Telephone
   */
   private List telephone = new ArrayList();
   public void addTelephone(String elem) { 
     telephone.add(elem);
   }
   public boolean removeTelephone(String elem) {
     boolean result = telephone.remove(elem);
     return result;
   }
   public void clearAllTelephone() {
     telephone.clear();
   }
   public Iterator getAllTelephone() {return telephone.iterator(); }
   public List getTelephone() {return telephone; }
   public void setTelephone(List l) {telephone = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#contact_person
   */
   private List contact_person = new ArrayList();
   public void addContact_person(String elem) { 
     contact_person.add(elem);
   }
   public boolean removeContact_person(String elem) {
     boolean result = contact_person.remove(elem);
     return result;
   }
   public void clearAllContact_person() {
     contact_person.clear();
   }
   public Iterator getAllContact_person() {return contact_person.iterator(); }
   public List getContact_person() {return contact_person; }
   public void setContact_person(List l) {contact_person = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Address
   */
   private List address = new ArrayList();
   public void addAddress(String elem) { 
     address.add(elem);
   }
   public boolean removeAddress(String elem) {
     boolean result = address.remove(elem);
     return result;
   }
   public void clearAllAddress() {
     address.clear();
   }
   public Iterator getAllAddress() {return address.iterator(); }
   public List getAddress() {return address; }
   public void setAddress(List l) {address = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#number_workers
   */
   private List number_workers = new ArrayList();
   public void addNumber_workers(int elem) { 
     number_workers.add(elem);
   }
   public boolean removeNumber_workers(int elem) {
     boolean result = (boolean) number_workers.remove(elem);
     return result;
   }
   public void clearAllNumber_workers() {
     number_workers.clear();
   }
   public Iterator getAllNumber_workers() {return number_workers.iterator(); }
   public List getNumber_workers() {return number_workers; }
   public void setNumber_workers(List l) {number_workers = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Full_Name
   */
   private List full_Name = new ArrayList();
   public void addFull_Name(String elem) { 
     full_Name.add(elem);
   }
   public boolean removeFull_Name(String elem) {
     boolean result = full_Name.remove(elem);
     return result;
   }
   public void clearAllFull_Name() {
     full_Name.clear();
   }
   public Iterator getAllFull_Name() {return full_Name.iterator(); }
   public List getFull_Name() {return full_Name; }
   public void setFull_Name(List l) {full_Name = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_job_vacancy
   */
   private List has_job_vacancy = new ArrayList();
   public void addHas_job_vacancy(Job_Vacancy elem) { 
     has_job_vacancy.add(elem);
   }
   public boolean removeHas_job_vacancy(Job_Vacancy elem) {
     boolean result = has_job_vacancy.remove(elem);
     return result;
   }
   public void clearAllHas_job_vacancy() {
     has_job_vacancy.clear();
   }
   public Iterator getAllHas_job_vacancy() {return has_job_vacancy.iterator(); }
   public List getHas_job_vacancy() {return has_job_vacancy; }
   public void setHas_job_vacancy(List l) {has_job_vacancy = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Fax
   */
   private List fax = new ArrayList();
   public void addFax(String elem) { 
     fax.add(elem);
   }
   public boolean removeFax(String elem) {
     boolean result = fax.remove(elem);
     return result;
   }
   public void clearAllFax() {
     fax.clear();
   }
   public Iterator getAllFax() {return fax.iterator(); }
   public List getFax() {return fax; }
   public void setFax(List l) {fax = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#email
   */
   private List email = new ArrayList();
   public void addEmail(String elem) { 
     email.add(elem);
   }
   public boolean removeEmail(String elem) {
     boolean result = email.remove(elem);
     return result;
   }
   public void clearAllEmail() {
     email.clear();
   }
   public Iterator getAllEmail() {return email.iterator(); }
   public List getEmail() {return email; }
   public void setEmail(List l) {email = l; }

}
