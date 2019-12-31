package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SecretListBuilder extends SecretListFluentImpl<SecretListBuilder> implements VisitableBuilder<SecretList,SecretListBuilder>{

    SecretListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SecretListBuilder(){
            this(true);
    }
    public SecretListBuilder(Boolean validationEnabled){
            this(new SecretList(), validationEnabled);
    }
    public SecretListBuilder(SecretListFluent<?> fluent){
            this(fluent, true);
    }
    public SecretListBuilder(SecretListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SecretList(), validationEnabled);
    }
    public SecretListBuilder(SecretListFluent<?> fluent,SecretList instance){
            this(fluent, instance, true);
    }
    public SecretListBuilder(SecretListFluent<?> fluent,SecretList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretListBuilder(SecretList instance){
            this(instance,true);
    }
    public SecretListBuilder(SecretList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretListBuilder(Validator validator){
            this(new SecretList(), true);
    }
    public SecretListBuilder(SecretListFluent<?> fluent,SecretList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SecretListBuilder(SecretList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SecretList build(){
            SecretList buildable = new SecretList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecretListBuilder that = (SecretListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
