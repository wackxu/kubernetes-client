package io.fabric8.kubernetes.api.model;

import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface EnvVarFluent<A extends EnvVarFluent<A>> extends Fluent<A>{


    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public String getValue();
    public A withValue(String value);
    public Boolean hasValue();
    
/**
 * This method has been deprecated, please use method buildValueFrom instead.
 * @return The buildable object.
 */
@Deprecated public EnvVarSource getValueFrom();
    public EnvVarSource buildValueFrom();
    public A withValueFrom(EnvVarSource valueFrom);
    public Boolean hasValueFrom();
    public EnvVarFluent.ValueFromNested<A> withNewValueFrom();
    public EnvVarFluent.ValueFromNested<A> withNewValueFromLike(EnvVarSource item);
    public EnvVarFluent.ValueFromNested<A> editValueFrom();
    public EnvVarFluent.ValueFromNested<A> editOrNewValueFrom();
    public EnvVarFluent.ValueFromNested<A> editOrNewValueFromLike(EnvVarSource item);

    public interface ValueFromNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvVarSourceFluent<EnvVarFluent.ValueFromNested<N>>{

        
    public N and();    public N endValueFrom();
}


}
