package educationontology.ontology.impl;


import jade.util.leap.*;
import educationontology.ontology.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Level_4
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:39:57
*/
public class DefaultLevel_4 implements Level_4 {

  private static final long serialVersionUID = 8382767021263464332L;

  private String _internalInstanceName = null;

  public DefaultLevel_4() {
    this._internalInstanceName = "";
  }

  public DefaultLevel_4(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Name
   */
   private List name = new ArrayList();
   public void addName(String elem) { 
     name.add(elem);
   }
   public boolean removeName(String elem) {
     boolean result = name.remove(elem);
     return result;
   }
   public void clearAllName() {
     name.clear();
   }
   public Iterator getAllName() {return name.iterator(); }
   public List getName() {return name; }
   public void setName(List l) {name = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#is_education_level_of
   */
   private List is_education_level_of = new ArrayList();
   public void addIs_education_level_of(Education elem) { 
     is_education_level_of.add(elem);
   }
   public boolean removeIs_education_level_of(Education elem) {
     boolean result = is_education_level_of.remove(elem);
     return result;
   }
   public void clearAllIs_education_level_of() {
     is_education_level_of.clear();
   }
   public Iterator getAllIs_education_level_of() {return is_education_level_of.iterator(); }
   public List getIs_education_level_of() {return is_education_level_of; }
   public void setIs_education_level_of(List l) {is_education_level_of = l; }

}
