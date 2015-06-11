package lab3.labourre.impl;


import lab3.labourre.Time_DateTimeInterval;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Time_Ontology#DateTimeInterval
* @author OntologyBeanGenerator v4.1
* @version 2015/06/11, 22:22:56
*/
public class DefaultTime_DateTimeInterval implements Time_DateTimeInterval {

  private static final long serialVersionUID = 5987543401077072536L;

  private String _internalInstanceName = null;

  public DefaultTime_DateTimeInterval() {
    this._internalInstanceName = "";
  }

  public DefaultTime_DateTimeInterval(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

}
