package io.fabric8.kubernetes.api.model.extensions;

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

public interface IngressBackendFluent<A extends IngressBackendFluent<A>> extends Fluent<A>{


    public String getServiceName();
    public A withServiceName(String serviceName);
    public Boolean hasServiceName();
    
/**
 * This method has been deprecated, please use method buildServicePort instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getServicePort();
    public IntOrString buildServicePort();
    public A withServicePort(IntOrString servicePort);
    public Boolean hasServicePort();
    public A withNewServicePort(String strVal);
    public A withNewServicePort(Integer intVal);
    public IngressBackendFluent.ServicePortNested<A> withNewServicePort();
    public IngressBackendFluent.ServicePortNested<A> withNewServicePortLike(IntOrString item);
    public IngressBackendFluent.ServicePortNested<A> editServicePort();
    public IngressBackendFluent.ServicePortNested<A> editOrNewServicePort();
    public IngressBackendFluent.ServicePortNested<A> editOrNewServicePortLike(IntOrString item);

    public interface ServicePortNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IntOrStringFluent<IngressBackendFluent.ServicePortNested<N>>{

        
    public N and();    public N endServicePort();
}


}
