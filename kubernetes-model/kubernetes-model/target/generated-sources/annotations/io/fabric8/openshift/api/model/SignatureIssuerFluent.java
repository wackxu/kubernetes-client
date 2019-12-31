package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface SignatureIssuerFluent<A extends SignatureIssuerFluent<A>> extends Fluent<A>{


    public String getCommonName();
    public A withCommonName(String commonName);
    public Boolean hasCommonName();
    public String getOrganization();
    public A withOrganization(String organization);
    public Boolean hasOrganization();



}
