package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BuildSpecBuilder extends BuildSpecFluentImpl<BuildSpecBuilder> implements VisitableBuilder<BuildSpec,BuildSpecBuilder>{

    BuildSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BuildSpecBuilder(){
            this(true);
    }
    public BuildSpecBuilder(Boolean validationEnabled){
            this(new BuildSpec(), validationEnabled);
    }
    public BuildSpecBuilder(BuildSpecFluent<?> fluent){
            this(fluent, true);
    }
    public BuildSpecBuilder(BuildSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BuildSpec(), validationEnabled);
    }
    public BuildSpecBuilder(BuildSpecFluent<?> fluent,BuildSpec instance){
            this(fluent, instance, true);
    }
    public BuildSpecBuilder(BuildSpecFluent<?> fluent,BuildSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCompletionDeadlineSeconds(instance.getCompletionDeadlineSeconds()); 
            fluent.withNodeSelector(instance.getNodeSelector()); 
            fluent.withOutput(instance.getOutput()); 
            fluent.withPostCommit(instance.getPostCommit()); 
            fluent.withResources(instance.getResources()); 
            fluent.withRevision(instance.getRevision()); 
            fluent.withServiceAccount(instance.getServiceAccount()); 
            fluent.withSource(instance.getSource()); 
            fluent.withStrategy(instance.getStrategy()); 
            fluent.withTriggeredBy(instance.getTriggeredBy()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildSpecBuilder(BuildSpec instance){
            this(instance,true);
    }
    public BuildSpecBuilder(BuildSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCompletionDeadlineSeconds(instance.getCompletionDeadlineSeconds()); 
            this.withNodeSelector(instance.getNodeSelector()); 
            this.withOutput(instance.getOutput()); 
            this.withPostCommit(instance.getPostCommit()); 
            this.withResources(instance.getResources()); 
            this.withRevision(instance.getRevision()); 
            this.withServiceAccount(instance.getServiceAccount()); 
            this.withSource(instance.getSource()); 
            this.withStrategy(instance.getStrategy()); 
            this.withTriggeredBy(instance.getTriggeredBy()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildSpecBuilder(Validator validator){
            this(new BuildSpec(), true);
    }
    public BuildSpecBuilder(BuildSpecFluent<?> fluent,BuildSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCompletionDeadlineSeconds(instance.getCompletionDeadlineSeconds()); 
            fluent.withNodeSelector(instance.getNodeSelector()); 
            fluent.withOutput(instance.getOutput()); 
            fluent.withPostCommit(instance.getPostCommit()); 
            fluent.withResources(instance.getResources()); 
            fluent.withRevision(instance.getRevision()); 
            fluent.withServiceAccount(instance.getServiceAccount()); 
            fluent.withSource(instance.getSource()); 
            fluent.withStrategy(instance.getStrategy()); 
            fluent.withTriggeredBy(instance.getTriggeredBy()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BuildSpecBuilder(BuildSpec instance,Validator validator){
            this.fluent = this; 
            this.withCompletionDeadlineSeconds(instance.getCompletionDeadlineSeconds()); 
            this.withNodeSelector(instance.getNodeSelector()); 
            this.withOutput(instance.getOutput()); 
            this.withPostCommit(instance.getPostCommit()); 
            this.withResources(instance.getResources()); 
            this.withRevision(instance.getRevision()); 
            this.withServiceAccount(instance.getServiceAccount()); 
            this.withSource(instance.getSource()); 
            this.withStrategy(instance.getStrategy()); 
            this.withTriggeredBy(instance.getTriggeredBy()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BuildSpec build(){
            BuildSpec buildable = new BuildSpec(fluent.getCompletionDeadlineSeconds(),fluent.getNodeSelector(),fluent.getOutput(),fluent.getPostCommit(),fluent.getResources(),fluent.getRevision(),fluent.getServiceAccount(),fluent.getSource(),fluent.getStrategy(),fluent.getTriggeredBy());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildSpecBuilder that = (BuildSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
