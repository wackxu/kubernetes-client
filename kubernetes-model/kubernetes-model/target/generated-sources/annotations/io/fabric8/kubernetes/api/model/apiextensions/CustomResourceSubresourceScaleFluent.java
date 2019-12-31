package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface CustomResourceSubresourceScaleFluent<A extends CustomResourceSubresourceScaleFluent<A>> extends Fluent<A>{


    public String getLabelSelectorPath();
    public A withLabelSelectorPath(String labelSelectorPath);
    public Boolean hasLabelSelectorPath();
    public String getSpecReplicasPath();
    public A withSpecReplicasPath(String specReplicasPath);
    public Boolean hasSpecReplicasPath();
    public String getStatusReplicasPath();
    public A withStatusReplicasPath(String statusReplicasPath);
    public Boolean hasStatusReplicasPath();



}
