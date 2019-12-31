package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.SELinuxOptionsBuilder;
import java.lang.String;
import io.fabric8.kubernetes.api.model.SELinuxOptionsFluentImpl;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.SELinuxOptions;
import java.lang.Object;
import java.lang.Boolean;

public class SELinuxStrategyOptionsFluentImpl<A extends SELinuxStrategyOptionsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SELinuxStrategyOptionsFluent<A>{

    private String rule;
    private SELinuxOptionsBuilder seLinuxOptions;

    public SELinuxStrategyOptionsFluentImpl(){
    }
    public SELinuxStrategyOptionsFluentImpl(SELinuxStrategyOptions instance){
            this.withRule(instance.getRule()); 
            this.withSeLinuxOptions(instance.getSeLinuxOptions()); 
    }

    public String getRule(){
            return this.rule;
    }

    public A withRule(String rule){
            this.rule=rule; return (A) this;
    }

    public Boolean hasRule(){
            return this.rule != null;
    }

    
/**
 * This method has been deprecated, please use method buildSeLinuxOptions instead.
 * @return The buildable object.
 */
@Deprecated public SELinuxOptions getSeLinuxOptions(){
            return this.seLinuxOptions!=null?this.seLinuxOptions.build():null;
    }

    public SELinuxOptions buildSeLinuxOptions(){
            return this.seLinuxOptions!=null?this.seLinuxOptions.build():null;
    }

    public A withSeLinuxOptions(SELinuxOptions seLinuxOptions){
            _visitables.remove(this.seLinuxOptions);
            if (seLinuxOptions!=null){ this.seLinuxOptions= new SELinuxOptionsBuilder(seLinuxOptions); _visitables.add(this.seLinuxOptions);} return (A) this;
    }

    public Boolean hasSeLinuxOptions(){
            return this.seLinuxOptions != null;
    }

    public A withNewSeLinuxOptions(String level,String role,String type,String user){
            return (A)withSeLinuxOptions(new SELinuxOptions(level, role, type, user));
    }

    public SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptions(){
            return new SeLinuxOptionsNestedImpl();
    }

    public SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(SELinuxOptions item){
            return new SeLinuxOptionsNestedImpl(item);
    }

    public SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> editSeLinuxOptions(){
            return withNewSeLinuxOptionsLike(getSeLinuxOptions());
    }

    public SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptions(){
            return withNewSeLinuxOptionsLike(getSeLinuxOptions() != null ? getSeLinuxOptions(): new SELinuxOptionsBuilder().build());
    }

    public SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(SELinuxOptions item){
            return withNewSeLinuxOptionsLike(getSeLinuxOptions() != null ? getSeLinuxOptions(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SELinuxStrategyOptionsFluentImpl that = (SELinuxStrategyOptionsFluentImpl) o;
            if (rule != null ? !rule.equals(that.rule) :that.rule != null) return false;
            if (seLinuxOptions != null ? !seLinuxOptions.equals(that.seLinuxOptions) :that.seLinuxOptions != null) return false;
            return true;
    }


    public class SeLinuxOptionsNestedImpl<N> extends SELinuxOptionsFluentImpl<SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<N>> implements SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SELinuxOptionsBuilder builder;
    
            SeLinuxOptionsNestedImpl(SELinuxOptions item){
                    this.builder = new SELinuxOptionsBuilder(this, item);
            }
            SeLinuxOptionsNestedImpl(){
                    this.builder = new SELinuxOptionsBuilder(this);
            }
    
    public N and(){
            return (N) SELinuxStrategyOptionsFluentImpl.this.withSeLinuxOptions(builder.build());
    }
    public N endSeLinuxOptions(){
            return and();
    }

}


}
