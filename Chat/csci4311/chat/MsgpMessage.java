/**
 * Encodes a text message
 */

package csci4311.chat;

import java.util.List;

public class MsgpMessage {
    private String from, message;
    private List<String> to;

    /**
     * @param   from    sender
     * @param   to      list of recipients
     * @param   message message content
     */
    public MsgpMessage(String from, List<String> to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }
    public String       getFrom()    {return from;}
    public List<String> getTo()      {return to;}
    public String       getMessage() {return message;}
}
