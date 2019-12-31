package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface CSIPersistentVolumeSourceFluent<A extends CSIPersistentVolumeSourceFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildControllerPublishSecretRef instead.
 * @return The buildable object.
 */
@Deprecated public SecretReference getControllerPublishSecretRef();
    public SecretReference buildControllerPublishSecretRef();
    public A withControllerPublishSecretRef(SecretReference controllerPublishSecretRef);
    public Boolean hasControllerPublishSecretRef();
    public A withNewControllerPublishSecretRef(String name,String namespace);
    public CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> withNewControllerPublishSecretRef();
    public CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> withNewControllerPublishSecretRefLike(SecretReference item);
    public CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> editControllerPublishSecretRef();
    public CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> editOrNewControllerPublishSecretRef();
    public CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> editOrNewControllerPublishSecretRefLike(SecretReference item);
    public String getDriver();
    public A withDriver(String driver);
    public Boolean hasDriver();
    public String getFsType();
    public A withFsType(String fsType);
    public Boolean hasFsType();
    
/**
 * This method has been deprecated, please use method buildNodePublishSecretRef instead.
 * @return The buildable object.
 */
@Deprecated public SecretReference getNodePublishSecretRef();
    public SecretReference buildNodePublishSecretRef();
    public A withNodePublishSecretRef(SecretReference nodePublishSecretRef);
    public Boolean hasNodePublishSecretRef();
    public A withNewNodePublishSecretRef(String name,String namespace);
    public CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> withNewNodePublishSecretRef();
    public CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> withNewNodePublishSecretRefLike(SecretReference item);
    public CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> editNodePublishSecretRef();
    public CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> editOrNewNodePublishSecretRef();
    public CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> editOrNewNodePublishSecretRefLike(SecretReference item);
    
/**
 * This method has been deprecated, please use method buildNodeStageSecretRef instead.
 * @return The buildable object.
 */
@Deprecated public SecretReference getNodeStageSecretRef();
    public SecretReference buildNodeStageSecretRef();
    public A withNodeStageSecretRef(SecretReference nodeStageSecretRef);
    public Boolean hasNodeStageSecretRef();
    public A withNewNodeStageSecretRef(String name,String namespace);
    public CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> withNewNodeStageSecretRef();
    public CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> withNewNodeStageSecretRefLike(SecretReference item);
    public CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> editNodeStageSecretRef();
    public CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> editOrNewNodeStageSecretRef();
    public CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> editOrNewNodeStageSecretRefLike(SecretReference item);
    public Boolean isReadOnly();
    public A withReadOnly(Boolean readOnly);
    public Boolean hasReadOnly();
    public A withNewReadOnly(String arg1);
    public A withNewReadOnly(boolean arg1);
    public A addToVolumeAttributes(String key,String value);
    public A addToVolumeAttributes(Map<String,String> map);
    public A removeFromVolumeAttributes(String key);
    public A removeFromVolumeAttributes(Map<String,String> map);
    public Map<String,String> getVolumeAttributes();
    public A withVolumeAttributes(Map<String,String> volumeAttributes);
    public Boolean hasVolumeAttributes();
    public String getVolumeHandle();
    public A withVolumeHandle(String volumeHandle);
    public Boolean hasVolumeHandle();

    public interface ControllerPublishSecretRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretReferenceFluent<CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<N>>{

        
    public N and();    public N endControllerPublishSecretRef();
}
    public interface NodePublishSecretRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretReferenceFluent<CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<N>>{

        
    public N and();    public N endNodePublishSecretRef();
}
    public interface NodeStageSecretRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretReferenceFluent<CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<N>>{

        
    public N and();    public N endNodeStageSecretRef();
}


}
