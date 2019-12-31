package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ContainerStatusBuilder extends ContainerStatusFluentImpl<ContainerStatusBuilder> implements VisitableBuilder<ContainerStatus,ContainerStatusBuilder>{

    ContainerStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ContainerStatusBuilder(){
            this(true);
    }
    public ContainerStatusBuilder(Boolean validationEnabled){
            this(new ContainerStatus(), validationEnabled);
    }
    public ContainerStatusBuilder(ContainerStatusFluent<?> fluent){
            this(fluent, true);
    }
    public ContainerStatusBuilder(ContainerStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ContainerStatus(), validationEnabled);
    }
    public ContainerStatusBuilder(ContainerStatusFluent<?> fluent,ContainerStatus instance){
            this(fluent, instance, true);
    }
    public ContainerStatusBuilder(ContainerStatusFluent<?> fluent,ContainerStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withContainerID(instance.getContainerID()); 
            fluent.withImage(instance.getImage()); 
            fluent.withImageID(instance.getImageID()); 
            fluent.withLastState(instance.getLastState()); 
            fluent.withName(instance.getName()); 
            fluent.withReady(instance.getReady()); 
            fluent.withRestartCount(instance.getRestartCount()); 
            fluent.withState(instance.getState()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerStatusBuilder(ContainerStatus instance){
            this(instance,true);
    }
    public ContainerStatusBuilder(ContainerStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withContainerID(instance.getContainerID()); 
            this.withImage(instance.getImage()); 
            this.withImageID(instance.getImageID()); 
            this.withLastState(instance.getLastState()); 
            this.withName(instance.getName()); 
            this.withReady(instance.getReady()); 
            this.withRestartCount(instance.getRestartCount()); 
            this.withState(instance.getState()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerStatusBuilder(Validator validator){
            this(new ContainerStatus(), true);
    }
    public ContainerStatusBuilder(ContainerStatusFluent<?> fluent,ContainerStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withContainerID(instance.getContainerID()); 
            fluent.withImage(instance.getImage()); 
            fluent.withImageID(instance.getImageID()); 
            fluent.withLastState(instance.getLastState()); 
            fluent.withName(instance.getName()); 
            fluent.withReady(instance.getReady()); 
            fluent.withRestartCount(instance.getRestartCount()); 
            fluent.withState(instance.getState()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ContainerStatusBuilder(ContainerStatus instance,Validator validator){
            this.fluent = this; 
            this.withContainerID(instance.getContainerID()); 
            this.withImage(instance.getImage()); 
            this.withImageID(instance.getImageID()); 
            this.withLastState(instance.getLastState()); 
            this.withName(instance.getName()); 
            this.withReady(instance.getReady()); 
            this.withRestartCount(instance.getRestartCount()); 
            this.withState(instance.getState()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ContainerStatus build(){
            ContainerStatus buildable = new ContainerStatus(fluent.getContainerID(),fluent.getImage(),fluent.getImageID(),fluent.getLastState(),fluent.getName(),fluent.isReady(),fluent.getRestartCount(),fluent.getState());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ContainerStatusBuilder that = (ContainerStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
