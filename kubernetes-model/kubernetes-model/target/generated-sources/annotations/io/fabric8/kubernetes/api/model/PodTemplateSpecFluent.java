package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface PodTemplateSpecFluent<A extends PodTemplateSpecFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public PodTemplateSpecFluent.MetadataNested<A> withNewMetadata();
    public PodTemplateSpecFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public PodTemplateSpecFluent.MetadataNested<A> editMetadata();
    public PodTemplateSpecFluent.MetadataNested<A> editOrNewMetadata();
    public PodTemplateSpecFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public PodSpec getSpec();
    public PodSpec buildSpec();
    public A withSpec(PodSpec spec);
    public Boolean hasSpec();
    public PodTemplateSpecFluent.SpecNested<A> withNewSpec();
    public PodTemplateSpecFluent.SpecNested<A> withNewSpecLike(PodSpec item);
    public PodTemplateSpecFluent.SpecNested<A> editSpec();
    public PodTemplateSpecFluent.SpecNested<A> editOrNewSpec();
    public PodTemplateSpecFluent.SpecNested<A> editOrNewSpecLike(PodSpec item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<PodTemplateSpecFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSpecFluent<PodTemplateSpecFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}


}
