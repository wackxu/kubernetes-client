package io.fabric8.kubernetes.api.model.apps;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.fabric8.kubernetes.api.model.IntOrStringBuilder;
import java.lang.Deprecated;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.IntOrStringFluent;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface RollingUpdateDeploymentFluent<A extends RollingUpdateDeploymentFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildMaxSurge instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getMaxSurge();
    public IntOrString buildMaxSurge();
    public A withMaxSurge(IntOrString maxSurge);
    public Boolean hasMaxSurge();
    public A withNewMaxSurge(String strVal);
    public A withNewMaxSurge(Integer intVal);
    public RollingUpdateDeploymentFluent.MaxSurgeNested<A> withNewMaxSurge();
    public RollingUpdateDeploymentFluent.MaxSurgeNested<A> withNewMaxSurgeLike(IntOrString item);
    public RollingUpdateDeploymentFluent.MaxSurgeNested<A> editMaxSurge();
    public RollingUpdateDeploymentFluent.MaxSurgeNested<A> editOrNewMaxSurge();
    public RollingUpdateDeploymentFluent.MaxSurgeNested<A> editOrNewMaxSurgeLike(IntOrString item);
    
/**
 * This method has been deprecated, please use method buildMaxUnavailable instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getMaxUnavailable();
    public IntOrString buildMaxUnavailable();
    public A withMaxUnavailable(IntOrString maxUnavailable);
    public Boolean hasMaxUnavailable();
    public A withNewMaxUnavailable(String strVal);
    public A withNewMaxUnavailable(Integer intVal);
    public RollingUpdateDeploymentFluent.MaxUnavailableNested<A> withNewMaxUnavailable();
    public RollingUpdateDeploymentFluent.MaxUnavailableNested<A> withNewMaxUnavailableLike(IntOrString item);
    public RollingUpdateDeploymentFluent.MaxUnavailableNested<A> editMaxUnavailable();
    public RollingUpdateDeploymentFluent.MaxUnavailableNested<A> editOrNewMaxUnavailable();
    public RollingUpdateDeploymentFluent.MaxUnavailableNested<A> editOrNewMaxUnavailableLike(IntOrString item);

    public interface MaxSurgeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IntOrStringFluent<RollingUpdateDeploymentFluent.MaxSurgeNested<N>>{

        
    public N and();    public N endMaxSurge();
}
    public interface MaxUnavailableNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IntOrStringFluent<RollingUpdateDeploymentFluent.MaxUnavailableNested<N>>{

        
    public N and();    public N endMaxUnavailable();
}


}
