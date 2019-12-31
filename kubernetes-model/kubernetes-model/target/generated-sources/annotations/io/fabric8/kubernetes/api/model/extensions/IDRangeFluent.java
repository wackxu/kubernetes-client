package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface IDRangeFluent<A extends IDRangeFluent<A>> extends Fluent<A>{


    public Long getMax();
    public A withMax(Long max);
    public Boolean hasMax();
    public A withNewMax(String arg1);
    public A withNewMax(long arg1);
    public Long getMin();
    public A withMin(Long min);
    public Boolean hasMin();
    public A withNewMin(String arg1);
    public A withNewMin(long arg1);



}
