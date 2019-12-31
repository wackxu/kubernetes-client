package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class SourceStrategyOptionsFluentImpl<A extends SourceStrategyOptionsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SourceStrategyOptionsFluent<A>{

    private Boolean incremental;

    public SourceStrategyOptionsFluentImpl(){
    }
    public SourceStrategyOptionsFluentImpl(SourceStrategyOptions instance){
            this.withIncremental(instance.getIncremental()); 
    }

    public Boolean isIncremental(){
            return this.incremental;
    }

    public A withIncremental(Boolean incremental){
            this.incremental=incremental; return (A) this;
    }

    public Boolean hasIncremental(){
            return this.incremental != null;
    }

    public A withNewIncremental(String arg1){
            return (A)withIncremental(new Boolean(arg1));
    }

    public A withNewIncremental(boolean arg1){
            return (A)withIncremental(new Boolean(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SourceStrategyOptionsFluentImpl that = (SourceStrategyOptionsFluentImpl) o;
            if (incremental != null ? !incremental.equals(that.incremental) :that.incremental != null) return false;
            return true;
    }




}
