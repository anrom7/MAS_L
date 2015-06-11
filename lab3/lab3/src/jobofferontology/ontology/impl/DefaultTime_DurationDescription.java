package jobofferontology.ontology.impl;


import jobofferontology.ontology.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Time_Ontology#DurationDescription
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:31:16
*/
public class DefaultTime_DurationDescription implements Time_DurationDescription {

  private static final long serialVersionUID = 1989109886661307945L;

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
