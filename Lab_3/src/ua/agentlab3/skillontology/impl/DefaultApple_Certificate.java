package ua.agentlab3.skillontology.impl;


import jade.util.leap.*;
import ua.agentlab3.skillontology.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Skill_Ontology#Apple_Certificate
* @author OntologyBeanGenerator v4.1
* @version 2015/06/10, 23:36:36
*/
public class DefaultApple_Certificate implements Apple_Certificate {

  private static final long serialVersionUID = -1750159446835811867L;

  private String _internalInstanceName = null;

  public DefaultApple_Certificate() {
    this._internalInstanceName = "";
  }

  public DefaultApple_Certificate(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Skill_Ontology#Description
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

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Skill_Ontology#Name
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
   * Protege name: http://mccarthy.dia.fi.upm.es/Skill_Ontology#weigth
   */
   private List weigth = new ArrayList();
   public void addWeigth(int elem) { 
     weigth.add(elem);
   }
   public boolean removeWeigth(int elem) {
     boolean result = (Boolean) weigth.remove(elem);
     return result;
   }
   public void clearAllWeigth() {
     weigth.clear();
   }
   public Iterator getAllWeigth() {return weigth.iterator(); }
   public List getWeigth() {return weigth; }
   public void setWeigth(List l) {weigth = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Skill_Ontology#Certified
   */
   private List certified = new ArrayList();
   public void addCertified(boolean elem) { 
     certified.add(elem);
   }
   public boolean removeCertified(boolean elem) {
     boolean result = certified.remove(elem);
     return result;
   }
   public void clearAllCertified() {
     certified.clear();
   }
   public Iterator getAllCertified() {return certified.iterator(); }
   public List getCertified() {return certified; }
   public void setCertified(List l) {certified = l; }

}
