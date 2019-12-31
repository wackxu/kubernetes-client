package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SourceBuildStrategyBuilder extends SourceBuildStrategyFluentImpl<SourceBuildStrategyBuilder> implements VisitableBuilder<SourceBuildStrategy,SourceBuildStrategyBuilder>{

    SourceBuildStrategyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SourceBuildStrategyBuilder(){
            this(true);
    }
    public SourceBuildStrategyBuilder(Boolean validationEnabled){
            this(new SourceBuildStrategy(), validationEnabled);
    }
    public SourceBuildStrategyBuilder(SourceBuildStrategyFluent<?> fluent){
            this(fluent, true);
    }
    public SourceBuildStrategyBuilder(SourceBuildStrategyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SourceBuildStrategy(), validationEnabled);
    }
    public SourceBuildStrategyBuilder(SourceBuildStrategyFluent<?> fluent,SourceBuildStrategy instance){
            this(fluent, instance, true);
    }
    public SourceBuildStrategyBuilder(SourceBuildStrategyFluent<?> fluent,SourceBuildStrategy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withEnv(instance.getEnv()); 
            fluent.withForcePull(instance.getForcePull()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withIncremental(instance.getIncremental()); 
            fluent.withPullSecret(instance.getPullSecret()); 
            fluent.withScripts(instance.getScripts()); 
            this.validationEnabled = validationEnabled; 
    }
    public SourceBuildStrategyBuilder(SourceBuildStrategy instance){
            this(instance,true);
    }
    public SourceBuildStrategyBuilder(SourceBuildStrategy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withEnv(instance.getEnv()); 
            this.withForcePull(instance.getForcePull()); 
            this.withFrom(instance.getFrom()); 
            this.withIncremental(instance.getIncremental()); 
            this.withPullSecret(instance.getPullSecret()); 
            this.withScripts(instance.getScripts()); 
            this.validationEnabled = validationEnabled; 
    }
    public SourceBuildStrategyBuilder(Validator validator){
            this(new SourceBuildStrategy(), true);
    }
    public SourceBuildStrategyBuilder(SourceBuildStrategyFluent<?> fluent,SourceBuildStrategy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withEnv(instance.getEnv()); 
            fluent.withForcePull(instance.getForcePull()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withIncremental(instance.getIncremental()); 
            fluent.withPullSecret(instance.getPullSecret()); 
            fluent.withScripts(instance.getScripts()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SourceBuildStrategyBuilder(SourceBuildStrategy instance,Validator validator){
            this.fluent = this; 
            this.withEnv(instance.getEnv()); 
            this.withForcePull(instance.getForcePull()); 
            this.withFrom(instance.getFrom()); 
            this.withIncremental(instance.getIncremental()); 
            this.withPullSecret(instance.getPullSecret()); 
            this.withScripts(instance.getScripts()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SourceBuildStrategy build(){
            SourceBuildStrategy buildable = new SourceBuildStrategy(fluent.getEnv(),fluent.isForcePull(),fluent.getFrom(),fluent.isIncremental(),fluent.getPullSecret(),fluent.getScripts());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SourceBuildStrategyBuilder that = (SourceBuildStrategyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
