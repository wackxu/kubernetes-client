package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class StatefulSetConditionBuilder extends StatefulSetConditionFluentImpl<StatefulSetConditionBuilder> implements VisitableBuilder<StatefulSetCondition,StatefulSetConditionBuilder>{

    StatefulSetConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public StatefulSetConditionBuilder(){
            this(true);
    }
    public StatefulSetConditionBuilder(Boolean validationEnabled){
            this(new StatefulSetCondition(), validationEnabled);
    }
    public StatefulSetConditionBuilder(StatefulSetConditionFluent<?> fluent){
            this(fluent, true);
    }
    public StatefulSetConditionBuilder(StatefulSetConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new StatefulSetCondition(), validationEnabled);
    }
    public StatefulSetConditionBuilder(StatefulSetConditionFluent<?> fluent,StatefulSetCondition instance){
            this(fluent, instance, true);
    }
    public StatefulSetConditionBuilder(StatefulSetConditionFluent<?> fluent,StatefulSetCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatefulSetConditionBuilder(StatefulSetCondition instance){
            this(instance,true);
    }
    public StatefulSetConditionBuilder(StatefulSetCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatefulSetConditionBuilder(Validator validator){
            this(new StatefulSetCondition(), true);
    }
    public StatefulSetConditionBuilder(StatefulSetConditionFluent<?> fluent,StatefulSetCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public StatefulSetConditionBuilder(StatefulSetCondition instance,Validator validator){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public StatefulSetCondition build(){
            StatefulSetCondition buildable = new StatefulSetCondition(fluent.getLastTransitionTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StatefulSetConditionBuilder that = (StatefulSetConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
