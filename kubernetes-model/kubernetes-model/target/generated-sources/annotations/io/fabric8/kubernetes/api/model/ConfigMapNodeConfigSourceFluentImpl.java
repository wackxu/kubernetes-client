package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ConfigMapNodeConfigSourceFluentImpl<A extends ConfigMapNodeConfigSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ConfigMapNodeConfigSourceFluent<A>{

    private String kubeletConfigKey;
    private String name;
    private String namespace;
    private String resourceVersion;
    private String uid;

    public ConfigMapNodeConfigSourceFluentImpl(){
    }
    public ConfigMapNodeConfigSourceFluentImpl(ConfigMapNodeConfigSource instance){
            this.withKubeletConfigKey(instance.getKubeletConfigKey()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withResourceVersion(instance.getResourceVersion()); 
            this.withUid(instance.getUid()); 
    }

    public String getKubeletConfigKey(){
            return this.kubeletConfigKey;
    }

    public A withKubeletConfigKey(String kubeletConfigKey){
            this.kubeletConfigKey=kubeletConfigKey; return (A) this;
    }

    public Boolean hasKubeletConfigKey(){
            return this.kubeletConfigKey != null;
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public String getNamespace(){
            return this.namespace;
    }

    public A withNamespace(String namespace){
            this.namespace=namespace; return (A) this;
    }

    public Boolean hasNamespace(){
            return this.namespace != null;
    }

    public String getResourceVersion(){
            return this.resourceVersion;
    }

    public A withResourceVersion(String resourceVersion){
            this.resourceVersion=resourceVersion; return (A) this;
    }

    public Boolean hasResourceVersion(){
            return this.resourceVersion != null;
    }

    public String getUid(){
            return this.uid;
    }

    public A withUid(String uid){
            this.uid=uid; return (A) this;
    }

    public Boolean hasUid(){
            return this.uid != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigMapNodeConfigSourceFluentImpl that = (ConfigMapNodeConfigSourceFluentImpl) o;
            if (kubeletConfigKey != null ? !kubeletConfigKey.equals(that.kubeletConfigKey) :that.kubeletConfigKey != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
            if (resourceVersion != null ? !resourceVersion.equals(that.resourceVersion) :that.resourceVersion != null) return false;
            if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
            return true;
    }




}
