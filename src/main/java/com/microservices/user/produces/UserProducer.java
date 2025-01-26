package com.microservices.user.produces;

import com.microservices.user.dtos.EmailDto;
import com.microservices.user.models.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserProducer {

    final RabbitTemplate rabbitTemplate;

    public UserProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Value(value = "${broker.queue.email.name}")
    private String routingKey;

    public void publishMessageEmail(User user) {
        var emailDto = new EmailDto();
        emailDto.setUserId(user.getId());
        emailDto.setUserId(user.getId());
        emailDto.setEmailTo(user.getEmail());
        emailDto.setSubject("Cadastro realizado com sucesso!");
        emailDto.setText(user.getName() + ", seja bem-vindo!\n" +
                "Seu cadastro foi realizado com sucesso.\n" +
                "Estamos muito felizes por você fazer parte da nossa plataforma.\n" +
                "Atenciosamente, Equipe de suporte.");

        rabbitTemplate.convertAndSend("", routingKey, emailDto);
    }
}
