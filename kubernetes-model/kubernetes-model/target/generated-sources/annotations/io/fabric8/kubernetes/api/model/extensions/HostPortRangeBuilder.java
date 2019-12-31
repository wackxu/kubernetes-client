package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class HostPortRangeBuilder extends HostPortRangeFluentImpl<HostPortRangeBuilder> implements VisitableBuilder<HostPortRange,HostPortRangeBuilder>{

    HostPortRangeFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public HostPortRangeBuilder(){
            this(true);
    }
    public HostPortRangeBuilder(Boolean validationEnabled){
            this(new HostPortRange(), validationEnabled);
    }
    public HostPortRangeBuilder(HostPortRangeFluent<?> fluent){
            this(fluent, true);
    }
    public HostPortRangeBuilder(HostPortRangeFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new HostPortRange(), validationEnabled);
    }
    public HostPortRangeBuilder(HostPortRangeFluent<?> fluent,HostPortRange instance){
            this(fluent, instance, true);
    }
    public HostPortRangeBuilder(HostPortRangeFluent<?> fluent,HostPortRange instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMax(instance.getMax()); 
            fluent.withMin(instance.getMin()); 
            this.validationEnabled = validationEnabled; 
    }
    public HostPortRangeBuilder(HostPortRange instance){
            this(instance,true);
    }
    public HostPortRangeBuilder(HostPortRange instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMax(instance.getMax()); 
            this.withMin(instance.getMin()); 
            this.validationEnabled = validationEnabled; 
    }
    public HostPortRangeBuilder(Validator validator){
            this(new HostPortRange(), true);
    }
    public HostPortRangeBuilder(HostPortRangeFluent<?> fluent,HostPortRange instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMax(instance.getMax()); 
            fluent.withMin(instance.getMin()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public HostPortRangeBuilder(HostPortRange instance,Validator validator){
            this.fluent = this; 
            this.withMax(instance.getMax()); 
            this.withMin(instance.getMin()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public HostPortRange build(){
            HostPortRange buildable = new HostPortRange(fluent.getMax(),fluent.getMin());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HostPortRangeBuilder that = (HostPortRangeBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
