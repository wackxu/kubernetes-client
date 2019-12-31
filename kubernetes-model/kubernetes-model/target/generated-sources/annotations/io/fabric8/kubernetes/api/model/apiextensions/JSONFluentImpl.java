package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class JSONFluentImpl<A extends JSONFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements JSONFluent<A>{

    private String raw;

    public JSONFluentImpl(){
    }
    public JSONFluentImpl(JSON instance){
            this.withRaw(instance.getRaw()); 
    }

    public String getRaw(){
            return this.raw;
    }

    public A withRaw(String raw){
            this.raw=raw; return (A) this;
    }

    public Boolean hasRaw(){
            return this.raw != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JSONFluentImpl that = (JSONFluentImpl) o;
            if (raw != null ? !raw.equals(that.raw) :that.raw != null) return false;
            return true;
    }




}
