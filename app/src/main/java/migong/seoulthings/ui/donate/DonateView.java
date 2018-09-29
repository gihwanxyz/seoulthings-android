package migong.seoulthings.ui.donate;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;

public interface DonateView {

  Context getContext();

  void startAddressLoading();

  void finishAddressLoading();

  void changeAddressButtonText(String address);

  void showGoogleMap();

  void hideGoogleMap();

  void setMarkerOnGoogleMap(@NonNull LatLng latLng);
}
