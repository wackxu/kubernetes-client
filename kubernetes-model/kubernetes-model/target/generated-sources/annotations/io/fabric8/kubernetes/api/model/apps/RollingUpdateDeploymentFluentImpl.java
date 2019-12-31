package io.fabric8.kubernetes.api.model.apps;

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

public class RollingUpdateDeploymentFluentImpl<A extends RollingUpdateDeploymentFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RollingUpdateDeploymentFluent<A>{

    private IntOrStringBuilder maxSurge;
    private IntOrStringBuilder maxUnavailable;

    public RollingUpdateDeploymentFluentImpl(){
    }
    public RollingUpdateDeploymentFluentImpl(RollingUpdateDeployment instance){
            this.withMaxSurge(instance.getMaxSurge()); 
            this.withMaxUnavailable(instance.getMaxUnavailable()); 
    }

    
/**
 * This method has been deprecated, please use method buildMaxSurge instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getMaxSurge(){
            return this.maxSurge!=null?this.maxSurge.build():null;
    }

    public IntOrString buildMaxSurge(){
            return this.maxSurge!=null?this.maxSurge.build():null;
    }

    public A withMaxSurge(IntOrString maxSurge){
            _visitables.remove(this.maxSurge);
            if (maxSurge!=null){ this.maxSurge= new IntOrStringBuilder(maxSurge); _visitables.add(this.maxSurge);} return (A) this;
    }

    public Boolean hasMaxSurge(){
            return this.maxSurge != null;
    }

    public A withNewMaxSurge(String strVal){
            return (A)withMaxSurge(new IntOrString(strVal));
    }

    public A withNewMaxSurge(Integer intVal){
            return (A)withMaxSurge(new IntOrString(intVal));
    }

    public RollingUpdateDeploymentFluent.MaxSurgeNested<A> withNewMaxSurge(){
            return new MaxSurgeNestedImpl();
    }

    public RollingUpdateDeploymentFluent.MaxSurgeNested<A> withNewMaxSurgeLike(IntOrString item){
            return new MaxSurgeNestedImpl(item);
    }

    public RollingUpdateDeploymentFluent.MaxSurgeNested<A> editMaxSurge(){
            return withNewMaxSurgeLike(getMaxSurge());
    }

    public RollingUpdateDeploymentFluent.MaxSurgeNested<A> editOrNewMaxSurge(){
            return withNewMaxSurgeLike(getMaxSurge() != null ? getMaxSurge(): new IntOrStringBuilder().build());
    }

    public RollingUpdateDeploymentFluent.MaxSurgeNested<A> editOrNewMaxSurgeLike(IntOrString item){
            return withNewMaxSurgeLike(getMaxSurge() != null ? getMaxSurge(): item);
    }

    
/**
 * This method has been deprecated, please use method buildMaxUnavailable instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getMaxUnavailable(){
            return this.maxUnavailable!=null?this.maxUnavailable.build():null;
    }

    public IntOrString buildMaxUnavailable(){
            return this.maxUnavailable!=null?this.maxUnavailable.build():null;
    }

    public A withMaxUnavailable(IntOrString maxUnavailable){
            _visitables.remove(this.maxUnavailable);
            if (maxUnavailable!=null){ this.maxUnavailable= new IntOrStringBuilder(maxUnavailable); _visitables.add(this.maxUnavailable);} return (A) this;
    }

    public Boolean hasMaxUnavailable(){
            return this.maxUnavailable != null;
    }

    public A withNewMaxUnavailable(String strVal){
            return (A)withMaxUnavailable(new IntOrString(strVal));
    }

    public A withNewMaxUnavailable(Integer intVal){
            return (A)withMaxUnavailable(new IntOrString(intVal));
    }

    public RollingUpdateDeploymentFluent.MaxUnavailableNested<A> withNewMaxUnavailable(){
            return new MaxUnavailableNestedImpl();
    }

    public RollingUpdateDeploymentFluent.MaxUnavailableNested<A> withNewMaxUnavailableLike(IntOrString item){
            return new MaxUnavailableNestedImpl(item);
    }

    public RollingUpdateDeploymentFluent.MaxUnavailableNested<A> editMaxUnavailable(){
            return withNewMaxUnavailableLike(getMaxUnavailable());
    }

    public RollingUpdateDeploymentFluent.MaxUnavailableNested<A> editOrNewMaxUnavailable(){
            return withNewMaxUnavailableLike(getMaxUnavailable() != null ? getMaxUnavailable(): new IntOrStringBuilder().build());
    }

    public RollingUpdateDeploymentFluent.MaxUnavailableNested<A> editOrNewMaxUnavailableLike(IntOrString item){
            return withNewMaxUnavailableLike(getMaxUnavailable() != null ? getMaxUnavailable(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RollingUpdateDeploymentFluentImpl that = (RollingUpdateDeploymentFluentImpl) o;
            if (maxSurge != null ? !maxSurge.equals(that.maxSurge) :that.maxSurge != null) return false;
            if (maxUnavailable != null ? !maxUnavailable.equals(that.maxUnavailable) :that.maxUnavailable != null) return false;
            return true;
    }


    public class MaxSurgeNestedImpl<N> extends IntOrStringFluentImpl<RollingUpdateDeploymentFluent.MaxSurgeNested<N>> implements RollingUpdateDeploymentFluent.MaxSurgeNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IntOrStringBuilder builder;
    
            MaxSurgeNestedImpl(IntOrString item){
                    this.builder = new IntOrStringBuilder(this, item);
            }
            MaxSurgeNestedImpl(){
                    this.builder = new IntOrStringBuilder(this);
            }
    
    public N and(){
            return (N) RollingUpdateDeploymentFluentImpl.this.withMaxSurge(builder.build());
    }
    public N endMaxSurge(){
            return and();
    }

}
    public class MaxUnavailableNestedImpl<N> extends IntOrStringFluentImpl<RollingUpdateDeploymentFluent.MaxUnavailableNested<N>> implements RollingUpdateDeploymentFluent.MaxUnavailableNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IntOrStringBuilder builder;
    
            MaxUnavailableNestedImpl(IntOrString item){
                    this.builder = new IntOrStringBuilder(this, item);
            }
            MaxUnavailableNestedImpl(){
                    this.builder = new IntOrStringBuilder(this);
            }
    
    public N and(){
            return (N) RollingUpdateDeploymentFluentImpl.this.withMaxUnavailable(builder.build());
    }
    public N endMaxUnavailable(){
            return and();
    }

}


}
