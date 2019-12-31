package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ContainerPortBuilder extends ContainerPortFluentImpl<ContainerPortBuilder> implements VisitableBuilder<ContainerPort,ContainerPortBuilder>{

    ContainerPortFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ContainerPortBuilder(){
            this(true);
    }
    public ContainerPortBuilder(Boolean validationEnabled){
            this(new ContainerPort(), validationEnabled);
    }
    public ContainerPortBuilder(ContainerPortFluent<?> fluent){
            this(fluent, true);
    }
    public ContainerPortBuilder(ContainerPortFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ContainerPort(), validationEnabled);
    }
    public ContainerPortBuilder(ContainerPortFluent<?> fluent,ContainerPort instance){
            this(fluent, instance, true);
    }
    public ContainerPortBuilder(ContainerPortFluent<?> fluent,ContainerPort instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withContainerPort(instance.getContainerPort()); 
            fluent.withHostIP(instance.getHostIP()); 
            fluent.withHostPort(instance.getHostPort()); 
            fluent.withName(instance.getName()); 
            fluent.withProtocol(instance.getProtocol()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerPortBuilder(ContainerPort instance){
            this(instance,true);
    }
    public ContainerPortBuilder(ContainerPort instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withContainerPort(instance.getContainerPort()); 
            this.withHostIP(instance.getHostIP()); 
            this.withHostPort(instance.getHostPort()); 
            this.withName(instance.getName()); 
            this.withProtocol(instance.getProtocol()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerPortBuilder(Validator validator){
            this(new ContainerPort(), true);
    }
    public ContainerPortBuilder(ContainerPortFluent<?> fluent,ContainerPort instance,Validator validator){
            this.fluent = fluent; 
            fluent.withContainerPort(instance.getContainerPort()); 
            fluent.withHostIP(instance.getHostIP()); 
            fluent.withHostPort(instance.getHostPort()); 
            fluent.withName(instance.getName()); 
            fluent.withProtocol(instance.getProtocol()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ContainerPortBuilder(ContainerPort instance,Validator validator){
            this.fluent = this; 
            this.withContainerPort(instance.getContainerPort()); 
            this.withHostIP(instance.getHostIP()); 
            this.withHostPort(instance.getHostPort()); 
            this.withName(instance.getName()); 
            this.withProtocol(instance.getProtocol()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ContainerPort build(){
            ContainerPort buildable = new ContainerPort(fluent.getContainerPort(),fluent.getHostIP(),fluent.getHostPort(),fluent.getName(),fluent.getProtocol());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ContainerPortBuilder that = (ContainerPortBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
