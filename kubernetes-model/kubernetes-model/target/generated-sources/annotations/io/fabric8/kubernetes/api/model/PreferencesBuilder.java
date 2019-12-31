package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PreferencesBuilder extends PreferencesFluentImpl<PreferencesBuilder> implements VisitableBuilder<Preferences,PreferencesBuilder>{

    PreferencesFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PreferencesBuilder(){
            this(true);
    }
    public PreferencesBuilder(Boolean validationEnabled){
            this(new Preferences(), validationEnabled);
    }
    public PreferencesBuilder(PreferencesFluent<?> fluent){
            this(fluent, true);
    }
    public PreferencesBuilder(PreferencesFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Preferences(), validationEnabled);
    }
    public PreferencesBuilder(PreferencesFluent<?> fluent,Preferences instance){
            this(fluent, instance, true);
    }
    public PreferencesBuilder(PreferencesFluent<?> fluent,Preferences instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withColors(instance.getColors()); 
            fluent.withExtensions(instance.getExtensions()); 
            this.validationEnabled = validationEnabled; 
    }
    public PreferencesBuilder(Preferences instance){
            this(instance,true);
    }
    public PreferencesBuilder(Preferences instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withColors(instance.getColors()); 
            this.withExtensions(instance.getExtensions()); 
            this.validationEnabled = validationEnabled; 
    }
    public PreferencesBuilder(Validator validator){
            this(new Preferences(), true);
    }
    public PreferencesBuilder(PreferencesFluent<?> fluent,Preferences instance,Validator validator){
            this.fluent = fluent; 
            fluent.withColors(instance.getColors()); 
            fluent.withExtensions(instance.getExtensions()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PreferencesBuilder(Preferences instance,Validator validator){
            this.fluent = this; 
            this.withColors(instance.getColors()); 
            this.withExtensions(instance.getExtensions()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Preferences build(){
            Preferences buildable = new Preferences(fluent.isColors(),fluent.getExtensions());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PreferencesBuilder that = (PreferencesBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
