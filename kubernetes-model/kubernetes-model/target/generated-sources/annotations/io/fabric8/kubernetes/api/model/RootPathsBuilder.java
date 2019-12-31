package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RootPathsBuilder extends RootPathsFluentImpl<RootPathsBuilder> implements VisitableBuilder<RootPaths,RootPathsBuilder>{

    RootPathsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RootPathsBuilder(){
            this(true);
    }
    public RootPathsBuilder(Boolean validationEnabled){
            this(new RootPaths(), validationEnabled);
    }
    public RootPathsBuilder(RootPathsFluent<?> fluent){
            this(fluent, true);
    }
    public RootPathsBuilder(RootPathsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RootPaths(), validationEnabled);
    }
    public RootPathsBuilder(RootPathsFluent<?> fluent,RootPaths instance){
            this(fluent, instance, true);
    }
    public RootPathsBuilder(RootPathsFluent<?> fluent,RootPaths instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPaths(instance.getPaths()); 
            this.validationEnabled = validationEnabled; 
    }
    public RootPathsBuilder(RootPaths instance){
            this(instance,true);
    }
    public RootPathsBuilder(RootPaths instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPaths(instance.getPaths()); 
            this.validationEnabled = validationEnabled; 
    }
    public RootPathsBuilder(Validator validator){
            this(new RootPaths(), true);
    }
    public RootPathsBuilder(RootPathsFluent<?> fluent,RootPaths instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPaths(instance.getPaths()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RootPathsBuilder(RootPaths instance,Validator validator){
            this.fluent = this; 
            this.withPaths(instance.getPaths()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RootPaths build(){
            RootPaths buildable = new RootPaths(fluent.getPaths());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RootPathsBuilder that = (RootPathsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
