package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface BuildConfigStatusFluent<A extends BuildConfigStatusFluent<A>> extends Fluent<A>{


    public Long getLastVersion();
    public A withLastVersion(Long lastVersion);
    public Boolean hasLastVersion();
    public A withNewLastVersion(String arg1);
    public A withNewLastVersion(long arg1);



}
