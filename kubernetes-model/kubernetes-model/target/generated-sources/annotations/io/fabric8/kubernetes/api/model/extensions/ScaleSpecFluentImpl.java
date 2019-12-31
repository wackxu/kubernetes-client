package io.fabric8.kubernetes.api.model.extensions;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class ScaleSpecFluentImpl<A extends ScaleSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ScaleSpecFluent<A>{

    private Integer replicas;

    public ScaleSpecFluentImpl(){
    }
    public ScaleSpecFluentImpl(ScaleSpec instance){
            this.withReplicas(instance.getReplicas()); 
    }

    public Integer getReplicas(){
            return this.replicas;
    }

    public A withReplicas(Integer replicas){
            this.replicas=replicas; return (A) this;
    }

    public Boolean hasReplicas(){
            return this.replicas != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ScaleSpecFluentImpl that = (ScaleSpecFluentImpl) o;
            if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
            return true;
    }




}
