package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface DeploymentDetailsFluent<A extends DeploymentDetailsFluent<A>> extends Fluent<A>{


    public A addToCauses(int index,DeploymentCause item);
    public A setToCauses(int index,DeploymentCause item);
    public A addToCauses(DeploymentCause... items);
    public A addAllToCauses(Collection<DeploymentCause> items);
    public A removeFromCauses(DeploymentCause... items);
    public A removeAllFromCauses(Collection<DeploymentCause> items);
    
/**
 * This method has been deprecated, please use method buildCauses instead.
 * @return The buildable object.
 */
@Deprecated public List<DeploymentCause> getCauses();
    public List<DeploymentCause> buildCauses();
    public DeploymentCause buildCause(int index);
    public DeploymentCause buildFirstCause();
    public DeploymentCause buildLastCause();
    public DeploymentCause buildMatchingCause(io.fabric8.kubernetes.api.builder.Predicate<DeploymentCauseBuilder> predicate);
    public A withCauses(List<DeploymentCause> causes);
    public A withCauses(DeploymentCause... causes);
    public Boolean hasCauses();
    public DeploymentDetailsFluent.CausesNested<A> addNewCause();
    public DeploymentDetailsFluent.CausesNested<A> addNewCauseLike(DeploymentCause item);
    public DeploymentDetailsFluent.CausesNested<A> setNewCauseLike(int index,DeploymentCause item);
    public DeploymentDetailsFluent.CausesNested<A> editCause(int index);
    public DeploymentDetailsFluent.CausesNested<A> editFirstCause();
    public DeploymentDetailsFluent.CausesNested<A> editLastCause();
    public DeploymentDetailsFluent.CausesNested<A> editMatchingCause(io.fabric8.kubernetes.api.builder.Predicate<DeploymentCauseBuilder> predicate);
    public String getMessage();
    public A withMessage(String message);
    public Boolean hasMessage();

    public interface CausesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentCauseFluent<DeploymentDetailsFluent.CausesNested<N>>{

        
    public N and();    public N endCause();
}


}
