package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RoleBindingBuilder extends RoleBindingFluentImpl<RoleBindingBuilder> implements VisitableBuilder<RoleBinding,RoleBindingBuilder>{

    RoleBindingFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RoleBindingBuilder(){
            this(true);
    }
    public RoleBindingBuilder(Boolean validationEnabled){
            this(new RoleBinding(), validationEnabled);
    }
    public RoleBindingBuilder(RoleBindingFluent<?> fluent){
            this(fluent, true);
    }
    public RoleBindingBuilder(RoleBindingFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RoleBinding(), validationEnabled);
    }
    public RoleBindingBuilder(RoleBindingFluent<?> fluent,RoleBinding instance){
            this(fluent, instance, true);
    }
    public RoleBindingBuilder(RoleBindingFluent<?> fluent,RoleBinding instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRoleRef(instance.getRoleRef()); 
            fluent.withSubjects(instance.getSubjects()); 
            this.validationEnabled = validationEnabled; 
    }
    public RoleBindingBuilder(RoleBinding instance){
            this(instance,true);
    }
    public RoleBindingBuilder(RoleBinding instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRoleRef(instance.getRoleRef()); 
            this.withSubjects(instance.getSubjects()); 
            this.validationEnabled = validationEnabled; 
    }
    public RoleBindingBuilder(Validator validator){
            this(new RoleBinding(), true);
    }
    public RoleBindingBuilder(RoleBindingFluent<?> fluent,RoleBinding instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRoleRef(instance.getRoleRef()); 
            fluent.withSubjects(instance.getSubjects()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RoleBindingBuilder(RoleBinding instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRoleRef(instance.getRoleRef()); 
            this.withSubjects(instance.getSubjects()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RoleBinding build(){
            RoleBinding buildable = new RoleBinding(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getRoleRef(),fluent.getSubjects());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RoleBindingBuilder that = (RoleBindingBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
