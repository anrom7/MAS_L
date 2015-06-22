package com.multiagent.educationontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Education_Level
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:39:58
*/
public interface Education_Level extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Name
   */
   public void addName(String elem);
   public boolean removeName(String elem);
   public void clearAllName();
   public Iterator getAllName();
   public List getName();
   public void setName(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#is_education_level_of
   */
   public void addIs_education_level_of(Education elem);
   public boolean removeIs_education_level_of(Education elem);
   public void clearAllIs_education_level_of();
   public Iterator getAllIs_education_level_of();
   public List getIs_education_level_of();
   public void setIs_education_level_of(List l);

}
