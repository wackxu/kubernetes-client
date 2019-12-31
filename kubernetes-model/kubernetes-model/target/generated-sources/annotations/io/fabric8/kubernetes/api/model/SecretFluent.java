package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface SecretFluent<A extends SecretFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToData(String key,String value);
    public A addToData(Map<String,String> map);
    public A removeFromData(String key);
    public A removeFromData(Map<String,String> map);
    public Map<String,String> getData();
    public A withData(Map<String,String> data);
    public Boolean hasData();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public SecretFluent.MetadataNested<A> withNewMetadata();
    public SecretFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public SecretFluent.MetadataNested<A> editMetadata();
    public SecretFluent.MetadataNested<A> editOrNewMetadata();
    public SecretFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public A addToStringData(String key,String value);
    public A addToStringData(Map<String,String> map);
    public A removeFromStringData(String key);
    public A removeFromStringData(Map<String,String> map);
    public Map<String,String> getStringData();
    public A withStringData(Map<String,String> stringData);
    public Boolean hasStringData();
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<SecretFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
