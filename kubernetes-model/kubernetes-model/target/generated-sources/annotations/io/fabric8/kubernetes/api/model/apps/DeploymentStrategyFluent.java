package io.fabric8.kubernetes.api.model.apps;

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

public interface DeploymentStrategyFluent<A extends DeploymentStrategyFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildRollingUpdate instead.
 * @return The buildable object.
 */
@Deprecated public RollingUpdateDeployment getRollingUpdate();
    public RollingUpdateDeployment buildRollingUpdate();
    public A withRollingUpdate(RollingUpdateDeployment rollingUpdate);
    public Boolean hasRollingUpdate();
    public DeploymentStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate();
    public DeploymentStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(RollingUpdateDeployment item);
    public DeploymentStrategyFluent.RollingUpdateNested<A> editRollingUpdate();
    public DeploymentStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate();
    public DeploymentStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(RollingUpdateDeployment item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface RollingUpdateNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RollingUpdateDeploymentFluent<DeploymentStrategyFluent.RollingUpdateNested<N>>{

        
    public N and();    public N endRollingUpdate();
}


}
