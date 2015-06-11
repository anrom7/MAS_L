package lab3.labourre.impl;


import jade.util.leap.ArrayList;
import jade.util.leap.Iterator;
import jade.util.leap.List;
import lab3.labourre.Contract_Type;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#Contract_Type
* @author OntologyBeanGenerator v4.1
* @version 2015/06/11, 22:22:56
*/
public class DefaultContract_Type implements Contract_Type {

  private static final long serialVersionUID = 5987543401077072536L;

  private String _internalInstanceName = null;

  public DefaultContract_Type() {
    this._internalInstanceName = "";
  }

  public DefaultContract_Type(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#Limited_duration
   */
   private List limited_duration = new ArrayList();
   public void addLimited_duration(boolean elem) { 
     limited_duration.add(elem);
   }
   public boolean removeLimited_duration(boolean elem) {
     boolean result = limited_duration.remove(elem);
     return result;
   }
   public void clearAllLimited_duration() {
     limited_duration.clear();
   }
   public Iterator getAllLimited_duration() {return limited_duration.iterator(); }
   public List getLimited_duration() {return limited_duration; }
   public void setLimited_duration(List l) {limited_duration = l; }

}
