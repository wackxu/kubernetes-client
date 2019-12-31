package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SecretBuildSourceBuilder extends SecretBuildSourceFluentImpl<SecretBuildSourceBuilder> implements VisitableBuilder<SecretBuildSource,SecretBuildSourceBuilder>{

    SecretBuildSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SecretBuildSourceBuilder(){
            this(true);
    }
    public SecretBuildSourceBuilder(Boolean validationEnabled){
            this(new SecretBuildSource(), validationEnabled);
    }
    public SecretBuildSourceBuilder(SecretBuildSourceFluent<?> fluent){
            this(fluent, true);
    }
    public SecretBuildSourceBuilder(SecretBuildSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SecretBuildSource(), validationEnabled);
    }
    public SecretBuildSourceBuilder(SecretBuildSourceFluent<?> fluent,SecretBuildSource instance){
            this(fluent, instance, true);
    }
    public SecretBuildSourceBuilder(SecretBuildSourceFluent<?> fluent,SecretBuildSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDestinationDir(instance.getDestinationDir()); 
            fluent.withSecret(instance.getSecret()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretBuildSourceBuilder(SecretBuildSource instance){
            this(instance,true);
    }
    public SecretBuildSourceBuilder(SecretBuildSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDestinationDir(instance.getDestinationDir()); 
            this.withSecret(instance.getSecret()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretBuildSourceBuilder(Validator validator){
            this(new SecretBuildSource(), true);
    }
    public SecretBuildSourceBuilder(SecretBuildSourceFluent<?> fluent,SecretBuildSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDestinationDir(instance.getDestinationDir()); 
            fluent.withSecret(instance.getSecret()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SecretBuildSourceBuilder(SecretBuildSource instance,Validator validator){
            this.fluent = this; 
            this.withDestinationDir(instance.getDestinationDir()); 
            this.withSecret(instance.getSecret()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SecretBuildSource build(){
            SecretBuildSource buildable = new SecretBuildSource(fluent.getDestinationDir(),fluent.getSecret());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecretBuildSourceBuilder that = (SecretBuildSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
