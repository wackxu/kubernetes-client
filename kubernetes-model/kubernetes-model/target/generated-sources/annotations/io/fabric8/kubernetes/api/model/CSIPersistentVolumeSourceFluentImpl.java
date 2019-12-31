package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public class CSIPersistentVolumeSourceFluentImpl<A extends CSIPersistentVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CSIPersistentVolumeSourceFluent<A>{

    private SecretReferenceBuilder controllerPublishSecretRef;
    private String driver;
    private String fsType;
    private SecretReferenceBuilder nodePublishSecretRef;
    private SecretReferenceBuilder nodeStageSecretRef;
    private Boolean readOnly;
    private Map<String,String> volumeAttributes;
    private String volumeHandle;

    public CSIPersistentVolumeSourceFluentImpl(){
    }
    public CSIPersistentVolumeSourceFluentImpl(CSIPersistentVolumeSource instance){
            this.withControllerPublishSecretRef(instance.getControllerPublishSecretRef()); 
            this.withDriver(instance.getDriver()); 
            this.withFsType(instance.getFsType()); 
            this.withNodePublishSecretRef(instance.getNodePublishSecretRef()); 
            this.withNodeStageSecretRef(instance.getNodeStageSecretRef()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withVolumeAttributes(instance.getVolumeAttributes()); 
            this.withVolumeHandle(instance.getVolumeHandle()); 
    }

    
/**
 * This method has been deprecated, please use method buildControllerPublishSecretRef instead.
 * @return The buildable object.
 */
@Deprecated public SecretReference getControllerPublishSecretRef(){
            return this.controllerPublishSecretRef!=null?this.controllerPublishSecretRef.build():null;
    }

    public SecretReference buildControllerPublishSecretRef(){
            return this.controllerPublishSecretRef!=null?this.controllerPublishSecretRef.build():null;
    }

    public A withControllerPublishSecretRef(SecretReference controllerPublishSecretRef){
            _visitables.remove(this.controllerPublishSecretRef);
            if (controllerPublishSecretRef!=null){ this.controllerPublishSecretRef= new SecretReferenceBuilder(controllerPublishSecretRef); _visitables.add(this.controllerPublishSecretRef);} return (A) this;
    }

    public Boolean hasControllerPublishSecretRef(){
            return this.controllerPublishSecretRef != null;
    }

    public A withNewControllerPublishSecretRef(String name,String namespace){
            return (A)withControllerPublishSecretRef(new SecretReference(name, namespace));
    }

    public CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> withNewControllerPublishSecretRef(){
            return new ControllerPublishSecretRefNestedImpl();
    }

    public CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> withNewControllerPublishSecretRefLike(SecretReference item){
            return new ControllerPublishSecretRefNestedImpl(item);
    }

    public CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> editControllerPublishSecretRef(){
            return withNewControllerPublishSecretRefLike(getControllerPublishSecretRef());
    }

    public CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> editOrNewControllerPublishSecretRef(){
            return withNewControllerPublishSecretRefLike(getControllerPublishSecretRef() != null ? getControllerPublishSecretRef(): new SecretReferenceBuilder().build());
    }

    public CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> editOrNewControllerPublishSecretRefLike(SecretReference item){
            return withNewControllerPublishSecretRefLike(getControllerPublishSecretRef() != null ? getControllerPublishSecretRef(): item);
    }

    public String getDriver(){
            return this.driver;
    }

    public A withDriver(String driver){
            this.driver=driver; return (A) this;
    }

    public Boolean hasDriver(){
            return this.driver != null;
    }

    public String getFsType(){
            return this.fsType;
    }

    public A withFsType(String fsType){
            this.fsType=fsType; return (A) this;
    }

    public Boolean hasFsType(){
            return this.fsType != null;
    }

    
/**
 * This method has been deprecated, please use method buildNodePublishSecretRef instead.
 * @return The buildable object.
 */
@Deprecated public SecretReference getNodePublishSecretRef(){
            return this.nodePublishSecretRef!=null?this.nodePublishSecretRef.build():null;
    }

    public SecretReference buildNodePublishSecretRef(){
            return this.nodePublishSecretRef!=null?this.nodePublishSecretRef.build():null;
    }

    public A withNodePublishSecretRef(SecretReference nodePublishSecretRef){
            _visitables.remove(this.nodePublishSecretRef);
            if (nodePublishSecretRef!=null){ this.nodePublishSecretRef= new SecretReferenceBuilder(nodePublishSecretRef); _visitables.add(this.nodePublishSecretRef);} return (A) this;
    }

    public Boolean hasNodePublishSecretRef(){
            return this.nodePublishSecretRef != null;
    }

    public A withNewNodePublishSecretRef(String name,String namespace){
            return (A)withNodePublishSecretRef(new SecretReference(name, namespace));
    }

    public CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> withNewNodePublishSecretRef(){
            return new NodePublishSecretRefNestedImpl();
    }

    public CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> withNewNodePublishSecretRefLike(SecretReference item){
            return new NodePublishSecretRefNestedImpl(item);
    }

    public CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> editNodePublishSecretRef(){
            return withNewNodePublishSecretRefLike(getNodePublishSecretRef());
    }

    public CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> editOrNewNodePublishSecretRef(){
            return withNewNodePublishSecretRefLike(getNodePublishSecretRef() != null ? getNodePublishSecretRef(): new SecretReferenceBuilder().build());
    }

    public CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> editOrNewNodePublishSecretRefLike(SecretReference item){
            return withNewNodePublishSecretRefLike(getNodePublishSecretRef() != null ? getNodePublishSecretRef(): item);
    }

    
/**
 * This method has been deprecated, please use method buildNodeStageSecretRef instead.
 * @return The buildable object.
 */
@Deprecated public SecretReference getNodeStageSecretRef(){
            return this.nodeStageSecretRef!=null?this.nodeStageSecretRef.build():null;
    }

    public SecretReference buildNodeStageSecretRef(){
            return this.nodeStageSecretRef!=null?this.nodeStageSecretRef.build():null;
    }

    public A withNodeStageSecretRef(SecretReference nodeStageSecretRef){
            _visitables.remove(this.nodeStageSecretRef);
            if (nodeStageSecretRef!=null){ this.nodeStageSecretRef= new SecretReferenceBuilder(nodeStageSecretRef); _visitables.add(this.nodeStageSecretRef);} return (A) this;
    }

    public Boolean hasNodeStageSecretRef(){
            return this.nodeStageSecretRef != null;
    }

    public A withNewNodeStageSecretRef(String name,String namespace){
            return (A)withNodeStageSecretRef(new SecretReference(name, namespace));
    }

    public CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> withNewNodeStageSecretRef(){
            return new NodeStageSecretRefNestedImpl();
    }

    public CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> withNewNodeStageSecretRefLike(SecretReference item){
            return new NodeStageSecretRefNestedImpl(item);
    }

    public CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> editNodeStageSecretRef(){
            return withNewNodeStageSecretRefLike(getNodeStageSecretRef());
    }

    public CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> editOrNewNodeStageSecretRef(){
            return withNewNodeStageSecretRefLike(getNodeStageSecretRef() != null ? getNodeStageSecretRef(): new SecretReferenceBuilder().build());
    }

    public CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> editOrNewNodeStageSecretRefLike(SecretReference item){
            return withNewNodeStageSecretRefLike(getNodeStageSecretRef() != null ? getNodeStageSecretRef(): item);
    }

    public Boolean isReadOnly(){
            return this.readOnly;
    }

    public A withReadOnly(Boolean readOnly){
            this.readOnly=readOnly; return (A) this;
    }

    public Boolean hasReadOnly(){
            return this.readOnly != null;
    }

    public A withNewReadOnly(String arg1){
            return (A)withReadOnly(new Boolean(arg1));
    }

    public A withNewReadOnly(boolean arg1){
            return (A)withReadOnly(new Boolean(arg1));
    }

    public A addToVolumeAttributes(String key,String value){
            if(this.volumeAttributes == null && key != null && value != null) { this.volumeAttributes = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.volumeAttributes.put(key, value);} return (A)this;
    }

    public A addToVolumeAttributes(Map<String,String> map){
            if(this.volumeAttributes == null && map != null) { this.volumeAttributes = new LinkedHashMap<String,String>(); }
            if(map != null) { this.volumeAttributes.putAll(map);} return (A)this;
    }

    public A removeFromVolumeAttributes(String key){
            if(this.volumeAttributes == null) { return (A) this; }
            if(key != null && this.volumeAttributes != null) {this.volumeAttributes.remove(key);} return (A)this;
    }

    public A removeFromVolumeAttributes(Map<String,String> map){
            if(this.volumeAttributes == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.volumeAttributes != null){this.volumeAttributes.remove(key);}}} return (A)this;
    }

    public Map<String,String> getVolumeAttributes(){
            return this.volumeAttributes;
    }

    public A withVolumeAttributes(Map<String,String> volumeAttributes){
            if (volumeAttributes == null) { this.volumeAttributes =  new LinkedHashMap<String,String>();} else {this.volumeAttributes = new LinkedHashMap<String,String>(volumeAttributes);} return (A) this;
    }

    public Boolean hasVolumeAttributes(){
            return this.volumeAttributes != null;
    }

    public String getVolumeHandle(){
            return this.volumeHandle;
    }

    public A withVolumeHandle(String volumeHandle){
            this.volumeHandle=volumeHandle; return (A) this;
    }

    public Boolean hasVolumeHandle(){
            return this.volumeHandle != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CSIPersistentVolumeSourceFluentImpl that = (CSIPersistentVolumeSourceFluentImpl) o;
            if (controllerPublishSecretRef != null ? !controllerPublishSecretRef.equals(that.controllerPublishSecretRef) :that.controllerPublishSecretRef != null) return false;
            if (driver != null ? !driver.equals(that.driver) :that.driver != null) return false;
            if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
            if (nodePublishSecretRef != null ? !nodePublishSecretRef.equals(that.nodePublishSecretRef) :that.nodePublishSecretRef != null) return false;
            if (nodeStageSecretRef != null ? !nodeStageSecretRef.equals(that.nodeStageSecretRef) :that.nodeStageSecretRef != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            if (volumeAttributes != null ? !volumeAttributes.equals(that.volumeAttributes) :that.volumeAttributes != null) return false;
            if (volumeHandle != null ? !volumeHandle.equals(that.volumeHandle) :that.volumeHandle != null) return false;
            return true;
    }


    public class ControllerPublishSecretRefNestedImpl<N> extends SecretReferenceFluentImpl<CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<N>> implements CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretReferenceBuilder builder;
    
            ControllerPublishSecretRefNestedImpl(SecretReference item){
                    this.builder = new SecretReferenceBuilder(this, item);
            }
            ControllerPublishSecretRefNestedImpl(){
                    this.builder = new SecretReferenceBuilder(this);
            }
    
    public N and(){
            return (N) CSIPersistentVolumeSourceFluentImpl.this.withControllerPublishSecretRef(builder.build());
    }
    public N endControllerPublishSecretRef(){
            return and();
    }

}
    public class NodePublishSecretRefNestedImpl<N> extends SecretReferenceFluentImpl<CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<N>> implements CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretReferenceBuilder builder;
    
            NodePublishSecretRefNestedImpl(SecretReference item){
                    this.builder = new SecretReferenceBuilder(this, item);
            }
            NodePublishSecretRefNestedImpl(){
                    this.builder = new SecretReferenceBuilder(this);
            }
    
    public N and(){
            return (N) CSIPersistentVolumeSourceFluentImpl.this.withNodePublishSecretRef(builder.build());
    }
    public N endNodePublishSecretRef(){
            return and();
    }

}
    public class NodeStageSecretRefNestedImpl<N> extends SecretReferenceFluentImpl<CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<N>> implements CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretReferenceBuilder builder;
    
            NodeStageSecretRefNestedImpl(SecretReference item){
                    this.builder = new SecretReferenceBuilder(this, item);
            }
            NodeStageSecretRefNestedImpl(){
                    this.builder = new SecretReferenceBuilder(this);
            }
    
    public N and(){
            return (N) CSIPersistentVolumeSourceFluentImpl.this.withNodeStageSecretRef(builder.build());
    }
    public N endNodeStageSecretRef(){
            return and();
    }

}


}
