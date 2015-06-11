package jobofferontology.ontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#JV_List
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:31:16
*/
public interface JV_List extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_elems
   */
   public void addHas_elems(Elem elem);
   public boolean removeHas_elems(Elem elem);
   public void clearAllHas_elems();
   public Iterator getAllHas_elems();
   public List getHas_elems();
   public void setHas_elems(List l);

}
