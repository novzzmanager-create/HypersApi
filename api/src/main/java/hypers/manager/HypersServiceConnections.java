package hypers.manager;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HypersServiceConnections {

    private static final Map<String, HypersServiceConnection> CACHE = Collections.synchronizedMap(new HashMap<>());

    @NonNull
    static HypersServiceConnection get(Hypers.UserServiceArgs args) {
        String key = args.tag != null ? args.tag : args.componentName.getClassName();
        HypersServiceConnection connection = CACHE.get(key);

        if (connection == null) {
            connection = new HypersServiceConnection(args);
            CACHE.put(key, connection);
        }
        return connection;
    }

    static void remove(HypersServiceConnection connection) {
        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, HypersServiceConnection> entry : CACHE.entrySet()) {
            if (entry.getValue() == connection) {
                keys.add(entry.getKey());
            }
        }
        for (String key : keys) {
            CACHE.remove(key);
        }
    }
}
