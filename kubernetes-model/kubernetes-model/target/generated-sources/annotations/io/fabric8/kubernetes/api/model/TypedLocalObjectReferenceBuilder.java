package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TypedLocalObjectReferenceBuilder extends TypedLocalObjectReferenceFluentImpl<TypedLocalObjectReferenceBuilder> implements VisitableBuilder<TypedLocalObjectReference,TypedLocalObjectReferenceBuilder>{

    TypedLocalObjectReferenceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TypedLocalObjectReferenceBuilder(){
            this(true);
    }
    public TypedLocalObjectReferenceBuilder(Boolean validationEnabled){
            this(new TypedLocalObjectReference(), validationEnabled);
    }
    public TypedLocalObjectReferenceBuilder(TypedLocalObjectReferenceFluent<?> fluent){
            this(fluent, true);
    }
    public TypedLocalObjectReferenceBuilder(TypedLocalObjectReferenceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TypedLocalObjectReference(), validationEnabled);
    }
    public TypedLocalObjectReferenceBuilder(TypedLocalObjectReferenceFluent<?> fluent,TypedLocalObjectReference instance){
            this(fluent, instance, true);
    }
    public TypedLocalObjectReferenceBuilder(TypedLocalObjectReferenceFluent<?> fluent,TypedLocalObjectReference instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiGroup(instance.getApiGroup()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public TypedLocalObjectReferenceBuilder(TypedLocalObjectReference instance){
            this(instance,true);
    }
    public TypedLocalObjectReferenceBuilder(TypedLocalObjectReference instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiGroup(instance.getApiGroup()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public TypedLocalObjectReferenceBuilder(Validator validator){
            this(new TypedLocalObjectReference(), true);
    }
    public TypedLocalObjectReferenceBuilder(TypedLocalObjectReferenceFluent<?> fluent,TypedLocalObjectReference instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiGroup(instance.getApiGroup()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TypedLocalObjectReferenceBuilder(TypedLocalObjectReference instance,Validator validator){
            this.fluent = this; 
            this.withApiGroup(instance.getApiGroup()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TypedLocalObjectReference build(){
            TypedLocalObjectReference buildable = new TypedLocalObjectReference(fluent.getApiGroup(),fluent.getKind(),fluent.getName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TypedLocalObjectReferenceBuilder that = (TypedLocalObjectReferenceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
