package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.fabric8.kubernetes.api.model.IntOrStringBuilder;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.IntOrStringFluentImpl;

public class IngressBackendFluentImpl<A extends IngressBackendFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements IngressBackendFluent<A>{

    private String serviceName;
    private IntOrStringBuilder servicePort;

    public IngressBackendFluentImpl(){
    }
    public IngressBackendFluentImpl(IngressBackend instance){
            this.withServiceName(instance.getServiceName()); 
            this.withServicePort(instance.getServicePort()); 
    }

    public String getServiceName(){
            return this.serviceName;
    }

    public A withServiceName(String serviceName){
            this.serviceName=serviceName; return (A) this;
    }

    public Boolean hasServiceName(){
            return this.serviceName != null;
    }

    
/**
 * This method has been deprecated, please use method buildServicePort instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getServicePort(){
            return this.servicePort!=null?this.servicePort.build():null;
    }

    public IntOrString buildServicePort(){
            return this.servicePort!=null?this.servicePort.build():null;
    }

    public A withServicePort(IntOrString servicePort){
            _visitables.remove(this.servicePort);
            if (servicePort!=null){ this.servicePort= new IntOrStringBuilder(servicePort); _visitables.add(this.servicePort);} return (A) this;
    }

    public Boolean hasServicePort(){
            return this.servicePort != null;
    }

    public A withNewServicePort(String strVal){
            return (A)withServicePort(new IntOrString(strVal));
    }

    public A withNewServicePort(Integer intVal){
            return (A)withServicePort(new IntOrString(intVal));
    }

    public IngressBackendFluent.ServicePortNested<A> withNewServicePort(){
            return new ServicePortNestedImpl();
    }

    public IngressBackendFluent.ServicePortNested<A> withNewServicePortLike(IntOrString item){
            return new ServicePortNestedImpl(item);
    }

    public IngressBackendFluent.ServicePortNested<A> editServicePort(){
            return withNewServicePortLike(getServicePort());
    }

    public IngressBackendFluent.ServicePortNested<A> editOrNewServicePort(){
            return withNewServicePortLike(getServicePort() != null ? getServicePort(): new IntOrStringBuilder().build());
    }

    public IngressBackendFluent.ServicePortNested<A> editOrNewServicePortLike(IntOrString item){
            return withNewServicePortLike(getServicePort() != null ? getServicePort(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IngressBackendFluentImpl that = (IngressBackendFluentImpl) o;
            if (serviceName != null ? !serviceName.equals(that.serviceName) :that.serviceName != null) return false;
            if (servicePort != null ? !servicePort.equals(that.servicePort) :that.servicePort != null) return false;
            return true;
    }


    public class ServicePortNestedImpl<N> extends IntOrStringFluentImpl<IngressBackendFluent.ServicePortNested<N>> implements IngressBackendFluent.ServicePortNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IntOrStringBuilder builder;
    
            ServicePortNestedImpl(IntOrString item){
                    this.builder = new IntOrStringBuilder(this, item);
            }
            ServicePortNestedImpl(){
                    this.builder = new IntOrStringBuilder(this);
            }
    
    public N and(){
            return (N) IngressBackendFluentImpl.this.withServicePort(builder.build());
    }
    public N endServicePort(){
            return and();
    }

}


}
