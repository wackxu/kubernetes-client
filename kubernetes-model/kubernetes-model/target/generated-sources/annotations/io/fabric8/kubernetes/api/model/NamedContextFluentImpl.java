package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class NamedContextFluentImpl<A extends NamedContextFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NamedContextFluent<A>{

    private ContextBuilder context;
    private String name;

    public NamedContextFluentImpl(){
    }
    public NamedContextFluentImpl(NamedContext instance){
            this.withContext(instance.getContext()); 
            this.withName(instance.getName()); 
    }

    
/**
 * This method has been deprecated, please use method buildContext instead.
 * @return The buildable object.
 */
@Deprecated public Context getContext(){
            return this.context!=null?this.context.build():null;
    }

    public Context buildContext(){
            return this.context!=null?this.context.build():null;
    }

    public A withContext(Context context){
            _visitables.remove(this.context);
            if (context!=null){ this.context= new ContextBuilder(context); _visitables.add(this.context);} return (A) this;
    }

    public Boolean hasContext(){
            return this.context != null;
    }

    public NamedContextFluent.ContextNested<A> withNewContext(){
            return new ContextNestedImpl();
    }

    public NamedContextFluent.ContextNested<A> withNewContextLike(Context item){
            return new ContextNestedImpl(item);
    }

    public NamedContextFluent.ContextNested<A> editContext(){
            return withNewContextLike(getContext());
    }

    public NamedContextFluent.ContextNested<A> editOrNewContext(){
            return withNewContextLike(getContext() != null ? getContext(): new ContextBuilder().build());
    }

    public NamedContextFluent.ContextNested<A> editOrNewContextLike(Context item){
            return withNewContextLike(getContext() != null ? getContext(): item);
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamedContextFluentImpl that = (NamedContextFluentImpl) o;
            if (context != null ? !context.equals(that.context) :that.context != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            return true;
    }


    public class ContextNestedImpl<N> extends ContextFluentImpl<NamedContextFluent.ContextNested<N>> implements NamedContextFluent.ContextNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContextBuilder builder;
    
            ContextNestedImpl(Context item){
                    this.builder = new ContextBuilder(this, item);
            }
            ContextNestedImpl(){
                    this.builder = new ContextBuilder(this);
            }
    
    public N and(){
            return (N) NamedContextFluentImpl.this.withContext(builder.build());
    }
    public N endContext(){
            return and();
    }

}


}
