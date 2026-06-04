package hypers.manager;

import androidx.annotation.RestrictTo;

import static androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX;

public class HypersApiConstants {

    public static final int SERVER_VERSION = 13;
    public static final int SERVER_PATCH_VERSION = 6;

    // binder
    public static final String BINDER_DESCRIPTOR = "com.hypers.server.IHypersService";
    public static final int BINDER_TRANSACTION_transact = 1;

    // user service
    @RestrictTo(LIBRARY_GROUP_PREFIX)
    public static final int USER_SERVICE_TRANSACTION_destroy = 16777115;

    public static final String USER_SERVICE_ARG_TAG = "hypers:user-service-arg-tag";
    public static final String USER_SERVICE_ARG_COMPONENT = "hypers:user-service-arg-component";
    public static final String USER_SERVICE_ARG_DEBUGGABLE = "hypers:user-service-arg-debuggable";
    public static final String USER_SERVICE_ARG_VERSION_CODE = "hypers:user-service-arg-version-code";
    public static final String USER_SERVICE_ARG_PROCESS_NAME = "hypers:user-service-arg-process-name";
    public static final String USER_SERVICE_ARG_NO_CREATE = "hypers:user-service-arg-no-create";
    public static final String USER_SERVICE_ARG_DAEMON = "hypers:user-service-arg-daemon";
    public static final String USER_SERVICE_ARG_USE_32_BIT_APP_PROCESS = "hypers:user-service-arg-use-32-bit-app-process";
    public static final String USER_SERVICE_ARG_REMOVE = "hypers:user-service-remove";

    @RestrictTo(LIBRARY_GROUP_PREFIX)
    public static final String USER_SERVICE_ARG_TOKEN = "hypers:user-service-arg-token";

    // bind application
    public static final String BIND_APPLICATION_SERVER_VERSION = "hypers:attach-reply-version";
    public static final String BIND_APPLICATION_SERVER_PATCH_VERSION = "hypers:attach-reply-patch-version";
    public static final String BIND_APPLICATION_SERVER_UID = "hypers:attach-reply-uid";
    public static final String BIND_APPLICATION_SERVER_SECONTEXT = "hypers:attach-reply-secontext";
    public static final String BIND_APPLICATION_PERMISSION_GRANTED = "hypers:attach-reply-permission-granted";
    public static final String BIND_APPLICATION_SHOULD_SHOW_REQUEST_PERMISSION_RATIONALE = "hypers:attach-reply-should-show-request-permission-rationale";

    // request permission
    public static final String REQUEST_PERMISSION_REPLY_ALLOWED = "hypers:request-permission-reply-allowed";
    public static final String REQUEST_PERMISSION_REPLY_IS_ONETIME = "hypers:request-permission-reply-is-onetime";

    // attach application
    public static final String ATTACH_APPLICATION_PACKAGE_NAME = "hypers:attach-package-name";
    public static final String ATTACH_APPLICATION_API_VERSION = "hypers:attach-api-version";
}
