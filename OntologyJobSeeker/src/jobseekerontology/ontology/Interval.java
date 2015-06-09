package jobseekerontology.ontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Interval
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:43:39
*/
public interface Interval extends Time_specification {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#dates
   */
   public void addDates(Time_DateTimeInterval elem);
   public boolean removeDates(Time_DateTimeInterval elem);
   public void clearAllDates();
   public Iterator getAllDates();
   public List getDates();
   public void setDates(List l);

}
