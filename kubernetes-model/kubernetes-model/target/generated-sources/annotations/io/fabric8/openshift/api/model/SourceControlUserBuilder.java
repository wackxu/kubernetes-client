package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SourceControlUserBuilder extends SourceControlUserFluentImpl<SourceControlUserBuilder> implements VisitableBuilder<SourceControlUser,SourceControlUserBuilder>{

    SourceControlUserFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SourceControlUserBuilder(){
            this(true);
    }
    public SourceControlUserBuilder(Boolean validationEnabled){
            this(new SourceControlUser(), validationEnabled);
    }
    public SourceControlUserBuilder(SourceControlUserFluent<?> fluent){
            this(fluent, true);
    }
    public SourceControlUserBuilder(SourceControlUserFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SourceControlUser(), validationEnabled);
    }
    public SourceControlUserBuilder(SourceControlUserFluent<?> fluent,SourceControlUser instance){
            this(fluent, instance, true);
    }
    public SourceControlUserBuilder(SourceControlUserFluent<?> fluent,SourceControlUser instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withEmail(instance.getEmail()); 
            fluent.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public SourceControlUserBuilder(SourceControlUser instance){
            this(instance,true);
    }
    public SourceControlUserBuilder(SourceControlUser instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withEmail(instance.getEmail()); 
            this.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public SourceControlUserBuilder(Validator validator){
            this(new SourceControlUser(), true);
    }
    public SourceControlUserBuilder(SourceControlUserFluent<?> fluent,SourceControlUser instance,Validator validator){
            this.fluent = fluent; 
            fluent.withEmail(instance.getEmail()); 
            fluent.withName(instance.getName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SourceControlUserBuilder(SourceControlUser instance,Validator validator){
            this.fluent = this; 
            this.withEmail(instance.getEmail()); 
            this.withName(instance.getName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SourceControlUser build(){
            SourceControlUser buildable = new SourceControlUser(fluent.getEmail(),fluent.getName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SourceControlUserBuilder that = (SourceControlUserBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
