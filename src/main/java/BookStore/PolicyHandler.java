package BookStore;

import BookStore.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PolicyHandler{

    @Autowired
    DeliveryRepository deliveryRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPayApproved_DeliveryRequest(@Payload PayApproved payApproved){

        if(payApproved.isMe()){
            System.out.println("111##### listener DeliveryRequest : " + payApproved.toJson());
        }

        Optional<Delivery> opt = deliveryRepository.findById(payApproved.getOrderId());
        Delivery delivery = opt.get();
        System.out.println("222##### listener DeliveryRequest : " + delivery.getStatus());
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPayCanceled_DeliveryCancel(@Payload PayCanceled payCanceled){

        if(payCanceled.isMe()){
            System.out.println("##### listener DeliveryCancel : " + payCanceled.toJson());
        }
    }

}
