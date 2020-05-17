package org.example.encoder;
import org.apache.commons.codec.digest.DigestUtils;
import org.example.usecase.port.PasswordEncoder;

public class Sha256PasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(final String str) {
        return DigestUtils.sha256Hex(str);
    }
}
