package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SecretSpecBuilder extends SecretSpecFluentImpl<SecretSpecBuilder> implements VisitableBuilder<SecretSpec,SecretSpecBuilder>{

    SecretSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SecretSpecBuilder(){
            this(true);
    }
    public SecretSpecBuilder(Boolean validationEnabled){
            this(new SecretSpec(), validationEnabled);
    }
    public SecretSpecBuilder(SecretSpecFluent<?> fluent){
            this(fluent, true);
    }
    public SecretSpecBuilder(SecretSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SecretSpec(), validationEnabled);
    }
    public SecretSpecBuilder(SecretSpecFluent<?> fluent,SecretSpec instance){
            this(fluent, instance, true);
    }
    public SecretSpecBuilder(SecretSpecFluent<?> fluent,SecretSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMountPath(instance.getMountPath()); 
            fluent.withSecretSource(instance.getSecretSource()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretSpecBuilder(SecretSpec instance){
            this(instance,true);
    }
    public SecretSpecBuilder(SecretSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMountPath(instance.getMountPath()); 
            this.withSecretSource(instance.getSecretSource()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretSpecBuilder(Validator validator){
            this(new SecretSpec(), true);
    }
    public SecretSpecBuilder(SecretSpecFluent<?> fluent,SecretSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMountPath(instance.getMountPath()); 
            fluent.withSecretSource(instance.getSecretSource()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SecretSpecBuilder(SecretSpec instance,Validator validator){
            this.fluent = this; 
            this.withMountPath(instance.getMountPath()); 
            this.withSecretSource(instance.getSecretSource()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SecretSpec build(){
            SecretSpec buildable = new SecretSpec(fluent.getMountPath(),fluent.getSecretSource());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecretSpecBuilder that = (SecretSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
