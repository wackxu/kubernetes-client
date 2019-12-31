package io.fabric8.kubernetes.api.model.apps;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class DaemonSetUpdateStrategyFluentImpl<A extends DaemonSetUpdateStrategyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DaemonSetUpdateStrategyFluent<A>{

    private RollingUpdateDaemonSetBuilder rollingUpdate;
    private String type;

    public DaemonSetUpdateStrategyFluentImpl(){
    }
    public DaemonSetUpdateStrategyFluentImpl(DaemonSetUpdateStrategy instance){
            this.withRollingUpdate(instance.getRollingUpdate()); 
            this.withType(instance.getType()); 
    }

    
/**
 * This method has been deprecated, please use method buildRollingUpdate instead.
 * @return The buildable object.
 */
@Deprecated public RollingUpdateDaemonSet getRollingUpdate(){
            return this.rollingUpdate!=null?this.rollingUpdate.build():null;
    }

    public RollingUpdateDaemonSet buildRollingUpdate(){
            return this.rollingUpdate!=null?this.rollingUpdate.build():null;
    }

    public A withRollingUpdate(RollingUpdateDaemonSet rollingUpdate){
            _visitables.remove(this.rollingUpdate);
            if (rollingUpdate!=null){ this.rollingUpdate= new RollingUpdateDaemonSetBuilder(rollingUpdate); _visitables.add(this.rollingUpdate);} return (A) this;
    }

    public Boolean hasRollingUpdate(){
            return this.rollingUpdate != null;
    }

    public DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate(){
            return new RollingUpdateNestedImpl();
    }

    public DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(RollingUpdateDaemonSet item){
            return new RollingUpdateNestedImpl(item);
    }

    public DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editRollingUpdate(){
            return withNewRollingUpdateLike(getRollingUpdate());
    }

    public DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate(){
            return withNewRollingUpdateLike(getRollingUpdate() != null ? getRollingUpdate(): new RollingUpdateDaemonSetBuilder().build());
    }

    public DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(RollingUpdateDaemonSet item){
            return withNewRollingUpdateLike(getRollingUpdate() != null ? getRollingUpdate(): item);
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
            DaemonSetUpdateStrategyFluentImpl that = (DaemonSetUpdateStrategyFluentImpl) o;
            if (rollingUpdate != null ? !rollingUpdate.equals(that.rollingUpdate) :that.rollingUpdate != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class RollingUpdateNestedImpl<N> extends RollingUpdateDaemonSetFluentImpl<DaemonSetUpdateStrategyFluent.RollingUpdateNested<N>> implements DaemonSetUpdateStrategyFluent.RollingUpdateNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RollingUpdateDaemonSetBuilder builder;
    
            RollingUpdateNestedImpl(RollingUpdateDaemonSet item){
                    this.builder = new RollingUpdateDaemonSetBuilder(this, item);
            }
            RollingUpdateNestedImpl(){
                    this.builder = new RollingUpdateDaemonSetBuilder(this);
            }
    
    public N and(){
            return (N) DaemonSetUpdateStrategyFluentImpl.this.withRollingUpdate(builder.build());
    }
    public N endRollingUpdate(){
            return and();
    }

}


}
