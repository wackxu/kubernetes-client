package io.fabric8.openshift.api.model;

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

public class SELinuxContextStrategyOptionsFluentImpl<A extends SELinuxContextStrategyOptionsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SELinuxContextStrategyOptionsFluent<A>{

    private SELinuxOptionsBuilder seLinuxOptions;
    private String type;

    public SELinuxContextStrategyOptionsFluentImpl(){
    }
    public SELinuxContextStrategyOptionsFluentImpl(SELinuxContextStrategyOptions instance){
            this.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            this.withType(instance.getType()); 
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

    public SELinuxContextStrategyOptionsFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptions(){
            return new SeLinuxOptionsNestedImpl();
    }

    public SELinuxContextStrategyOptionsFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(SELinuxOptions item){
            return new SeLinuxOptionsNestedImpl(item);
    }

    public SELinuxContextStrategyOptionsFluent.SeLinuxOptionsNested<A> editSeLinuxOptions(){
            return withNewSeLinuxOptionsLike(getSeLinuxOptions());
    }

    public SELinuxContextStrategyOptionsFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptions(){
            return withNewSeLinuxOptionsLike(getSeLinuxOptions() != null ? getSeLinuxOptions(): new SELinuxOptionsBuilder().build());
    }

    public SELinuxContextStrategyOptionsFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(SELinuxOptions item){
            return withNewSeLinuxOptionsLike(getSeLinuxOptions() != null ? getSeLinuxOptions(): item);
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SELinuxContextStrategyOptionsFluentImpl that = (SELinuxContextStrategyOptionsFluentImpl) o;
            if (seLinuxOptions != null ? !seLinuxOptions.equals(that.seLinuxOptions) :that.seLinuxOptions != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class SeLinuxOptionsNestedImpl<N> extends SELinuxOptionsFluentImpl<SELinuxContextStrategyOptionsFluent.SeLinuxOptionsNested<N>> implements SELinuxContextStrategyOptionsFluent.SeLinuxOptionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SELinuxOptionsBuilder builder;
    
            SeLinuxOptionsNestedImpl(SELinuxOptions item){
                    this.builder = new SELinuxOptionsBuilder(this, item);
            }
            SeLinuxOptionsNestedImpl(){
                    this.builder = new SELinuxOptionsBuilder(this);
            }
    
    public N and(){
            return (N) SELinuxContextStrategyOptionsFluentImpl.this.withSeLinuxOptions(builder.build());
    }
    public N endSeLinuxOptions(){
            return and();
    }

}


}
