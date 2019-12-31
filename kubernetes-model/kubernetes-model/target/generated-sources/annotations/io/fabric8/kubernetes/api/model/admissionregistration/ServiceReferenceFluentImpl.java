package io.fabric8.kubernetes.api.model.admissionregistration;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ServiceReferenceFluentImpl<A extends ServiceReferenceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ServiceReferenceFluent<A>{

    private String name;
    private String namespace;
    private String path;

    public ServiceReferenceFluentImpl(){
    }
    public ServiceReferenceFluentImpl(ServiceReference instance){
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withPath(instance.getPath()); 
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

    public String getPath(){
            return this.path;
    }

    public A withPath(String path){
            this.path=path; return (A) this;
    }

    public Boolean hasPath(){
            return this.path != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceReferenceFluentImpl that = (ServiceReferenceFluentImpl) o;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
            if (path != null ? !path.equals(that.path) :that.path != null) return false;
            return true;
    }




}
