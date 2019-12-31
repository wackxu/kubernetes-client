package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentConfigSpecBuilder extends DeploymentConfigSpecFluentImpl<DeploymentConfigSpecBuilder> implements VisitableBuilder<DeploymentConfigSpec,DeploymentConfigSpecBuilder>{

    DeploymentConfigSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentConfigSpecBuilder(){
            this(true);
    }
    public DeploymentConfigSpecBuilder(Boolean validationEnabled){
            this(new DeploymentConfigSpec(), validationEnabled);
    }
    public DeploymentConfigSpecBuilder(DeploymentConfigSpecFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentConfigSpecBuilder(DeploymentConfigSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentConfigSpec(), validationEnabled);
    }
    public DeploymentConfigSpecBuilder(DeploymentConfigSpecFluent<?> fluent,DeploymentConfigSpec instance){
            this(fluent, instance, true);
    }
    public DeploymentConfigSpecBuilder(DeploymentConfigSpecFluent<?> fluent,DeploymentConfigSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMinReadySeconds(instance.getMinReadySeconds()); 
            fluent.withPaused(instance.getPaused()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withStrategy(instance.getStrategy()); 
            fluent.withTemplate(instance.getTemplate()); 
            fluent.withTest(instance.getTest()); 
            fluent.withTriggers(instance.getTriggers()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentConfigSpecBuilder(DeploymentConfigSpec instance){
            this(instance,true);
    }
    public DeploymentConfigSpecBuilder(DeploymentConfigSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMinReadySeconds(instance.getMinReadySeconds()); 
            this.withPaused(instance.getPaused()); 
            this.withReplicas(instance.getReplicas()); 
            this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            this.withSelector(instance.getSelector()); 
            this.withStrategy(instance.getStrategy()); 
            this.withTemplate(instance.getTemplate()); 
            this.withTest(instance.getTest()); 
            this.withTriggers(instance.getTriggers()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentConfigSpecBuilder(Validator validator){
            this(new DeploymentConfigSpec(), true);
    }
    public DeploymentConfigSpecBuilder(DeploymentConfigSpecFluent<?> fluent,DeploymentConfigSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMinReadySeconds(instance.getMinReadySeconds()); 
            fluent.withPaused(instance.getPaused()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withStrategy(instance.getStrategy()); 
            fluent.withTemplate(instance.getTemplate()); 
            fluent.withTest(instance.getTest()); 
            fluent.withTriggers(instance.getTriggers()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentConfigSpecBuilder(DeploymentConfigSpec instance,Validator validator){
            this.fluent = this; 
            this.withMinReadySeconds(instance.getMinReadySeconds()); 
            this.withPaused(instance.getPaused()); 
            this.withReplicas(instance.getReplicas()); 
            this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            this.withSelector(instance.getSelector()); 
            this.withStrategy(instance.getStrategy()); 
            this.withTemplate(instance.getTemplate()); 
            this.withTest(instance.getTest()); 
            this.withTriggers(instance.getTriggers()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeploymentConfigSpec build(){
            DeploymentConfigSpec buildable = new DeploymentConfigSpec(fluent.getMinReadySeconds(),fluent.isPaused(),fluent.getReplicas(),fluent.getRevisionHistoryLimit(),fluent.getSelector(),fluent.getStrategy(),fluent.getTemplate(),fluent.isTest(),fluent.getTriggers());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentConfigSpecBuilder that = (DeploymentConfigSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
