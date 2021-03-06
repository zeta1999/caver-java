package com.klaytn.caver.wallet.keyring;

import com.klaytn.caver.crypto.KlaySignatureData;

/**
 * Represents a signed data info
 */
public class MessageSigned {
    /**
     * Signed message
     */
    String messageHash;

    /**
     * ECDSA signature data(V, R, S)
     */
    KlaySignatureData signatureData;

    /**
     * Plain message
     */
    String message;

    /**
     * Creates a MessageSigned instance
     * @param messageHash Signed message string
     * @param signatureData ECDSA signature data
     * @param message Plain message string
     */
    public MessageSigned(String messageHash, KlaySignatureData signatureData, String message) {
        this.messageHash = messageHash;
        this.signatureData = signatureData;
        this.message = message;
    }

    /**
     * Getter function of message hash
     * @return String
     */
    public String getMessageHash() {
        return messageHash;
    }

    /**
     * Getter function of ECDSA signature data
     * @return KlaySignatureData
     */
    public KlaySignatureData getSignatureData() {
        return signatureData;
    }

    /**
     * Getter function of message
     * @return String
     */
    public String getMessage() {
        return message;
    }
}
