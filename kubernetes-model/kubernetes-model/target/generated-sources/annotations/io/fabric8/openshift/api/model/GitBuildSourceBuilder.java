package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class GitBuildSourceBuilder extends GitBuildSourceFluentImpl<GitBuildSourceBuilder> implements VisitableBuilder<GitBuildSource,GitBuildSourceBuilder>{

    GitBuildSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public GitBuildSourceBuilder(){
            this(true);
    }
    public GitBuildSourceBuilder(Boolean validationEnabled){
            this(new GitBuildSource(), validationEnabled);
    }
    public GitBuildSourceBuilder(GitBuildSourceFluent<?> fluent){
            this(fluent, true);
    }
    public GitBuildSourceBuilder(GitBuildSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new GitBuildSource(), validationEnabled);
    }
    public GitBuildSourceBuilder(GitBuildSourceFluent<?> fluent,GitBuildSource instance){
            this(fluent, instance, true);
    }
    public GitBuildSourceBuilder(GitBuildSourceFluent<?> fluent,GitBuildSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withHttpProxy(instance.getHttpProxy()); 
            fluent.withHttpsProxy(instance.getHttpsProxy()); 
            fluent.withNoProxy(instance.getNoProxy()); 
            fluent.withRef(instance.getRef()); 
            fluent.withUri(instance.getUri()); 
            this.validationEnabled = validationEnabled; 
    }
    public GitBuildSourceBuilder(GitBuildSource instance){
            this(instance,true);
    }
    public GitBuildSourceBuilder(GitBuildSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withHttpProxy(instance.getHttpProxy()); 
            this.withHttpsProxy(instance.getHttpsProxy()); 
            this.withNoProxy(instance.getNoProxy()); 
            this.withRef(instance.getRef()); 
            this.withUri(instance.getUri()); 
            this.validationEnabled = validationEnabled; 
    }
    public GitBuildSourceBuilder(Validator validator){
            this(new GitBuildSource(), true);
    }
    public GitBuildSourceBuilder(GitBuildSourceFluent<?> fluent,GitBuildSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withHttpProxy(instance.getHttpProxy()); 
            fluent.withHttpsProxy(instance.getHttpsProxy()); 
            fluent.withNoProxy(instance.getNoProxy()); 
            fluent.withRef(instance.getRef()); 
            fluent.withUri(instance.getUri()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public GitBuildSourceBuilder(GitBuildSource instance,Validator validator){
            this.fluent = this; 
            this.withHttpProxy(instance.getHttpProxy()); 
            this.withHttpsProxy(instance.getHttpsProxy()); 
            this.withNoProxy(instance.getNoProxy()); 
            this.withRef(instance.getRef()); 
            this.withUri(instance.getUri()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public GitBuildSource build(){
            GitBuildSource buildable = new GitBuildSource(fluent.getHttpProxy(),fluent.getHttpsProxy(),fluent.getNoProxy(),fluent.getRef(),fluent.getUri());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GitBuildSourceBuilder that = (GitBuildSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
