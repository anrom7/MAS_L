package languageontology.ontology.impl;


import jade.util.leap.*;
import languageontology.ontology.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#Language_Level
* @author OntologyBeanGenerator v4.1
* @version 2015/06/11, 22:55:16
*/
public class DefaultLanguage_Level implements Language_Level {

  private static final long serialVersionUID = -7416178792637387560L;

  private String _internalInstanceName = null;

  public DefaultLanguage_Level() {
    this._internalInstanceName = "";
  }

  public DefaultLanguage_Level(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#is_spoken_production_level_Language_Proficiency
   */
   private List is_spoken_production_level_Language_Proficiency = new ArrayList();
   public void addIs_spoken_production_level_Language_Proficiency(Language_Proficiency elem) { 
     is_spoken_production_level_Language_Proficiency.add(elem);
   }
   public boolean removeIs_spoken_production_level_Language_Proficiency(Language_Proficiency elem) {
     boolean result = is_spoken_production_level_Language_Proficiency.remove(elem);
     return result;
   }
   public void clearAllIs_spoken_production_level_Language_Proficiency() {
     is_spoken_production_level_Language_Proficiency.clear();
   }
   public Iterator getAllIs_spoken_production_level_Language_Proficiency() {return is_spoken_production_level_Language_Proficiency.iterator(); }
   public List getIs_spoken_production_level_Language_Proficiency() {return is_spoken_production_level_Language_Proficiency; }
   public void setIs_spoken_production_level_Language_Proficiency(List l) {is_spoken_production_level_Language_Proficiency = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#is_reading_level_Language_Proficiency
   */
   private List is_reading_level_Language_Proficiency = new ArrayList();
   public void addIs_reading_level_Language_Proficiency(Language_Proficiency elem) { 
     is_reading_level_Language_Proficiency.add(elem);
   }
   public boolean removeIs_reading_level_Language_Proficiency(Language_Proficiency elem) {
     boolean result = is_reading_level_Language_Proficiency.remove(elem);
     return result;
   }
   public void clearAllIs_reading_level_Language_Proficiency() {
     is_reading_level_Language_Proficiency.clear();
   }
   public Iterator getAllIs_reading_level_Language_Proficiency() {return is_reading_level_Language_Proficiency.iterator(); }
   public List getIs_reading_level_Language_Proficiency() {return is_reading_level_Language_Proficiency; }
   public void setIs_reading_level_Language_Proficiency(List l) {is_reading_level_Language_Proficiency = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#is_writing_level_Language_Proficiency
   */
   private List is_writing_level_Language_Proficiency = new ArrayList();
   public void addIs_writing_level_Language_Proficiency(Language_Proficiency elem) { 
     is_writing_level_Language_Proficiency.add(elem);
   }
   public boolean removeIs_writing_level_Language_Proficiency(Language_Proficiency elem) {
     boolean result = is_writing_level_Language_Proficiency.remove(elem);
     return result;
   }
   public void clearAllIs_writing_level_Language_Proficiency() {
     is_writing_level_Language_Proficiency.clear();
   }
   public Iterator getAllIs_writing_level_Language_Proficiency() {return is_writing_level_Language_Proficiency.iterator(); }
   public List getIs_writing_level_Language_Proficiency() {return is_writing_level_Language_Proficiency; }
   public void setIs_writing_level_Language_Proficiency(List l) {is_writing_level_Language_Proficiency = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#is_spoken_interaction_level_Language_Proficiency
   */
   private List is_spoken_interaction_level_Language_Proficiency = new ArrayList();
   public void addIs_spoken_interaction_level_Language_Proficiency(Language_Proficiency elem) { 
     is_spoken_interaction_level_Language_Proficiency.add(elem);
   }
   public boolean removeIs_spoken_interaction_level_Language_Proficiency(Language_Proficiency elem) {
     boolean result = is_spoken_interaction_level_Language_Proficiency.remove(elem);
     return result;
   }
   public void clearAllIs_spoken_interaction_level_Language_Proficiency() {
     is_spoken_interaction_level_Language_Proficiency.clear();
   }
   public Iterator getAllIs_spoken_interaction_level_Language_Proficiency() {return is_spoken_interaction_level_Language_Proficiency.iterator(); }
   public List getIs_spoken_interaction_level_Language_Proficiency() {return is_spoken_interaction_level_Language_Proficiency; }
   public void setIs_spoken_interaction_level_Language_Proficiency(List l) {is_spoken_interaction_level_Language_Proficiency = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#is_listening_level_Language_Proficiency
   */
   private List is_listening_level_Language_Proficiency = new ArrayList();
   public void addIs_listening_level_Language_Proficiency(Language_Proficiency elem) { 
     is_listening_level_Language_Proficiency.add(elem);
   }
   public boolean removeIs_listening_level_Language_Proficiency(Language_Proficiency elem) {
     boolean result = is_listening_level_Language_Proficiency.remove(elem);
     return result;
   }
   public void clearAllIs_listening_level_Language_Proficiency() {
     is_listening_level_Language_Proficiency.clear();
   }
   public Iterator getAllIs_listening_level_Language_Proficiency() {return is_listening_level_Language_Proficiency.iterator(); }
   public List getIs_listening_level_Language_Proficiency() {return is_listening_level_Language_Proficiency; }
   public void setIs_listening_level_Language_Proficiency(List l) {is_listening_level_Language_Proficiency = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#Description
   */
   private List description = new ArrayList();
   public void addDescription(String elem) { 
     description.add(elem);
   }
   public boolean removeDescription(String elem) {
     boolean result = description.remove(elem);
     return result;
   }
   public void clearAllDescription() {
     description.clear();
   }
   public Iterator getAllDescription() {return description.iterator(); }
   public List getDescription() {return description; }
   public void setDescription(List l) {description = l; }

}
