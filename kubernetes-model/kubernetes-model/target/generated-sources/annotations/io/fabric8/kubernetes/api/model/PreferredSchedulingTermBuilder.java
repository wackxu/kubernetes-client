package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PreferredSchedulingTermBuilder extends PreferredSchedulingTermFluentImpl<PreferredSchedulingTermBuilder> implements VisitableBuilder<PreferredSchedulingTerm,PreferredSchedulingTermBuilder>{

    PreferredSchedulingTermFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PreferredSchedulingTermBuilder(){
            this(true);
    }
    public PreferredSchedulingTermBuilder(Boolean validationEnabled){
            this(new PreferredSchedulingTerm(), validationEnabled);
    }
    public PreferredSchedulingTermBuilder(PreferredSchedulingTermFluent<?> fluent){
            this(fluent, true);
    }
    public PreferredSchedulingTermBuilder(PreferredSchedulingTermFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PreferredSchedulingTerm(), validationEnabled);
    }
    public PreferredSchedulingTermBuilder(PreferredSchedulingTermFluent<?> fluent,PreferredSchedulingTerm instance){
            this(fluent, instance, true);
    }
    public PreferredSchedulingTermBuilder(PreferredSchedulingTermFluent<?> fluent,PreferredSchedulingTerm instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPreference(instance.getPreference()); 
            fluent.withWeight(instance.getWeight()); 
            this.validationEnabled = validationEnabled; 
    }
    public PreferredSchedulingTermBuilder(PreferredSchedulingTerm instance){
            this(instance,true);
    }
    public PreferredSchedulingTermBuilder(PreferredSchedulingTerm instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPreference(instance.getPreference()); 
            this.withWeight(instance.getWeight()); 
            this.validationEnabled = validationEnabled; 
    }
    public PreferredSchedulingTermBuilder(Validator validator){
            this(new PreferredSchedulingTerm(), true);
    }
    public PreferredSchedulingTermBuilder(PreferredSchedulingTermFluent<?> fluent,PreferredSchedulingTerm instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPreference(instance.getPreference()); 
            fluent.withWeight(instance.getWeight()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PreferredSchedulingTermBuilder(PreferredSchedulingTerm instance,Validator validator){
            this.fluent = this; 
            this.withPreference(instance.getPreference()); 
            this.withWeight(instance.getWeight()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PreferredSchedulingTerm build(){
            PreferredSchedulingTerm buildable = new PreferredSchedulingTerm(fluent.getPreference(),fluent.getWeight());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PreferredSchedulingTermBuilder that = (PreferredSchedulingTermBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
