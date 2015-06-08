package ua.edu.lp.cad.mas.lab3.geography;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#Location
* @author OntologyBeanGenerator v4.1
* @version 2015/06/8, 23:11:56
*/
public interface Location extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#is_associated_with_Vacancy
   */
   public void addIs_associated_with_Vacancy(JobOffOnt_Vacancy elem);
   public boolean removeIs_associated_with_Vacancy(JobOffOnt_Vacancy elem);
   public void clearAllIs_associated_with_Vacancy();
   public Iterator getAllIs_associated_with_Vacancy();
   public List getIs_associated_with_Vacancy();
   public void setIs_associated_with_Vacancy(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#is_location_of_Organization
   */
   public void addIs_location_of_Organization(JobOffOnt_Organization elem);
   public boolean removeIs_location_of_Organization(JobOffOnt_Organization elem);
   public void clearAllIs_location_of_Organization();
   public Iterator getAllIs_location_of_Organization();
   public List getIs_location_of_Organization();
   public void setIs_location_of_Organization(List l);

}
