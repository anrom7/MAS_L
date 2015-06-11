package jobofferontology.ontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Time_specification
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:31:16
*/
public interface Time_specification extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#belongs_to_end_date
   */
   public void addBelongs_to_end_date(Vacancy elem);
   public boolean removeBelongs_to_end_date(Vacancy elem);
   public void clearAllBelongs_to_end_date();
   public Iterator getAllBelongs_to_end_date();
   public List getBelongs_to_end_date();
   public void setBelongs_to_end_date(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#belongs_to_begin_date
   */
   public void addBelongs_to_begin_date(Vacancy elem);
   public boolean removeBelongs_to_begin_date(Vacancy elem);
   public void clearAllBelongs_to_begin_date();
   public Iterator getAllBelongs_to_begin_date();
   public List getBelongs_to_begin_date();
   public void setBelongs_to_begin_date(List l);

}
