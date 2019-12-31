package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class PodReadinessGateFluentImpl<A extends PodReadinessGateFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PodReadinessGateFluent<A>{

    private String conditionType;

    public PodReadinessGateFluentImpl(){
    }
    public PodReadinessGateFluentImpl(PodReadinessGate instance){
            this.withConditionType(instance.getConditionType()); 
    }

    public String getConditionType(){
            return this.conditionType;
    }

    public A withConditionType(String conditionType){
            this.conditionType=conditionType; return (A) this;
    }

    public Boolean hasConditionType(){
            return this.conditionType != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodReadinessGateFluentImpl that = (PodReadinessGateFluentImpl) o;
            if (conditionType != null ? !conditionType.equals(that.conditionType) :that.conditionType != null) return false;
            return true;
    }




}
