package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class GenericWebHookCauseBuilder extends GenericWebHookCauseFluentImpl<GenericWebHookCauseBuilder> implements VisitableBuilder<GenericWebHookCause,GenericWebHookCauseBuilder>{

    GenericWebHookCauseFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public GenericWebHookCauseBuilder(){
            this(true);
    }
    public GenericWebHookCauseBuilder(Boolean validationEnabled){
            this(new GenericWebHookCause(), validationEnabled);
    }
    public GenericWebHookCauseBuilder(GenericWebHookCauseFluent<?> fluent){
            this(fluent, true);
    }
    public GenericWebHookCauseBuilder(GenericWebHookCauseFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new GenericWebHookCause(), validationEnabled);
    }
    public GenericWebHookCauseBuilder(GenericWebHookCauseFluent<?> fluent,GenericWebHookCause instance){
            this(fluent, instance, true);
    }
    public GenericWebHookCauseBuilder(GenericWebHookCauseFluent<?> fluent,GenericWebHookCause instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRevision(instance.getRevision()); 
            fluent.withSecret(instance.getSecret()); 
            this.validationEnabled = validationEnabled; 
    }
    public GenericWebHookCauseBuilder(GenericWebHookCause instance){
            this(instance,true);
    }
    public GenericWebHookCauseBuilder(GenericWebHookCause instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRevision(instance.getRevision()); 
            this.withSecret(instance.getSecret()); 
            this.validationEnabled = validationEnabled; 
    }
    public GenericWebHookCauseBuilder(Validator validator){
            this(new GenericWebHookCause(), true);
    }
    public GenericWebHookCauseBuilder(GenericWebHookCauseFluent<?> fluent,GenericWebHookCause instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRevision(instance.getRevision()); 
            fluent.withSecret(instance.getSecret()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public GenericWebHookCauseBuilder(GenericWebHookCause instance,Validator validator){
            this.fluent = this; 
            this.withRevision(instance.getRevision()); 
            this.withSecret(instance.getSecret()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public GenericWebHookCause build(){
            GenericWebHookCause buildable = new GenericWebHookCause(fluent.getRevision(),fluent.getSecret());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GenericWebHookCauseBuilder that = (GenericWebHookCauseBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
