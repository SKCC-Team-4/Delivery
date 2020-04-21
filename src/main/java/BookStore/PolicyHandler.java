package BookStore;

import BookStore.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
<<<<<<< HEAD

    @Autowired
    DeliveryRepository deliveryRepository;
=======
>>>>>>> 87a68d5fd7eba1a9d55cd2b622e6a183be6130ca
    
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPayApproved_DeliveryRequest(@Payload PayApproved payApproved){

        if(payApproved.isMe()){
<<<<<<< HEAD
            System.out.println("111##### listener DeliveryRequest : " + payApproved.toJson());
        }

        deliveryRepository.findById(payApproved.getOrderId());
        System.out.println("222##### listener DeliveryRequest : " + payApproved.toJson());
=======
            System.out.println("##### listener DeliveryRequest : " + payApproved.toJson());
        }
>>>>>>> 87a68d5fd7eba1a9d55cd2b622e6a183be6130ca
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPayCanceled_DeliveryCancel(@Payload PayCanceled payCanceled){

        if(payCanceled.isMe()){
            System.out.println("##### listener DeliveryCancel : " + payCanceled.toJson());
        }
    }

}
