package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ContainerStateTerminatedBuilder extends ContainerStateTerminatedFluentImpl<ContainerStateTerminatedBuilder> implements VisitableBuilder<ContainerStateTerminated,ContainerStateTerminatedBuilder>{

    ContainerStateTerminatedFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ContainerStateTerminatedBuilder(){
            this(true);
    }
    public ContainerStateTerminatedBuilder(Boolean validationEnabled){
            this(new ContainerStateTerminated(), validationEnabled);
    }
    public ContainerStateTerminatedBuilder(ContainerStateTerminatedFluent<?> fluent){
            this(fluent, true);
    }
    public ContainerStateTerminatedBuilder(ContainerStateTerminatedFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ContainerStateTerminated(), validationEnabled);
    }
    public ContainerStateTerminatedBuilder(ContainerStateTerminatedFluent<?> fluent,ContainerStateTerminated instance){
            this(fluent, instance, true);
    }
    public ContainerStateTerminatedBuilder(ContainerStateTerminatedFluent<?> fluent,ContainerStateTerminated instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withContainerID(instance.getContainerID()); 
            fluent.withExitCode(instance.getExitCode()); 
            fluent.withFinishedAt(instance.getFinishedAt()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withSignal(instance.getSignal()); 
            fluent.withStartedAt(instance.getStartedAt()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerStateTerminatedBuilder(ContainerStateTerminated instance){
            this(instance,true);
    }
    public ContainerStateTerminatedBuilder(ContainerStateTerminated instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withContainerID(instance.getContainerID()); 
            this.withExitCode(instance.getExitCode()); 
            this.withFinishedAt(instance.getFinishedAt()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withSignal(instance.getSignal()); 
            this.withStartedAt(instance.getStartedAt()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerStateTerminatedBuilder(Validator validator){
            this(new ContainerStateTerminated(), true);
    }
    public ContainerStateTerminatedBuilder(ContainerStateTerminatedFluent<?> fluent,ContainerStateTerminated instance,Validator validator){
            this.fluent = fluent; 
            fluent.withContainerID(instance.getContainerID()); 
            fluent.withExitCode(instance.getExitCode()); 
            fluent.withFinishedAt(instance.getFinishedAt()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withSignal(instance.getSignal()); 
            fluent.withStartedAt(instance.getStartedAt()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ContainerStateTerminatedBuilder(ContainerStateTerminated instance,Validator validator){
            this.fluent = this; 
            this.withContainerID(instance.getContainerID()); 
            this.withExitCode(instance.getExitCode()); 
            this.withFinishedAt(instance.getFinishedAt()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withSignal(instance.getSignal()); 
            this.withStartedAt(instance.getStartedAt()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ContainerStateTerminated build(){
            ContainerStateTerminated buildable = new ContainerStateTerminated(fluent.getContainerID(),fluent.getExitCode(),fluent.getFinishedAt(),fluent.getMessage(),fluent.getReason(),fluent.getSignal(),fluent.getStartedAt());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ContainerStateTerminatedBuilder that = (ContainerStateTerminatedBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
