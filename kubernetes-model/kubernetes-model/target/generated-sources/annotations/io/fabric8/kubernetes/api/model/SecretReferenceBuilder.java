package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SecretReferenceBuilder extends SecretReferenceFluentImpl<SecretReferenceBuilder> implements VisitableBuilder<SecretReference,SecretReferenceBuilder>{

    SecretReferenceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SecretReferenceBuilder(){
            this(true);
    }
    public SecretReferenceBuilder(Boolean validationEnabled){
            this(new SecretReference(), validationEnabled);
    }
    public SecretReferenceBuilder(SecretReferenceFluent<?> fluent){
            this(fluent, true);
    }
    public SecretReferenceBuilder(SecretReferenceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SecretReference(), validationEnabled);
    }
    public SecretReferenceBuilder(SecretReferenceFluent<?> fluent,SecretReference instance){
            this(fluent, instance, true);
    }
    public SecretReferenceBuilder(SecretReferenceFluent<?> fluent,SecretReference instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretReferenceBuilder(SecretReference instance){
            this(instance,true);
    }
    public SecretReferenceBuilder(SecretReference instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretReferenceBuilder(Validator validator){
            this(new SecretReference(), true);
    }
    public SecretReferenceBuilder(SecretReferenceFluent<?> fluent,SecretReference instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SecretReferenceBuilder(SecretReference instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SecretReference build(){
            SecretReference buildable = new SecretReference(fluent.getName(),fluent.getNamespace());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecretReferenceBuilder that = (SecretReferenceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
