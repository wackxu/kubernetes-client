package io.fabric8.kubernetes.api.model.settings;

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

public interface PodPresetFluent<A extends PodPresetFluent<A>> extends Fluent<A>{


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
    public PodPresetFluent.MetadataNested<A> withNewMetadata();
    public PodPresetFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public PodPresetFluent.MetadataNested<A> editMetadata();
    public PodPresetFluent.MetadataNested<A> editOrNewMetadata();
    public PodPresetFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public PodPresetSpec getSpec();
    public PodPresetSpec buildSpec();
    public A withSpec(PodPresetSpec spec);
    public Boolean hasSpec();
    public PodPresetFluent.SpecNested<A> withNewSpec();
    public PodPresetFluent.SpecNested<A> withNewSpecLike(PodPresetSpec item);
    public PodPresetFluent.SpecNested<A> editSpec();
    public PodPresetFluent.SpecNested<A> editOrNewSpec();
    public PodPresetFluent.SpecNested<A> editOrNewSpecLike(PodPresetSpec item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<PodPresetFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetSpecFluent<PodPresetFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}


}
