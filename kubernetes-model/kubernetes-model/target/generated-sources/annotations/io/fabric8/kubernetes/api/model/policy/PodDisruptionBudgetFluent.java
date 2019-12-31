package io.fabric8.kubernetes.api.model.policy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface PodDisruptionBudgetFluent<A extends PodDisruptionBudgetFluent<A>> extends Fluent<A>{


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
    public PodDisruptionBudgetFluent.MetadataNested<A> withNewMetadata();
    public PodDisruptionBudgetFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public PodDisruptionBudgetFluent.MetadataNested<A> editMetadata();
    public PodDisruptionBudgetFluent.MetadataNested<A> editOrNewMetadata();
    public PodDisruptionBudgetFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public PodDisruptionBudgetSpec getSpec();
    public PodDisruptionBudgetSpec buildSpec();
    public A withSpec(PodDisruptionBudgetSpec spec);
    public Boolean hasSpec();
    public PodDisruptionBudgetFluent.SpecNested<A> withNewSpec();
    public PodDisruptionBudgetFluent.SpecNested<A> withNewSpecLike(PodDisruptionBudgetSpec item);
    public PodDisruptionBudgetFluent.SpecNested<A> editSpec();
    public PodDisruptionBudgetFluent.SpecNested<A> editOrNewSpec();
    public PodDisruptionBudgetFluent.SpecNested<A> editOrNewSpecLike(PodDisruptionBudgetSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public PodDisruptionBudgetStatus getStatus();
    public PodDisruptionBudgetStatus buildStatus();
    public A withStatus(PodDisruptionBudgetStatus status);
    public Boolean hasStatus();
    public PodDisruptionBudgetFluent.StatusNested<A> withNewStatus();
    public PodDisruptionBudgetFluent.StatusNested<A> withNewStatusLike(PodDisruptionBudgetStatus item);
    public PodDisruptionBudgetFluent.StatusNested<A> editStatus();
    public PodDisruptionBudgetFluent.StatusNested<A> editOrNewStatus();
    public PodDisruptionBudgetFluent.StatusNested<A> editOrNewStatusLike(PodDisruptionBudgetStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<PodDisruptionBudgetFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetSpecFluent<PodDisruptionBudgetFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetStatusFluent<PodDisruptionBudgetFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
