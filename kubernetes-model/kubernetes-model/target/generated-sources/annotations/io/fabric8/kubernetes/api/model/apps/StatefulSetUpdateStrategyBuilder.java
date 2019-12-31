package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class StatefulSetUpdateStrategyBuilder extends StatefulSetUpdateStrategyFluentImpl<StatefulSetUpdateStrategyBuilder> implements VisitableBuilder<StatefulSetUpdateStrategy,StatefulSetUpdateStrategyBuilder>{

    StatefulSetUpdateStrategyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public StatefulSetUpdateStrategyBuilder(){
            this(true);
    }
    public StatefulSetUpdateStrategyBuilder(Boolean validationEnabled){
            this(new StatefulSetUpdateStrategy(), validationEnabled);
    }
    public StatefulSetUpdateStrategyBuilder(StatefulSetUpdateStrategyFluent<?> fluent){
            this(fluent, true);
    }
    public StatefulSetUpdateStrategyBuilder(StatefulSetUpdateStrategyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new StatefulSetUpdateStrategy(), validationEnabled);
    }
    public StatefulSetUpdateStrategyBuilder(StatefulSetUpdateStrategyFluent<?> fluent,StatefulSetUpdateStrategy instance){
            this(fluent, instance, true);
    }
    public StatefulSetUpdateStrategyBuilder(StatefulSetUpdateStrategyFluent<?> fluent,StatefulSetUpdateStrategy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRollingUpdate(instance.getRollingUpdate()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatefulSetUpdateStrategyBuilder(StatefulSetUpdateStrategy instance){
            this(instance,true);
    }
    public StatefulSetUpdateStrategyBuilder(StatefulSetUpdateStrategy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRollingUpdate(instance.getRollingUpdate()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatefulSetUpdateStrategyBuilder(Validator validator){
            this(new StatefulSetUpdateStrategy(), true);
    }
    public StatefulSetUpdateStrategyBuilder(StatefulSetUpdateStrategyFluent<?> fluent,StatefulSetUpdateStrategy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRollingUpdate(instance.getRollingUpdate()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public StatefulSetUpdateStrategyBuilder(StatefulSetUpdateStrategy instance,Validator validator){
            this.fluent = this; 
            this.withRollingUpdate(instance.getRollingUpdate()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public StatefulSetUpdateStrategy build(){
            StatefulSetUpdateStrategy buildable = new StatefulSetUpdateStrategy(fluent.getRollingUpdate(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StatefulSetUpdateStrategyBuilder that = (StatefulSetUpdateStrategyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
