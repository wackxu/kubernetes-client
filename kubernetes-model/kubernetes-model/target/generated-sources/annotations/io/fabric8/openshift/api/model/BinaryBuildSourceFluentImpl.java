package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class BinaryBuildSourceFluentImpl<A extends BinaryBuildSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BinaryBuildSourceFluent<A>{

    private String asFile;

    public BinaryBuildSourceFluentImpl(){
    }
    public BinaryBuildSourceFluentImpl(BinaryBuildSource instance){
            this.withAsFile(instance.getAsFile()); 
    }

    public String getAsFile(){
            return this.asFile;
    }

    public A withAsFile(String asFile){
            this.asFile=asFile; return (A) this;
    }

    public Boolean hasAsFile(){
            return this.asFile != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BinaryBuildSourceFluentImpl that = (BinaryBuildSourceFluentImpl) o;
            if (asFile != null ? !asFile.equals(that.asFile) :that.asFile != null) return false;
            return true;
    }




}
