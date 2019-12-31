package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface RunAsUserStrategyOptionsFluent<A extends RunAsUserStrategyOptionsFluent<A>> extends Fluent<A>{


    public String getType();
    public A withType(String type);
    public Boolean hasType();
    public Long getUid();
    public A withUid(Long uid);
    public Boolean hasUid();
    public A withNewUid(String arg1);
    public A withNewUid(long arg1);
    public Long getUidRangeMax();
    public A withUidRangeMax(Long uidRangeMax);
    public Boolean hasUidRangeMax();
    public A withNewUidRangeMax(String arg1);
    public A withNewUidRangeMax(long arg1);
    public Long getUidRangeMin();
    public A withUidRangeMin(Long uidRangeMin);
    public Boolean hasUidRangeMin();
    public A withNewUidRangeMin(String arg1);
    public A withNewUidRangeMin(long arg1);



}
