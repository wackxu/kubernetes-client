package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodReadinessGateBuilder extends PodReadinessGateFluentImpl<PodReadinessGateBuilder> implements VisitableBuilder<PodReadinessGate,PodReadinessGateBuilder>{

    PodReadinessGateFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodReadinessGateBuilder(){
            this(true);
    }
    public PodReadinessGateBuilder(Boolean validationEnabled){
            this(new PodReadinessGate(), validationEnabled);
    }
    public PodReadinessGateBuilder(PodReadinessGateFluent<?> fluent){
            this(fluent, true);
    }
    public PodReadinessGateBuilder(PodReadinessGateFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodReadinessGate(), validationEnabled);
    }
    public PodReadinessGateBuilder(PodReadinessGateFluent<?> fluent,PodReadinessGate instance){
            this(fluent, instance, true);
    }
    public PodReadinessGateBuilder(PodReadinessGateFluent<?> fluent,PodReadinessGate instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withConditionType(instance.getConditionType()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodReadinessGateBuilder(PodReadinessGate instance){
            this(instance,true);
    }
    public PodReadinessGateBuilder(PodReadinessGate instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withConditionType(instance.getConditionType()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodReadinessGateBuilder(Validator validator){
            this(new PodReadinessGate(), true);
    }
    public PodReadinessGateBuilder(PodReadinessGateFluent<?> fluent,PodReadinessGate instance,Validator validator){
            this.fluent = fluent; 
            fluent.withConditionType(instance.getConditionType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodReadinessGateBuilder(PodReadinessGate instance,Validator validator){
            this.fluent = this; 
            this.withConditionType(instance.getConditionType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodReadinessGate build(){
            PodReadinessGate buildable = new PodReadinessGate(fluent.getConditionType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodReadinessGateBuilder that = (PodReadinessGateBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
