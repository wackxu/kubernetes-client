package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public class SecretFluentImpl<A extends SecretFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SecretFluent<A>{

    private String apiVersion;
    private Map<String,String> data;
    private String kind;
    private ObjectMetaBuilder metadata;
    private Map<String,String> stringData;
    private String type;

    public SecretFluentImpl(){
    }
    public SecretFluentImpl(Secret instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withData(instance.getData()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withStringData(instance.getStringData()); 
            this.withType(instance.getType()); 
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    public A addToData(String key,String value){
            if(this.data == null && key != null && value != null) { this.data = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.data.put(key, value);} return (A)this;
    }

    public A addToData(Map<String,String> map){
            if(this.data == null && map != null) { this.data = new LinkedHashMap<String,String>(); }
            if(map != null) { this.data.putAll(map);} return (A)this;
    }

    public A removeFromData(String key){
            if(this.data == null) { return (A) this; }
            if(key != null && this.data != null) {this.data.remove(key);} return (A)this;
    }

    public A removeFromData(Map<String,String> map){
            if(this.data == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.data != null){this.data.remove(key);}}} return (A)this;
    }

    public Map<String,String> getData(){
            return this.data;
    }

    public A withData(Map<String,String> data){
            if (data == null) { this.data =  new LinkedHashMap<String,String>();} else {this.data = new LinkedHashMap<String,String>(data);} return (A) this;
    }

    public Boolean hasData(){
            return this.data != null;
    }

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
    }

    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ObjectMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ObjectMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ObjectMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public SecretFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public SecretFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public SecretFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public SecretFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public SecretFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public A addToStringData(String key,String value){
            if(this.stringData == null && key != null && value != null) { this.stringData = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.stringData.put(key, value);} return (A)this;
    }

    public A addToStringData(Map<String,String> map){
            if(this.stringData == null && map != null) { this.stringData = new LinkedHashMap<String,String>(); }
            if(map != null) { this.stringData.putAll(map);} return (A)this;
    }

    public A removeFromStringData(String key){
            if(this.stringData == null) { return (A) this; }
            if(key != null && this.stringData != null) {this.stringData.remove(key);} return (A)this;
    }

    public A removeFromStringData(Map<String,String> map){
            if(this.stringData == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.stringData != null){this.stringData.remove(key);}}} return (A)this;
    }

    public Map<String,String> getStringData(){
            return this.stringData;
    }

    public A withStringData(Map<String,String> stringData){
            if (stringData == null) { this.stringData =  new LinkedHashMap<String,String>();} else {this.stringData = new LinkedHashMap<String,String>(stringData);} return (A) this;
    }

    public Boolean hasStringData(){
            return this.stringData != null;
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecretFluentImpl that = (SecretFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (data != null ? !data.equals(that.data) :that.data != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (stringData != null ? !stringData.equals(that.stringData) :that.stringData != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<SecretFluent.MetadataNested<N>> implements SecretFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) SecretFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}


}
