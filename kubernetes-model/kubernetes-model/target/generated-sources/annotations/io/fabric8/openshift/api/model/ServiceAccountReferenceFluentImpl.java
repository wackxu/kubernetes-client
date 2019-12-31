package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ServiceAccountReferenceFluentImpl<A extends ServiceAccountReferenceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ServiceAccountReferenceFluent<A>{

    private String name;
    private String namespace;

    public ServiceAccountReferenceFluentImpl(){
    }
    public ServiceAccountReferenceFluentImpl(ServiceAccountReference instance){
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public String getNamespace(){
            return this.namespace;
    }

    public A withNamespace(String namespace){
            this.namespace=namespace; return (A) this;
    }

    public Boolean hasNamespace(){
            return this.namespace != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceAccountReferenceFluentImpl that = (ServiceAccountReferenceFluentImpl) o;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
            return true;
    }




}
