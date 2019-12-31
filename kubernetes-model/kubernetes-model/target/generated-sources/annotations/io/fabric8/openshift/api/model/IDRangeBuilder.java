package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class IDRangeBuilder extends io.fabric8.openshift.api.model.IDRangeFluentImpl<io.fabric8.openshift.api.model.IDRangeBuilder> implements VisitableBuilder<io.fabric8.openshift.api.model.IDRange,io.fabric8.openshift.api.model.IDRangeBuilder>{

    io.fabric8.openshift.api.model.IDRangeFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public IDRangeBuilder(){
            this(true);
    }
    public IDRangeBuilder(Boolean validationEnabled){
            this(new IDRange(), validationEnabled);
    }
    public IDRangeBuilder(io.fabric8.openshift.api.model.IDRangeFluent<?> fluent){
            this(fluent, true);
    }
    public IDRangeBuilder(io.fabric8.openshift.api.model.IDRangeFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new IDRange(), validationEnabled);
    }
    public IDRangeBuilder(io.fabric8.openshift.api.model.IDRangeFluent<?> fluent,io.fabric8.openshift.api.model.IDRange instance){
            this(fluent, instance, true);
    }
    public IDRangeBuilder(io.fabric8.openshift.api.model.IDRangeFluent<?> fluent,io.fabric8.openshift.api.model.IDRange instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMax(instance.getMax()); 
            fluent.withMin(instance.getMin()); 
            this.validationEnabled = validationEnabled; 
    }
    public IDRangeBuilder(io.fabric8.openshift.api.model.IDRange instance){
            this(instance,true);
    }
    public IDRangeBuilder(io.fabric8.openshift.api.model.IDRange instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMax(instance.getMax()); 
            this.withMin(instance.getMin()); 
            this.validationEnabled = validationEnabled; 
    }
    public IDRangeBuilder(Validator validator){
            this(new IDRange(), true);
    }
    public IDRangeBuilder(io.fabric8.openshift.api.model.IDRangeFluent<?> fluent,io.fabric8.openshift.api.model.IDRange instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMax(instance.getMax()); 
            fluent.withMin(instance.getMin()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public IDRangeBuilder(io.fabric8.openshift.api.model.IDRange instance,Validator validator){
            this.fluent = this; 
            this.withMax(instance.getMax()); 
            this.withMin(instance.getMin()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public io.fabric8.openshift.api.model.IDRange build(){
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
