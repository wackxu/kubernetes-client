package io.fabric8.kubernetes.api.model.extensions;

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

public interface IngressFluent<A extends IngressFluent<A>> extends Fluent<A>{


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
    public IngressFluent.MetadataNested<A> withNewMetadata();
    public IngressFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public IngressFluent.MetadataNested<A> editMetadata();
    public IngressFluent.MetadataNested<A> editOrNewMetadata();
    public IngressFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public IngressSpec getSpec();
    public IngressSpec buildSpec();
    public A withSpec(IngressSpec spec);
    public Boolean hasSpec();
    public IngressFluent.SpecNested<A> withNewSpec();
    public IngressFluent.SpecNested<A> withNewSpecLike(IngressSpec item);
    public IngressFluent.SpecNested<A> editSpec();
    public IngressFluent.SpecNested<A> editOrNewSpec();
    public IngressFluent.SpecNested<A> editOrNewSpecLike(IngressSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public IngressStatus getStatus();
    public IngressStatus buildStatus();
    public A withStatus(IngressStatus status);
    public Boolean hasStatus();
    public IngressFluent.StatusNested<A> withNewStatus();
    public IngressFluent.StatusNested<A> withNewStatusLike(IngressStatus item);
    public IngressFluent.StatusNested<A> editStatus();
    public IngressFluent.StatusNested<A> editOrNewStatus();
    public IngressFluent.StatusNested<A> editOrNewStatusLike(IngressStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<IngressFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressSpecFluent<IngressFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressStatusFluent<IngressFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
