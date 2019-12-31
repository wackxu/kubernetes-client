package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CrossVersionObjectReferenceBuilder extends CrossVersionObjectReferenceFluentImpl<CrossVersionObjectReferenceBuilder> implements VisitableBuilder<CrossVersionObjectReference,CrossVersionObjectReferenceBuilder>{

    CrossVersionObjectReferenceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CrossVersionObjectReferenceBuilder(){
            this(true);
    }
    public CrossVersionObjectReferenceBuilder(Boolean validationEnabled){
            this(new CrossVersionObjectReference(), validationEnabled);
    }
    public CrossVersionObjectReferenceBuilder(CrossVersionObjectReferenceFluent<?> fluent){
            this(fluent, true);
    }
    public CrossVersionObjectReferenceBuilder(CrossVersionObjectReferenceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CrossVersionObjectReference(), validationEnabled);
    }
    public CrossVersionObjectReferenceBuilder(CrossVersionObjectReferenceFluent<?> fluent,CrossVersionObjectReference instance){
            this(fluent, instance, true);
    }
    public CrossVersionObjectReferenceBuilder(CrossVersionObjectReferenceFluent<?> fluent,CrossVersionObjectReference instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public CrossVersionObjectReferenceBuilder(CrossVersionObjectReference instance){
            this(instance,true);
    }
    public CrossVersionObjectReferenceBuilder(CrossVersionObjectReference instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public CrossVersionObjectReferenceBuilder(Validator validator){
            this(new CrossVersionObjectReference(), true);
    }
    public CrossVersionObjectReferenceBuilder(CrossVersionObjectReferenceFluent<?> fluent,CrossVersionObjectReference instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CrossVersionObjectReferenceBuilder(CrossVersionObjectReference instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CrossVersionObjectReference build(){
            CrossVersionObjectReference buildable = new CrossVersionObjectReference(fluent.getApiVersion(),fluent.getKind(),fluent.getName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CrossVersionObjectReferenceBuilder that = (CrossVersionObjectReferenceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
