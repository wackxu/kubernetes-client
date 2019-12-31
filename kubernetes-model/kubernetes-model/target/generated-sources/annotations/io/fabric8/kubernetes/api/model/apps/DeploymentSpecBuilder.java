package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentSpecBuilder extends DeploymentSpecFluentImpl<DeploymentSpecBuilder> implements VisitableBuilder<DeploymentSpec,DeploymentSpecBuilder>{

    DeploymentSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentSpecBuilder(){
            this(true);
    }
    public DeploymentSpecBuilder(Boolean validationEnabled){
            this(new DeploymentSpec(), validationEnabled);
    }
    public DeploymentSpecBuilder(DeploymentSpecFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentSpecBuilder(DeploymentSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentSpec(), validationEnabled);
    }
    public DeploymentSpecBuilder(DeploymentSpecFluent<?> fluent,DeploymentSpec instance){
            this(fluent, instance, true);
    }
    public DeploymentSpecBuilder(DeploymentSpecFluent<?> fluent,DeploymentSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMinReadySeconds(instance.getMinReadySeconds()); 
            fluent.withPaused(instance.getPaused()); 
            fluent.withProgressDeadlineSeconds(instance.getProgressDeadlineSeconds()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withStrategy(instance.getStrategy()); 
            fluent.withTemplate(instance.getTemplate()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentSpecBuilder(DeploymentSpec instance){
            this(instance,true);
    }
    public DeploymentSpecBuilder(DeploymentSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMinReadySeconds(instance.getMinReadySeconds()); 
            this.withPaused(instance.getPaused()); 
            this.withProgressDeadlineSeconds(instance.getProgressDeadlineSeconds()); 
            this.withReplicas(instance.getReplicas()); 
            this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            this.withSelector(instance.getSelector()); 
            this.withStrategy(instance.getStrategy()); 
            this.withTemplate(instance.getTemplate()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentSpecBuilder(Validator validator){
            this(new DeploymentSpec(), true);
    }
    public DeploymentSpecBuilder(DeploymentSpecFluent<?> fluent,DeploymentSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMinReadySeconds(instance.getMinReadySeconds()); 
            fluent.withPaused(instance.getPaused()); 
            fluent.withProgressDeadlineSeconds(instance.getProgressDeadlineSeconds()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withStrategy(instance.getStrategy()); 
            fluent.withTemplate(instance.getTemplate()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentSpecBuilder(DeploymentSpec instance,Validator validator){
            this.fluent = this; 
            this.withMinReadySeconds(instance.getMinReadySeconds()); 
            this.withPaused(instance.getPaused()); 
            this.withProgressDeadlineSeconds(instance.getProgressDeadlineSeconds()); 
            this.withReplicas(instance.getReplicas()); 
            this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            this.withSelector(instance.getSelector()); 
            this.withStrategy(instance.getStrategy()); 
            this.withTemplate(instance.getTemplate()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeploymentSpec build(){
            DeploymentSpec buildable = new DeploymentSpec(fluent.getMinReadySeconds(),fluent.isPaused(),fluent.getProgressDeadlineSeconds(),fluent.getReplicas(),fluent.getRevisionHistoryLimit(),fluent.getSelector(),fluent.getStrategy(),fluent.getTemplate());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentSpecBuilder that = (DeploymentSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
