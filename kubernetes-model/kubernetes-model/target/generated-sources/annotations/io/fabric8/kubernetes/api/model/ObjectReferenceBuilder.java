package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ObjectReferenceBuilder extends ObjectReferenceFluentImpl<ObjectReferenceBuilder> implements VisitableBuilder<ObjectReference,ObjectReferenceBuilder>{

    ObjectReferenceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ObjectReferenceBuilder(){
            this(true);
    }
    public ObjectReferenceBuilder(Boolean validationEnabled){
            this(new ObjectReference(), validationEnabled);
    }
    public ObjectReferenceBuilder(ObjectReferenceFluent<?> fluent){
            this(fluent, true);
    }
    public ObjectReferenceBuilder(ObjectReferenceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ObjectReference(), validationEnabled);
    }
    public ObjectReferenceBuilder(ObjectReferenceFluent<?> fluent,ObjectReference instance){
            this(fluent, instance, true);
    }
    public ObjectReferenceBuilder(ObjectReferenceFluent<?> fluent,ObjectReference instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withFieldPath(instance.getFieldPath()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withResourceVersion(instance.getResourceVersion()); 
            fluent.withUid(instance.getUid()); 
            this.validationEnabled = validationEnabled; 
    }
    public ObjectReferenceBuilder(ObjectReference instance){
            this(instance,true);
    }
    public ObjectReferenceBuilder(ObjectReference instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withFieldPath(instance.getFieldPath()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withResourceVersion(instance.getResourceVersion()); 
            this.withUid(instance.getUid()); 
            this.validationEnabled = validationEnabled; 
    }
    public ObjectReferenceBuilder(Validator validator){
            this(new ObjectReference(), true);
    }
    public ObjectReferenceBuilder(ObjectReferenceFluent<?> fluent,ObjectReference instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withFieldPath(instance.getFieldPath()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withResourceVersion(instance.getResourceVersion()); 
            fluent.withUid(instance.getUid()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ObjectReferenceBuilder(ObjectReference instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withFieldPath(instance.getFieldPath()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withResourceVersion(instance.getResourceVersion()); 
            this.withUid(instance.getUid()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ObjectReference build(){
            ObjectReference buildable = new ObjectReference(fluent.getApiVersion(),fluent.getFieldPath(),fluent.getKind(),fluent.getName(),fluent.getNamespace(),fluent.getResourceVersion(),fluent.getUid());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ObjectReferenceBuilder that = (ObjectReferenceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
