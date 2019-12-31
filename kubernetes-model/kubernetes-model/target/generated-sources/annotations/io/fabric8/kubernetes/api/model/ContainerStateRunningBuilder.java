package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ContainerStateRunningBuilder extends ContainerStateRunningFluentImpl<ContainerStateRunningBuilder> implements VisitableBuilder<ContainerStateRunning,ContainerStateRunningBuilder>{

    ContainerStateRunningFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ContainerStateRunningBuilder(){
            this(true);
    }
    public ContainerStateRunningBuilder(Boolean validationEnabled){
            this(new ContainerStateRunning(), validationEnabled);
    }
    public ContainerStateRunningBuilder(ContainerStateRunningFluent<?> fluent){
            this(fluent, true);
    }
    public ContainerStateRunningBuilder(ContainerStateRunningFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ContainerStateRunning(), validationEnabled);
    }
    public ContainerStateRunningBuilder(ContainerStateRunningFluent<?> fluent,ContainerStateRunning instance){
            this(fluent, instance, true);
    }
    public ContainerStateRunningBuilder(ContainerStateRunningFluent<?> fluent,ContainerStateRunning instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withStartedAt(instance.getStartedAt()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerStateRunningBuilder(ContainerStateRunning instance){
            this(instance,true);
    }
    public ContainerStateRunningBuilder(ContainerStateRunning instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withStartedAt(instance.getStartedAt()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerStateRunningBuilder(Validator validator){
            this(new ContainerStateRunning(), true);
    }
    public ContainerStateRunningBuilder(ContainerStateRunningFluent<?> fluent,ContainerStateRunning instance,Validator validator){
            this.fluent = fluent; 
            fluent.withStartedAt(instance.getStartedAt()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ContainerStateRunningBuilder(ContainerStateRunning instance,Validator validator){
            this.fluent = this; 
            this.withStartedAt(instance.getStartedAt()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ContainerStateRunning build(){
            ContainerStateRunning buildable = new ContainerStateRunning(fluent.getStartedAt());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ContainerStateRunningBuilder that = (ContainerStateRunningBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
