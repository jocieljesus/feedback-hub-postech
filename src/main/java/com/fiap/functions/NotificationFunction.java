package com.fiap.functions;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.ServiceBusQueueTrigger;

public class NotificationFunction {

    @FunctionName("NotifyCriticalFeedback")
    public void process(
            @ServiceBusQueueTrigger(name = "msg", queueName = "critical-queue", connection = "AzureServiceBusConn")
            String message,
            final ExecutionContext context) {

        context.getLogger().info("Enviando e-mail de alerta para administrador: " + message);
        // Lógica de envio de e-mail (SendGrid ou Azure Communication Services)
    }
}
