package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DockerStrategyOptionsBuilder extends DockerStrategyOptionsFluentImpl<DockerStrategyOptionsBuilder> implements VisitableBuilder<DockerStrategyOptions,DockerStrategyOptionsBuilder>{

    DockerStrategyOptionsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DockerStrategyOptionsBuilder(){
            this(true);
    }
    public DockerStrategyOptionsBuilder(Boolean validationEnabled){
            this(new DockerStrategyOptions(), validationEnabled);
    }
    public DockerStrategyOptionsBuilder(DockerStrategyOptionsFluent<?> fluent){
            this(fluent, true);
    }
    public DockerStrategyOptionsBuilder(DockerStrategyOptionsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DockerStrategyOptions(), validationEnabled);
    }
    public DockerStrategyOptionsBuilder(DockerStrategyOptionsFluent<?> fluent,DockerStrategyOptions instance){
            this(fluent, instance, true);
    }
    public DockerStrategyOptionsBuilder(DockerStrategyOptionsFluent<?> fluent,DockerStrategyOptions instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withBuildArgs(instance.getBuildArgs()); 
            fluent.withNoCache(instance.getNoCache()); 
            this.validationEnabled = validationEnabled; 
    }
    public DockerStrategyOptionsBuilder(DockerStrategyOptions instance){
            this(instance,true);
    }
    public DockerStrategyOptionsBuilder(DockerStrategyOptions instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withBuildArgs(instance.getBuildArgs()); 
            this.withNoCache(instance.getNoCache()); 
            this.validationEnabled = validationEnabled; 
    }
    public DockerStrategyOptionsBuilder(Validator validator){
            this(new DockerStrategyOptions(), true);
    }
    public DockerStrategyOptionsBuilder(DockerStrategyOptionsFluent<?> fluent,DockerStrategyOptions instance,Validator validator){
            this.fluent = fluent; 
            fluent.withBuildArgs(instance.getBuildArgs()); 
            fluent.withNoCache(instance.getNoCache()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DockerStrategyOptionsBuilder(DockerStrategyOptions instance,Validator validator){
            this.fluent = this; 
            this.withBuildArgs(instance.getBuildArgs()); 
            this.withNoCache(instance.getNoCache()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DockerStrategyOptions build(){
            DockerStrategyOptions buildable = new DockerStrategyOptions(fluent.getBuildArgs(),fluent.isNoCache());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DockerStrategyOptionsBuilder that = (DockerStrategyOptionsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
