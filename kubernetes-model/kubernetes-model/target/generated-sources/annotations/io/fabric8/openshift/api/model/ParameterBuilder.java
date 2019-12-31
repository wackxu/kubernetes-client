package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ParameterBuilder extends ParameterFluentImpl<ParameterBuilder> implements VisitableBuilder<Parameter,ParameterBuilder>{

    ParameterFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ParameterBuilder(){
            this(true);
    }
    public ParameterBuilder(Boolean validationEnabled){
            this(new Parameter(), validationEnabled);
    }
    public ParameterBuilder(ParameterFluent<?> fluent){
            this(fluent, true);
    }
    public ParameterBuilder(ParameterFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Parameter(), validationEnabled);
    }
    public ParameterBuilder(ParameterFluent<?> fluent,Parameter instance){
            this(fluent, instance, true);
    }
    public ParameterBuilder(ParameterFluent<?> fluent,Parameter instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDescription(instance.getDescription()); 
            fluent.withDisplayName(instance.getDisplayName()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withGenerate(instance.getGenerate()); 
            fluent.withName(instance.getName()); 
            fluent.withRequired(instance.getRequired()); 
            fluent.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public ParameterBuilder(Parameter instance){
            this(instance,true);
    }
    public ParameterBuilder(Parameter instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDescription(instance.getDescription()); 
            this.withDisplayName(instance.getDisplayName()); 
            this.withFrom(instance.getFrom()); 
            this.withGenerate(instance.getGenerate()); 
            this.withName(instance.getName()); 
            this.withRequired(instance.getRequired()); 
            this.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public ParameterBuilder(Validator validator){
            this(new Parameter(), true);
    }
    public ParameterBuilder(ParameterFluent<?> fluent,Parameter instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDescription(instance.getDescription()); 
            fluent.withDisplayName(instance.getDisplayName()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withGenerate(instance.getGenerate()); 
            fluent.withName(instance.getName()); 
            fluent.withRequired(instance.getRequired()); 
            fluent.withValue(instance.getValue()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ParameterBuilder(Parameter instance,Validator validator){
            this.fluent = this; 
            this.withDescription(instance.getDescription()); 
            this.withDisplayName(instance.getDisplayName()); 
            this.withFrom(instance.getFrom()); 
            this.withGenerate(instance.getGenerate()); 
            this.withName(instance.getName()); 
            this.withRequired(instance.getRequired()); 
            this.withValue(instance.getValue()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Parameter build(){
            Parameter buildable = new Parameter(fluent.getDescription(),fluent.getDisplayName(),fluent.getFrom(),fluent.getGenerate(),fluent.getName(),fluent.isRequired(),fluent.getValue());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ParameterBuilder that = (ParameterBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
