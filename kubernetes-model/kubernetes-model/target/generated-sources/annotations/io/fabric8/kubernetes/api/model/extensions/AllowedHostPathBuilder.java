package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class AllowedHostPathBuilder extends AllowedHostPathFluentImpl<AllowedHostPathBuilder> implements VisitableBuilder<AllowedHostPath,AllowedHostPathBuilder>{

    AllowedHostPathFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public AllowedHostPathBuilder(){
            this(true);
    }
    public AllowedHostPathBuilder(Boolean validationEnabled){
            this(new AllowedHostPath(), validationEnabled);
    }
    public AllowedHostPathBuilder(AllowedHostPathFluent<?> fluent){
            this(fluent, true);
    }
    public AllowedHostPathBuilder(AllowedHostPathFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new AllowedHostPath(), validationEnabled);
    }
    public AllowedHostPathBuilder(AllowedHostPathFluent<?> fluent,AllowedHostPath instance){
            this(fluent, instance, true);
    }
    public AllowedHostPathBuilder(AllowedHostPathFluent<?> fluent,AllowedHostPath instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPathPrefix(instance.getPathPrefix()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            this.validationEnabled = validationEnabled; 
    }
    public AllowedHostPathBuilder(AllowedHostPath instance){
            this(instance,true);
    }
    public AllowedHostPathBuilder(AllowedHostPath instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPathPrefix(instance.getPathPrefix()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.validationEnabled = validationEnabled; 
    }
    public AllowedHostPathBuilder(Validator validator){
            this(new AllowedHostPath(), true);
    }
    public AllowedHostPathBuilder(AllowedHostPathFluent<?> fluent,AllowedHostPath instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPathPrefix(instance.getPathPrefix()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public AllowedHostPathBuilder(AllowedHostPath instance,Validator validator){
            this.fluent = this; 
            this.withPathPrefix(instance.getPathPrefix()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public AllowedHostPath build(){
            AllowedHostPath buildable = new AllowedHostPath(fluent.getPathPrefix(),fluent.isReadOnly());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AllowedHostPathBuilder that = (AllowedHostPathBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
