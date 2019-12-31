package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface TLSConfigFluent<A extends TLSConfigFluent<A>> extends Fluent<A>{


    public String getCaCertificate();
    public A withCaCertificate(String caCertificate);
    public Boolean hasCaCertificate();
    public String getCertificate();
    public A withCertificate(String certificate);
    public Boolean hasCertificate();
    public String getDestinationCACertificate();
    public A withDestinationCACertificate(String destinationCACertificate);
    public Boolean hasDestinationCACertificate();
    public String getInsecureEdgeTerminationPolicy();
    public A withInsecureEdgeTerminationPolicy(String insecureEdgeTerminationPolicy);
    public Boolean hasInsecureEdgeTerminationPolicy();
    public String getKey();
    public A withKey(String key);
    public Boolean hasKey();
    public String getTermination();
    public A withTermination(String termination);
    public Boolean hasTermination();



}
