package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class SignatureIssuerFluentImpl<A extends SignatureIssuerFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SignatureIssuerFluent<A>{

    private String commonName;
    private String organization;

    public SignatureIssuerFluentImpl(){
    }
    public SignatureIssuerFluentImpl(SignatureIssuer instance){
            this.withCommonName(instance.getCommonName()); 
            this.withOrganization(instance.getOrganization()); 
    }

    public String getCommonName(){
            return this.commonName;
    }

    public A withCommonName(String commonName){
            this.commonName=commonName; return (A) this;
    }

    public Boolean hasCommonName(){
            return this.commonName != null;
    }

    public String getOrganization(){
            return this.organization;
    }

    public A withOrganization(String organization){
            this.organization=organization; return (A) this;
    }

    public Boolean hasOrganization(){
            return this.organization != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SignatureIssuerFluentImpl that = (SignatureIssuerFluentImpl) o;
            if (commonName != null ? !commonName.equals(that.commonName) :that.commonName != null) return false;
            if (organization != null ? !organization.equals(that.organization) :that.organization != null) return false;
            return true;
    }




}
