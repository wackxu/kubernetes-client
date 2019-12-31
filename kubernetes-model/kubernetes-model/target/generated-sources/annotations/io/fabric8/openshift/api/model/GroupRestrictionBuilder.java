package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class GroupRestrictionBuilder extends GroupRestrictionFluentImpl<GroupRestrictionBuilder> implements VisitableBuilder<GroupRestriction,GroupRestrictionBuilder>{

    GroupRestrictionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public GroupRestrictionBuilder(){
            this(true);
    }
    public GroupRestrictionBuilder(Boolean validationEnabled){
            this(new GroupRestriction(), validationEnabled);
    }
    public GroupRestrictionBuilder(GroupRestrictionFluent<?> fluent){
            this(fluent, true);
    }
    public GroupRestrictionBuilder(GroupRestrictionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new GroupRestriction(), validationEnabled);
    }
    public GroupRestrictionBuilder(GroupRestrictionFluent<?> fluent,GroupRestriction instance){
            this(fluent, instance, true);
    }
    public GroupRestrictionBuilder(GroupRestrictionFluent<?> fluent,GroupRestriction instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withGroups(instance.getGroups()); 
            fluent.withLabels(instance.getLabels()); 
            this.validationEnabled = validationEnabled; 
    }
    public GroupRestrictionBuilder(GroupRestriction instance){
            this(instance,true);
    }
    public GroupRestrictionBuilder(GroupRestriction instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withGroups(instance.getGroups()); 
            this.withLabels(instance.getLabels()); 
            this.validationEnabled = validationEnabled; 
    }
    public GroupRestrictionBuilder(Validator validator){
            this(new GroupRestriction(), true);
    }
    public GroupRestrictionBuilder(GroupRestrictionFluent<?> fluent,GroupRestriction instance,Validator validator){
            this.fluent = fluent; 
            fluent.withGroups(instance.getGroups()); 
            fluent.withLabels(instance.getLabels()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public GroupRestrictionBuilder(GroupRestriction instance,Validator validator){
            this.fluent = this; 
            this.withGroups(instance.getGroups()); 
            this.withLabels(instance.getLabels()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public GroupRestriction build(){
            GroupRestriction buildable = new GroupRestriction(fluent.getGroups(),fluent.getLabels());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GroupRestrictionBuilder that = (GroupRestrictionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
