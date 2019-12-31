package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RouteIngressConditionBuilder extends RouteIngressConditionFluentImpl<RouteIngressConditionBuilder> implements VisitableBuilder<RouteIngressCondition,RouteIngressConditionBuilder>{

    RouteIngressConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RouteIngressConditionBuilder(){
            this(true);
    }
    public RouteIngressConditionBuilder(Boolean validationEnabled){
            this(new RouteIngressCondition(), validationEnabled);
    }
    public RouteIngressConditionBuilder(RouteIngressConditionFluent<?> fluent){
            this(fluent, true);
    }
    public RouteIngressConditionBuilder(RouteIngressConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RouteIngressCondition(), validationEnabled);
    }
    public RouteIngressConditionBuilder(RouteIngressConditionFluent<?> fluent,RouteIngressCondition instance){
            this(fluent, instance, true);
    }
    public RouteIngressConditionBuilder(RouteIngressConditionFluent<?> fluent,RouteIngressCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public RouteIngressConditionBuilder(RouteIngressCondition instance){
            this(instance,true);
    }
    public RouteIngressConditionBuilder(RouteIngressCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public RouteIngressConditionBuilder(Validator validator){
            this(new RouteIngressCondition(), true);
    }
    public RouteIngressConditionBuilder(RouteIngressConditionFluent<?> fluent,RouteIngressCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RouteIngressConditionBuilder(RouteIngressCondition instance,Validator validator){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RouteIngressCondition build(){
            RouteIngressCondition buildable = new RouteIngressCondition(fluent.getLastTransitionTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RouteIngressConditionBuilder that = (RouteIngressConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
