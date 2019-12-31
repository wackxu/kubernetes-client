package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class LoadBalancerIngressBuilder extends LoadBalancerIngressFluentImpl<LoadBalancerIngressBuilder> implements VisitableBuilder<LoadBalancerIngress,LoadBalancerIngressBuilder>{

    LoadBalancerIngressFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public LoadBalancerIngressBuilder(){
            this(true);
    }
    public LoadBalancerIngressBuilder(Boolean validationEnabled){
            this(new LoadBalancerIngress(), validationEnabled);
    }
    public LoadBalancerIngressBuilder(LoadBalancerIngressFluent<?> fluent){
            this(fluent, true);
    }
    public LoadBalancerIngressBuilder(LoadBalancerIngressFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new LoadBalancerIngress(), validationEnabled);
    }
    public LoadBalancerIngressBuilder(LoadBalancerIngressFluent<?> fluent,LoadBalancerIngress instance){
            this(fluent, instance, true);
    }
    public LoadBalancerIngressBuilder(LoadBalancerIngressFluent<?> fluent,LoadBalancerIngress instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withHostname(instance.getHostname()); 
            fluent.withIp(instance.getIp()); 
            this.validationEnabled = validationEnabled; 
    }
    public LoadBalancerIngressBuilder(LoadBalancerIngress instance){
            this(instance,true);
    }
    public LoadBalancerIngressBuilder(LoadBalancerIngress instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withHostname(instance.getHostname()); 
            this.withIp(instance.getIp()); 
            this.validationEnabled = validationEnabled; 
    }
    public LoadBalancerIngressBuilder(Validator validator){
            this(new LoadBalancerIngress(), true);
    }
    public LoadBalancerIngressBuilder(LoadBalancerIngressFluent<?> fluent,LoadBalancerIngress instance,Validator validator){
            this.fluent = fluent; 
            fluent.withHostname(instance.getHostname()); 
            fluent.withIp(instance.getIp()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public LoadBalancerIngressBuilder(LoadBalancerIngress instance,Validator validator){
            this.fluent = this; 
            this.withHostname(instance.getHostname()); 
            this.withIp(instance.getIp()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public LoadBalancerIngress build(){
            LoadBalancerIngress buildable = new LoadBalancerIngress(fluent.getHostname(),fluent.getIp());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LoadBalancerIngressBuilder that = (LoadBalancerIngressBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
