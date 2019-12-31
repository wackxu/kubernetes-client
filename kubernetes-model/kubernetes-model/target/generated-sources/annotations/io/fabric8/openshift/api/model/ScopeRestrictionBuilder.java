package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ScopeRestrictionBuilder extends ScopeRestrictionFluentImpl<ScopeRestrictionBuilder> implements VisitableBuilder<ScopeRestriction,ScopeRestrictionBuilder>{

    ScopeRestrictionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ScopeRestrictionBuilder(){
            this(true);
    }
    public ScopeRestrictionBuilder(Boolean validationEnabled){
            this(new ScopeRestriction(), validationEnabled);
    }
    public ScopeRestrictionBuilder(ScopeRestrictionFluent<?> fluent){
            this(fluent, true);
    }
    public ScopeRestrictionBuilder(ScopeRestrictionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ScopeRestriction(), validationEnabled);
    }
    public ScopeRestrictionBuilder(ScopeRestrictionFluent<?> fluent,ScopeRestriction instance){
            this(fluent, instance, true);
    }
    public ScopeRestrictionBuilder(ScopeRestrictionFluent<?> fluent,ScopeRestriction instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withClusterRole(instance.getClusterRole()); 
            fluent.withLiterals(instance.getLiterals()); 
            this.validationEnabled = validationEnabled; 
    }
    public ScopeRestrictionBuilder(ScopeRestriction instance){
            this(instance,true);
    }
    public ScopeRestrictionBuilder(ScopeRestriction instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withClusterRole(instance.getClusterRole()); 
            this.withLiterals(instance.getLiterals()); 
            this.validationEnabled = validationEnabled; 
    }
    public ScopeRestrictionBuilder(Validator validator){
            this(new ScopeRestriction(), true);
    }
    public ScopeRestrictionBuilder(ScopeRestrictionFluent<?> fluent,ScopeRestriction instance,Validator validator){
            this.fluent = fluent; 
            fluent.withClusterRole(instance.getClusterRole()); 
            fluent.withLiterals(instance.getLiterals()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ScopeRestrictionBuilder(ScopeRestriction instance,Validator validator){
            this.fluent = this; 
            this.withClusterRole(instance.getClusterRole()); 
            this.withLiterals(instance.getLiterals()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ScopeRestriction build(){
            ScopeRestriction buildable = new ScopeRestriction(fluent.getClusterRole(),fluent.getLiterals());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ScopeRestrictionBuilder that = (ScopeRestrictionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
