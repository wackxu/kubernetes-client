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

public interface DaemonSetUpdateStrategyFluent<A extends DaemonSetUpdateStrategyFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildRollingUpdate instead.
 * @return The buildable object.
 */
@Deprecated public RollingUpdateDaemonSet getRollingUpdate();
    public RollingUpdateDaemonSet buildRollingUpdate();
    public A withRollingUpdate(RollingUpdateDaemonSet rollingUpdate);
    public Boolean hasRollingUpdate();
    public DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate();
    public DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(RollingUpdateDaemonSet item);
    public DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editRollingUpdate();
    public DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate();
    public DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(RollingUpdateDaemonSet item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface RollingUpdateNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RollingUpdateDaemonSetFluent<DaemonSetUpdateStrategyFluent.RollingUpdateNested<N>>{

        
    public N and();    public N endRollingUpdate();
}


}
