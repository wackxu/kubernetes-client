package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ScopeSelectorBuilder extends ScopeSelectorFluentImpl<ScopeSelectorBuilder> implements VisitableBuilder<ScopeSelector,ScopeSelectorBuilder>{

    ScopeSelectorFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ScopeSelectorBuilder(){
            this(true);
    }
    public ScopeSelectorBuilder(Boolean validationEnabled){
            this(new ScopeSelector(), validationEnabled);
    }
    public ScopeSelectorBuilder(ScopeSelectorFluent<?> fluent){
            this(fluent, true);
    }
    public ScopeSelectorBuilder(ScopeSelectorFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ScopeSelector(), validationEnabled);
    }
    public ScopeSelectorBuilder(ScopeSelectorFluent<?> fluent,ScopeSelector instance){
            this(fluent, instance, true);
    }
    public ScopeSelectorBuilder(ScopeSelectorFluent<?> fluent,ScopeSelector instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMatchExpressions(instance.getMatchExpressions()); 
            this.validationEnabled = validationEnabled; 
    }
    public ScopeSelectorBuilder(ScopeSelector instance){
            this(instance,true);
    }
    public ScopeSelectorBuilder(ScopeSelector instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMatchExpressions(instance.getMatchExpressions()); 
            this.validationEnabled = validationEnabled; 
    }
    public ScopeSelectorBuilder(Validator validator){
            this(new ScopeSelector(), true);
    }
    public ScopeSelectorBuilder(ScopeSelectorFluent<?> fluent,ScopeSelector instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMatchExpressions(instance.getMatchExpressions()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ScopeSelectorBuilder(ScopeSelector instance,Validator validator){
            this.fluent = this; 
            this.withMatchExpressions(instance.getMatchExpressions()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ScopeSelector build(){
            ScopeSelector buildable = new ScopeSelector(fluent.getMatchExpressions());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ScopeSelectorBuilder that = (ScopeSelectorBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
