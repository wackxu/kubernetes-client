package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ContainerStateBuilder extends ContainerStateFluentImpl<ContainerStateBuilder> implements VisitableBuilder<ContainerState,ContainerStateBuilder>{

    ContainerStateFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ContainerStateBuilder(){
            this(true);
    }
    public ContainerStateBuilder(Boolean validationEnabled){
            this(new ContainerState(), validationEnabled);
    }
    public ContainerStateBuilder(ContainerStateFluent<?> fluent){
            this(fluent, true);
    }
    public ContainerStateBuilder(ContainerStateFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ContainerState(), validationEnabled);
    }
    public ContainerStateBuilder(ContainerStateFluent<?> fluent,ContainerState instance){
            this(fluent, instance, true);
    }
    public ContainerStateBuilder(ContainerStateFluent<?> fluent,ContainerState instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRunning(instance.getRunning()); 
            fluent.withTerminated(instance.getTerminated()); 
            fluent.withWaiting(instance.getWaiting()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerStateBuilder(ContainerState instance){
            this(instance,true);
    }
    public ContainerStateBuilder(ContainerState instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRunning(instance.getRunning()); 
            this.withTerminated(instance.getTerminated()); 
            this.withWaiting(instance.getWaiting()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerStateBuilder(Validator validator){
            this(new ContainerState(), true);
    }
    public ContainerStateBuilder(ContainerStateFluent<?> fluent,ContainerState instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRunning(instance.getRunning()); 
            fluent.withTerminated(instance.getTerminated()); 
            fluent.withWaiting(instance.getWaiting()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ContainerStateBuilder(ContainerState instance,Validator validator){
            this.fluent = this; 
            this.withRunning(instance.getRunning()); 
            this.withTerminated(instance.getTerminated()); 
            this.withWaiting(instance.getWaiting()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ContainerState build(){
            ContainerState buildable = new ContainerState(fluent.getRunning(),fluent.getTerminated(),fluent.getWaiting());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ContainerStateBuilder that = (ContainerStateBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
