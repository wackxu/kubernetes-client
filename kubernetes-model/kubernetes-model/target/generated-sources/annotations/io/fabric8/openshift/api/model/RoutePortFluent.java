package io.fabric8.openshift.api.model;

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

public interface RoutePortFluent<A extends RoutePortFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildTargetPort instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getTargetPort();
    public IntOrString buildTargetPort();
    public A withTargetPort(IntOrString targetPort);
    public Boolean hasTargetPort();
    public A withNewTargetPort(String strVal);
    public A withNewTargetPort(Integer intVal);
    public RoutePortFluent.TargetPortNested<A> withNewTargetPort();
    public RoutePortFluent.TargetPortNested<A> withNewTargetPortLike(IntOrString item);
    public RoutePortFluent.TargetPortNested<A> editTargetPort();
    public RoutePortFluent.TargetPortNested<A> editOrNewTargetPort();
    public RoutePortFluent.TargetPortNested<A> editOrNewTargetPortLike(IntOrString item);

    public interface TargetPortNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IntOrStringFluent<RoutePortFluent.TargetPortNested<N>>{

        
    public N and();    public N endTargetPort();
}


}
