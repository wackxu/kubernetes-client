package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RoleBuilder extends RoleFluentImpl<RoleBuilder> implements VisitableBuilder<Role,RoleBuilder>{

    RoleFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RoleBuilder(){
            this(true);
    }
    public RoleBuilder(Boolean validationEnabled){
            this(new Role(), validationEnabled);
    }
    public RoleBuilder(RoleFluent<?> fluent){
            this(fluent, true);
    }
    public RoleBuilder(RoleFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Role(), validationEnabled);
    }
    public RoleBuilder(RoleFluent<?> fluent,Role instance){
            this(fluent, instance, true);
    }
    public RoleBuilder(RoleFluent<?> fluent,Role instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRules(instance.getRules()); 
            this.validationEnabled = validationEnabled; 
    }
    public RoleBuilder(Role instance){
            this(instance,true);
    }
    public RoleBuilder(Role instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRules(instance.getRules()); 
            this.validationEnabled = validationEnabled; 
    }
    public RoleBuilder(Validator validator){
            this(new Role(), true);
    }
    public RoleBuilder(RoleFluent<?> fluent,Role instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRules(instance.getRules()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RoleBuilder(Role instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRules(instance.getRules()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Role build(){
            Role buildable = new Role(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getRules());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RoleBuilder that = (RoleBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
