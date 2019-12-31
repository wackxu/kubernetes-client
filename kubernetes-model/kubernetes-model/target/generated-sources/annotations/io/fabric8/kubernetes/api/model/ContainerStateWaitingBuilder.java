package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ContainerStateWaitingBuilder extends ContainerStateWaitingFluentImpl<ContainerStateWaitingBuilder> implements VisitableBuilder<ContainerStateWaiting,ContainerStateWaitingBuilder>{

    ContainerStateWaitingFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ContainerStateWaitingBuilder(){
            this(true);
    }
    public ContainerStateWaitingBuilder(Boolean validationEnabled){
            this(new ContainerStateWaiting(), validationEnabled);
    }
    public ContainerStateWaitingBuilder(ContainerStateWaitingFluent<?> fluent){
            this(fluent, true);
    }
    public ContainerStateWaitingBuilder(ContainerStateWaitingFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ContainerStateWaiting(), validationEnabled);
    }
    public ContainerStateWaitingBuilder(ContainerStateWaitingFluent<?> fluent,ContainerStateWaiting instance){
            this(fluent, instance, true);
    }
    public ContainerStateWaitingBuilder(ContainerStateWaitingFluent<?> fluent,ContainerStateWaiting instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerStateWaitingBuilder(ContainerStateWaiting instance){
            this(instance,true);
    }
    public ContainerStateWaitingBuilder(ContainerStateWaiting instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerStateWaitingBuilder(Validator validator){
            this(new ContainerStateWaiting(), true);
    }
    public ContainerStateWaitingBuilder(ContainerStateWaitingFluent<?> fluent,ContainerStateWaiting instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ContainerStateWaitingBuilder(ContainerStateWaiting instance,Validator validator){
            this.fluent = this; 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ContainerStateWaiting build(){
            ContainerStateWaiting buildable = new ContainerStateWaiting(fluent.getMessage(),fluent.getReason());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ContainerStateWaitingBuilder that = (ContainerStateWaitingBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
