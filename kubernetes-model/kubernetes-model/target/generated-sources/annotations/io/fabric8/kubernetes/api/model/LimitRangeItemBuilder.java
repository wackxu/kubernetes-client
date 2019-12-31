package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class LimitRangeItemBuilder extends LimitRangeItemFluentImpl<LimitRangeItemBuilder> implements VisitableBuilder<LimitRangeItem,LimitRangeItemBuilder>{

    LimitRangeItemFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public LimitRangeItemBuilder(){
            this(true);
    }
    public LimitRangeItemBuilder(Boolean validationEnabled){
            this(new LimitRangeItem(), validationEnabled);
    }
    public LimitRangeItemBuilder(LimitRangeItemFluent<?> fluent){
            this(fluent, true);
    }
    public LimitRangeItemBuilder(LimitRangeItemFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new LimitRangeItem(), validationEnabled);
    }
    public LimitRangeItemBuilder(LimitRangeItemFluent<?> fluent,LimitRangeItem instance){
            this(fluent, instance, true);
    }
    public LimitRangeItemBuilder(LimitRangeItemFluent<?> fluent,LimitRangeItem instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDefault(instance.getDefault()); 
            fluent.withDefaultRequest(instance.getDefaultRequest()); 
            fluent.withMax(instance.getMax()); 
            fluent.withMaxLimitRequestRatio(instance.getMaxLimitRequestRatio()); 
            fluent.withMin(instance.getMin()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public LimitRangeItemBuilder(LimitRangeItem instance){
            this(instance,true);
    }
    public LimitRangeItemBuilder(LimitRangeItem instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDefault(instance.getDefault()); 
            this.withDefaultRequest(instance.getDefaultRequest()); 
            this.withMax(instance.getMax()); 
            this.withMaxLimitRequestRatio(instance.getMaxLimitRequestRatio()); 
            this.withMin(instance.getMin()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public LimitRangeItemBuilder(Validator validator){
            this(new LimitRangeItem(), true);
    }
    public LimitRangeItemBuilder(LimitRangeItemFluent<?> fluent,LimitRangeItem instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDefault(instance.getDefault()); 
            fluent.withDefaultRequest(instance.getDefaultRequest()); 
            fluent.withMax(instance.getMax()); 
            fluent.withMaxLimitRequestRatio(instance.getMaxLimitRequestRatio()); 
            fluent.withMin(instance.getMin()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public LimitRangeItemBuilder(LimitRangeItem instance,Validator validator){
            this.fluent = this; 
            this.withDefault(instance.getDefault()); 
            this.withDefaultRequest(instance.getDefaultRequest()); 
            this.withMax(instance.getMax()); 
            this.withMaxLimitRequestRatio(instance.getMaxLimitRequestRatio()); 
            this.withMin(instance.getMin()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public LimitRangeItem build(){
            LimitRangeItem buildable = new LimitRangeItem(fluent.getDefault(),fluent.getDefaultRequest(),fluent.getMax(),fluent.getMaxLimitRequestRatio(),fluent.getMin(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LimitRangeItemBuilder that = (LimitRangeItemBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
