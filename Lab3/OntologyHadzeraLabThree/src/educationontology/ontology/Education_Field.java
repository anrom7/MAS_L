package educationontology.ontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Education_Field
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:39:59
*/
public interface Education_Field extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#is_education_field_of_Education
   */
   public void addIs_education_field_of_Education(Education elem);
   public boolean removeIs_education_field_of_Education(Education elem);
   public void clearAllIs_education_field_of_Education();
   public Iterator getAllIs_education_field_of_Education();
   public List getIs_education_field_of_Education();
   public void setIs_education_field_of_Education(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Excludes
   */
   public void addExcludes(String elem);
   public boolean removeExcludes(String elem);
   public void clearAllExcludes();
   public Iterator getAllExcludes();
   public List getExcludes();
   public void setExcludes(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Includes
   */
   public void addIncludes(String elem);
   public boolean removeIncludes(String elem);
   public void clearAllIncludes();
   public Iterator getAllIncludes();
   public List getIncludes();
   public void setIncludes(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Definition
   */
   public void addDefinition(String elem);
   public boolean removeDefinition(String elem);
   public void clearAllDefinition();
   public Iterator getAllDefinition();
   public List getDefinition();
   public void setDefinition(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Code
   */
   public void addCode(String elem);
   public boolean removeCode(String elem);
   public void clearAllCode();
   public Iterator getAllCode();
   public List getCode();
   public void setCode(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Level
   */
   public void addLevel(String elem);
   public boolean removeLevel(String elem);
   public void clearAllLevel();
   public Iterator getAllLevel();
   public List getLevel();
   public void setLevel(List l);

}
