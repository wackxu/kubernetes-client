package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentRollbackBuilder extends DeploymentRollbackFluentImpl<DeploymentRollbackBuilder> implements VisitableBuilder<DeploymentRollback,DeploymentRollbackBuilder>{

    DeploymentRollbackFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentRollbackBuilder(){
            this(true);
    }
    public DeploymentRollbackBuilder(Boolean validationEnabled){
            this(new DeploymentRollback(), validationEnabled);
    }
    public DeploymentRollbackBuilder(DeploymentRollbackFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentRollbackBuilder(DeploymentRollbackFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentRollback(), validationEnabled);
    }
    public DeploymentRollbackBuilder(DeploymentRollbackFluent<?> fluent,DeploymentRollback instance){
            this(fluent, instance, true);
    }
    public DeploymentRollbackBuilder(DeploymentRollbackFluent<?> fluent,DeploymentRollback instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            fluent.withRollbackTo(instance.getRollbackTo()); 
            fluent.withUpdatedAnnotations(instance.getUpdatedAnnotations()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentRollbackBuilder(DeploymentRollback instance){
            this(instance,true);
    }
    public DeploymentRollbackBuilder(DeploymentRollback instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withRollbackTo(instance.getRollbackTo()); 
            this.withUpdatedAnnotations(instance.getUpdatedAnnotations()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentRollbackBuilder(Validator validator){
            this(new DeploymentRollback(), true);
    }
    public DeploymentRollbackBuilder(DeploymentRollbackFluent<?> fluent,DeploymentRollback instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            fluent.withRollbackTo(instance.getRollbackTo()); 
            fluent.withUpdatedAnnotations(instance.getUpdatedAnnotations()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentRollbackBuilder(DeploymentRollback instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withRollbackTo(instance.getRollbackTo()); 
            this.withUpdatedAnnotations(instance.getUpdatedAnnotations()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeploymentRollback build(){
            DeploymentRollback buildable = new DeploymentRollback(fluent.getApiVersion(),fluent.getKind(),fluent.getName(),fluent.getRollbackTo(),fluent.getUpdatedAnnotations());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentRollbackBuilder that = (DeploymentRollbackBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
