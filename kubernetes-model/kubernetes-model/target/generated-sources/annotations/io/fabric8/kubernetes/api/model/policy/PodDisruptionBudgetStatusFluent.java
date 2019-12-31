package io.fabric8.kubernetes.api.model.policy;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

public interface PodDisruptionBudgetStatusFluent<A extends PodDisruptionBudgetStatusFluent<A>> extends Fluent<A>{


    public Integer getCurrentHealthy();
    public A withCurrentHealthy(Integer currentHealthy);
    public Boolean hasCurrentHealthy();
    public Integer getDesiredHealthy();
    public A withDesiredHealthy(Integer desiredHealthy);
    public Boolean hasDesiredHealthy();
    public A addToDisruptedPods(String key,String value);
    public A addToDisruptedPods(Map<String,String> map);
    public A removeFromDisruptedPods(String key);
    public A removeFromDisruptedPods(Map<String,String> map);
    public Map<String,String> getDisruptedPods();
    public A withDisruptedPods(Map<String,String> disruptedPods);
    public Boolean hasDisruptedPods();
    public Integer getDisruptionsAllowed();
    public A withDisruptionsAllowed(Integer disruptionsAllowed);
    public Boolean hasDisruptionsAllowed();
    public Integer getExpectedPods();
    public A withExpectedPods(Integer expectedPods);
    public Boolean hasExpectedPods();
    public Long getObservedGeneration();
    public A withObservedGeneration(Long observedGeneration);
    public Boolean hasObservedGeneration();
    public A withNewObservedGeneration(String arg1);
    public A withNewObservedGeneration(long arg1);



}
