package languageontology.ontology.impl;


import jade.util.leap.*;
import languageontology.ontology.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#Language
* @author OntologyBeanGenerator v4.1
* @version 2015/06/11, 22:55:16
*/
public class DefaultLanguage implements Language {

  private static final long serialVersionUID = -7416178792637387560L;

  private String _internalInstanceName = null;

  public DefaultLanguage() {
    this._internalInstanceName = "";
  }

  public DefaultLanguage(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#is_mother_tongue_of_Candidacy
   */
   private List is_mother_tongue_of_Candidacy = new ArrayList();
   public void addIs_mother_tongue_of_Candidacy(JobSeeOnt_Candidacy elem) { 
     is_mother_tongue_of_Candidacy.add(elem);
   }
   public boolean removeIs_mother_tongue_of_Candidacy(JobSeeOnt_Candidacy elem) {
     boolean result = is_mother_tongue_of_Candidacy.remove(elem);
     return result;
   }
   public void clearAllIs_mother_tongue_of_Candidacy() {
     is_mother_tongue_of_Candidacy.clear();
   }
   public Iterator getAllIs_mother_tongue_of_Candidacy() {return is_mother_tongue_of_Candidacy.iterator(); }
   public List getIs_mother_tongue_of_Candidacy() {return is_mother_tongue_of_Candidacy; }
   public void setIs_mother_tongue_of_Candidacy(List l) {is_mother_tongue_of_Candidacy = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#is_spoken_by_Candidacy
   */
   private List is_spoken_by_Candidacy = new ArrayList();
   public void addIs_spoken_by_Candidacy(JobSeeOnt_Candidacy elem) { 
     is_spoken_by_Candidacy.add(elem);
   }
   public boolean removeIs_spoken_by_Candidacy(JobSeeOnt_Candidacy elem) {
     boolean result = is_spoken_by_Candidacy.remove(elem);
     return result;
   }
   public void clearAllIs_spoken_by_Candidacy() {
     is_spoken_by_Candidacy.clear();
   }
   public Iterator getAllIs_spoken_by_Candidacy() {return is_spoken_by_Candidacy.iterator(); }
   public List getIs_spoken_by_Candidacy() {return is_spoken_by_Candidacy; }
   public void setIs_spoken_by_Candidacy(List l) {is_spoken_by_Candidacy = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#Code
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

}
