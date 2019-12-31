package io.fabric8.kubernetes.api.model.apps;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class DeploymentStrategyFluentImpl<A extends DeploymentStrategyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DeploymentStrategyFluent<A>{

    private RollingUpdateDeploymentBuilder rollingUpdate;
    private String type;

    public DeploymentStrategyFluentImpl(){
    }
    public DeploymentStrategyFluentImpl(DeploymentStrategy instance){
            this.withRollingUpdate(instance.getRollingUpdate()); 
            this.withType(instance.getType()); 
    }

    
/**
 * This method has been deprecated, please use method buildRollingUpdate instead.
 * @return The buildable object.
 */
@Deprecated public RollingUpdateDeployment getRollingUpdate(){
            return this.rollingUpdate!=null?this.rollingUpdate.build():null;
    }

    public RollingUpdateDeployment buildRollingUpdate(){
            return this.rollingUpdate!=null?this.rollingUpdate.build():null;
    }

    public A withRollingUpdate(RollingUpdateDeployment rollingUpdate){
            _visitables.remove(this.rollingUpdate);
            if (rollingUpdate!=null){ this.rollingUpdate= new RollingUpdateDeploymentBuilder(rollingUpdate); _visitables.add(this.rollingUpdate);} return (A) this;
    }

    public Boolean hasRollingUpdate(){
            return this.rollingUpdate != null;
    }

    public DeploymentStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate(){
            return new RollingUpdateNestedImpl();
    }

    public DeploymentStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(RollingUpdateDeployment item){
            return new RollingUpdateNestedImpl(item);
    }

    public DeploymentStrategyFluent.RollingUpdateNested<A> editRollingUpdate(){
            return withNewRollingUpdateLike(getRollingUpdate());
    }

    public DeploymentStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate(){
            return withNewRollingUpdateLike(getRollingUpdate() != null ? getRollingUpdate(): new RollingUpdateDeploymentBuilder().build());
    }

    public DeploymentStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(RollingUpdateDeployment item){
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
            DeploymentStrategyFluentImpl that = (DeploymentStrategyFluentImpl) o;
            if (rollingUpdate != null ? !rollingUpdate.equals(that.rollingUpdate) :that.rollingUpdate != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class RollingUpdateNestedImpl<N> extends RollingUpdateDeploymentFluentImpl<DeploymentStrategyFluent.RollingUpdateNested<N>> implements DeploymentStrategyFluent.RollingUpdateNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RollingUpdateDeploymentBuilder builder;
    
            RollingUpdateNestedImpl(RollingUpdateDeployment item){
                    this.builder = new RollingUpdateDeploymentBuilder(this, item);
            }
            RollingUpdateNestedImpl(){
                    this.builder = new RollingUpdateDeploymentBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentStrategyFluentImpl.this.withRollingUpdate(builder.build());
    }
    public N endRollingUpdate(){
            return and();
    }

}


}
