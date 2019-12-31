package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OpenshiftRoleBindingBuilder extends OpenshiftRoleBindingFluentImpl<OpenshiftRoleBindingBuilder> implements VisitableBuilder<OpenshiftRoleBinding,OpenshiftRoleBindingBuilder>{

    OpenshiftRoleBindingFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OpenshiftRoleBindingBuilder(){
            this(true);
    }
    public OpenshiftRoleBindingBuilder(Boolean validationEnabled){
            this(new OpenshiftRoleBinding(), validationEnabled);
    }
    public OpenshiftRoleBindingBuilder(OpenshiftRoleBindingFluent<?> fluent){
            this(fluent, true);
    }
    public OpenshiftRoleBindingBuilder(OpenshiftRoleBindingFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OpenshiftRoleBinding(), validationEnabled);
    }
    public OpenshiftRoleBindingBuilder(OpenshiftRoleBindingFluent<?> fluent,OpenshiftRoleBinding instance){
            this(fluent, instance, true);
    }
    public OpenshiftRoleBindingBuilder(OpenshiftRoleBindingFluent<?> fluent,OpenshiftRoleBinding instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withGroupNames(instance.getGroupNames()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRoleRef(instance.getRoleRef()); 
            fluent.withSubjects(instance.getSubjects()); 
            fluent.withUserNames(instance.getUserNames()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftRoleBindingBuilder(OpenshiftRoleBinding instance){
            this(instance,true);
    }
    public OpenshiftRoleBindingBuilder(OpenshiftRoleBinding instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withGroupNames(instance.getGroupNames()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRoleRef(instance.getRoleRef()); 
            this.withSubjects(instance.getSubjects()); 
            this.withUserNames(instance.getUserNames()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftRoleBindingBuilder(Validator validator){
            this(new OpenshiftRoleBinding(), true);
    }
    public OpenshiftRoleBindingBuilder(OpenshiftRoleBindingFluent<?> fluent,OpenshiftRoleBinding instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withGroupNames(instance.getGroupNames()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRoleRef(instance.getRoleRef()); 
            fluent.withSubjects(instance.getSubjects()); 
            fluent.withUserNames(instance.getUserNames()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OpenshiftRoleBindingBuilder(OpenshiftRoleBinding instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withGroupNames(instance.getGroupNames()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRoleRef(instance.getRoleRef()); 
            this.withSubjects(instance.getSubjects()); 
            this.withUserNames(instance.getUserNames()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OpenshiftRoleBinding build(){
            OpenshiftRoleBinding buildable = new OpenshiftRoleBinding(fluent.getApiVersion(),fluent.getGroupNames(),fluent.getKind(),fluent.getMetadata(),fluent.getRoleRef(),fluent.getSubjects(),fluent.getUserNames());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenshiftRoleBindingBuilder that = (OpenshiftRoleBindingBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
