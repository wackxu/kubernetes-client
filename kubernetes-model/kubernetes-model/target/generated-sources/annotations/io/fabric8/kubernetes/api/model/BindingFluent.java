package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface BindingFluent<A extends BindingFluent<A>> extends Fluent<A>{


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
    public BindingFluent.MetadataNested<A> withNewMetadata();
    public BindingFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public BindingFluent.MetadataNested<A> editMetadata();
    public BindingFluent.MetadataNested<A> editOrNewMetadata();
    public BindingFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildTarget instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getTarget();
    public ObjectReference buildTarget();
    public A withTarget(ObjectReference target);
    public Boolean hasTarget();
    public BindingFluent.TargetNested<A> withNewTarget();
    public BindingFluent.TargetNested<A> withNewTargetLike(ObjectReference item);
    public BindingFluent.TargetNested<A> editTarget();
    public BindingFluent.TargetNested<A> editOrNewTarget();
    public BindingFluent.TargetNested<A> editOrNewTargetLike(ObjectReference item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<BindingFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface TargetNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<BindingFluent.TargetNested<N>>{

        
    public N and();    public N endTarget();
}


}
