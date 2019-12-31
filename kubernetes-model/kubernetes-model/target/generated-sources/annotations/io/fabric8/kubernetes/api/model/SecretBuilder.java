package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SecretBuilder extends SecretFluentImpl<SecretBuilder> implements VisitableBuilder<Secret,SecretBuilder>{

    SecretFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SecretBuilder(){
            this(true);
    }
    public SecretBuilder(Boolean validationEnabled){
            this(new Secret(), validationEnabled);
    }
    public SecretBuilder(SecretFluent<?> fluent){
            this(fluent, true);
    }
    public SecretBuilder(SecretFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Secret(), validationEnabled);
    }
    public SecretBuilder(SecretFluent<?> fluent,Secret instance){
            this(fluent, instance, true);
    }
    public SecretBuilder(SecretFluent<?> fluent,Secret instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withData(instance.getData()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withStringData(instance.getStringData()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretBuilder(Secret instance){
            this(instance,true);
    }
    public SecretBuilder(Secret instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withData(instance.getData()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withStringData(instance.getStringData()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretBuilder(Validator validator){
            this(new Secret(), true);
    }
    public SecretBuilder(SecretFluent<?> fluent,Secret instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withData(instance.getData()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withStringData(instance.getStringData()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SecretBuilder(Secret instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withData(instance.getData()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withStringData(instance.getStringData()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Secret build(){
            Secret buildable = new Secret(fluent.getApiVersion(),fluent.getData(),fluent.getKind(),fluent.getMetadata(),fluent.getStringData(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecretBuilder that = (SecretBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
