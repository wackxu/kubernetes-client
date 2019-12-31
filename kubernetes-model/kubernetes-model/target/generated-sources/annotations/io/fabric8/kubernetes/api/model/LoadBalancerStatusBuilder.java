package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class LoadBalancerStatusBuilder extends LoadBalancerStatusFluentImpl<LoadBalancerStatusBuilder> implements VisitableBuilder<LoadBalancerStatus,LoadBalancerStatusBuilder>{

    LoadBalancerStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public LoadBalancerStatusBuilder(){
            this(true);
    }
    public LoadBalancerStatusBuilder(Boolean validationEnabled){
            this(new LoadBalancerStatus(), validationEnabled);
    }
    public LoadBalancerStatusBuilder(LoadBalancerStatusFluent<?> fluent){
            this(fluent, true);
    }
    public LoadBalancerStatusBuilder(LoadBalancerStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new LoadBalancerStatus(), validationEnabled);
    }
    public LoadBalancerStatusBuilder(LoadBalancerStatusFluent<?> fluent,LoadBalancerStatus instance){
            this(fluent, instance, true);
    }
    public LoadBalancerStatusBuilder(LoadBalancerStatusFluent<?> fluent,LoadBalancerStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withIngress(instance.getIngress()); 
            this.validationEnabled = validationEnabled; 
    }
    public LoadBalancerStatusBuilder(LoadBalancerStatus instance){
            this(instance,true);
    }
    public LoadBalancerStatusBuilder(LoadBalancerStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withIngress(instance.getIngress()); 
            this.validationEnabled = validationEnabled; 
    }
    public LoadBalancerStatusBuilder(Validator validator){
            this(new LoadBalancerStatus(), true);
    }
    public LoadBalancerStatusBuilder(LoadBalancerStatusFluent<?> fluent,LoadBalancerStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withIngress(instance.getIngress()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public LoadBalancerStatusBuilder(LoadBalancerStatus instance,Validator validator){
            this.fluent = this; 
            this.withIngress(instance.getIngress()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public LoadBalancerStatus build(){
            LoadBalancerStatus buildable = new LoadBalancerStatus(fluent.getIngress());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LoadBalancerStatusBuilder that = (LoadBalancerStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
