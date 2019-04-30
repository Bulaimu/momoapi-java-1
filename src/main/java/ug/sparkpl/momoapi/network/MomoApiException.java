package ug.sparkpl.momoapi.network;

import java.io.IOException;

/**
 * An exception class for the response.
 */
public final class MomoApiException extends IOException {


  public MomoApiException(String response) {
    super(response);

  }
}
