package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class InitializerFluentImpl<A extends InitializerFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements InitializerFluent<A>{

    private String name;

    public InitializerFluentImpl(){
    }
    public InitializerFluentImpl(Initializer instance){
            this.withName(instance.getName()); 
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
            InitializerFluentImpl that = (InitializerFluentImpl) o;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            return true;
    }




}
