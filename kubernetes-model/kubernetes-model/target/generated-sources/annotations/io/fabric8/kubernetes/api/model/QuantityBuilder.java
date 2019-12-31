package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class QuantityBuilder extends QuantityFluentImpl<QuantityBuilder> implements VisitableBuilder<Quantity,QuantityBuilder>{

    QuantityFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public QuantityBuilder(){
            this(true);
    }
    public QuantityBuilder(Boolean validationEnabled){
            this(new Quantity(), validationEnabled);
    }
    public QuantityBuilder(QuantityFluent<?> fluent){
            this(fluent, true);
    }
    public QuantityBuilder(QuantityFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Quantity(), validationEnabled);
    }
    public QuantityBuilder(QuantityFluent<?> fluent,Quantity instance){
            this(fluent, instance, true);
    }
    public QuantityBuilder(QuantityFluent<?> fluent,Quantity instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAmount(instance.getAmount()); 
            fluent.withFormat(instance.getFormat());

            this.validationEnabled = validationEnabled; 
    }
    public QuantityBuilder(Quantity instance){
            this(instance,true);
    }
    public QuantityBuilder(Quantity instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAmount(instance.getAmount()); 
            this.withFormat(instance.getFormat());

            this.validationEnabled = validationEnabled; 
    }
    public QuantityBuilder(Validator validator){
            this(new Quantity(), true);
    }
    public QuantityBuilder(QuantityFluent<?> fluent,Quantity instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAmount(instance.getAmount()); 
            fluent.withFormat(instance.getFormat());

            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public QuantityBuilder(Quantity instance,Validator validator){
            this.fluent = this; 
            this.withAmount(instance.getAmount()); 
            this.withFormat(instance.getFormat());

            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Quantity build(){
            Quantity buildable = new Quantity(fluent.getAmount());
            buildable.setFormat(fluent.getFormat());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            QuantityBuilder that = (QuantityBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
