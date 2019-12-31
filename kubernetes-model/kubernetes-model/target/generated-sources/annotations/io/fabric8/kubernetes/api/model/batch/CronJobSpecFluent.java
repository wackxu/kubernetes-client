package io.fabric8.kubernetes.api.model.batch;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface CronJobSpecFluent<A extends CronJobSpecFluent<A>> extends Fluent<A>{


    public String getConcurrencyPolicy();
    public A withConcurrencyPolicy(String concurrencyPolicy);
    public Boolean hasConcurrencyPolicy();
    public Integer getFailedJobsHistoryLimit();
    public A withFailedJobsHistoryLimit(Integer failedJobsHistoryLimit);
    public Boolean hasFailedJobsHistoryLimit();
    
/**
 * This method has been deprecated, please use method buildJobTemplate instead.
 * @return The buildable object.
 */
@Deprecated public JobTemplateSpec getJobTemplate();
    public JobTemplateSpec buildJobTemplate();
    public A withJobTemplate(JobTemplateSpec jobTemplate);
    public Boolean hasJobTemplate();
    public CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplate();
    public CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplateLike(JobTemplateSpec item);
    public CronJobSpecFluent.JobTemplateNested<A> editJobTemplate();
    public CronJobSpecFluent.JobTemplateNested<A> editOrNewJobTemplate();
    public CronJobSpecFluent.JobTemplateNested<A> editOrNewJobTemplateLike(JobTemplateSpec item);
    public String getSchedule();
    public A withSchedule(String schedule);
    public Boolean hasSchedule();
    public Long getStartingDeadlineSeconds();
    public A withStartingDeadlineSeconds(Long startingDeadlineSeconds);
    public Boolean hasStartingDeadlineSeconds();
    public A withNewStartingDeadlineSeconds(String arg1);
    public A withNewStartingDeadlineSeconds(long arg1);
    public Integer getSuccessfulJobsHistoryLimit();
    public A withSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit);
    public Boolean hasSuccessfulJobsHistoryLimit();
    public Boolean isSuspend();
    public A withSuspend(Boolean suspend);
    public Boolean hasSuspend();
    public A withNewSuspend(String arg1);
    public A withNewSuspend(boolean arg1);

    public interface JobTemplateNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobTemplateSpecFluent<CronJobSpecFluent.JobTemplateNested<N>>{

        
    public N and();    public N endJobTemplate();
}


}
