package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class HTTPIngressRuleValueBuilder extends HTTPIngressRuleValueFluentImpl<HTTPIngressRuleValueBuilder> implements VisitableBuilder<HTTPIngressRuleValue,HTTPIngressRuleValueBuilder>{

    HTTPIngressRuleValueFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public HTTPIngressRuleValueBuilder(){
            this(true);
    }
    public HTTPIngressRuleValueBuilder(Boolean validationEnabled){
            this(new HTTPIngressRuleValue(), validationEnabled);
    }
    public HTTPIngressRuleValueBuilder(HTTPIngressRuleValueFluent<?> fluent){
            this(fluent, true);
    }
    public HTTPIngressRuleValueBuilder(HTTPIngressRuleValueFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new HTTPIngressRuleValue(), validationEnabled);
    }
    public HTTPIngressRuleValueBuilder(HTTPIngressRuleValueFluent<?> fluent,HTTPIngressRuleValue instance){
            this(fluent, instance, true);
    }
    public HTTPIngressRuleValueBuilder(HTTPIngressRuleValueFluent<?> fluent,HTTPIngressRuleValue instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPaths(instance.getPaths()); 
            this.validationEnabled = validationEnabled; 
    }
    public HTTPIngressRuleValueBuilder(HTTPIngressRuleValue instance){
            this(instance,true);
    }
    public HTTPIngressRuleValueBuilder(HTTPIngressRuleValue instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPaths(instance.getPaths()); 
            this.validationEnabled = validationEnabled; 
    }
    public HTTPIngressRuleValueBuilder(Validator validator){
            this(new HTTPIngressRuleValue(), true);
    }
    public HTTPIngressRuleValueBuilder(HTTPIngressRuleValueFluent<?> fluent,HTTPIngressRuleValue instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPaths(instance.getPaths()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public HTTPIngressRuleValueBuilder(HTTPIngressRuleValue instance,Validator validator){
            this.fluent = this; 
            this.withPaths(instance.getPaths()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public HTTPIngressRuleValue build(){
            HTTPIngressRuleValue buildable = new HTTPIngressRuleValue(fluent.getPaths());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HTTPIngressRuleValueBuilder that = (HTTPIngressRuleValueBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
