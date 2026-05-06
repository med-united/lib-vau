package de.gematik.vau.lib.cbor;

import lombok.Getter;

@Getter
public class VAUAutCertificateWithChain {
    private byte[] cert; // DER-encoded AUT-VAU certificate
    private byte[] ca;   // DER-encoded component PKI CA from the "cert"
    private byte[][] rca_chain; // Array of cross-certificates
}
