package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface HorizontalPodAutoscalerFluent<A extends HorizontalPodAutoscalerFluent<A>> extends Fluent<A>{


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
    public HorizontalPodAutoscalerFluent.MetadataNested<A> withNewMetadata();
    public HorizontalPodAutoscalerFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public HorizontalPodAutoscalerFluent.MetadataNested<A> editMetadata();
    public HorizontalPodAutoscalerFluent.MetadataNested<A> editOrNewMetadata();
    public HorizontalPodAutoscalerFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public HorizontalPodAutoscalerSpec getSpec();
    public HorizontalPodAutoscalerSpec buildSpec();
    public A withSpec(HorizontalPodAutoscalerSpec spec);
    public Boolean hasSpec();
    public HorizontalPodAutoscalerFluent.SpecNested<A> withNewSpec();
    public HorizontalPodAutoscalerFluent.SpecNested<A> withNewSpecLike(HorizontalPodAutoscalerSpec item);
    public HorizontalPodAutoscalerFluent.SpecNested<A> editSpec();
    public HorizontalPodAutoscalerFluent.SpecNested<A> editOrNewSpec();
    public HorizontalPodAutoscalerFluent.SpecNested<A> editOrNewSpecLike(HorizontalPodAutoscalerSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public HorizontalPodAutoscalerStatus getStatus();
    public HorizontalPodAutoscalerStatus buildStatus();
    public A withStatus(HorizontalPodAutoscalerStatus status);
    public Boolean hasStatus();
    public HorizontalPodAutoscalerFluent.StatusNested<A> withNewStatus();
    public HorizontalPodAutoscalerFluent.StatusNested<A> withNewStatusLike(HorizontalPodAutoscalerStatus item);
    public HorizontalPodAutoscalerFluent.StatusNested<A> editStatus();
    public HorizontalPodAutoscalerFluent.StatusNested<A> editOrNewStatus();
    public HorizontalPodAutoscalerFluent.StatusNested<A> editOrNewStatusLike(HorizontalPodAutoscalerStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<HorizontalPodAutoscalerFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerSpecFluent<HorizontalPodAutoscalerFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerStatusFluent<HorizontalPodAutoscalerFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
