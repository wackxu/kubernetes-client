package io.fabric8.kubernetes.api.model.authorization;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class NonResourceAttributesFluentImpl<A extends NonResourceAttributesFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NonResourceAttributesFluent<A>{

    private String path;
    private String verb;

    public NonResourceAttributesFluentImpl(){
    }
    public NonResourceAttributesFluentImpl(NonResourceAttributes instance){
            this.withPath(instance.getPath()); 
            this.withVerb(instance.getVerb()); 
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

    public String getVerb(){
            return this.verb;
    }

    public A withVerb(String verb){
            this.verb=verb; return (A) this;
    }

    public Boolean hasVerb(){
            return this.verb != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NonResourceAttributesFluentImpl that = (NonResourceAttributesFluentImpl) o;
            if (path != null ? !path.equals(that.path) :that.path != null) return false;
            if (verb != null ? !verb.equals(that.verb) :that.verb != null) return false;
            return true;
    }




}
