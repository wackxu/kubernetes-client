package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class IngressBuilder extends IngressFluentImpl<IngressBuilder> implements VisitableBuilder<Ingress,IngressBuilder>{

    IngressFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public IngressBuilder(){
            this(true);
    }
    public IngressBuilder(Boolean validationEnabled){
            this(new Ingress(), validationEnabled);
    }
    public IngressBuilder(IngressFluent<?> fluent){
            this(fluent, true);
    }
    public IngressBuilder(IngressFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Ingress(), validationEnabled);
    }
    public IngressBuilder(IngressFluent<?> fluent,Ingress instance){
            this(fluent, instance, true);
    }
    public IngressBuilder(IngressFluent<?> fluent,Ingress instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public IngressBuilder(Ingress instance){
            this(instance,true);
    }
    public IngressBuilder(Ingress instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public IngressBuilder(Validator validator){
            this(new Ingress(), true);
    }
    public IngressBuilder(IngressFluent<?> fluent,Ingress instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public IngressBuilder(Ingress instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Ingress build(){
            Ingress buildable = new Ingress(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IngressBuilder that = (IngressBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
