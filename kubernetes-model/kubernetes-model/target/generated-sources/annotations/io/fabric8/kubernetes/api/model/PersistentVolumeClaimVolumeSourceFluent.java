package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface PersistentVolumeClaimVolumeSourceFluent<A extends PersistentVolumeClaimVolumeSourceFluent<A>> extends Fluent<A>{


    public String getClaimName();
    public A withClaimName(String claimName);
    public Boolean hasClaimName();
    public Boolean isReadOnly();
    public A withReadOnly(Boolean readOnly);
    public Boolean hasReadOnly();
    public A withNewReadOnly(String arg1);
    public A withNewReadOnly(boolean arg1);



}
