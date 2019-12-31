package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OpenshiftRoleBuilder extends OpenshiftRoleFluentImpl<OpenshiftRoleBuilder> implements VisitableBuilder<OpenshiftRole,OpenshiftRoleBuilder>{

    OpenshiftRoleFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OpenshiftRoleBuilder(){
            this(true);
    }
    public OpenshiftRoleBuilder(Boolean validationEnabled){
            this(new OpenshiftRole(), validationEnabled);
    }
    public OpenshiftRoleBuilder(OpenshiftRoleFluent<?> fluent){
            this(fluent, true);
    }
    public OpenshiftRoleBuilder(OpenshiftRoleFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OpenshiftRole(), validationEnabled);
    }
    public OpenshiftRoleBuilder(OpenshiftRoleFluent<?> fluent,OpenshiftRole instance){
            this(fluent, instance, true);
    }
    public OpenshiftRoleBuilder(OpenshiftRoleFluent<?> fluent,OpenshiftRole instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRules(instance.getRules()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftRoleBuilder(OpenshiftRole instance){
            this(instance,true);
    }
    public OpenshiftRoleBuilder(OpenshiftRole instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRules(instance.getRules()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftRoleBuilder(Validator validator){
            this(new OpenshiftRole(), true);
    }
    public OpenshiftRoleBuilder(OpenshiftRoleFluent<?> fluent,OpenshiftRole instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRules(instance.getRules()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OpenshiftRoleBuilder(OpenshiftRole instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRules(instance.getRules()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OpenshiftRole build(){
            OpenshiftRole buildable = new OpenshiftRole(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getRules());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenshiftRoleBuilder that = (OpenshiftRoleBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
