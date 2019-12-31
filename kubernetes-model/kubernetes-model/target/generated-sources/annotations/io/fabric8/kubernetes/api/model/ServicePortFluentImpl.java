package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import javax.validation.constraints.Pattern;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;

public class ServicePortFluentImpl<A extends ServicePortFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ServicePortFluent<A>{

    private String name;
    private Integer nodePort;
    private Integer port;
    private String protocol;
    private IntOrStringBuilder targetPort;

    public ServicePortFluentImpl(){
    }
    public ServicePortFluentImpl(ServicePort instance){
            this.withName(instance.getName()); 
            this.withNodePort(instance.getNodePort()); 
            this.withPort(instance.getPort()); 
            this.withProtocol(instance.getProtocol()); 
            this.withTargetPort(instance.getTargetPort()); 
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public Integer getNodePort(){
            return this.nodePort;
    }

    public A withNodePort(Integer nodePort){
            this.nodePort=nodePort; return (A) this;
    }

    public Boolean hasNodePort(){
            return this.nodePort != null;
    }

    public Integer getPort(){
            return this.port;
    }

    public A withPort(Integer port){
            this.port=port; return (A) this;
    }

    public Boolean hasPort(){
            return this.port != null;
    }

    public String getProtocol(){
            return this.protocol;
    }

    public A withProtocol(String protocol){
            this.protocol=protocol; return (A) this;
    }

    public Boolean hasProtocol(){
            return this.protocol != null;
    }

    
/**
 * This method has been deprecated, please use method buildTargetPort instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getTargetPort(){
            return this.targetPort!=null?this.targetPort.build():null;
    }

    public IntOrString buildTargetPort(){
            return this.targetPort!=null?this.targetPort.build():null;
    }

    public A withTargetPort(IntOrString targetPort){
            _visitables.remove(this.targetPort);
            if (targetPort!=null){ this.targetPort= new IntOrStringBuilder(targetPort); _visitables.add(this.targetPort);} return (A) this;
    }

    public Boolean hasTargetPort(){
            return this.targetPort != null;
    }

    public A withNewTargetPort(String strVal){
            return (A)withTargetPort(new IntOrString(strVal));
    }

    public A withNewTargetPort(Integer intVal){
            return (A)withTargetPort(new IntOrString(intVal));
    }

    public ServicePortFluent.TargetPortNested<A> withNewTargetPort(){
            return new TargetPortNestedImpl();
    }

    public ServicePortFluent.TargetPortNested<A> withNewTargetPortLike(IntOrString item){
            return new TargetPortNestedImpl(item);
    }

    public ServicePortFluent.TargetPortNested<A> editTargetPort(){
            return withNewTargetPortLike(getTargetPort());
    }

    public ServicePortFluent.TargetPortNested<A> editOrNewTargetPort(){
            return withNewTargetPortLike(getTargetPort() != null ? getTargetPort(): new IntOrStringBuilder().build());
    }

    public ServicePortFluent.TargetPortNested<A> editOrNewTargetPortLike(IntOrString item){
            return withNewTargetPortLike(getTargetPort() != null ? getTargetPort(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServicePortFluentImpl that = (ServicePortFluentImpl) o;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (nodePort != null ? !nodePort.equals(that.nodePort) :that.nodePort != null) return false;
            if (port != null ? !port.equals(that.port) :that.port != null) return false;
            if (protocol != null ? !protocol.equals(that.protocol) :that.protocol != null) return false;
            if (targetPort != null ? !targetPort.equals(that.targetPort) :that.targetPort != null) return false;
            return true;
    }


    public class TargetPortNestedImpl<N> extends IntOrStringFluentImpl<ServicePortFluent.TargetPortNested<N>> implements ServicePortFluent.TargetPortNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IntOrStringBuilder builder;
    
            TargetPortNestedImpl(IntOrString item){
                    this.builder = new IntOrStringBuilder(this, item);
            }
            TargetPortNestedImpl(){
                    this.builder = new IntOrStringBuilder(this);
            }
    
    public N and(){
            return (N) ServicePortFluentImpl.this.withTargetPort(builder.build());
    }
    public N endTargetPort(){
            return and();
    }

}


}
