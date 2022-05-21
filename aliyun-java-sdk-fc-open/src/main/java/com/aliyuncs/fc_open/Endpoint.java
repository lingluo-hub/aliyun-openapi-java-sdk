/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.fc_open;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "account-id.cn-shenzhen.fc.aliyuncs.com");
            put("cn-beijing", "account-id.cn-beijing.fc.aliyuncs.com");
            put("ap-south-1", "account-id.ap-south-1.fc.aliyuncs.com");
            put("eu-west-1", "account-id.eu-west-1.fc.aliyuncs.com");
            put("ap-northeast-1", "account-id.ap-northeast-1.fc.aliyuncs.com");
            put("cn-chengdu", "account-id.cn-chengdu.fc.aliyuncs.com");
            put("cn-north-2-gov-1", "account-id.cn-north-2-gov-1.fc.aliyuncs.com");
            put("cn-qingdao", "account-id.cn-qingdao.fc.aliyuncs.com");
            put("cn-shanghai", "account-id.cn-shanghai.fc.aliyuncs.com");
            put("cn-hangzhou-finance", "account-id.cn-hangzhou-finance.fc.aliyuncs.com");
            put("cn-hongkong", "account-id.cn-hongkong.fc.aliyuncs.com");
            put("ap-southeast-1", "account-id.ap-southeast-1.fc.aliyuncs.com");
            put("ap-southeast-2", "account-id.ap-southeast-2.fc.aliyuncs.com");
            put("ap-southeast-3", "account-id.ap-southeast-3.fc.aliyuncs.com");
            put("eu-central-1", "account-id.eu-central-1.fc.aliyuncs.com");
            put("cn-huhehaote", "account-id.cn-huhehaote.fc.aliyuncs.com");
            put("ap-southeast-5", "account-id.ap-southeast-5.fc.aliyuncs.com");
            put("us-east-1", "account-id.us-east-1.fc.aliyuncs.com");
            put("cn-zhangjiakou", "account-id.cn-zhangjiakou.fc.aliyuncs.com");
            put("us-west-1", "account-id.us-west-1.fc.aliyuncs.com");
            put("cn-hangzhou", "account-id.cn-hangzhou.fc.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
