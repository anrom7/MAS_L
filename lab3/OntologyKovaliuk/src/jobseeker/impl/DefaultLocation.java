package jobseeker.impl;


import jade.util.leap.ArrayList;
import jade.util.leap.Iterator;
import jade.util.leap.List;
import jobseeker.JobOffOnt_Organization;
import jobseeker.JobOffOnt_Vacancy;
import jobseeker.Location;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#Location
* @author OntologyBeanGenerator v4.1
* @version 2015/06/8, 23:11:56
*/
public class DefaultLocation implements Location {

  private static final long serialVersionUID = -1974204183884102668L;

  private String _internalInstanceName = null;

  public DefaultLocation() {
    this._internalInstanceName = "";
  }

  public DefaultLocation(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#is_associated_with_Vacancy
   */
   private List is_associated_with_Vacancy = new ArrayList();
   public void addIs_associated_with_Vacancy(JobOffOnt_Vacancy elem) { 
     is_associated_with_Vacancy.add(elem);
   }
   public boolean removeIs_associated_with_Vacancy(JobOffOnt_Vacancy elem) {
     boolean result = is_associated_with_Vacancy.remove(elem);
     return result;
   }
   public void clearAllIs_associated_with_Vacancy() {
     is_associated_with_Vacancy.clear();
   }
   public Iterator getAllIs_associated_with_Vacancy() {return is_associated_with_Vacancy.iterator(); }
   public List getIs_associated_with_Vacancy() {return is_associated_with_Vacancy; }
   public void setIs_associated_with_Vacancy(List l) {is_associated_with_Vacancy = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#is_location_of_Organization
   */
   private List is_location_of_Organization = new ArrayList();
   public void addIs_location_of_Organization(JobOffOnt_Organization elem) { 
     is_location_of_Organization.add(elem);
   }
   public boolean removeIs_location_of_Organization(JobOffOnt_Organization elem) {
     boolean result = is_location_of_Organization.remove(elem);
     return result;
   }
   public void clearAllIs_location_of_Organization() {
     is_location_of_Organization.clear();
   }
   public Iterator getAllIs_location_of_Organization() {return is_location_of_Organization.iterator(); }
   public List getIs_location_of_Organization() {return is_location_of_Organization; }
   public void setIs_location_of_Organization(List l) {is_location_of_Organization = l; }

}
