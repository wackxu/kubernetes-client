package io.fabric8.kubernetes.api.model.scheduling;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.constraints.NotNull;
import java.lang.Integer;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface PriorityClassFluent<A extends PriorityClassFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getDescription();
    public A withDescription(String description);
    public Boolean hasDescription();
    public Boolean isGlobalDefault();
    public A withGlobalDefault(Boolean globalDefault);
    public Boolean hasGlobalDefault();
    public A withNewGlobalDefault(String arg1);
    public A withNewGlobalDefault(boolean arg1);
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
    public PriorityClassFluent.MetadataNested<A> withNewMetadata();
    public PriorityClassFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public PriorityClassFluent.MetadataNested<A> editMetadata();
    public PriorityClassFluent.MetadataNested<A> editOrNewMetadata();
    public PriorityClassFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public Integer getValue();
    public A withValue(Integer value);
    public Boolean hasValue();

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<PriorityClassFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
