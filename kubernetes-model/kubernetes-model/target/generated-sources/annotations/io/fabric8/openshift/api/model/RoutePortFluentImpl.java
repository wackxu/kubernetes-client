package io.fabric8.openshift.api.model;

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

public class RoutePortFluentImpl<A extends RoutePortFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RoutePortFluent<A>{

    private IntOrStringBuilder targetPort;

    public RoutePortFluentImpl(){
    }
    public RoutePortFluentImpl(RoutePort instance){
            this.withTargetPort(instance.getTargetPort()); 
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

    public RoutePortFluent.TargetPortNested<A> withNewTargetPort(){
            return new TargetPortNestedImpl();
    }

    public RoutePortFluent.TargetPortNested<A> withNewTargetPortLike(IntOrString item){
            return new TargetPortNestedImpl(item);
    }

    public RoutePortFluent.TargetPortNested<A> editTargetPort(){
            return withNewTargetPortLike(getTargetPort());
    }

    public RoutePortFluent.TargetPortNested<A> editOrNewTargetPort(){
            return withNewTargetPortLike(getTargetPort() != null ? getTargetPort(): new IntOrStringBuilder().build());
    }

    public RoutePortFluent.TargetPortNested<A> editOrNewTargetPortLike(IntOrString item){
            return withNewTargetPortLike(getTargetPort() != null ? getTargetPort(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RoutePortFluentImpl that = (RoutePortFluentImpl) o;
            if (targetPort != null ? !targetPort.equals(that.targetPort) :that.targetPort != null) return false;
            return true;
    }


    public class TargetPortNestedImpl<N> extends IntOrStringFluentImpl<RoutePortFluent.TargetPortNested<N>> implements RoutePortFluent.TargetPortNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IntOrStringBuilder builder;
    
            TargetPortNestedImpl(IntOrString item){
                    this.builder = new IntOrStringBuilder(this, item);
            }
            TargetPortNestedImpl(){
                    this.builder = new IntOrStringBuilder(this);
            }
    
    public N and(){
            return (N) RoutePortFluentImpl.this.withTargetPort(builder.build());
    }
    public N endTargetPort(){
            return and();
    }

}


}
