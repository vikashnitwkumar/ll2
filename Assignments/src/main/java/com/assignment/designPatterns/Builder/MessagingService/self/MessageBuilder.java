package main.java.com.assignment.designPatterns.Builder.MessagingService.self;


@WithBuilder
public class MessageBuilder {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;
    private MessageBuilder(MessageBuilderInner messageBuilderInner) {
        this.messageType = messageBuilderInner.messageType;
        this.content = messageBuilderInner.content;
        this.sender = messageBuilderInner.sender;
        this.recipient = messageBuilderInner.recipient;
        this.isDelivered = messageBuilderInner.isDelivered;
        this.timestamp = messageBuilderInner.timestamp;
    }

    public static  MessageBuilderInner getBuilder(){
        return  new MessageBuilderInner();
    }
    @WithBuilder
    public static class MessageBuilderInner {
        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;

        public long getTimeStamp() {
            return timestamp;
        }

        public MessageBuilderInner setTimeStamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        private  long timestamp;

        public MessageType getMessageType() {
            return messageType;
        }

        public MessageBuilderInner setMessageType(MessageType messageType) {
            this.messageType = messageType;
            return this;
        }

        public String getContent() {
            return content;
        }

        public MessageBuilderInner setContent(String content) {
            this.content = content;
            return this;
        }

        public String getSender() {
            return sender;
        }

        public MessageBuilderInner setSender(String sender) {
            this.sender = sender;
            return this;
        }

        public String getRecipient() {
            return recipient;
        }

        public MessageBuilderInner setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public boolean isDelivered() {
            return isDelivered;
        }

        public MessageBuilderInner setDelivered(boolean delivered) {
            isDelivered = delivered;
            return this;
        }

        public MessageBuilder build(){
            return new MessageBuilder(this);
        }
    }
}