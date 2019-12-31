package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class IngressTLSBuilder extends IngressTLSFluentImpl<IngressTLSBuilder> implements VisitableBuilder<IngressTLS,IngressTLSBuilder>{

    IngressTLSFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public IngressTLSBuilder(){
            this(true);
    }
    public IngressTLSBuilder(Boolean validationEnabled){
            this(new IngressTLS(), validationEnabled);
    }
    public IngressTLSBuilder(IngressTLSFluent<?> fluent){
            this(fluent, true);
    }
    public IngressTLSBuilder(IngressTLSFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new IngressTLS(), validationEnabled);
    }
    public IngressTLSBuilder(IngressTLSFluent<?> fluent,IngressTLS instance){
            this(fluent, instance, true);
    }
    public IngressTLSBuilder(IngressTLSFluent<?> fluent,IngressTLS instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withHosts(instance.getHosts()); 
            fluent.withSecretName(instance.getSecretName()); 
            this.validationEnabled = validationEnabled; 
    }
    public IngressTLSBuilder(IngressTLS instance){
            this(instance,true);
    }
    public IngressTLSBuilder(IngressTLS instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withHosts(instance.getHosts()); 
            this.withSecretName(instance.getSecretName()); 
            this.validationEnabled = validationEnabled; 
    }
    public IngressTLSBuilder(Validator validator){
            this(new IngressTLS(), true);
    }
    public IngressTLSBuilder(IngressTLSFluent<?> fluent,IngressTLS instance,Validator validator){
            this.fluent = fluent; 
            fluent.withHosts(instance.getHosts()); 
            fluent.withSecretName(instance.getSecretName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public IngressTLSBuilder(IngressTLS instance,Validator validator){
            this.fluent = this; 
            this.withHosts(instance.getHosts()); 
            this.withSecretName(instance.getSecretName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public IngressTLS build(){
            IngressTLS buildable = new IngressTLS(fluent.getHosts(),fluent.getSecretName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IngressTLSBuilder that = (IngressTLSBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
