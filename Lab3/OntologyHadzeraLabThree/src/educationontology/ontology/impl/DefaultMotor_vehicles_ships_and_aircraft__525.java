package educationontology.ontology.impl;


import jade.util.leap.*;
import educationontology.ontology.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Motor_vehicles_ships_and_aircraft__525
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:39:58
*/
public class DefaultMotor_vehicles_ships_and_aircraft__525 implements Motor_vehicles_ships_and_aircraft__525 {

  private static final long serialVersionUID = 8382767021263464332L;

  private String _internalInstanceName = null;

  public DefaultMotor_vehicles_ships_and_aircraft__525() {
    this._internalInstanceName = "";
  }

  public DefaultMotor_vehicles_ships_and_aircraft__525(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#is_education_field_of_Education
   */
   private List is_education_field_of_Education = new ArrayList();
   public void addIs_education_field_of_Education(Education elem) { 
     is_education_field_of_Education.add(elem);
   }
   public boolean removeIs_education_field_of_Education(Education elem) {
     boolean result = is_education_field_of_Education.remove(elem);
     return result;
   }
   public void clearAllIs_education_field_of_Education() {
     is_education_field_of_Education.clear();
   }
   public Iterator getAllIs_education_field_of_Education() {return is_education_field_of_Education.iterator(); }
   public List getIs_education_field_of_Education() {return is_education_field_of_Education; }
   public void setIs_education_field_of_Education(List l) {is_education_field_of_Education = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Excludes
   */
   private List excludes = new ArrayList();
   public void addExcludes(String elem) { 
     excludes.add(elem);
   }
   public boolean removeExcludes(String elem) {
     boolean result = excludes.remove(elem);
     return result;
   }
   public void clearAllExcludes() {
     excludes.clear();
   }
   public Iterator getAllExcludes() {return excludes.iterator(); }
   public List getExcludes() {return excludes; }
   public void setExcludes(List l) {excludes = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Includes
   */
   private List includes = new ArrayList();
   public void addIncludes(String elem) { 
     includes.add(elem);
   }
   public boolean removeIncludes(String elem) {
     boolean result = includes.remove(elem);
     return result;
   }
   public void clearAllIncludes() {
     includes.clear();
   }
   public Iterator getAllIncludes() {return includes.iterator(); }
   public List getIncludes() {return includes; }
   public void setIncludes(List l) {includes = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Definition
   */
   private List definition = new ArrayList();
   public void addDefinition(String elem) { 
     definition.add(elem);
   }
   public boolean removeDefinition(String elem) {
     boolean result = definition.remove(elem);
     return result;
   }
   public void clearAllDefinition() {
     definition.clear();
   }
   public Iterator getAllDefinition() {return definition.iterator(); }
   public List getDefinition() {return definition; }
   public void setDefinition(List l) {definition = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Code
   */
   private List code = new ArrayList();
   public void addCode(String elem) { 
     code.add(elem);
   }
   public boolean removeCode(String elem) {
     boolean result = code.remove(elem);
     return result;
   }
   public void clearAllCode() {
     code.clear();
   }
   public Iterator getAllCode() {return code.iterator(); }
   public List getCode() {return code; }
   public void setCode(List l) {code = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Level
   */
   private List level = new ArrayList();
   public void addLevel(String elem) { 
     level.add(elem);
   }
   public boolean removeLevel(String elem) {
     boolean result = level.remove(elem);
     return result;
   }
   public void clearAllLevel() {
     level.clear();
   }
   public Iterator getAllLevel() {return level.iterator(); }
   public List getLevel() {return level; }
   public void setLevel(List l) {level = l; }

}
