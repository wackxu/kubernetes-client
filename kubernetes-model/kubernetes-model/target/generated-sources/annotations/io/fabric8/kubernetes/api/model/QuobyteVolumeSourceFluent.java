package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface QuobyteVolumeSourceFluent<A extends QuobyteVolumeSourceFluent<A>> extends Fluent<A>{


    public String getGroup();
    public A withGroup(String group);
    public Boolean hasGroup();
    public Boolean isReadOnly();
    public A withReadOnly(Boolean readOnly);
    public Boolean hasReadOnly();
    public A withNewReadOnly(String arg1);
    public A withNewReadOnly(boolean arg1);
    public String getRegistry();
    public A withRegistry(String registry);
    public Boolean hasRegistry();
    public String getUser();
    public A withUser(String user);
    public Boolean hasUser();
    public String getVolume();
    public A withVolume(String volume);
    public Boolean hasVolume();



}
