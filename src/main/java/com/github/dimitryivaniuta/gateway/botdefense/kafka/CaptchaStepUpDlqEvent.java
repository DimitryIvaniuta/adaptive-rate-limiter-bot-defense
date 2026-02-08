package com.github.dimitryivaniuta.gateway.botdefense.kafka;

import java.time.Instant;

/**
 * DLQ payload for step-up processing failures.
 */
public record CaptchaStepUpDlqEvent(
        String dlqId,
        Instant createdAt,
        BotDefenseEvent original,
        String errorMessage,
        String errorClass
) {
}
