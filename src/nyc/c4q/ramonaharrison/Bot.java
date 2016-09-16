package nyc.c4q.ramonaharrison;

import nyc.c4q.ramonaharrison.model.Channel;
import nyc.c4q.ramonaharrison.model.Message;
import nyc.c4q.ramonaharrison.network.*;
import nyc.c4q.ramonaharrison.network.response.*;
//import nyc.c4q.ramonaharrison.util.FunFacts;

import java.util.List;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 */

public class Bot {
    // TODO: implement your bot logic!

    public Bot() {
//        FunFacts funFacts = new FunFacts();
//        funFacts.randomFact();
//sendMessageToBotsChannel(FunFacts.getFact());
    }

    /**
     * Sample method: tests the Slack API. Prints a message indicating success or failure.
     */
    public void testApi() {
        Response apiTest = Slack.testApi();
        System.out.println("API OK: " +apiTest.isOk() + "\n");
    }

    /**
     * Sample method: prints all public AccessCode3-3 channel names and ids. Prints an error message on failure.
     */
    public void listChannels() {
        ListChannelsResponse listChannelsResponse = Slack.listChannels();

        if (listChannelsResponse.isOk()) {
            List<Channel> channels = listChannelsResponse.getChannels();

            System.out.println("\nChannels: ");
            for (Channel channel : channels) {
                System.out.println("name: " + channel.getName() + ", id:" + channel.getId());
            }
        } else {
            System.err.print("Error listing channels: " + listChannelsResponse.getError());
        }
    }

    /**
     * Sample method: prints up to the last 100 messages from a given channel. Prints an error message on failure.
     * or failure.
     *
     * @param channelId id of the given channel.
     */
    public void listMessages(String channelId) {
        ListMessagesResponse listMessagesResponse = Slack.listMessages(channelId);
        List<Message> messages = listMessagesResponse.getMessages();
        if (listMessagesResponse.isOk()) {


            System.out.println("\nMessages: ");
            for (Message message : messages) {
                    System.out.println();
                    System.out.println("Timestamp: " + message.getTs());
                    System.out.println("Message: " + message.getText());
            }
        }
        else{
                System.err.print("Error listing messages: " + listMessagesResponse.getError());
            }
        for (int i = 0; i < messages.size(); i++) {
            Message locater = messages.get(i);
            String text = locater.getText();
            if (text.equals("@robotron")) {
                System.out.println("Robotron has been mentioned!");

            }
        }
        }

    /**
     * Sample method: sends a plain text message to the #bots channel. Prints a message indicating success or failure.
     *
     * @param text message text.
     */
    public void sendMessageToBotsChannel(String text) {
        SendMessageResponse sendMessageResponse = Slack.sendMessage(text);

        if (sendMessageResponse.isOk()) {
            System.out.println("Message sent successfully!");
        } else {
            System.err.print("Error sending message: " + sendMessageResponse.getError());
        }
    }

//    public void sendFunFactMessagetoBotsChannel(){
//        SendMessageResponse sendFunFact = Slack.sendMessage(funfact);
//        FunFacts funFact = new FunFacts();
//        FunFacts.randomFact();
//    }

    /**
     * Sample method: deletes a message from the #bots channel. Prints a message indicating success or failure.
     *
     * @param messageTs unique timestamp of the message to be deleted.
     */
    public void deleteMessageInBotsChannel(String messageTs) {
        DeleteMessageResponse deleteMessageResponse = Slack.deleteMessage(messageTs);

        if (deleteMessageResponse.isOk()) {
            System.out.println("Message deleted successfully!");
        } else {
            System.err.print("Error sending message: " + deleteMessageResponse.getError());
        }
    }
}
