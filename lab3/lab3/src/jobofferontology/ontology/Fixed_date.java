package jobofferontology.ontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Fixed_date
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:31:16
*/
public interface Fixed_date extends Time_specification {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#date
   */
   public void addDate(Time_DateTimeDescription elem);
   public boolean removeDate(Time_DateTimeDescription elem);
   public void clearAllDate();
   public Iterator getAllDate();
   public List getDate();
   public void setDate(List l);

}
