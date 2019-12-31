package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class NamespaceStatusFluentImpl<A extends NamespaceStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NamespaceStatusFluent<A>{

    private String phase;

    public NamespaceStatusFluentImpl(){
    }
    public NamespaceStatusFluentImpl(NamespaceStatus instance){
            this.withPhase(instance.getPhase()); 
    }

    public String getPhase(){
            return this.phase;
    }

    public A withPhase(String phase){
            this.phase=phase; return (A) this;
    }

    public Boolean hasPhase(){
            return this.phase != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamespaceStatusFluentImpl that = (NamespaceStatusFluentImpl) o;
            if (phase != null ? !phase.equals(that.phase) :that.phase != null) return false;
            return true;
    }




}
