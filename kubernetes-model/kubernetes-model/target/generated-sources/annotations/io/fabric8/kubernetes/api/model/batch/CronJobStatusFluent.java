package io.fabric8.kubernetes.api.model.batch;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface CronJobStatusFluent<A extends CronJobStatusFluent<A>> extends Fluent<A>{


    public A addToActive(int index,ObjectReference item);
    public A setToActive(int index,ObjectReference item);
    public A addToActive(ObjectReference... items);
    public A addAllToActive(Collection<ObjectReference> items);
    public A removeFromActive(ObjectReference... items);
    public A removeAllFromActive(Collection<ObjectReference> items);
    
/**
 * This method has been deprecated, please use method buildActive instead.
 * @return The buildable object.
 */
@Deprecated public List<ObjectReference> getActive();
    public List<ObjectReference> buildActive();
    public ObjectReference buildActive(int index);
    public ObjectReference buildFirstActive();
    public ObjectReference buildLastActive();
    public ObjectReference buildMatchingActive(io.fabric8.kubernetes.api.builder.Predicate<ObjectReferenceBuilder> predicate);
    public A withActive(List<ObjectReference> active);
    public A withActive(ObjectReference... active);
    public Boolean hasActive();
    public CronJobStatusFluent.ActiveNested<A> addNewActive();
    public CronJobStatusFluent.ActiveNested<A> addNewActiveLike(ObjectReference item);
    public CronJobStatusFluent.ActiveNested<A> setNewActiveLike(int index,ObjectReference item);
    public CronJobStatusFluent.ActiveNested<A> editActive(int index);
    public CronJobStatusFluent.ActiveNested<A> editFirstActive();
    public CronJobStatusFluent.ActiveNested<A> editLastActive();
    public CronJobStatusFluent.ActiveNested<A> editMatchingActive(io.fabric8.kubernetes.api.builder.Predicate<ObjectReferenceBuilder> predicate);
    public String getLastScheduleTime();
    public A withLastScheduleTime(String lastScheduleTime);
    public Boolean hasLastScheduleTime();

    public interface ActiveNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<CronJobStatusFluent.ActiveNested<N>>{

        
    public N and();    public N endActive();
}


}
