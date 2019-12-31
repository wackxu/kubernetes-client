package io.fabric8.kubernetes.api.model;

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

public interface NamedContextFluent<A extends NamedContextFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildContext instead.
 * @return The buildable object.
 */
@Deprecated public Context getContext();
    public Context buildContext();
    public A withContext(Context context);
    public Boolean hasContext();
    public NamedContextFluent.ContextNested<A> withNewContext();
    public NamedContextFluent.ContextNested<A> withNewContextLike(Context item);
    public NamedContextFluent.ContextNested<A> editContext();
    public NamedContextFluent.ContextNested<A> editOrNewContext();
    public NamedContextFluent.ContextNested<A> editOrNewContextLike(Context item);
    public String getName();
    public A withName(String name);
    public Boolean hasName();

    public interface ContextNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContextFluent<NamedContextFluent.ContextNested<N>>{

        
    public N and();    public N endContext();
}


}
