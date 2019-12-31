package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RollingUpdateStatefulSetStrategyBuilder extends RollingUpdateStatefulSetStrategyFluentImpl<RollingUpdateStatefulSetStrategyBuilder> implements VisitableBuilder<RollingUpdateStatefulSetStrategy,RollingUpdateStatefulSetStrategyBuilder>{

    RollingUpdateStatefulSetStrategyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RollingUpdateStatefulSetStrategyBuilder(){
            this(true);
    }
    public RollingUpdateStatefulSetStrategyBuilder(Boolean validationEnabled){
            this(new RollingUpdateStatefulSetStrategy(), validationEnabled);
    }
    public RollingUpdateStatefulSetStrategyBuilder(RollingUpdateStatefulSetStrategyFluent<?> fluent){
            this(fluent, true);
    }
    public RollingUpdateStatefulSetStrategyBuilder(RollingUpdateStatefulSetStrategyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RollingUpdateStatefulSetStrategy(), validationEnabled);
    }
    public RollingUpdateStatefulSetStrategyBuilder(RollingUpdateStatefulSetStrategyFluent<?> fluent,RollingUpdateStatefulSetStrategy instance){
            this(fluent, instance, true);
    }
    public RollingUpdateStatefulSetStrategyBuilder(RollingUpdateStatefulSetStrategyFluent<?> fluent,RollingUpdateStatefulSetStrategy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPartition(instance.getPartition()); 
            this.validationEnabled = validationEnabled; 
    }
    public RollingUpdateStatefulSetStrategyBuilder(RollingUpdateStatefulSetStrategy instance){
            this(instance,true);
    }
    public RollingUpdateStatefulSetStrategyBuilder(RollingUpdateStatefulSetStrategy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPartition(instance.getPartition()); 
            this.validationEnabled = validationEnabled; 
    }
    public RollingUpdateStatefulSetStrategyBuilder(Validator validator){
            this(new RollingUpdateStatefulSetStrategy(), true);
    }
    public RollingUpdateStatefulSetStrategyBuilder(RollingUpdateStatefulSetStrategyFluent<?> fluent,RollingUpdateStatefulSetStrategy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPartition(instance.getPartition()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RollingUpdateStatefulSetStrategyBuilder(RollingUpdateStatefulSetStrategy instance,Validator validator){
            this.fluent = this; 
            this.withPartition(instance.getPartition()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RollingUpdateStatefulSetStrategy build(){
            RollingUpdateStatefulSetStrategy buildable = new RollingUpdateStatefulSetStrategy(fluent.getPartition());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RollingUpdateStatefulSetStrategyBuilder that = (RollingUpdateStatefulSetStrategyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
