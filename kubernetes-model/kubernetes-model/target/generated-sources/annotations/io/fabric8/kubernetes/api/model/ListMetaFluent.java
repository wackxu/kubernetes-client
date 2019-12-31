package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ListMetaFluent<A extends ListMetaFluent<A>> extends Fluent<A>{


    public String getContinue();
    public A withContinue(String _continue);
    public Boolean hasContinue();
    public String getResourceVersion();
    public A withResourceVersion(String resourceVersion);
    public Boolean hasResourceVersion();
    public String getSelfLink();
    public A withSelfLink(String selfLink);
    public Boolean hasSelfLink();



}
