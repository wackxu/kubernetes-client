package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class IngressSpecBuilder extends IngressSpecFluentImpl<IngressSpecBuilder> implements VisitableBuilder<IngressSpec,IngressSpecBuilder>{

    IngressSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public IngressSpecBuilder(){
            this(true);
    }
    public IngressSpecBuilder(Boolean validationEnabled){
            this(new IngressSpec(), validationEnabled);
    }
    public IngressSpecBuilder(IngressSpecFluent<?> fluent){
            this(fluent, true);
    }
    public IngressSpecBuilder(IngressSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new IngressSpec(), validationEnabled);
    }
    public IngressSpecBuilder(IngressSpecFluent<?> fluent,IngressSpec instance){
            this(fluent, instance, true);
    }
    public IngressSpecBuilder(IngressSpecFluent<?> fluent,IngressSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withBackend(instance.getBackend()); 
            fluent.withRules(instance.getRules()); 
            fluent.withTls(instance.getTls()); 
            this.validationEnabled = validationEnabled; 
    }
    public IngressSpecBuilder(IngressSpec instance){
            this(instance,true);
    }
    public IngressSpecBuilder(IngressSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withBackend(instance.getBackend()); 
            this.withRules(instance.getRules()); 
            this.withTls(instance.getTls()); 
            this.validationEnabled = validationEnabled; 
    }
    public IngressSpecBuilder(Validator validator){
            this(new IngressSpec(), true);
    }
    public IngressSpecBuilder(IngressSpecFluent<?> fluent,IngressSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withBackend(instance.getBackend()); 
            fluent.withRules(instance.getRules()); 
            fluent.withTls(instance.getTls()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public IngressSpecBuilder(IngressSpec instance,Validator validator){
            this.fluent = this; 
            this.withBackend(instance.getBackend()); 
            this.withRules(instance.getRules()); 
            this.withTls(instance.getTls()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public IngressSpec build(){
            IngressSpec buildable = new IngressSpec(fluent.getBackend(),fluent.getRules(),fluent.getTls());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IngressSpecBuilder that = (IngressSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
