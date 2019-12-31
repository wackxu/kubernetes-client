package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class IngressBackendBuilder extends IngressBackendFluentImpl<IngressBackendBuilder> implements VisitableBuilder<IngressBackend,IngressBackendBuilder>{

    IngressBackendFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public IngressBackendBuilder(){
            this(true);
    }
    public IngressBackendBuilder(Boolean validationEnabled){
            this(new IngressBackend(), validationEnabled);
    }
    public IngressBackendBuilder(IngressBackendFluent<?> fluent){
            this(fluent, true);
    }
    public IngressBackendBuilder(IngressBackendFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new IngressBackend(), validationEnabled);
    }
    public IngressBackendBuilder(IngressBackendFluent<?> fluent,IngressBackend instance){
            this(fluent, instance, true);
    }
    public IngressBackendBuilder(IngressBackendFluent<?> fluent,IngressBackend instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withServiceName(instance.getServiceName()); 
            fluent.withServicePort(instance.getServicePort()); 
            this.validationEnabled = validationEnabled; 
    }
    public IngressBackendBuilder(IngressBackend instance){
            this(instance,true);
    }
    public IngressBackendBuilder(IngressBackend instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withServiceName(instance.getServiceName()); 
            this.withServicePort(instance.getServicePort()); 
            this.validationEnabled = validationEnabled; 
    }
    public IngressBackendBuilder(Validator validator){
            this(new IngressBackend(), true);
    }
    public IngressBackendBuilder(IngressBackendFluent<?> fluent,IngressBackend instance,Validator validator){
            this.fluent = fluent; 
            fluent.withServiceName(instance.getServiceName()); 
            fluent.withServicePort(instance.getServicePort()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public IngressBackendBuilder(IngressBackend instance,Validator validator){
            this.fluent = this; 
            this.withServiceName(instance.getServiceName()); 
            this.withServicePort(instance.getServicePort()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public IngressBackend build(){
            IngressBackend buildable = new IngressBackend(fluent.getServiceName(),fluent.getServicePort());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IngressBackendBuilder that = (IngressBackendBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
