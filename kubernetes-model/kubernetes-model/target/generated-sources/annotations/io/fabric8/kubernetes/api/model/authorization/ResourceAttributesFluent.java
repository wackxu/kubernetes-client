package io.fabric8.kubernetes.api.model.authorization;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ResourceAttributesFluent<A extends ResourceAttributesFluent<A>> extends Fluent<A>{


    public String getGroup();
    public A withGroup(String group);
    public Boolean hasGroup();
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public String getNamespace();
    public A withNamespace(String namespace);
    public Boolean hasNamespace();
    public String getResource();
    public A withResource(String resource);
    public Boolean hasResource();
    public String getSubresource();
    public A withSubresource(String subresource);
    public Boolean hasSubresource();
    public String getVerb();
    public A withVerb(String verb);
    public Boolean hasVerb();
    public String getVersion();
    public A withVersion(String version);
    public Boolean hasVersion();



}
