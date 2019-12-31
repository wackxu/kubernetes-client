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

public class FlexVolumeSourceFluentImpl<A extends FlexVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements FlexVolumeSourceFluent<A>{

    private String driver;
    private String fsType;
    private Map<String,String> options;
    private Boolean readOnly;
    private LocalObjectReferenceBuilder secretRef;

    public FlexVolumeSourceFluentImpl(){
    }
    public FlexVolumeSourceFluentImpl(FlexVolumeSource instance){
            this.withDriver(instance.getDriver()); 
            this.withFsType(instance.getFsType()); 
            this.withOptions(instance.getOptions()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
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

    public A addToOptions(String key,String value){
            if(this.options == null && key != null && value != null) { this.options = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.options.put(key, value);} return (A)this;
    }

    public A addToOptions(Map<String,String> map){
            if(this.options == null && map != null) { this.options = new LinkedHashMap<String,String>(); }
            if(map != null) { this.options.putAll(map);} return (A)this;
    }

    public A removeFromOptions(String key){
            if(this.options == null) { return (A) this; }
            if(key != null && this.options != null) {this.options.remove(key);} return (A)this;
    }

    public A removeFromOptions(Map<String,String> map){
            if(this.options == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.options != null){this.options.remove(key);}}} return (A)this;
    }

    public Map<String,String> getOptions(){
            return this.options;
    }

    public A withOptions(Map<String,String> options){
            if (options == null) { this.options =  new LinkedHashMap<String,String>();} else {this.options = new LinkedHashMap<String,String>(options);} return (A) this;
    }

    public Boolean hasOptions(){
            return this.options != null;
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

    
/**
 * This method has been deprecated, please use method buildSecretRef instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getSecretRef(){
            return this.secretRef!=null?this.secretRef.build():null;
    }

    public LocalObjectReference buildSecretRef(){
            return this.secretRef!=null?this.secretRef.build():null;
    }

    public A withSecretRef(LocalObjectReference secretRef){
            _visitables.remove(this.secretRef);
            if (secretRef!=null){ this.secretRef= new LocalObjectReferenceBuilder(secretRef); _visitables.add(this.secretRef);} return (A) this;
    }

    public Boolean hasSecretRef(){
            return this.secretRef != null;
    }

    public A withNewSecretRef(String name){
            return (A)withSecretRef(new LocalObjectReference(name));
    }

    public FlexVolumeSourceFluent.SecretRefNested<A> withNewSecretRef(){
            return new SecretRefNestedImpl();
    }

    public FlexVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(LocalObjectReference item){
            return new SecretRefNestedImpl(item);
    }

    public FlexVolumeSourceFluent.SecretRefNested<A> editSecretRef(){
            return withNewSecretRefLike(getSecretRef());
    }

    public FlexVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef(){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new LocalObjectReferenceBuilder().build());
    }

    public FlexVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(LocalObjectReference item){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            FlexVolumeSourceFluentImpl that = (FlexVolumeSourceFluentImpl) o;
            if (driver != null ? !driver.equals(that.driver) :that.driver != null) return false;
            if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
            if (options != null ? !options.equals(that.options) :that.options != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
            return true;
    }


    public class SecretRefNestedImpl<N> extends LocalObjectReferenceFluentImpl<FlexVolumeSourceFluent.SecretRefNested<N>> implements FlexVolumeSourceFluent.SecretRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
    
            SecretRefNestedImpl(LocalObjectReference item){
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            SecretRefNestedImpl(){
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) FlexVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef(){
            return and();
    }

}


}
