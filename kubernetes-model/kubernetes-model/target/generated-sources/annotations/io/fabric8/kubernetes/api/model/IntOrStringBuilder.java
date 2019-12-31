package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class IntOrStringBuilder extends IntOrStringFluentImpl<IntOrStringBuilder> implements VisitableBuilder<IntOrString,IntOrStringBuilder>{

    IntOrStringFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public IntOrStringBuilder(){
            this(true);
    }
    public IntOrStringBuilder(Boolean validationEnabled){
            this(new IntOrString(), validationEnabled);
    }
    public IntOrStringBuilder(IntOrStringFluent<?> fluent){
            this(fluent, true);
    }
    public IntOrStringBuilder(IntOrStringFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new IntOrString(), validationEnabled);
    }
    public IntOrStringBuilder(IntOrStringFluent<?> fluent,IntOrString instance){
            this(fluent, instance, true);
    }
    public IntOrStringBuilder(IntOrStringFluent<?> fluent,IntOrString instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withIntVal(instance.getIntVal()); 
            fluent.withKind(instance.getKind()); 
            fluent.withStrVal(instance.getStrVal()); 
            fluent.withAdditionalProperties(instance.getAdditionalProperties()); 
            fluent.withIntVal(instance.getIntVal());

            fluent.withKind(instance.getKind());

            fluent.withStrVal(instance.getStrVal());

            this.validationEnabled = validationEnabled; 
    }
    public IntOrStringBuilder(IntOrString instance){
            this(instance,true);
    }
    public IntOrStringBuilder(IntOrString instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withIntVal(instance.getIntVal()); 
            this.withKind(instance.getKind()); 
            this.withStrVal(instance.getStrVal()); 
            this.withAdditionalProperties(instance.getAdditionalProperties()); 
            this.withIntVal(instance.getIntVal());

            this.withKind(instance.getKind());

            this.withStrVal(instance.getStrVal());

            this.validationEnabled = validationEnabled; 
    }
    public IntOrStringBuilder(Validator validator){
            this(new IntOrString(), true);
    }
    public IntOrStringBuilder(IntOrStringFluent<?> fluent,IntOrString instance,Validator validator){
            this.fluent = fluent; 
            fluent.withIntVal(instance.getIntVal()); 
            fluent.withKind(instance.getKind()); 
            fluent.withStrVal(instance.getStrVal()); 
            fluent.withAdditionalProperties(instance.getAdditionalProperties()); 
            fluent.withIntVal(instance.getIntVal());

            fluent.withKind(instance.getKind());

            fluent.withStrVal(instance.getStrVal());

            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public IntOrStringBuilder(IntOrString instance,Validator validator){
            this.fluent = this; 
            this.withIntVal(instance.getIntVal()); 
            this.withKind(instance.getKind()); 
            this.withStrVal(instance.getStrVal()); 
            this.withAdditionalProperties(instance.getAdditionalProperties()); 
            this.withIntVal(instance.getIntVal());

            this.withKind(instance.getKind());

            this.withStrVal(instance.getStrVal());

            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public IntOrString build(){
            IntOrString buildable = new IntOrString(fluent.getIntVal(),fluent.getKind(),fluent.getStrVal(),fluent.getAdditionalProperties());
            buildable.setIntVal(fluent.getIntVal());
            buildable.setKind(fluent.getKind());
            buildable.setStrVal(fluent.getStrVal());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IntOrStringBuilder that = (IntOrStringBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
