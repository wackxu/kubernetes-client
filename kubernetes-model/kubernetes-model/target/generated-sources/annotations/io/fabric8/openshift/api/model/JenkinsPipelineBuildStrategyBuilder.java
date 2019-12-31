package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class JenkinsPipelineBuildStrategyBuilder extends JenkinsPipelineBuildStrategyFluentImpl<JenkinsPipelineBuildStrategyBuilder> implements VisitableBuilder<JenkinsPipelineBuildStrategy,JenkinsPipelineBuildStrategyBuilder>{

    JenkinsPipelineBuildStrategyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public JenkinsPipelineBuildStrategyBuilder(){
            this(true);
    }
    public JenkinsPipelineBuildStrategyBuilder(Boolean validationEnabled){
            this(new JenkinsPipelineBuildStrategy(), validationEnabled);
    }
    public JenkinsPipelineBuildStrategyBuilder(JenkinsPipelineBuildStrategyFluent<?> fluent){
            this(fluent, true);
    }
    public JenkinsPipelineBuildStrategyBuilder(JenkinsPipelineBuildStrategyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new JenkinsPipelineBuildStrategy(), validationEnabled);
    }
    public JenkinsPipelineBuildStrategyBuilder(JenkinsPipelineBuildStrategyFluent<?> fluent,JenkinsPipelineBuildStrategy instance){
            this(fluent, instance, true);
    }
    public JenkinsPipelineBuildStrategyBuilder(JenkinsPipelineBuildStrategyFluent<?> fluent,JenkinsPipelineBuildStrategy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withEnv(instance.getEnv()); 
            fluent.withJenkinsfile(instance.getJenkinsfile()); 
            fluent.withJenkinsfilePath(instance.getJenkinsfilePath()); 
            this.validationEnabled = validationEnabled; 
    }
    public JenkinsPipelineBuildStrategyBuilder(JenkinsPipelineBuildStrategy instance){
            this(instance,true);
    }
    public JenkinsPipelineBuildStrategyBuilder(JenkinsPipelineBuildStrategy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withEnv(instance.getEnv()); 
            this.withJenkinsfile(instance.getJenkinsfile()); 
            this.withJenkinsfilePath(instance.getJenkinsfilePath()); 
            this.validationEnabled = validationEnabled; 
    }
    public JenkinsPipelineBuildStrategyBuilder(Validator validator){
            this(new JenkinsPipelineBuildStrategy(), true);
    }
    public JenkinsPipelineBuildStrategyBuilder(JenkinsPipelineBuildStrategyFluent<?> fluent,JenkinsPipelineBuildStrategy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withEnv(instance.getEnv()); 
            fluent.withJenkinsfile(instance.getJenkinsfile()); 
            fluent.withJenkinsfilePath(instance.getJenkinsfilePath()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public JenkinsPipelineBuildStrategyBuilder(JenkinsPipelineBuildStrategy instance,Validator validator){
            this.fluent = this; 
            this.withEnv(instance.getEnv()); 
            this.withJenkinsfile(instance.getJenkinsfile()); 
            this.withJenkinsfilePath(instance.getJenkinsfilePath()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public JenkinsPipelineBuildStrategy build(){
            JenkinsPipelineBuildStrategy buildable = new JenkinsPipelineBuildStrategy(fluent.getEnv(),fluent.getJenkinsfile(),fluent.getJenkinsfilePath());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JenkinsPipelineBuildStrategyBuilder that = (JenkinsPipelineBuildStrategyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
