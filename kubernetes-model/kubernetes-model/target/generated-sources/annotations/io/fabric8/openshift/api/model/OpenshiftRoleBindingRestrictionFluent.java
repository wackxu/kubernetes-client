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
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface OpenshiftRoleBindingRestrictionFluent<A extends OpenshiftRoleBindingRestrictionFluent<A>> extends Fluent<A>{


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
    public OpenshiftRoleBindingRestrictionFluent.MetadataNested<A> withNewMetadata();
    public OpenshiftRoleBindingRestrictionFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public OpenshiftRoleBindingRestrictionFluent.MetadataNested<A> editMetadata();
    public OpenshiftRoleBindingRestrictionFluent.MetadataNested<A> editOrNewMetadata();
    public OpenshiftRoleBindingRestrictionFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftRoleBindingRestrictionSpec getSpec();
    public OpenshiftRoleBindingRestrictionSpec buildSpec();
    public A withSpec(OpenshiftRoleBindingRestrictionSpec spec);
    public Boolean hasSpec();
    public OpenshiftRoleBindingRestrictionFluent.SpecNested<A> withNewSpec();
    public OpenshiftRoleBindingRestrictionFluent.SpecNested<A> withNewSpecLike(OpenshiftRoleBindingRestrictionSpec item);
    public OpenshiftRoleBindingRestrictionFluent.SpecNested<A> editSpec();
    public OpenshiftRoleBindingRestrictionFluent.SpecNested<A> editOrNewSpec();
    public OpenshiftRoleBindingRestrictionFluent.SpecNested<A> editOrNewSpecLike(OpenshiftRoleBindingRestrictionSpec item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<OpenshiftRoleBindingRestrictionFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingRestrictionSpecFluent<OpenshiftRoleBindingRestrictionFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}


}
