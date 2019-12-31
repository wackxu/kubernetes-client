package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class LabelSelectorBuilder extends LabelSelectorFluentImpl<LabelSelectorBuilder> implements VisitableBuilder<LabelSelector,LabelSelectorBuilder>{

    LabelSelectorFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public LabelSelectorBuilder(){
            this(true);
    }
    public LabelSelectorBuilder(Boolean validationEnabled){
            this(new LabelSelector(), validationEnabled);
    }
    public LabelSelectorBuilder(LabelSelectorFluent<?> fluent){
            this(fluent, true);
    }
    public LabelSelectorBuilder(LabelSelectorFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new LabelSelector(), validationEnabled);
    }
    public LabelSelectorBuilder(LabelSelectorFluent<?> fluent,LabelSelector instance){
            this(fluent, instance, true);
    }
    public LabelSelectorBuilder(LabelSelectorFluent<?> fluent,LabelSelector instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMatchExpressions(instance.getMatchExpressions()); 
            fluent.withMatchLabels(instance.getMatchLabels()); 
            this.validationEnabled = validationEnabled; 
    }
    public LabelSelectorBuilder(LabelSelector instance){
            this(instance,true);
    }
    public LabelSelectorBuilder(LabelSelector instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMatchExpressions(instance.getMatchExpressions()); 
            this.withMatchLabels(instance.getMatchLabels()); 
            this.validationEnabled = validationEnabled; 
    }
    public LabelSelectorBuilder(Validator validator){
            this(new LabelSelector(), true);
    }
    public LabelSelectorBuilder(LabelSelectorFluent<?> fluent,LabelSelector instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMatchExpressions(instance.getMatchExpressions()); 
            fluent.withMatchLabels(instance.getMatchLabels()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public LabelSelectorBuilder(LabelSelector instance,Validator validator){
            this.fluent = this; 
            this.withMatchExpressions(instance.getMatchExpressions()); 
            this.withMatchLabels(instance.getMatchLabels()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public LabelSelector build(){
            LabelSelector buildable = new LabelSelector(fluent.getMatchExpressions(),fluent.getMatchLabels());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LabelSelectorBuilder that = (LabelSelectorBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
