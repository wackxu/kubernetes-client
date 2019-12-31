package io.fabric8.kubernetes.api.model.runtime;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class RawExtensionFluentImpl<A extends RawExtensionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RawExtensionFluent<A>{

    private String raw;

    public RawExtensionFluentImpl(){
    }
    public RawExtensionFluentImpl(RawExtension instance){
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
            RawExtensionFluentImpl that = (RawExtensionFluentImpl) o;
            if (raw != null ? !raw.equals(that.raw) :that.raw != null) return false;
            return true;
    }




}
