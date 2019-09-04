package cn.jpush.api.push;


public class GroupPushClientTest extends cn.jpush.api.BaseTest {
    protected static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(cn.jpush.api.push.GroupPushClientTest.class);

    @org.junit.Test
    public void testSendGroupPush() {
        cn.jpush.api.push.GroupPushClient groupPushClient = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.GroupPushClient>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|0", cn.jpush.api.push.GroupPushClient.class, new cn.jpush.api.push.GroupPushClient(cn.jpush.api.BaseTest.GROUP_MASTER_SECRET, cn.jpush.api.BaseTest.GROUP_PUSH_KEY));
        final cn.jpush.api.push.model.PushPayload payload = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.PushPayload>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|1", cn.jpush.api.push.model.PushPayload.class, cn.jpush.api.push.GroupPushClientTest.buildPushObject_android());
        try {
            java.util.Map<java.lang.String, cn.jpush.api.push.PushResult> result = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Map<java.lang.String, cn.jpush.api.push.PushResult>>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|4", java.util.Map.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.GroupPushClient>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|2", cn.jpush.api.push.GroupPushClient.class, groupPushClient).sendGroupPush(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.PushPayload>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|3", cn.jpush.api.push.model.PushPayload.class, payload)));
            for (java.util.Map.Entry<java.lang.String, cn.jpush.api.push.PushResult> entry : eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.util.Map.Entry<java.lang.String, cn.jpush.api.push.PushResult>>>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|6", java.util.Set.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Map<java.lang.String, cn.jpush.api.push.PushResult>>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|5", java.util.Map.class, result).entrySet())) {
                cn.jpush.api.push.PushResult pushResult = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushResult>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|8", cn.jpush.api.push.PushResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Map.Entry<java.lang.String, cn.jpush.api.push.PushResult>>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|7", java.util.Map.Entry.class, entry).getValue());
                cn.jpush.api.push.PushResult.Error error = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushResult.Error>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|10", cn.jpush.api.push.PushResult.Error.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushResult>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|9", cn.jpush.api.push.PushResult.class, pushResult).error);
                if ((eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushResult.Error>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|11", cn.jpush.api.push.PushResult.Error.class, error)) != null) {
                    eu.stamp_project.reneri.instrumentation.StateObserver.<org.slf4j.Logger>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|12", org.slf4j.Logger.class, cn.jpush.api.push.GroupPushClientTest.LOG).info(((((("AppKey: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Map.Entry<java.lang.String, cn.jpush.api.push.PushResult>>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|13", java.util.Map.Entry.class, entry).getKey()))) + " error code : ") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushResult.Error>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|15", cn.jpush.api.push.PushResult.Error.class, error).getCode()))) + " error message: ") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushResult.Error>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|17", cn.jpush.api.push.PushResult.Error.class, error).getMessage()))));
                }else {
                    eu.stamp_project.reneri.instrumentation.StateObserver.<org.slf4j.Logger>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|19", org.slf4j.Logger.class, cn.jpush.api.push.GroupPushClientTest.LOG).info(((((("AppKey: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Map.Entry<java.lang.String, cn.jpush.api.push.PushResult>>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|20", java.util.Map.Entry.class, entry).getKey()))) + " sendno: ") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushResult>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|22", cn.jpush.api.push.PushResult.class, pushResult).sendno))) + " msg_id:") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|25", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushResult>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|24", cn.jpush.api.push.PushResult.class, pushResult).msg_id))));
                }
            }
        } catch (cn.jiguang.common.resp.APIConnectionException e) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.slf4j.Logger>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|26", org.slf4j.Logger.class, cn.jpush.api.push.GroupPushClientTest.LOG).error("Connection error. Should retry later. ", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIConnectionException>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|27", cn.jiguang.common.resp.APIConnectionException.class, e));
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.slf4j.Logger>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|28", org.slf4j.Logger.class, cn.jpush.api.push.GroupPushClientTest.LOG).error(("Sendno: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|30", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.PushPayload>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|29", cn.jpush.api.push.model.PushPayload.class, payload).getSendno()))));
        } catch (cn.jiguang.common.resp.APIRequestException e) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.slf4j.Logger>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|31", org.slf4j.Logger.class, cn.jpush.api.push.GroupPushClientTest.LOG).error("Error response from JPush server. Should review and fix it. ", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIRequestException>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|32", cn.jiguang.common.resp.APIRequestException.class, e));
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.slf4j.Logger>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|33", org.slf4j.Logger.class, cn.jpush.api.push.GroupPushClientTest.LOG).info(("HTTP Status: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|35", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIRequestException>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|34", cn.jiguang.common.resp.APIRequestException.class, e).getStatus()))));
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.slf4j.Logger>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|36", org.slf4j.Logger.class, cn.jpush.api.push.GroupPushClientTest.LOG).info(("Error Code: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|38", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIRequestException>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|37", cn.jiguang.common.resp.APIRequestException.class, e).getErrorCode()))));
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.slf4j.Logger>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|39", org.slf4j.Logger.class, cn.jpush.api.push.GroupPushClientTest.LOG).info(("Error Message: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|41", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIRequestException>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|40", cn.jiguang.common.resp.APIRequestException.class, e).getErrorMessage()))));
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.slf4j.Logger>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|42", org.slf4j.Logger.class, cn.jpush.api.push.GroupPushClientTest.LOG).info(("Msg ID: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|44", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIRequestException>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|43", cn.jiguang.common.resp.APIRequestException.class, e).getMsgId()))));
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.slf4j.Logger>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|45", org.slf4j.Logger.class, cn.jpush.api.push.GroupPushClientTest.LOG).error(("Sendno: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|47", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.PushPayload>observeState("cn.jpush.api.push.GroupPushClientTest|testSendGroupPush()|46", cn.jpush.api.push.model.PushPayload.class, payload).getSendno()))));
        }
    }

    public static cn.jpush.api.push.model.PushPayload buildPushObject_android() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.PushPayload>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|18", cn.jpush.api.push.model.PushPayload.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.PushPayload.Builder>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|17", cn.jpush.api.push.model.PushPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.PushPayload.Builder>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|4", cn.jpush.api.push.model.PushPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.PushPayload.Builder>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|2", cn.jpush.api.push.model.PushPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.PushPayload.Builder>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|0", cn.jpush.api.push.model.PushPayload.Builder.class, cn.jpush.api.push.model.PushPayload.newBuilder()).setPlatform(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.Platform>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|1", cn.jpush.api.push.model.Platform.class, cn.jpush.api.push.model.Platform.android()))).setAudience(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|3", cn.jpush.api.push.model.audience.Audience.class, cn.jpush.api.push.model.audience.Audience.registrationId(cn.jpush.api.BaseTest.REGISTRATION_ID3)))).setNotification(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.notification.Notification>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|16", cn.jpush.api.push.model.notification.Notification.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.notification.Notification.Builder>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|15", cn.jpush.api.push.model.notification.Notification.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.notification.Notification.Builder>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|10", cn.jpush.api.push.model.notification.Notification.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.notification.Notification.Builder>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|6", cn.jpush.api.push.model.notification.Notification.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.notification.Notification.Builder>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|5", cn.jpush.api.push.model.notification.Notification.Builder.class, cn.jpush.api.push.model.notification.Notification.newBuilder()).setAlert("alert content")).addPlatformNotification(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.notification.AndroidNotification>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|9", cn.jpush.api.push.model.notification.AndroidNotification.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.notification.AndroidNotification.Builder>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|8", cn.jpush.api.push.model.notification.AndroidNotification.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.notification.AndroidNotification.Builder>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|7", cn.jpush.api.push.model.notification.AndroidNotification.Builder.class, cn.jpush.api.push.model.notification.AndroidNotification.newBuilder()).setTitle("Android Title")).build()))).addPlatformNotification(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.notification.IosNotification>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|14", cn.jpush.api.push.model.notification.IosNotification.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.notification.IosNotification.Builder>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|13", cn.jpush.api.push.model.notification.IosNotification.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.notification.IosNotification.Builder>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|12", cn.jpush.api.push.model.notification.IosNotification.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.notification.IosNotification.Builder>observeState("cn.jpush.api.push.GroupPushClientTest|buildPushObject_android()|11", cn.jpush.api.push.model.notification.IosNotification.Builder.class, cn.jpush.api.push.model.notification.IosNotification.newBuilder()).incrBadge(1)).addExtra("extra_key", "extra_value")).build()))).build()))).build());
    }
}
