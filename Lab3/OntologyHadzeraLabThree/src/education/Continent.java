package education;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#Continent
* @author OntologyBeanGenerator v4.1
* @version 2015/06/8, 23:11:56
*/
public interface Continent extends Location {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#has_country_Country
   */
   public void addHas_country_Country(Country elem);
   public boolean removeHas_country_Country(Country elem);
   public void clearAllHas_country_Country();
   public Iterator getAllHas_country_Country();
   public List getHas_country_Country();
   public void setHas_country_Country(List l);

}
