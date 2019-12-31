package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BuildStrategyBuilder extends BuildStrategyFluentImpl<BuildStrategyBuilder> implements VisitableBuilder<BuildStrategy,BuildStrategyBuilder>{

    BuildStrategyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BuildStrategyBuilder(){
            this(true);
    }
    public BuildStrategyBuilder(Boolean validationEnabled){
            this(new BuildStrategy(), validationEnabled);
    }
    public BuildStrategyBuilder(BuildStrategyFluent<?> fluent){
            this(fluent, true);
    }
    public BuildStrategyBuilder(BuildStrategyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BuildStrategy(), validationEnabled);
    }
    public BuildStrategyBuilder(BuildStrategyFluent<?> fluent,BuildStrategy instance){
            this(fluent, instance, true);
    }
    public BuildStrategyBuilder(BuildStrategyFluent<?> fluent,BuildStrategy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCustomStrategy(instance.getCustomStrategy()); 
            fluent.withDockerStrategy(instance.getDockerStrategy()); 
            fluent.withJenkinsPipelineStrategy(instance.getJenkinsPipelineStrategy()); 
            fluent.withSourceStrategy(instance.getSourceStrategy()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildStrategyBuilder(BuildStrategy instance){
            this(instance,true);
    }
    public BuildStrategyBuilder(BuildStrategy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCustomStrategy(instance.getCustomStrategy()); 
            this.withDockerStrategy(instance.getDockerStrategy()); 
            this.withJenkinsPipelineStrategy(instance.getJenkinsPipelineStrategy()); 
            this.withSourceStrategy(instance.getSourceStrategy()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildStrategyBuilder(Validator validator){
            this(new BuildStrategy(), true);
    }
    public BuildStrategyBuilder(BuildStrategyFluent<?> fluent,BuildStrategy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCustomStrategy(instance.getCustomStrategy()); 
            fluent.withDockerStrategy(instance.getDockerStrategy()); 
            fluent.withJenkinsPipelineStrategy(instance.getJenkinsPipelineStrategy()); 
            fluent.withSourceStrategy(instance.getSourceStrategy()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BuildStrategyBuilder(BuildStrategy instance,Validator validator){
            this.fluent = this; 
            this.withCustomStrategy(instance.getCustomStrategy()); 
            this.withDockerStrategy(instance.getDockerStrategy()); 
            this.withJenkinsPipelineStrategy(instance.getJenkinsPipelineStrategy()); 
            this.withSourceStrategy(instance.getSourceStrategy()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BuildStrategy build(){
            BuildStrategy buildable = new BuildStrategy(fluent.getCustomStrategy(),fluent.getDockerStrategy(),fluent.getJenkinsPipelineStrategy(),fluent.getSourceStrategy(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildStrategyBuilder that = (BuildStrategyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
