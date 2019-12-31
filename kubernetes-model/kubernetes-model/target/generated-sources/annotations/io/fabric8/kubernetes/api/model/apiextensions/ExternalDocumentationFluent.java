package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ExternalDocumentationFluent<A extends ExternalDocumentationFluent<A>> extends Fluent<A>{


    public String getDescription();
    public A withDescription(String description);
    public Boolean hasDescription();
    public String getUrl();
    public A withUrl(String url);
    public Boolean hasUrl();



}
