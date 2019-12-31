package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class TagReferencePolicyFluentImpl<A extends TagReferencePolicyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TagReferencePolicyFluent<A>{

    private String type;

    public TagReferencePolicyFluentImpl(){
    }
    public TagReferencePolicyFluentImpl(TagReferencePolicy instance){
            this.withType(instance.getType()); 
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TagReferencePolicyFluentImpl that = (TagReferencePolicyFluentImpl) o;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }




}
