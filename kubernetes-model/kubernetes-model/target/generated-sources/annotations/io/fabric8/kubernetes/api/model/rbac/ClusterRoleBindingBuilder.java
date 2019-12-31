package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ClusterRoleBindingBuilder extends ClusterRoleBindingFluentImpl<ClusterRoleBindingBuilder> implements VisitableBuilder<ClusterRoleBinding,ClusterRoleBindingBuilder>{

    ClusterRoleBindingFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ClusterRoleBindingBuilder(){
            this(true);
    }
    public ClusterRoleBindingBuilder(Boolean validationEnabled){
            this(new ClusterRoleBinding(), validationEnabled);
    }
    public ClusterRoleBindingBuilder(ClusterRoleBindingFluent<?> fluent){
            this(fluent, true);
    }
    public ClusterRoleBindingBuilder(ClusterRoleBindingFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ClusterRoleBinding(), validationEnabled);
    }
    public ClusterRoleBindingBuilder(ClusterRoleBindingFluent<?> fluent,ClusterRoleBinding instance){
            this(fluent, instance, true);
    }
    public ClusterRoleBindingBuilder(ClusterRoleBindingFluent<?> fluent,ClusterRoleBinding instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRoleRef(instance.getRoleRef()); 
            fluent.withSubjects(instance.getSubjects()); 
            this.validationEnabled = validationEnabled; 
    }
    public ClusterRoleBindingBuilder(ClusterRoleBinding instance){
            this(instance,true);
    }
    public ClusterRoleBindingBuilder(ClusterRoleBinding instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRoleRef(instance.getRoleRef()); 
            this.withSubjects(instance.getSubjects()); 
            this.validationEnabled = validationEnabled; 
    }
    public ClusterRoleBindingBuilder(Validator validator){
            this(new ClusterRoleBinding(), true);
    }
    public ClusterRoleBindingBuilder(ClusterRoleBindingFluent<?> fluent,ClusterRoleBinding instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRoleRef(instance.getRoleRef()); 
            fluent.withSubjects(instance.getSubjects()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ClusterRoleBindingBuilder(ClusterRoleBinding instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRoleRef(instance.getRoleRef()); 
            this.withSubjects(instance.getSubjects()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ClusterRoleBinding build(){
            ClusterRoleBinding buildable = new ClusterRoleBinding(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getRoleRef(),fluent.getSubjects());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ClusterRoleBindingBuilder that = (ClusterRoleBindingBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
