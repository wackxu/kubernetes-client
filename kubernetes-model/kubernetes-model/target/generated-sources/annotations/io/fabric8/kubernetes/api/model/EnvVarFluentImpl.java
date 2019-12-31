package io.fabric8.kubernetes.api.model;

import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class EnvVarFluentImpl<A extends EnvVarFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements EnvVarFluent<A>{

    private String name;
    private String value;
    private EnvVarSourceBuilder valueFrom;

    public EnvVarFluentImpl(){
    }
    public EnvVarFluentImpl(EnvVar instance){
            this.withName(instance.getName()); 
            this.withValue(instance.getValue()); 
            this.withValueFrom(instance.getValueFrom()); 
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

    public String getValue(){
            return this.value;
    }

    public A withValue(String value){
            this.value=value; return (A) this;
    }

    public Boolean hasValue(){
            return this.value != null;
    }

    
/**
 * This method has been deprecated, please use method buildValueFrom instead.
 * @return The buildable object.
 */
@Deprecated public EnvVarSource getValueFrom(){
            return this.valueFrom!=null?this.valueFrom.build():null;
    }

    public EnvVarSource buildValueFrom(){
            return this.valueFrom!=null?this.valueFrom.build():null;
    }

    public A withValueFrom(EnvVarSource valueFrom){
            _visitables.remove(this.valueFrom);
            if (valueFrom!=null){ this.valueFrom= new EnvVarSourceBuilder(valueFrom); _visitables.add(this.valueFrom);} return (A) this;
    }

    public Boolean hasValueFrom(){
            return this.valueFrom != null;
    }

    public EnvVarFluent.ValueFromNested<A> withNewValueFrom(){
            return new ValueFromNestedImpl();
    }

    public EnvVarFluent.ValueFromNested<A> withNewValueFromLike(EnvVarSource item){
            return new ValueFromNestedImpl(item);
    }

    public EnvVarFluent.ValueFromNested<A> editValueFrom(){
            return withNewValueFromLike(getValueFrom());
    }

    public EnvVarFluent.ValueFromNested<A> editOrNewValueFrom(){
            return withNewValueFromLike(getValueFrom() != null ? getValueFrom(): new EnvVarSourceBuilder().build());
    }

    public EnvVarFluent.ValueFromNested<A> editOrNewValueFromLike(EnvVarSource item){
            return withNewValueFromLike(getValueFrom() != null ? getValueFrom(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EnvVarFluentImpl that = (EnvVarFluentImpl) o;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (value != null ? !value.equals(that.value) :that.value != null) return false;
            if (valueFrom != null ? !valueFrom.equals(that.valueFrom) :that.valueFrom != null) return false;
            return true;
    }


    public class ValueFromNestedImpl<N> extends EnvVarSourceFluentImpl<EnvVarFluent.ValueFromNested<N>> implements EnvVarFluent.ValueFromNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EnvVarSourceBuilder builder;
    
            ValueFromNestedImpl(EnvVarSource item){
                    this.builder = new EnvVarSourceBuilder(this, item);
            }
            ValueFromNestedImpl(){
                    this.builder = new EnvVarSourceBuilder(this);
            }
    
    public N and(){
            return (N) EnvVarFluentImpl.this.withValueFrom(builder.build());
    }
    public N endValueFrom(){
            return and();
    }

}


}
