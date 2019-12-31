package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SubjectBuilder extends SubjectFluentImpl<SubjectBuilder> implements VisitableBuilder<Subject,SubjectBuilder>{

    SubjectFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SubjectBuilder(){
            this(true);
    }
    public SubjectBuilder(Boolean validationEnabled){
            this(new Subject(), validationEnabled);
    }
    public SubjectBuilder(SubjectFluent<?> fluent){
            this(fluent, true);
    }
    public SubjectBuilder(SubjectFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Subject(), validationEnabled);
    }
    public SubjectBuilder(SubjectFluent<?> fluent,Subject instance){
            this(fluent, instance, true);
    }
    public SubjectBuilder(SubjectFluent<?> fluent,Subject instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiGroup(instance.getApiGroup()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            this.validationEnabled = validationEnabled; 
    }
    public SubjectBuilder(Subject instance){
            this(instance,true);
    }
    public SubjectBuilder(Subject instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiGroup(instance.getApiGroup()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.validationEnabled = validationEnabled; 
    }
    public SubjectBuilder(Validator validator){
            this(new Subject(), true);
    }
    public SubjectBuilder(SubjectFluent<?> fluent,Subject instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiGroup(instance.getApiGroup()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SubjectBuilder(Subject instance,Validator validator){
            this.fluent = this; 
            this.withApiGroup(instance.getApiGroup()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Subject build(){
            Subject buildable = new Subject(fluent.getApiGroup(),fluent.getKind(),fluent.getName(),fluent.getNamespace());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SubjectBuilder that = (SubjectBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
