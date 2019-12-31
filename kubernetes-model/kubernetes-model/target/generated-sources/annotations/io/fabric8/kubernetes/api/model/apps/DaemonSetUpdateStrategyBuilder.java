package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DaemonSetUpdateStrategyBuilder extends DaemonSetUpdateStrategyFluentImpl<DaemonSetUpdateStrategyBuilder> implements VisitableBuilder<DaemonSetUpdateStrategy,DaemonSetUpdateStrategyBuilder>{

    DaemonSetUpdateStrategyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DaemonSetUpdateStrategyBuilder(){
            this(true);
    }
    public DaemonSetUpdateStrategyBuilder(Boolean validationEnabled){
            this(new DaemonSetUpdateStrategy(), validationEnabled);
    }
    public DaemonSetUpdateStrategyBuilder(DaemonSetUpdateStrategyFluent<?> fluent){
            this(fluent, true);
    }
    public DaemonSetUpdateStrategyBuilder(DaemonSetUpdateStrategyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DaemonSetUpdateStrategy(), validationEnabled);
    }
    public DaemonSetUpdateStrategyBuilder(DaemonSetUpdateStrategyFluent<?> fluent,DaemonSetUpdateStrategy instance){
            this(fluent, instance, true);
    }
    public DaemonSetUpdateStrategyBuilder(DaemonSetUpdateStrategyFluent<?> fluent,DaemonSetUpdateStrategy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRollingUpdate(instance.getRollingUpdate()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public DaemonSetUpdateStrategyBuilder(DaemonSetUpdateStrategy instance){
            this(instance,true);
    }
    public DaemonSetUpdateStrategyBuilder(DaemonSetUpdateStrategy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRollingUpdate(instance.getRollingUpdate()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public DaemonSetUpdateStrategyBuilder(Validator validator){
            this(new DaemonSetUpdateStrategy(), true);
    }
    public DaemonSetUpdateStrategyBuilder(DaemonSetUpdateStrategyFluent<?> fluent,DaemonSetUpdateStrategy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRollingUpdate(instance.getRollingUpdate()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DaemonSetUpdateStrategyBuilder(DaemonSetUpdateStrategy instance,Validator validator){
            this.fluent = this; 
            this.withRollingUpdate(instance.getRollingUpdate()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DaemonSetUpdateStrategy build(){
            DaemonSetUpdateStrategy buildable = new DaemonSetUpdateStrategy(fluent.getRollingUpdate(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DaemonSetUpdateStrategyBuilder that = (DaemonSetUpdateStrategyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
