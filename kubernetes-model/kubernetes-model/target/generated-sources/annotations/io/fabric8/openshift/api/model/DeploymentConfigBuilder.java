package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentConfigBuilder extends DeploymentConfigFluentImpl<DeploymentConfigBuilder> implements VisitableBuilder<DeploymentConfig,DeploymentConfigBuilder>{

    DeploymentConfigFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentConfigBuilder(){
            this(true);
    }
    public DeploymentConfigBuilder(Boolean validationEnabled){
            this(new DeploymentConfig(), validationEnabled);
    }
    public DeploymentConfigBuilder(DeploymentConfigFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentConfigBuilder(DeploymentConfigFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentConfig(), validationEnabled);
    }
    public DeploymentConfigBuilder(DeploymentConfigFluent<?> fluent,DeploymentConfig instance){
            this(fluent, instance, true);
    }
    public DeploymentConfigBuilder(DeploymentConfigFluent<?> fluent,DeploymentConfig instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentConfigBuilder(DeploymentConfig instance){
            this(instance,true);
    }
    public DeploymentConfigBuilder(DeploymentConfig instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentConfigBuilder(Validator validator){
            this(new DeploymentConfig(), true);
    }
    public DeploymentConfigBuilder(DeploymentConfigFluent<?> fluent,DeploymentConfig instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentConfigBuilder(DeploymentConfig instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeploymentConfig build(){
            DeploymentConfig buildable = new DeploymentConfig(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentConfigBuilder that = (DeploymentConfigBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
