package com.fiap.functions;

import com.fiap.models.Feedback;
import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

import java.util.Optional;

public class FeedbackFunction {

    @FunctionName("PostFeedback")
    public HttpResponseMessage run(
            @HttpTrigger(name = "req", methods = {HttpMethod.POST}, authLevel = AuthorizationLevel.ANONYMOUS)
            HttpRequestMessage<Optional<Feedback>> request,
            final ExecutionContext context) {

        Feedback fb = request.getBody().get();
        //  fb.persist(); // Salvando no banco (ex: PostgreSQL ou CosmosDB)

      /*  if (fb.nota <= 2) {
            // Enviar para a Fila do Service Bus aqui
            context.getLogger().info("Feedback crítico detectado!");
        }*/

        return request.createResponseBuilder(HttpStatus.CREATED).build();
    }

}
