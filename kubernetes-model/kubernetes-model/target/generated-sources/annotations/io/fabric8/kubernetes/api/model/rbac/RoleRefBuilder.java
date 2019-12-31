package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RoleRefBuilder extends RoleRefFluentImpl<RoleRefBuilder> implements VisitableBuilder<RoleRef,RoleRefBuilder>{

    RoleRefFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RoleRefBuilder(){
            this(true);
    }
    public RoleRefBuilder(Boolean validationEnabled){
            this(new RoleRef(), validationEnabled);
    }
    public RoleRefBuilder(RoleRefFluent<?> fluent){
            this(fluent, true);
    }
    public RoleRefBuilder(RoleRefFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RoleRef(), validationEnabled);
    }
    public RoleRefBuilder(RoleRefFluent<?> fluent,RoleRef instance){
            this(fluent, instance, true);
    }
    public RoleRefBuilder(RoleRefFluent<?> fluent,RoleRef instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiGroup(instance.getApiGroup()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public RoleRefBuilder(RoleRef instance){
            this(instance,true);
    }
    public RoleRefBuilder(RoleRef instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiGroup(instance.getApiGroup()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public RoleRefBuilder(Validator validator){
            this(new RoleRef(), true);
    }
    public RoleRefBuilder(RoleRefFluent<?> fluent,RoleRef instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiGroup(instance.getApiGroup()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RoleRefBuilder(RoleRef instance,Validator validator){
            this.fluent = this; 
            this.withApiGroup(instance.getApiGroup()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RoleRef build(){
            RoleRef buildable = new RoleRef(fluent.getApiGroup(),fluent.getKind(),fluent.getName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RoleRefBuilder that = (RoleRefBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
