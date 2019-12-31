package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SecurityContextConstraintsListBuilder extends SecurityContextConstraintsListFluentImpl<SecurityContextConstraintsListBuilder> implements VisitableBuilder<SecurityContextConstraintsList,SecurityContextConstraintsListBuilder>{

    SecurityContextConstraintsListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SecurityContextConstraintsListBuilder(){
            this(true);
    }
    public SecurityContextConstraintsListBuilder(Boolean validationEnabled){
            this(new SecurityContextConstraintsList(), validationEnabled);
    }
    public SecurityContextConstraintsListBuilder(SecurityContextConstraintsListFluent<?> fluent){
            this(fluent, true);
    }
    public SecurityContextConstraintsListBuilder(SecurityContextConstraintsListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SecurityContextConstraintsList(), validationEnabled);
    }
    public SecurityContextConstraintsListBuilder(SecurityContextConstraintsListFluent<?> fluent,SecurityContextConstraintsList instance){
            this(fluent, instance, true);
    }
    public SecurityContextConstraintsListBuilder(SecurityContextConstraintsListFluent<?> fluent,SecurityContextConstraintsList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecurityContextConstraintsListBuilder(SecurityContextConstraintsList instance){
            this(instance,true);
    }
    public SecurityContextConstraintsListBuilder(SecurityContextConstraintsList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecurityContextConstraintsListBuilder(Validator validator){
            this(new SecurityContextConstraintsList(), true);
    }
    public SecurityContextConstraintsListBuilder(SecurityContextConstraintsListFluent<?> fluent,SecurityContextConstraintsList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SecurityContextConstraintsListBuilder(SecurityContextConstraintsList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SecurityContextConstraintsList build(){
            SecurityContextConstraintsList buildable = new SecurityContextConstraintsList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecurityContextConstraintsListBuilder that = (SecurityContextConstraintsListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
