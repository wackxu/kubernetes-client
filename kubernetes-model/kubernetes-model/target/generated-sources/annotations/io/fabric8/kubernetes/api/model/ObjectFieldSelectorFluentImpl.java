package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import javax.validation.constraints.NotNull;

public class ObjectFieldSelectorFluentImpl<A extends ObjectFieldSelectorFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ObjectFieldSelectorFluent<A>{

    private String apiVersion;
    private String fieldPath;

    public ObjectFieldSelectorFluentImpl(){
    }
    public ObjectFieldSelectorFluentImpl(ObjectFieldSelector instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withFieldPath(instance.getFieldPath()); 
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    public String getFieldPath(){
            return this.fieldPath;
    }

    public A withFieldPath(String fieldPath){
            this.fieldPath=fieldPath; return (A) this;
    }

    public Boolean hasFieldPath(){
            return this.fieldPath != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ObjectFieldSelectorFluentImpl that = (ObjectFieldSelectorFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (fieldPath != null ? !fieldPath.equals(that.fieldPath) :that.fieldPath != null) return false;
            return true;
    }




}
