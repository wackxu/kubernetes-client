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

public class RollingUpdateDaemonSetFluentImpl<A extends RollingUpdateDaemonSetFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RollingUpdateDaemonSetFluent<A>{

    private IntOrStringBuilder maxUnavailable;

    public RollingUpdateDaemonSetFluentImpl(){
    }
    public RollingUpdateDaemonSetFluentImpl(RollingUpdateDaemonSet instance){
            this.withMaxUnavailable(instance.getMaxUnavailable()); 
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

    public RollingUpdateDaemonSetFluent.MaxUnavailableNested<A> withNewMaxUnavailable(){
            return new MaxUnavailableNestedImpl();
    }

    public RollingUpdateDaemonSetFluent.MaxUnavailableNested<A> withNewMaxUnavailableLike(IntOrString item){
            return new MaxUnavailableNestedImpl(item);
    }

    public RollingUpdateDaemonSetFluent.MaxUnavailableNested<A> editMaxUnavailable(){
            return withNewMaxUnavailableLike(getMaxUnavailable());
    }

    public RollingUpdateDaemonSetFluent.MaxUnavailableNested<A> editOrNewMaxUnavailable(){
            return withNewMaxUnavailableLike(getMaxUnavailable() != null ? getMaxUnavailable(): new IntOrStringBuilder().build());
    }

    public RollingUpdateDaemonSetFluent.MaxUnavailableNested<A> editOrNewMaxUnavailableLike(IntOrString item){
            return withNewMaxUnavailableLike(getMaxUnavailable() != null ? getMaxUnavailable(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RollingUpdateDaemonSetFluentImpl that = (RollingUpdateDaemonSetFluentImpl) o;
            if (maxUnavailable != null ? !maxUnavailable.equals(that.maxUnavailable) :that.maxUnavailable != null) return false;
            return true;
    }


    public class MaxUnavailableNestedImpl<N> extends IntOrStringFluentImpl<RollingUpdateDaemonSetFluent.MaxUnavailableNested<N>> implements RollingUpdateDaemonSetFluent.MaxUnavailableNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IntOrStringBuilder builder;
    
            MaxUnavailableNestedImpl(IntOrString item){
                    this.builder = new IntOrStringBuilder(this, item);
            }
            MaxUnavailableNestedImpl(){
                    this.builder = new IntOrStringBuilder(this);
            }
    
    public N and(){
            return (N) RollingUpdateDaemonSetFluentImpl.this.withMaxUnavailable(builder.build());
    }
    public N endMaxUnavailable(){
            return and();
    }

}


}
