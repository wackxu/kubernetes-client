package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ConfigMapNodeConfigSourceFluent<A extends ConfigMapNodeConfigSourceFluent<A>> extends Fluent<A>{


    public String getKubeletConfigKey();
    public A withKubeletConfigKey(String kubeletConfigKey);
    public Boolean hasKubeletConfigKey();
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
