package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OwnerReferenceBuilder extends OwnerReferenceFluentImpl<OwnerReferenceBuilder> implements VisitableBuilder<OwnerReference,OwnerReferenceBuilder>{

    OwnerReferenceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OwnerReferenceBuilder(){
            this(true);
    }
    public OwnerReferenceBuilder(Boolean validationEnabled){
            this(new OwnerReference(), validationEnabled);
    }
    public OwnerReferenceBuilder(OwnerReferenceFluent<?> fluent){
            this(fluent, true);
    }
    public OwnerReferenceBuilder(OwnerReferenceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OwnerReference(), validationEnabled);
    }
    public OwnerReferenceBuilder(OwnerReferenceFluent<?> fluent,OwnerReference instance){
            this(fluent, instance, true);
    }
    public OwnerReferenceBuilder(OwnerReferenceFluent<?> fluent,OwnerReference instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withBlockOwnerDeletion(instance.getBlockOwnerDeletion()); 
            fluent.withController(instance.getController()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            fluent.withUid(instance.getUid()); 
            this.validationEnabled = validationEnabled; 
    }
    public OwnerReferenceBuilder(OwnerReference instance){
            this(instance,true);
    }
    public OwnerReferenceBuilder(OwnerReference instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withBlockOwnerDeletion(instance.getBlockOwnerDeletion()); 
            this.withController(instance.getController()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withUid(instance.getUid()); 
            this.validationEnabled = validationEnabled; 
    }
    public OwnerReferenceBuilder(Validator validator){
            this(new OwnerReference(), true);
    }
    public OwnerReferenceBuilder(OwnerReferenceFluent<?> fluent,OwnerReference instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withBlockOwnerDeletion(instance.getBlockOwnerDeletion()); 
            fluent.withController(instance.getController()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            fluent.withUid(instance.getUid()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OwnerReferenceBuilder(OwnerReference instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withBlockOwnerDeletion(instance.getBlockOwnerDeletion()); 
            this.withController(instance.getController()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withUid(instance.getUid()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OwnerReference build(){
            OwnerReference buildable = new OwnerReference(fluent.getApiVersion(),fluent.isBlockOwnerDeletion(),fluent.isController(),fluent.getKind(),fluent.getName(),fluent.getUid());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OwnerReferenceBuilder that = (OwnerReferenceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
