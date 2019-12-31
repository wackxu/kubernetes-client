package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class IngressRuleBuilder extends IngressRuleFluentImpl<IngressRuleBuilder> implements VisitableBuilder<IngressRule,IngressRuleBuilder>{

    IngressRuleFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public IngressRuleBuilder(){
            this(true);
    }
    public IngressRuleBuilder(Boolean validationEnabled){
            this(new IngressRule(), validationEnabled);
    }
    public IngressRuleBuilder(IngressRuleFluent<?> fluent){
            this(fluent, true);
    }
    public IngressRuleBuilder(IngressRuleFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new IngressRule(), validationEnabled);
    }
    public IngressRuleBuilder(IngressRuleFluent<?> fluent,IngressRule instance){
            this(fluent, instance, true);
    }
    public IngressRuleBuilder(IngressRuleFluent<?> fluent,IngressRule instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withHost(instance.getHost()); 
            fluent.withHttp(instance.getHttp()); 
            this.validationEnabled = validationEnabled; 
    }
    public IngressRuleBuilder(IngressRule instance){
            this(instance,true);
    }
    public IngressRuleBuilder(IngressRule instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withHost(instance.getHost()); 
            this.withHttp(instance.getHttp()); 
            this.validationEnabled = validationEnabled; 
    }
    public IngressRuleBuilder(Validator validator){
            this(new IngressRule(), true);
    }
    public IngressRuleBuilder(IngressRuleFluent<?> fluent,IngressRule instance,Validator validator){
            this.fluent = fluent; 
            fluent.withHost(instance.getHost()); 
            fluent.withHttp(instance.getHttp()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public IngressRuleBuilder(IngressRule instance,Validator validator){
            this.fluent = this; 
            this.withHost(instance.getHost()); 
            this.withHttp(instance.getHttp()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public IngressRule build(){
            IngressRule buildable = new IngressRule(fluent.getHost(),fluent.getHttp());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IngressRuleBuilder that = (IngressRuleBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
