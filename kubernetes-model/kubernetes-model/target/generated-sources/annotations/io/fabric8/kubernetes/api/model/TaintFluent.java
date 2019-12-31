package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface TaintFluent<A extends TaintFluent<A>> extends Fluent<A>{


    public String getEffect();
    public A withEffect(String effect);
    public Boolean hasEffect();
    public String getKey();
    public A withKey(String key);
    public Boolean hasKey();
    public String getTimeAdded();
    public A withTimeAdded(String timeAdded);
    public Boolean hasTimeAdded();
    public String getValue();
    public A withValue(String value);
    public Boolean hasValue();



}
