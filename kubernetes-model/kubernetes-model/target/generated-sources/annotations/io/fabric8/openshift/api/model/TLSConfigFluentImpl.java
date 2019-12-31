package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class TLSConfigFluentImpl<A extends TLSConfigFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TLSConfigFluent<A>{

    private String caCertificate;
    private String certificate;
    private String destinationCACertificate;
    private String insecureEdgeTerminationPolicy;
    private String key;
    private String termination;

    public TLSConfigFluentImpl(){
    }
    public TLSConfigFluentImpl(TLSConfig instance){
            this.withCaCertificate(instance.getCaCertificate()); 
            this.withCertificate(instance.getCertificate()); 
            this.withDestinationCACertificate(instance.getDestinationCACertificate()); 
            this.withInsecureEdgeTerminationPolicy(instance.getInsecureEdgeTerminationPolicy()); 
            this.withKey(instance.getKey()); 
            this.withTermination(instance.getTermination()); 
    }

    public String getCaCertificate(){
            return this.caCertificate;
    }

    public A withCaCertificate(String caCertificate){
            this.caCertificate=caCertificate; return (A) this;
    }

    public Boolean hasCaCertificate(){
            return this.caCertificate != null;
    }

    public String getCertificate(){
            return this.certificate;
    }

    public A withCertificate(String certificate){
            this.certificate=certificate; return (A) this;
    }

    public Boolean hasCertificate(){
            return this.certificate != null;
    }

    public String getDestinationCACertificate(){
            return this.destinationCACertificate;
    }

    public A withDestinationCACertificate(String destinationCACertificate){
            this.destinationCACertificate=destinationCACertificate; return (A) this;
    }

    public Boolean hasDestinationCACertificate(){
            return this.destinationCACertificate != null;
    }

    public String getInsecureEdgeTerminationPolicy(){
            return this.insecureEdgeTerminationPolicy;
    }

    public A withInsecureEdgeTerminationPolicy(String insecureEdgeTerminationPolicy){
            this.insecureEdgeTerminationPolicy=insecureEdgeTerminationPolicy; return (A) this;
    }

    public Boolean hasInsecureEdgeTerminationPolicy(){
            return this.insecureEdgeTerminationPolicy != null;
    }

    public String getKey(){
            return this.key;
    }

    public A withKey(String key){
            this.key=key; return (A) this;
    }

    public Boolean hasKey(){
            return this.key != null;
    }

    public String getTermination(){
            return this.termination;
    }

    public A withTermination(String termination){
            this.termination=termination; return (A) this;
    }

    public Boolean hasTermination(){
            return this.termination != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TLSConfigFluentImpl that = (TLSConfigFluentImpl) o;
            if (caCertificate != null ? !caCertificate.equals(that.caCertificate) :that.caCertificate != null) return false;
            if (certificate != null ? !certificate.equals(that.certificate) :that.certificate != null) return false;
            if (destinationCACertificate != null ? !destinationCACertificate.equals(that.destinationCACertificate) :that.destinationCACertificate != null) return false;
            if (insecureEdgeTerminationPolicy != null ? !insecureEdgeTerminationPolicy.equals(that.insecureEdgeTerminationPolicy) :that.insecureEdgeTerminationPolicy != null) return false;
            if (key != null ? !key.equals(that.key) :that.key != null) return false;
            if (termination != null ? !termination.equals(that.termination) :that.termination != null) return false;
            return true;
    }




}
