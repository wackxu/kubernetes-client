package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentBuilder extends DeploymentFluentImpl<DeploymentBuilder> implements VisitableBuilder<Deployment,DeploymentBuilder>{

    DeploymentFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentBuilder(){
            this(true);
    }
    public DeploymentBuilder(Boolean validationEnabled){
            this(new Deployment(), validationEnabled);
    }
    public DeploymentBuilder(DeploymentFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentBuilder(DeploymentFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Deployment(), validationEnabled);
    }
    public DeploymentBuilder(DeploymentFluent<?> fluent,Deployment instance){
            this(fluent, instance, true);
    }
    public DeploymentBuilder(DeploymentFluent<?> fluent,Deployment instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentBuilder(Deployment instance){
            this(instance,true);
    }
    public DeploymentBuilder(Deployment instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentBuilder(Validator validator){
            this(new Deployment(), true);
    }
    public DeploymentBuilder(DeploymentFluent<?> fluent,Deployment instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentBuilder(Deployment instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Deployment build(){
            Deployment buildable = new Deployment(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentBuilder that = (DeploymentBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
