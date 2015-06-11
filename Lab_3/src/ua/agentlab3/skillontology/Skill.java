package ua.agentlab3.skillontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Skill_Ontology#Skill
* @author OntologyBeanGenerator v4.1
* @version 2015/06/10, 23:36:36
*/
public interface Skill extends Com_Competence {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Skill_Ontology#Description
   */
   public void addDescription(String elem);
   public boolean removeDescription(String elem);
   public void clearAllDescription();
   public Iterator getAllDescription();
   public List getDescription();
   public void setDescription(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Skill_Ontology#Name
   */
   public void addName(String elem);
   public boolean removeName(String elem);
   public void clearAllName();
   public Iterator getAllName();
   public List getName();
   public void setName(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Skill_Ontology#weigth
   */
   public void addWeigth(int elem);
   public boolean removeWeigth(int elem);
   public void clearAllWeigth();
   public Iterator getAllWeigth();
   public List getWeigth();
   public void setWeigth(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Skill_Ontology#Certified
   */
   public void addCertified(boolean elem);
   public boolean removeCertified(boolean elem);
   public void clearAllCertified();
   public Iterator getAllCertified();
   public List getCertified();
   public void setCertified(List l);

}
