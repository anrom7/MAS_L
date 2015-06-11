package ua.ontologylab;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#Language_Proficiency
* @author OntologyBeanGenerator v4.1
* @version 2015/06/11, 22:55:16
*/
public interface Language_Proficiency extends Com_Competence {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#has_writing_level
   */
   public void addHas_writing_level(Language_Level elem);
   public boolean removeHas_writing_level(Language_Level elem);
   public void clearAllHas_writing_level();
   public Iterator getAllHas_writing_level();
   public List getHas_writing_level();
   public void setHas_writing_level(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#has_spoken_production_level
   */
   public void addHas_spoken_production_level(Language_Level elem);
   public boolean removeHas_spoken_production_level(Language_Level elem);
   public void clearAllHas_spoken_production_level();
   public Iterator getAllHas_spoken_production_level();
   public List getHas_spoken_production_level();
   public void setHas_spoken_production_level(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#has_listening_level
   */
   public void addHas_listening_level(Language_Level elem);
   public boolean removeHas_listening_level(Language_Level elem);
   public void clearAllHas_listening_level();
   public Iterator getAllHas_listening_level();
   public List getHas_listening_level();
   public void setHas_listening_level(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#related_language
   */
   public void addRelated_language(Language elem);
   public boolean removeRelated_language(Language elem);
   public void clearAllRelated_language();
   public Iterator getAllRelated_language();
   public List getRelated_language();
   public void setRelated_language(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#has_spoken_interaction_level
   */
   public void addHas_spoken_interaction_level(Language_Level elem);
   public boolean removeHas_spoken_interaction_level(Language_Level elem);
   public void clearAllHas_spoken_interaction_level();
   public Iterator getAllHas_spoken_interaction_level();
   public List getHas_spoken_interaction_level();
   public void setHas_spoken_interaction_level(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#has_reading_level
   */
   public void addHas_reading_level(Language_Level elem);
   public boolean removeHas_reading_level(Language_Level elem);
   public void clearAllHas_reading_level();
   public Iterator getAllHas_reading_level();
   public List getHas_reading_level();
   public void setHas_reading_level(List l);

}
