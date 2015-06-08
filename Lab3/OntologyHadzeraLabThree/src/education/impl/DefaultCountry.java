package education.impl;


import education.Continent;
import education.Country;
import education.JobOffOnt_Organization;
import education.JobOffOnt_Vacancy;
import education.JobSeeOnt_Candidacy;
import education.JobSeeOnt_Job_Seeker;
import education.Region;
import jade.util.leap.ArrayList;
import jade.util.leap.Iterator;
import jade.util.leap.List;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#Country
* @author OntologyBeanGenerator v4.1
* @version 2015/06/8, 23:11:56
*/
public class DefaultCountry implements Country {

  private static final long serialVersionUID = -1974204183884102668L;

  private String _internalInstanceName = null;

  public DefaultCountry() {
    this._internalInstanceName = "";
  }

  public DefaultCountry(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#is_residence_of_Job_Seeker
   */
   private List is_residence_of_Job_Seeker = new ArrayList();
   public void addIs_residence_of_Job_Seeker(JobSeeOnt_Job_Seeker elem) { 
     is_residence_of_Job_Seeker.add(elem);
   }
   public boolean removeIs_residence_of_Job_Seeker(JobSeeOnt_Job_Seeker elem) {
     boolean result = is_residence_of_Job_Seeker.remove(elem);
     return result;
   }
   public void clearAllIs_residence_of_Job_Seeker() {
     is_residence_of_Job_Seeker.clear();
   }
   public Iterator getAllIs_residence_of_Job_Seeker() {return is_residence_of_Job_Seeker.iterator(); }
   public List getIs_residence_of_Job_Seeker() {return is_residence_of_Job_Seeker; }
   public void setIs_residence_of_Job_Seeker(List l) {is_residence_of_Job_Seeker = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#has_region_Region
   */
   private List has_region_Region = new ArrayList();
   public void addHas_region_Region(Region elem) { 
     has_region_Region.add(elem);
   }
   public boolean removeHas_region_Region(Region elem) {
     boolean result = has_region_Region.remove(elem);
     return result;
   }
   public void clearAllHas_region_Region() {
     has_region_Region.clear();
   }
   public Iterator getAllHas_region_Region() {return has_region_Region.iterator(); }
   public List getHas_region_Region() {return has_region_Region; }
   public void setHas_region_Region(List l) {has_region_Region = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#is_nation_of_Candidacy
   */
   private List is_nation_of_Candidacy = new ArrayList();
   public void addIs_nation_of_Candidacy(JobSeeOnt_Candidacy elem) { 
     is_nation_of_Candidacy.add(elem);
   }
   public boolean removeIs_nation_of_Candidacy(JobSeeOnt_Candidacy elem) {
     boolean result = is_nation_of_Candidacy.remove(elem);
     return result;
   }
   public void clearAllIs_nation_of_Candidacy() {
     is_nation_of_Candidacy.clear();
   }
   public Iterator getAllIs_nation_of_Candidacy() {return is_nation_of_Candidacy.iterator(); }
   public List getIs_nation_of_Candidacy() {return is_nation_of_Candidacy; }
   public void setIs_nation_of_Candidacy(List l) {is_nation_of_Candidacy = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#is_located_in_Continent
   */
   private List is_located_in_Continent = new ArrayList();
   public void addIs_located_in_Continent(Continent elem) { 
     is_located_in_Continent.add(elem);
   }
   public boolean removeIs_located_in_Continent(Continent elem) {
     boolean result = is_located_in_Continent.remove(elem);
     return result;
   }
   public void clearAllIs_located_in_Continent() {
     is_located_in_Continent.clear();
   }
   public Iterator getAllIs_located_in_Continent() {return is_located_in_Continent.iterator(); }
   public List getIs_located_in_Continent() {return is_located_in_Continent; }
   public void setIs_located_in_Continent(List l) {is_located_in_Continent = l; }

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
