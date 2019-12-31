package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.Deprecated;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import javax.validation.constraints.Pattern;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface ServicePortFluent<A extends ServicePortFluent<A>> extends Fluent<A>{


    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public Integer getNodePort();
    public A withNodePort(Integer nodePort);
    public Boolean hasNodePort();
    public Integer getPort();
    public A withPort(Integer port);
    public Boolean hasPort();
    public String getProtocol();
    public A withProtocol(String protocol);
    public Boolean hasProtocol();
    
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
    public ServicePortFluent.TargetPortNested<A> withNewTargetPort();
    public ServicePortFluent.TargetPortNested<A> withNewTargetPortLike(IntOrString item);
    public ServicePortFluent.TargetPortNested<A> editTargetPort();
    public ServicePortFluent.TargetPortNested<A> editOrNewTargetPort();
    public ServicePortFluent.TargetPortNested<A> editOrNewTargetPortLike(IntOrString item);

    public interface TargetPortNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IntOrStringFluent<ServicePortFluent.TargetPortNested<N>>{

        
    public N and();    public N endTargetPort();
}


}
