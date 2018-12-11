package com.fhir.model;

public class Patient
{
private String resourceType;
private String id;

public String getId() {
    return this.id;
}
    
public void setId(String id) {
    this.id = id;
}

public String getResourceType() {
    return this.resourceType;
}
    
public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
}
}