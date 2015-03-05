package org.passiba.fooddelivery;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyLocationContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyLocation> ITEMS = new ArrayList<DummyLocation>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyLocation> ITEM_MAP = new HashMap<String, DummyLocation>();

    static {
        // Add 6 sample items.
        addItem(new DummyLocation("1", "Helsinki","http://pelastusarmeija.fi/avis/","Helsingin pelastusarmeija",60.185342,24.949493));
        addItem(new DummyLocation("2", "Helsinki","http://pelastusarmeija.fi/avis/","Veikko ja Lahja Hurstin Laupeudentyö ry",60.187084,24.953502));
        addItem(new DummyLocation("3", "Haapavesi","http://www.haapavesi.svk.fi","Haapaveden vapaaseurakunta",64.13677,25.371158));
        addItem(new DummyLocation("4", "Espoo","http://www.kaivoespoo.com/avoinna.html","Lähetyskappeli Ruoka-apu ry",60.157874,24.739865));
        addItem(new DummyLocation("5", "Espoo","http://www.hyva-arki.fi","Hyvä Arki ry",60.203123,24.654608));
        addItem(new DummyLocation("6", "Espoo","http://www.manna-apu.com","Manna-Apu Ry",60.202722,24.653334));
    }

    private static void addItem(DummyLocation item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyLocation {
        private String id;
        private String city,name,website;
        private double latitude;
        private double longitude;
        private LatLng latitudelongitude;


        public DummyLocation(String id, String city, String website, String name, double latitude, double longitude) {
            this.id = id;
            this.city = city;
            this.name=name;
            this.website=website;
            this.latitude=latitude;
            this.longitude=longitude;
            latitudelongitude=new LatLng(latitude,longitude);
        }


        public LatLng getLatitudelongitude() {
            return this.latitudelongitude;
        }

        public String getCity() {
            return city;
        }

        public String getName() {
            return name;
        }

        public String getWebsite() {
            return website;
        }

        public String getId() {
            return id;
        }
    }
}
