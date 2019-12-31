package io.fabric8.kubernetes.api.model.apps;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class StatefulSetUpdateStrategyFluentImpl<A extends StatefulSetUpdateStrategyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements StatefulSetUpdateStrategyFluent<A>{

    private RollingUpdateStatefulSetStrategyBuilder rollingUpdate;
    private String type;

    public StatefulSetUpdateStrategyFluentImpl(){
    }
    public StatefulSetUpdateStrategyFluentImpl(StatefulSetUpdateStrategy instance){
            this.withRollingUpdate(instance.getRollingUpdate()); 
            this.withType(instance.getType()); 
    }

    
/**
 * This method has been deprecated, please use method buildRollingUpdate instead.
 * @return The buildable object.
 */
@Deprecated public RollingUpdateStatefulSetStrategy getRollingUpdate(){
            return this.rollingUpdate!=null?this.rollingUpdate.build():null;
    }

    public RollingUpdateStatefulSetStrategy buildRollingUpdate(){
            return this.rollingUpdate!=null?this.rollingUpdate.build():null;
    }

    public A withRollingUpdate(RollingUpdateStatefulSetStrategy rollingUpdate){
            _visitables.remove(this.rollingUpdate);
            if (rollingUpdate!=null){ this.rollingUpdate= new RollingUpdateStatefulSetStrategyBuilder(rollingUpdate); _visitables.add(this.rollingUpdate);} return (A) this;
    }

    public Boolean hasRollingUpdate(){
            return this.rollingUpdate != null;
    }

    public A withNewRollingUpdate(Integer partition){
            return (A)withRollingUpdate(new RollingUpdateStatefulSetStrategy(partition));
    }

    public StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate(){
            return new RollingUpdateNestedImpl();
    }

    public StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(RollingUpdateStatefulSetStrategy item){
            return new RollingUpdateNestedImpl(item);
    }

    public StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editRollingUpdate(){
            return withNewRollingUpdateLike(getRollingUpdate());
    }

    public StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate(){
            return withNewRollingUpdateLike(getRollingUpdate() != null ? getRollingUpdate(): new RollingUpdateStatefulSetStrategyBuilder().build());
    }

    public StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(RollingUpdateStatefulSetStrategy item){
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
            StatefulSetUpdateStrategyFluentImpl that = (StatefulSetUpdateStrategyFluentImpl) o;
            if (rollingUpdate != null ? !rollingUpdate.equals(that.rollingUpdate) :that.rollingUpdate != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class RollingUpdateNestedImpl<N> extends RollingUpdateStatefulSetStrategyFluentImpl<StatefulSetUpdateStrategyFluent.RollingUpdateNested<N>> implements StatefulSetUpdateStrategyFluent.RollingUpdateNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RollingUpdateStatefulSetStrategyBuilder builder;
    
            RollingUpdateNestedImpl(RollingUpdateStatefulSetStrategy item){
                    this.builder = new RollingUpdateStatefulSetStrategyBuilder(this, item);
            }
            RollingUpdateNestedImpl(){
                    this.builder = new RollingUpdateStatefulSetStrategyBuilder(this);
            }
    
    public N and(){
            return (N) StatefulSetUpdateStrategyFluentImpl.this.withRollingUpdate(builder.build());
    }
    public N endRollingUpdate(){
            return and();
    }

}


}
