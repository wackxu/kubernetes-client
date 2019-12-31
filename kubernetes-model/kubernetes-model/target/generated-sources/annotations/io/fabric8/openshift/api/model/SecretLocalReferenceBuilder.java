package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SecretLocalReferenceBuilder extends SecretLocalReferenceFluentImpl<SecretLocalReferenceBuilder> implements VisitableBuilder<SecretLocalReference,SecretLocalReferenceBuilder>{

    SecretLocalReferenceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SecretLocalReferenceBuilder(){
            this(true);
    }
    public SecretLocalReferenceBuilder(Boolean validationEnabled){
            this(new SecretLocalReference(), validationEnabled);
    }
    public SecretLocalReferenceBuilder(SecretLocalReferenceFluent<?> fluent){
            this(fluent, true);
    }
    public SecretLocalReferenceBuilder(SecretLocalReferenceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SecretLocalReference(), validationEnabled);
    }
    public SecretLocalReferenceBuilder(SecretLocalReferenceFluent<?> fluent,SecretLocalReference instance){
            this(fluent, instance, true);
    }
    public SecretLocalReferenceBuilder(SecretLocalReferenceFluent<?> fluent,SecretLocalReference instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretLocalReferenceBuilder(SecretLocalReference instance){
            this(instance,true);
    }
    public SecretLocalReferenceBuilder(SecretLocalReference instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretLocalReferenceBuilder(Validator validator){
            this(new SecretLocalReference(), true);
    }
    public SecretLocalReferenceBuilder(SecretLocalReferenceFluent<?> fluent,SecretLocalReference instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SecretLocalReferenceBuilder(SecretLocalReference instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SecretLocalReference build(){
            SecretLocalReference buildable = new SecretLocalReference(fluent.getName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecretLocalReferenceBuilder that = (SecretLocalReferenceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
