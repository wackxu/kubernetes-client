package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class KubernetesRunAsUserStrategyOptionsBuilder extends KubernetesRunAsUserStrategyOptionsFluentImpl<KubernetesRunAsUserStrategyOptionsBuilder> implements VisitableBuilder<KubernetesRunAsUserStrategyOptions,KubernetesRunAsUserStrategyOptionsBuilder>{

    KubernetesRunAsUserStrategyOptionsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public KubernetesRunAsUserStrategyOptionsBuilder(){
            this(true);
    }
    public KubernetesRunAsUserStrategyOptionsBuilder(Boolean validationEnabled){
            this(new KubernetesRunAsUserStrategyOptions(), validationEnabled);
    }
    public KubernetesRunAsUserStrategyOptionsBuilder(KubernetesRunAsUserStrategyOptionsFluent<?> fluent){
            this(fluent, true);
    }
    public KubernetesRunAsUserStrategyOptionsBuilder(KubernetesRunAsUserStrategyOptionsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new KubernetesRunAsUserStrategyOptions(), validationEnabled);
    }
    public KubernetesRunAsUserStrategyOptionsBuilder(KubernetesRunAsUserStrategyOptionsFluent<?> fluent,KubernetesRunAsUserStrategyOptions instance){
            this(fluent, instance, true);
    }
    public KubernetesRunAsUserStrategyOptionsBuilder(KubernetesRunAsUserStrategyOptionsFluent<?> fluent,KubernetesRunAsUserStrategyOptions instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRanges(instance.getRanges()); 
            fluent.withRule(instance.getRule()); 
            this.validationEnabled = validationEnabled; 
    }
    public KubernetesRunAsUserStrategyOptionsBuilder(KubernetesRunAsUserStrategyOptions instance){
            this(instance,true);
    }
    public KubernetesRunAsUserStrategyOptionsBuilder(KubernetesRunAsUserStrategyOptions instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRanges(instance.getRanges()); 
            this.withRule(instance.getRule()); 
            this.validationEnabled = validationEnabled; 
    }
    public KubernetesRunAsUserStrategyOptionsBuilder(Validator validator){
            this(new KubernetesRunAsUserStrategyOptions(), true);
    }
    public KubernetesRunAsUserStrategyOptionsBuilder(KubernetesRunAsUserStrategyOptionsFluent<?> fluent,KubernetesRunAsUserStrategyOptions instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRanges(instance.getRanges()); 
            fluent.withRule(instance.getRule()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public KubernetesRunAsUserStrategyOptionsBuilder(KubernetesRunAsUserStrategyOptions instance,Validator validator){
            this.fluent = this; 
            this.withRanges(instance.getRanges()); 
            this.withRule(instance.getRule()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public KubernetesRunAsUserStrategyOptions build(){
            KubernetesRunAsUserStrategyOptions buildable = new KubernetesRunAsUserStrategyOptions(fluent.getRanges(),fluent.getRule());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            KubernetesRunAsUserStrategyOptionsBuilder that = (KubernetesRunAsUserStrategyOptionsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
