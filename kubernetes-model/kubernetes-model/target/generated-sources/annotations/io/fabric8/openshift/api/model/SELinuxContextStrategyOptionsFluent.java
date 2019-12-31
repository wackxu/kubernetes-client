package io.fabric8.openshift.api.model;

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

public interface SELinuxContextStrategyOptionsFluent<A extends SELinuxContextStrategyOptionsFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildSeLinuxOptions instead.
 * @return The buildable object.
 */
@Deprecated public SELinuxOptions getSeLinuxOptions();
    public SELinuxOptions buildSeLinuxOptions();
    public A withSeLinuxOptions(SELinuxOptions seLinuxOptions);
    public Boolean hasSeLinuxOptions();
    public A withNewSeLinuxOptions(String level,String role,String type,String user);
    public SELinuxContextStrategyOptionsFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptions();
    public SELinuxContextStrategyOptionsFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(SELinuxOptions item);
    public SELinuxContextStrategyOptionsFluent.SeLinuxOptionsNested<A> editSeLinuxOptions();
    public SELinuxContextStrategyOptionsFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptions();
    public SELinuxContextStrategyOptionsFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(SELinuxOptions item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface SeLinuxOptionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SELinuxOptionsFluent<SELinuxContextStrategyOptionsFluent.SeLinuxOptionsNested<N>>{

        
    public N and();    public N endSeLinuxOptions();
}


}
