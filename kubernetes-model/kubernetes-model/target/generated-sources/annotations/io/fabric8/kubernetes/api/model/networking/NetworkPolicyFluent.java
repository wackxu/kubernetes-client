package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface NetworkPolicyFluent<A extends NetworkPolicyFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
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
    public NetworkPolicyFluent.MetadataNested<A> withNewMetadata();
    public NetworkPolicyFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public NetworkPolicyFluent.MetadataNested<A> editMetadata();
    public NetworkPolicyFluent.MetadataNested<A> editOrNewMetadata();
    public NetworkPolicyFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public NetworkPolicySpec getSpec();
    public NetworkPolicySpec buildSpec();
    public A withSpec(NetworkPolicySpec spec);
    public Boolean hasSpec();
    public NetworkPolicyFluent.SpecNested<A> withNewSpec();
    public NetworkPolicyFluent.SpecNested<A> withNewSpecLike(NetworkPolicySpec item);
    public NetworkPolicyFluent.SpecNested<A> editSpec();
    public NetworkPolicyFluent.SpecNested<A> editOrNewSpec();
    public NetworkPolicyFluent.SpecNested<A> editOrNewSpecLike(NetworkPolicySpec item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<NetworkPolicyFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicySpecFluent<NetworkPolicyFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}


}
