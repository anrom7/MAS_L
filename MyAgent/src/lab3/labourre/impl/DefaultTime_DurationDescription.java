package lab3.labourre.impl;


import lab3.labourre.Time_DurationDescription;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Time_Ontology#DurationDescription
* @author OntologyBeanGenerator v4.1
* @version 2015/06/11, 22:22:55
*/
public class DefaultTime_DurationDescription implements Time_DurationDescription {

  private static final long serialVersionUID = 5987543401077072536L;

  private String _internalInstanceName = null;

  public DefaultTime_DurationDescription() {
    this._internalInstanceName = "";
  }

  public DefaultTime_DurationDescription(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

}
