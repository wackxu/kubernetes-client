package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodSecurityPolicyBuilder extends PodSecurityPolicyFluentImpl<PodSecurityPolicyBuilder> implements VisitableBuilder<PodSecurityPolicy,PodSecurityPolicyBuilder>{

    PodSecurityPolicyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodSecurityPolicyBuilder(){
            this(true);
    }
    public PodSecurityPolicyBuilder(Boolean validationEnabled){
            this(new PodSecurityPolicy(), validationEnabled);
    }
    public PodSecurityPolicyBuilder(PodSecurityPolicyFluent<?> fluent){
            this(fluent, true);
    }
    public PodSecurityPolicyBuilder(PodSecurityPolicyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodSecurityPolicy(), validationEnabled);
    }
    public PodSecurityPolicyBuilder(PodSecurityPolicyFluent<?> fluent,PodSecurityPolicy instance){
            this(fluent, instance, true);
    }
    public PodSecurityPolicyBuilder(PodSecurityPolicyFluent<?> fluent,PodSecurityPolicy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodSecurityPolicyBuilder(PodSecurityPolicy instance){
            this(instance,true);
    }
    public PodSecurityPolicyBuilder(PodSecurityPolicy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodSecurityPolicyBuilder(Validator validator){
            this(new PodSecurityPolicy(), true);
    }
    public PodSecurityPolicyBuilder(PodSecurityPolicyFluent<?> fluent,PodSecurityPolicy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodSecurityPolicyBuilder(PodSecurityPolicy instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodSecurityPolicy build(){
            PodSecurityPolicy buildable = new PodSecurityPolicy(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodSecurityPolicyBuilder that = (PodSecurityPolicyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
