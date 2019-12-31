package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OpenshiftClusterRoleBindingBuilder extends OpenshiftClusterRoleBindingFluentImpl<OpenshiftClusterRoleBindingBuilder> implements VisitableBuilder<OpenshiftClusterRoleBinding,OpenshiftClusterRoleBindingBuilder>{

    OpenshiftClusterRoleBindingFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OpenshiftClusterRoleBindingBuilder(){
            this(true);
    }
    public OpenshiftClusterRoleBindingBuilder(Boolean validationEnabled){
            this(new OpenshiftClusterRoleBinding(), validationEnabled);
    }
    public OpenshiftClusterRoleBindingBuilder(OpenshiftClusterRoleBindingFluent<?> fluent){
            this(fluent, true);
    }
    public OpenshiftClusterRoleBindingBuilder(OpenshiftClusterRoleBindingFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OpenshiftClusterRoleBinding(), validationEnabled);
    }
    public OpenshiftClusterRoleBindingBuilder(OpenshiftClusterRoleBindingFluent<?> fluent,OpenshiftClusterRoleBinding instance){
            this(fluent, instance, true);
    }
    public OpenshiftClusterRoleBindingBuilder(OpenshiftClusterRoleBindingFluent<?> fluent,OpenshiftClusterRoleBinding instance,Boolean validationEnabled){
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
    public OpenshiftClusterRoleBindingBuilder(OpenshiftClusterRoleBinding instance){
            this(instance,true);
    }
    public OpenshiftClusterRoleBindingBuilder(OpenshiftClusterRoleBinding instance,Boolean validationEnabled){
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
    public OpenshiftClusterRoleBindingBuilder(Validator validator){
            this(new OpenshiftClusterRoleBinding(), true);
    }
    public OpenshiftClusterRoleBindingBuilder(OpenshiftClusterRoleBindingFluent<?> fluent,OpenshiftClusterRoleBinding instance,Validator validator){
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
    public OpenshiftClusterRoleBindingBuilder(OpenshiftClusterRoleBinding instance,Validator validator){
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

    public OpenshiftClusterRoleBinding build(){
            OpenshiftClusterRoleBinding buildable = new OpenshiftClusterRoleBinding(fluent.getApiVersion(),fluent.getGroupNames(),fluent.getKind(),fluent.getMetadata(),fluent.getRoleRef(),fluent.getSubjects(),fluent.getUserNames());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenshiftClusterRoleBindingBuilder that = (OpenshiftClusterRoleBindingBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
