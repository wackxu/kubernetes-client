package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TagEventConditionBuilder extends TagEventConditionFluentImpl<TagEventConditionBuilder> implements VisitableBuilder<TagEventCondition,TagEventConditionBuilder>{

    TagEventConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TagEventConditionBuilder(){
            this(true);
    }
    public TagEventConditionBuilder(Boolean validationEnabled){
            this(new TagEventCondition(), validationEnabled);
    }
    public TagEventConditionBuilder(TagEventConditionFluent<?> fluent){
            this(fluent, true);
    }
    public TagEventConditionBuilder(TagEventConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TagEventCondition(), validationEnabled);
    }
    public TagEventConditionBuilder(TagEventConditionFluent<?> fluent,TagEventCondition instance){
            this(fluent, instance, true);
    }
    public TagEventConditionBuilder(TagEventConditionFluent<?> fluent,TagEventCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withGeneration(instance.getGeneration()); 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public TagEventConditionBuilder(TagEventCondition instance){
            this(instance,true);
    }
    public TagEventConditionBuilder(TagEventCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withGeneration(instance.getGeneration()); 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public TagEventConditionBuilder(Validator validator){
            this(new TagEventCondition(), true);
    }
    public TagEventConditionBuilder(TagEventConditionFluent<?> fluent,TagEventCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withGeneration(instance.getGeneration()); 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TagEventConditionBuilder(TagEventCondition instance,Validator validator){
            this.fluent = this; 
            this.withGeneration(instance.getGeneration()); 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TagEventCondition build(){
            TagEventCondition buildable = new TagEventCondition(fluent.getGeneration(),fluent.getLastTransitionTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TagEventConditionBuilder that = (TagEventConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
