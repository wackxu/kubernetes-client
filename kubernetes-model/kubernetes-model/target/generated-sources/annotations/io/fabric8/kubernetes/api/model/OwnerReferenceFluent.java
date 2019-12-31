package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import javax.validation.constraints.NotNull;

public interface OwnerReferenceFluent<A extends OwnerReferenceFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public Boolean isBlockOwnerDeletion();
    public A withBlockOwnerDeletion(Boolean blockOwnerDeletion);
    public Boolean hasBlockOwnerDeletion();
    public A withNewBlockOwnerDeletion(String arg1);
    public A withNewBlockOwnerDeletion(boolean arg1);
    public Boolean isController();
    public A withController(Boolean controller);
    public Boolean hasController();
    public A withNewController(String arg1);
    public A withNewController(boolean arg1);
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public String getUid();
    public A withUid(String uid);
    public Boolean hasUid();



}
