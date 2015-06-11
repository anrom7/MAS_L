package languageontology.ontology.impl;


import jade.util.leap.*;
import languageontology.ontology.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#Language_Proficiency
* @author OntologyBeanGenerator v4.1
* @version 2015/06/11, 22:55:16
*/
public class DefaultLanguage_Proficiency implements Language_Proficiency {

  private static final long serialVersionUID = -7416178792637387560L;

  private String _internalInstanceName = null;

  public DefaultLanguage_Proficiency() {
    this._internalInstanceName = "";
  }

  public DefaultLanguage_Proficiency(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#has_writing_level
   */
   private List has_writing_level = new ArrayList();
   public void addHas_writing_level(Language_Level elem) { 
     has_writing_level.add(elem);
   }
   public boolean removeHas_writing_level(Language_Level elem) {
     boolean result = has_writing_level.remove(elem);
     return result;
   }
   public void clearAllHas_writing_level() {
     has_writing_level.clear();
   }
   public Iterator getAllHas_writing_level() {return has_writing_level.iterator(); }
   public List getHas_writing_level() {return has_writing_level; }
   public void setHas_writing_level(List l) {has_writing_level = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#has_spoken_production_level
   */
   private List has_spoken_production_level = new ArrayList();
   public void addHas_spoken_production_level(Language_Level elem) { 
     has_spoken_production_level.add(elem);
   }
   public boolean removeHas_spoken_production_level(Language_Level elem) {
     boolean result = has_spoken_production_level.remove(elem);
     return result;
   }
   public void clearAllHas_spoken_production_level() {
     has_spoken_production_level.clear();
   }
   public Iterator getAllHas_spoken_production_level() {return has_spoken_production_level.iterator(); }
   public List getHas_spoken_production_level() {return has_spoken_production_level; }
   public void setHas_spoken_production_level(List l) {has_spoken_production_level = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#has_listening_level
   */
   private List has_listening_level = new ArrayList();
   public void addHas_listening_level(Language_Level elem) { 
     has_listening_level.add(elem);
   }
   public boolean removeHas_listening_level(Language_Level elem) {
     boolean result = has_listening_level.remove(elem);
     return result;
   }
   public void clearAllHas_listening_level() {
     has_listening_level.clear();
   }
   public Iterator getAllHas_listening_level() {return has_listening_level.iterator(); }
   public List getHas_listening_level() {return has_listening_level; }
   public void setHas_listening_level(List l) {has_listening_level = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#related_language
   */
   private List related_language = new ArrayList();
   public void addRelated_language(Language elem) { 
     related_language.add(elem);
   }
   public boolean removeRelated_language(Language elem) {
     boolean result = related_language.remove(elem);
     return result;
   }
   public void clearAllRelated_language() {
     related_language.clear();
   }
   public Iterator getAllRelated_language() {return related_language.iterator(); }
   public List getRelated_language() {return related_language; }
   public void setRelated_language(List l) {related_language = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#has_spoken_interaction_level
   */
   private List has_spoken_interaction_level = new ArrayList();
   public void addHas_spoken_interaction_level(Language_Level elem) { 
     has_spoken_interaction_level.add(elem);
   }
   public boolean removeHas_spoken_interaction_level(Language_Level elem) {
     boolean result = has_spoken_interaction_level.remove(elem);
     return result;
   }
   public void clearAllHas_spoken_interaction_level() {
     has_spoken_interaction_level.clear();
   }
   public Iterator getAllHas_spoken_interaction_level() {return has_spoken_interaction_level.iterator(); }
   public List getHas_spoken_interaction_level() {return has_spoken_interaction_level; }
   public void setHas_spoken_interaction_level(List l) {has_spoken_interaction_level = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#has_reading_level
   */
   private List has_reading_level = new ArrayList();
   public void addHas_reading_level(Language_Level elem) { 
     has_reading_level.add(elem);
   }
   public boolean removeHas_reading_level(Language_Level elem) {
     boolean result = has_reading_level.remove(elem);
     return result;
   }
   public void clearAllHas_reading_level() {
     has_reading_level.clear();
   }
   public Iterator getAllHas_reading_level() {return has_reading_level.iterator(); }
   public List getHas_reading_level() {return has_reading_level; }
   public void setHas_reading_level(List l) {has_reading_level = l; }

}
