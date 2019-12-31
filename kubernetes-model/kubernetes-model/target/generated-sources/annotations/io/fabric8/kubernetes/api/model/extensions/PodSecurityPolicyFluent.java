package io.fabric8.kubernetes.api.model.extensions;

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

public interface PodSecurityPolicyFluent<A extends PodSecurityPolicyFluent<A>> extends Fluent<A>{


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
    public PodSecurityPolicyFluent.MetadataNested<A> withNewMetadata();
    public PodSecurityPolicyFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public PodSecurityPolicyFluent.MetadataNested<A> editMetadata();
    public PodSecurityPolicyFluent.MetadataNested<A> editOrNewMetadata();
    public PodSecurityPolicyFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public PodSecurityPolicySpec getSpec();
    public PodSecurityPolicySpec buildSpec();
    public A withSpec(PodSecurityPolicySpec spec);
    public Boolean hasSpec();
    public PodSecurityPolicyFluent.SpecNested<A> withNewSpec();
    public PodSecurityPolicyFluent.SpecNested<A> withNewSpecLike(PodSecurityPolicySpec item);
    public PodSecurityPolicyFluent.SpecNested<A> editSpec();
    public PodSecurityPolicyFluent.SpecNested<A> editOrNewSpec();
    public PodSecurityPolicyFluent.SpecNested<A> editOrNewSpecLike(PodSecurityPolicySpec item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<PodSecurityPolicyFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityPolicySpecFluent<PodSecurityPolicyFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}


}
