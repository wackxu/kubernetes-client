package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.constraints.NotNull;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface IdentityFluent<A extends IdentityFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToExtra(String key,String value);
    public A addToExtra(Map<String,String> map);
    public A removeFromExtra(String key);
    public A removeFromExtra(Map<String,String> map);
    public Map<String,String> getExtra();
    public A withExtra(Map<String,String> extra);
    public Boolean hasExtra();
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
    public IdentityFluent.MetadataNested<A> withNewMetadata();
    public IdentityFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public IdentityFluent.MetadataNested<A> editMetadata();
    public IdentityFluent.MetadataNested<A> editOrNewMetadata();
    public IdentityFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public String getProviderName();
    public A withProviderName(String providerName);
    public Boolean hasProviderName();
    public String getProviderUserName();
    public A withProviderUserName(String providerUserName);
    public Boolean hasProviderUserName();
    
/**
 * This method has been deprecated, please use method buildUser instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getUser();
    public ObjectReference buildUser();
    public A withUser(ObjectReference user);
    public Boolean hasUser();
    public IdentityFluent.UserNested<A> withNewUser();
    public IdentityFluent.UserNested<A> withNewUserLike(ObjectReference item);
    public IdentityFluent.UserNested<A> editUser();
    public IdentityFluent.UserNested<A> editOrNewUser();
    public IdentityFluent.UserNested<A> editOrNewUserLike(ObjectReference item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<IdentityFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface UserNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<IdentityFluent.UserNested<N>>{

        
    public N and();    public N endUser();
}


}
