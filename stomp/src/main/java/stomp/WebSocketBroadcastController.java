package stomp;

import stomp.dto.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebSocketBroadcastController {

    @GetMapping("/stomp-broadcast")
    public String getWebSocketBroadcast() {
        return "stomp-broadcast";
    }

    @MessageMapping("/broadcast")
    @SendTo("/topic/messages")
    public ChatMessage send(ChatMessage chatMessage) {
        return new ChatMessage(chatMessage.getFrom(), chatMessage.getText(), "ALL");
    }

}