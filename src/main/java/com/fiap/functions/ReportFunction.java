package com.fiap.functions;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.TimerTrigger;

public class ReportFunction {
    @FunctionName("GenerateDailyReport")
    public void run(
            @TimerTrigger(name = "keepAliveTimer", schedule = "0 0 0 * * *") String timerInfo,
            final ExecutionContext context) {

        // 1. Buscar feedbacks do último dia
        // 2. Gerar CSV ou JSON
        // 3. Salvar no Azure Blob Storage
        context.getLogger().info("Relatório diário gerado e armazenado.");
    }
}
