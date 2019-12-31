package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class TypedLocalObjectReferenceFluentImpl<A extends TypedLocalObjectReferenceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TypedLocalObjectReferenceFluent<A>{

    private String apiGroup;
    private String kind;
    private String name;

    public TypedLocalObjectReferenceFluentImpl(){
    }
    public TypedLocalObjectReferenceFluentImpl(TypedLocalObjectReference instance){
            this.withApiGroup(instance.getApiGroup()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
    }

    public String getApiGroup(){
            return this.apiGroup;
    }

    public A withApiGroup(String apiGroup){
            this.apiGroup=apiGroup; return (A) this;
    }

    public Boolean hasApiGroup(){
            return this.apiGroup != null;
    }

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TypedLocalObjectReferenceFluentImpl that = (TypedLocalObjectReferenceFluentImpl) o;
            if (apiGroup != null ? !apiGroup.equals(that.apiGroup) :that.apiGroup != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            return true;
    }




}
