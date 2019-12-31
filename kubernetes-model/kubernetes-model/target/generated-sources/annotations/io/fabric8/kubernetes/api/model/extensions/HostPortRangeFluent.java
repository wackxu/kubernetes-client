package io.fabric8.kubernetes.api.model.extensions;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface HostPortRangeFluent<A extends HostPortRangeFluent<A>> extends Fluent<A>{


    public Integer getMax();
    public A withMax(Integer max);
    public Boolean hasMax();
    public Integer getMin();
    public A withMin(Integer min);
    public Boolean hasMin();



}
