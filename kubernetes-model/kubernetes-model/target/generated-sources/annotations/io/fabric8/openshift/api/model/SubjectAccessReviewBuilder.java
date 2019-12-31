package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SubjectAccessReviewBuilder extends io.fabric8.openshift.api.model.SubjectAccessReviewFluentImpl<io.fabric8.openshift.api.model.SubjectAccessReviewBuilder> implements VisitableBuilder<io.fabric8.openshift.api.model.SubjectAccessReview,io.fabric8.openshift.api.model.SubjectAccessReviewBuilder>{

    io.fabric8.openshift.api.model.SubjectAccessReviewFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SubjectAccessReviewBuilder(){
            this(true);
    }
    public SubjectAccessReviewBuilder(Boolean validationEnabled){
            this(new SubjectAccessReview(), validationEnabled);
    }
    public SubjectAccessReviewBuilder(io.fabric8.openshift.api.model.SubjectAccessReviewFluent<?> fluent){
            this(fluent, true);
    }
    public SubjectAccessReviewBuilder(io.fabric8.openshift.api.model.SubjectAccessReviewFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SubjectAccessReview(), validationEnabled);
    }
    public SubjectAccessReviewBuilder(io.fabric8.openshift.api.model.SubjectAccessReviewFluent<?> fluent,io.fabric8.openshift.api.model.SubjectAccessReview instance){
            this(fluent, instance, true);
    }
    public SubjectAccessReviewBuilder(io.fabric8.openshift.api.model.SubjectAccessReviewFluent<?> fluent,io.fabric8.openshift.api.model.SubjectAccessReview instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withContent(instance.getContent()); 
            fluent.withGroups(instance.getGroups()); 
            fluent.withIsNonResourceURL(instance.getIsNonResourceURL()); 
            fluent.withKind(instance.getKind()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withPath(instance.getPath()); 
            fluent.withResource(instance.getResource()); 
            fluent.withResourceAPIGroup(instance.getResourceAPIGroup()); 
            fluent.withResourceAPIVersion(instance.getResourceAPIVersion()); 
            fluent.withResourceName(instance.getResourceName()); 
            fluent.withScopes(instance.getScopes()); 
            fluent.withUser(instance.getUser()); 
            fluent.withVerb(instance.getVerb()); 
            this.validationEnabled = validationEnabled; 
    }
    public SubjectAccessReviewBuilder(io.fabric8.openshift.api.model.SubjectAccessReview instance){
            this(instance,true);
    }
    public SubjectAccessReviewBuilder(io.fabric8.openshift.api.model.SubjectAccessReview instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withContent(instance.getContent()); 
            this.withGroups(instance.getGroups()); 
            this.withIsNonResourceURL(instance.getIsNonResourceURL()); 
            this.withKind(instance.getKind()); 
            this.withNamespace(instance.getNamespace()); 
            this.withPath(instance.getPath()); 
            this.withResource(instance.getResource()); 
            this.withResourceAPIGroup(instance.getResourceAPIGroup()); 
            this.withResourceAPIVersion(instance.getResourceAPIVersion()); 
            this.withResourceName(instance.getResourceName()); 
            this.withScopes(instance.getScopes()); 
            this.withUser(instance.getUser()); 
            this.withVerb(instance.getVerb()); 
            this.validationEnabled = validationEnabled; 
    }
    public SubjectAccessReviewBuilder(Validator validator){
            this(new SubjectAccessReview(), true);
    }
    public SubjectAccessReviewBuilder(io.fabric8.openshift.api.model.SubjectAccessReviewFluent<?> fluent,io.fabric8.openshift.api.model.SubjectAccessReview instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withContent(instance.getContent()); 
            fluent.withGroups(instance.getGroups()); 
            fluent.withIsNonResourceURL(instance.getIsNonResourceURL()); 
            fluent.withKind(instance.getKind()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withPath(instance.getPath()); 
            fluent.withResource(instance.getResource()); 
            fluent.withResourceAPIGroup(instance.getResourceAPIGroup()); 
            fluent.withResourceAPIVersion(instance.getResourceAPIVersion()); 
            fluent.withResourceName(instance.getResourceName()); 
            fluent.withScopes(instance.getScopes()); 
            fluent.withUser(instance.getUser()); 
            fluent.withVerb(instance.getVerb()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SubjectAccessReviewBuilder(io.fabric8.openshift.api.model.SubjectAccessReview instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withContent(instance.getContent()); 
            this.withGroups(instance.getGroups()); 
            this.withIsNonResourceURL(instance.getIsNonResourceURL()); 
            this.withKind(instance.getKind()); 
            this.withNamespace(instance.getNamespace()); 
            this.withPath(instance.getPath()); 
            this.withResource(instance.getResource()); 
            this.withResourceAPIGroup(instance.getResourceAPIGroup()); 
            this.withResourceAPIVersion(instance.getResourceAPIVersion()); 
            this.withResourceName(instance.getResourceName()); 
            this.withScopes(instance.getScopes()); 
            this.withUser(instance.getUser()); 
            this.withVerb(instance.getVerb()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public io.fabric8.openshift.api.model.SubjectAccessReview build(){
            SubjectAccessReview buildable = new SubjectAccessReview(fluent.getApiVersion(),fluent.getContent(),fluent.getGroups(),fluent.isIsNonResourceURL(),fluent.getKind(),fluent.getNamespace(),fluent.getPath(),fluent.getResource(),fluent.getResourceAPIGroup(),fluent.getResourceAPIVersion(),fluent.getResourceName(),fluent.getScopes(),fluent.getUser(),fluent.getVerb());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SubjectAccessReviewBuilder that = (SubjectAccessReviewBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
