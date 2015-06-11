package jobofferontology.ontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Requested_Work_Experience
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:31:16
*/
public interface Requested_Work_Experience extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#is_associated_with
   */
   public void addIs_associated_with(Vacancy elem);
   public boolean removeIs_associated_with(Vacancy elem);
   public void clearAllIs_associated_with();
   public Iterator getAllIs_associated_with();
   public List getIs_associated_with();
   public void setIs_associated_with(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Years
   */
   public void addYears(Time_Year elem);
   public boolean removeYears(Time_Year elem);
   public void clearAllYears();
   public Iterator getAllYears();
   public List getYears();
   public void setYears(List l);

}
