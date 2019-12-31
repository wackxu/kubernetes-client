package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.SELinuxOptionsBuilder;
import java.lang.String;
import io.fabric8.kubernetes.api.model.SELinuxOptionsFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.SELinuxOptions;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface SELinuxStrategyOptionsFluent<A extends SELinuxStrategyOptionsFluent<A>> extends Fluent<A>{


    public String getRule();
    public A withRule(String rule);
    public Boolean hasRule();
    
/**
 * This method has been deprecated, please use method buildSeLinuxOptions instead.
 * @return The buildable object.
 */
@Deprecated public SELinuxOptions getSeLinuxOptions();
    public SELinuxOptions buildSeLinuxOptions();
    public A withSeLinuxOptions(SELinuxOptions seLinuxOptions);
    public Boolean hasSeLinuxOptions();
    public A withNewSeLinuxOptions(String level,String role,String type,String user);
    public SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptions();
    public SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(SELinuxOptions item);
    public SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> editSeLinuxOptions();
    public SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptions();
    public SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(SELinuxOptions item);

    public interface SeLinuxOptionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SELinuxOptionsFluent<SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<N>>{

        
    public N and();    public N endSeLinuxOptions();
}


}
