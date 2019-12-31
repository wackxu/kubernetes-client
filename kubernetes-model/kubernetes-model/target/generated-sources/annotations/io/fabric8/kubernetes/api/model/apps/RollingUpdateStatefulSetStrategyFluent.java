package io.fabric8.kubernetes.api.model.apps;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface RollingUpdateStatefulSetStrategyFluent<A extends RollingUpdateStatefulSetStrategyFluent<A>> extends Fluent<A>{


    public Integer getPartition();
    public A withPartition(Integer partition);
    public Boolean hasPartition();



}
