package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import javax.validation.constraints.NotNull;

public interface ObjectReferenceFluent<A extends ObjectReferenceFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getFieldPath();
    public A withFieldPath(String fieldPath);
    public Boolean hasFieldPath();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public String getNamespace();
    public A withNamespace(String namespace);
    public Boolean hasNamespace();
    public String getResourceVersion();
    public A withResourceVersion(String resourceVersion);
    public Boolean hasResourceVersion();
    public String getUid();
    public A withUid(String uid);
    public Boolean hasUid();



}
