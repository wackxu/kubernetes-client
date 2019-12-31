package io.fabric8.kubernetes.api.model.apps;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class RollingUpdateStatefulSetStrategyFluentImpl<A extends RollingUpdateStatefulSetStrategyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RollingUpdateStatefulSetStrategyFluent<A>{

    private Integer partition;

    public RollingUpdateStatefulSetStrategyFluentImpl(){
    }
    public RollingUpdateStatefulSetStrategyFluentImpl(RollingUpdateStatefulSetStrategy instance){
            this.withPartition(instance.getPartition()); 
    }

    public Integer getPartition(){
            return this.partition;
    }

    public A withPartition(Integer partition){
            this.partition=partition; return (A) this;
    }

    public Boolean hasPartition(){
            return this.partition != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RollingUpdateStatefulSetStrategyFluentImpl that = (RollingUpdateStatefulSetStrategyFluentImpl) o;
            if (partition != null ? !partition.equals(that.partition) :that.partition != null) return false;
            return true;
    }




}
