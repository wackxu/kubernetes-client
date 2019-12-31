package io.fabric8.kubernetes.api.model.apps;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface StatefulSetUpdateStrategyFluent<A extends StatefulSetUpdateStrategyFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildRollingUpdate instead.
 * @return The buildable object.
 */
@Deprecated public RollingUpdateStatefulSetStrategy getRollingUpdate();
    public RollingUpdateStatefulSetStrategy buildRollingUpdate();
    public A withRollingUpdate(RollingUpdateStatefulSetStrategy rollingUpdate);
    public Boolean hasRollingUpdate();
    public A withNewRollingUpdate(Integer partition);
    public StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate();
    public StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(RollingUpdateStatefulSetStrategy item);
    public StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editRollingUpdate();
    public StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate();
    public StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(RollingUpdateStatefulSetStrategy item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface RollingUpdateNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RollingUpdateStatefulSetStrategyFluent<StatefulSetUpdateStrategyFluent.RollingUpdateNested<N>>{

        
    public N and();    public N endRollingUpdate();
}


}
