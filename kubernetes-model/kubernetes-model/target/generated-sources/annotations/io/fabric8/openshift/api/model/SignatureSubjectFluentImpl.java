package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class SignatureSubjectFluentImpl<A extends SignatureSubjectFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SignatureSubjectFluent<A>{

    private String commonName;
    private String organization;
    private String publicKeyID;

    public SignatureSubjectFluentImpl(){
    }
    public SignatureSubjectFluentImpl(SignatureSubject instance){
            this.withCommonName(instance.getCommonName()); 
            this.withOrganization(instance.getOrganization()); 
            this.withPublicKeyID(instance.getPublicKeyID()); 
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

    public String getPublicKeyID(){
            return this.publicKeyID;
    }

    public A withPublicKeyID(String publicKeyID){
            this.publicKeyID=publicKeyID; return (A) this;
    }

    public Boolean hasPublicKeyID(){
            return this.publicKeyID != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SignatureSubjectFluentImpl that = (SignatureSubjectFluentImpl) o;
            if (commonName != null ? !commonName.equals(that.commonName) :that.commonName != null) return false;
            if (organization != null ? !organization.equals(that.organization) :that.organization != null) return false;
            if (publicKeyID != null ? !publicKeyID.equals(that.publicKeyID) :that.publicKeyID != null) return false;
            return true;
    }




}
