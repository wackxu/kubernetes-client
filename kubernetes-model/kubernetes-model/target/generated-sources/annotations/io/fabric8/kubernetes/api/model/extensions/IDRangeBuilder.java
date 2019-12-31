package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class IDRangeBuilder extends IDRangeFluentImpl<IDRangeBuilder> implements VisitableBuilder<IDRange,IDRangeBuilder>{

    IDRangeFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public IDRangeBuilder(){
            this(true);
    }
    public IDRangeBuilder(Boolean validationEnabled){
            this(new IDRange(), validationEnabled);
    }
    public IDRangeBuilder(IDRangeFluent<?> fluent){
            this(fluent, true);
    }
    public IDRangeBuilder(IDRangeFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new IDRange(), validationEnabled);
    }
    public IDRangeBuilder(IDRangeFluent<?> fluent,IDRange instance){
            this(fluent, instance, true);
    }
    public IDRangeBuilder(IDRangeFluent<?> fluent,IDRange instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMax(instance.getMax()); 
            fluent.withMin(instance.getMin()); 
            this.validationEnabled = validationEnabled; 
    }
    public IDRangeBuilder(IDRange instance){
            this(instance,true);
    }
    public IDRangeBuilder(IDRange instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMax(instance.getMax()); 
            this.withMin(instance.getMin()); 
            this.validationEnabled = validationEnabled; 
    }
    public IDRangeBuilder(Validator validator){
            this(new IDRange(), true);
    }
    public IDRangeBuilder(IDRangeFluent<?> fluent,IDRange instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMax(instance.getMax()); 
            fluent.withMin(instance.getMin()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public IDRangeBuilder(IDRange instance,Validator validator){
            this.fluent = this; 
            this.withMax(instance.getMax()); 
            this.withMin(instance.getMin()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public IDRange build(){
            IDRange buildable = new IDRange(fluent.getMax(),fluent.getMin());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IDRangeBuilder that = (IDRangeBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
