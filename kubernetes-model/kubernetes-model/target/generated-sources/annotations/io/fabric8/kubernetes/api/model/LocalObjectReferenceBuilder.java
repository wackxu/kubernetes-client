package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class LocalObjectReferenceBuilder extends LocalObjectReferenceFluentImpl<LocalObjectReferenceBuilder> implements VisitableBuilder<LocalObjectReference,LocalObjectReferenceBuilder>{

    LocalObjectReferenceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public LocalObjectReferenceBuilder(){
            this(true);
    }
    public LocalObjectReferenceBuilder(Boolean validationEnabled){
            this(new LocalObjectReference(), validationEnabled);
    }
    public LocalObjectReferenceBuilder(LocalObjectReferenceFluent<?> fluent){
            this(fluent, true);
    }
    public LocalObjectReferenceBuilder(LocalObjectReferenceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new LocalObjectReference(), validationEnabled);
    }
    public LocalObjectReferenceBuilder(LocalObjectReferenceFluent<?> fluent,LocalObjectReference instance){
            this(fluent, instance, true);
    }
    public LocalObjectReferenceBuilder(LocalObjectReferenceFluent<?> fluent,LocalObjectReference instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public LocalObjectReferenceBuilder(LocalObjectReference instance){
            this(instance,true);
    }
    public LocalObjectReferenceBuilder(LocalObjectReference instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public LocalObjectReferenceBuilder(Validator validator){
            this(new LocalObjectReference(), true);
    }
    public LocalObjectReferenceBuilder(LocalObjectReferenceFluent<?> fluent,LocalObjectReference instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public LocalObjectReferenceBuilder(LocalObjectReference instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public LocalObjectReference build(){
            LocalObjectReference buildable = new LocalObjectReference(fluent.getName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LocalObjectReferenceBuilder that = (LocalObjectReferenceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
