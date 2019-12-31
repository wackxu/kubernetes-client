package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface AzureFilePersistentVolumeSourceFluent<A extends AzureFilePersistentVolumeSourceFluent<A>> extends Fluent<A>{


    public Boolean isReadOnly();
    public A withReadOnly(Boolean readOnly);
    public Boolean hasReadOnly();
    public A withNewReadOnly(String arg1);
    public A withNewReadOnly(boolean arg1);
    public String getSecretName();
    public A withSecretName(String secretName);
    public Boolean hasSecretName();
    public String getSecretNamespace();
    public A withSecretNamespace(String secretNamespace);
    public Boolean hasSecretNamespace();
    public String getShareName();
    public A withShareName(String shareName);
    public Boolean hasShareName();



}
