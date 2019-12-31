package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface CustomResourceConversionFluent<A extends CustomResourceConversionFluent<A>> extends Fluent<A>{


    public String getStrategy();
    public A withStrategy(String strategy);
    public Boolean hasStrategy();
    
/**
 * This method has been deprecated, please use method buildWebhookClientConfig instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig getWebhookClientConfig();
    public io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig buildWebhookClientConfig();
    public A withWebhookClientConfig(io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig webhookClientConfig);
    public Boolean hasWebhookClientConfig();
    public CustomResourceConversionFluent.WebhookClientConfigNested<A> withNewWebhookClientConfig();
    public CustomResourceConversionFluent.WebhookClientConfigNested<A> withNewWebhookClientConfigLike(io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig item);
    public CustomResourceConversionFluent.WebhookClientConfigNested<A> editWebhookClientConfig();
    public CustomResourceConversionFluent.WebhookClientConfigNested<A> editOrNewWebhookClientConfig();
    public CustomResourceConversionFluent.WebhookClientConfigNested<A> editOrNewWebhookClientConfigLike(io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig item);

    public interface WebhookClientConfigNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigFluent<CustomResourceConversionFluent.WebhookClientConfigNested<N>>{

        
    public N and();    public N endWebhookClientConfig();
}


}
