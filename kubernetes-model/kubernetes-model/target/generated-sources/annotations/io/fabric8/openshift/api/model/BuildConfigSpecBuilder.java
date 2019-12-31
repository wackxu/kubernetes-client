package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BuildConfigSpecBuilder extends BuildConfigSpecFluentImpl<BuildConfigSpecBuilder> implements VisitableBuilder<BuildConfigSpec,BuildConfigSpecBuilder>{

    BuildConfigSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BuildConfigSpecBuilder(){
            this(true);
    }
    public BuildConfigSpecBuilder(Boolean validationEnabled){
            this(new BuildConfigSpec(), validationEnabled);
    }
    public BuildConfigSpecBuilder(BuildConfigSpecFluent<?> fluent){
            this(fluent, true);
    }
    public BuildConfigSpecBuilder(BuildConfigSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BuildConfigSpec(), validationEnabled);
    }
    public BuildConfigSpecBuilder(BuildConfigSpecFluent<?> fluent,BuildConfigSpec instance){
            this(fluent, instance, true);
    }
    public BuildConfigSpecBuilder(BuildConfigSpecFluent<?> fluent,BuildConfigSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCompletionDeadlineSeconds(instance.getCompletionDeadlineSeconds()); 
            fluent.withFailedBuildsHistoryLimit(instance.getFailedBuildsHistoryLimit()); 
            fluent.withNodeSelector(instance.getNodeSelector()); 
            fluent.withOutput(instance.getOutput()); 
            fluent.withPostCommit(instance.getPostCommit()); 
            fluent.withResources(instance.getResources()); 
            fluent.withRevision(instance.getRevision()); 
            fluent.withRunPolicy(instance.getRunPolicy()); 
            fluent.withServiceAccount(instance.getServiceAccount()); 
            fluent.withSource(instance.getSource()); 
            fluent.withStrategy(instance.getStrategy()); 
            fluent.withSuccessfulBuildsHistoryLimit(instance.getSuccessfulBuildsHistoryLimit()); 
            fluent.withTriggers(instance.getTriggers()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildConfigSpecBuilder(BuildConfigSpec instance){
            this(instance,true);
    }
    public BuildConfigSpecBuilder(BuildConfigSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCompletionDeadlineSeconds(instance.getCompletionDeadlineSeconds()); 
            this.withFailedBuildsHistoryLimit(instance.getFailedBuildsHistoryLimit()); 
            this.withNodeSelector(instance.getNodeSelector()); 
            this.withOutput(instance.getOutput()); 
            this.withPostCommit(instance.getPostCommit()); 
            this.withResources(instance.getResources()); 
            this.withRevision(instance.getRevision()); 
            this.withRunPolicy(instance.getRunPolicy()); 
            this.withServiceAccount(instance.getServiceAccount()); 
            this.withSource(instance.getSource()); 
            this.withStrategy(instance.getStrategy()); 
            this.withSuccessfulBuildsHistoryLimit(instance.getSuccessfulBuildsHistoryLimit()); 
            this.withTriggers(instance.getTriggers()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildConfigSpecBuilder(Validator validator){
            this(new BuildConfigSpec(), true);
    }
    public BuildConfigSpecBuilder(BuildConfigSpecFluent<?> fluent,BuildConfigSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCompletionDeadlineSeconds(instance.getCompletionDeadlineSeconds()); 
            fluent.withFailedBuildsHistoryLimit(instance.getFailedBuildsHistoryLimit()); 
            fluent.withNodeSelector(instance.getNodeSelector()); 
            fluent.withOutput(instance.getOutput()); 
            fluent.withPostCommit(instance.getPostCommit()); 
            fluent.withResources(instance.getResources()); 
            fluent.withRevision(instance.getRevision()); 
            fluent.withRunPolicy(instance.getRunPolicy()); 
            fluent.withServiceAccount(instance.getServiceAccount()); 
            fluent.withSource(instance.getSource()); 
            fluent.withStrategy(instance.getStrategy()); 
            fluent.withSuccessfulBuildsHistoryLimit(instance.getSuccessfulBuildsHistoryLimit()); 
            fluent.withTriggers(instance.getTriggers()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BuildConfigSpecBuilder(BuildConfigSpec instance,Validator validator){
            this.fluent = this; 
            this.withCompletionDeadlineSeconds(instance.getCompletionDeadlineSeconds()); 
            this.withFailedBuildsHistoryLimit(instance.getFailedBuildsHistoryLimit()); 
            this.withNodeSelector(instance.getNodeSelector()); 
            this.withOutput(instance.getOutput()); 
            this.withPostCommit(instance.getPostCommit()); 
            this.withResources(instance.getResources()); 
            this.withRevision(instance.getRevision()); 
            this.withRunPolicy(instance.getRunPolicy()); 
            this.withServiceAccount(instance.getServiceAccount()); 
            this.withSource(instance.getSource()); 
            this.withStrategy(instance.getStrategy()); 
            this.withSuccessfulBuildsHistoryLimit(instance.getSuccessfulBuildsHistoryLimit()); 
            this.withTriggers(instance.getTriggers()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BuildConfigSpec build(){
            BuildConfigSpec buildable = new BuildConfigSpec(fluent.getCompletionDeadlineSeconds(),fluent.getFailedBuildsHistoryLimit(),fluent.getNodeSelector(),fluent.getOutput(),fluent.getPostCommit(),fluent.getResources(),fluent.getRevision(),fluent.getRunPolicy(),fluent.getServiceAccount(),fluent.getSource(),fluent.getStrategy(),fluent.getSuccessfulBuildsHistoryLimit(),fluent.getTriggers());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildConfigSpecBuilder that = (BuildConfigSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
