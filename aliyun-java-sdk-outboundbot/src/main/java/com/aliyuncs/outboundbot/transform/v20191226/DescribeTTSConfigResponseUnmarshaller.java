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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.DescribeTTSConfigResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeTTSConfigResponse.TTSConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTTSConfigResponseUnmarshaller {

	public static DescribeTTSConfigResponse unmarshall(DescribeTTSConfigResponse describeTTSConfigResponse, UnmarshallerContext _ctx) {
		
		describeTTSConfigResponse.setRequestId(_ctx.stringValue("DescribeTTSConfigResponse.RequestId"));
		describeTTSConfigResponse.setHttpStatusCode(_ctx.integerValue("DescribeTTSConfigResponse.HttpStatusCode"));
		describeTTSConfigResponse.setCode(_ctx.stringValue("DescribeTTSConfigResponse.Code"));
		describeTTSConfigResponse.setMessage(_ctx.stringValue("DescribeTTSConfigResponse.Message"));
		describeTTSConfigResponse.setSuccess(_ctx.booleanValue("DescribeTTSConfigResponse.Success"));

		TTSConfig tTSConfig = new TTSConfig();
		tTSConfig.setVoice(_ctx.stringValue("DescribeTTSConfigResponse.TTSConfig.Voice"));
		tTSConfig.setSpeechRate(_ctx.stringValue("DescribeTTSConfigResponse.TTSConfig.SpeechRate"));
		tTSConfig.setVolume(_ctx.stringValue("DescribeTTSConfigResponse.TTSConfig.Volume"));
		tTSConfig.setInstanceId(_ctx.stringValue("DescribeTTSConfigResponse.TTSConfig.InstanceId"));
		tTSConfig.setNlsServiceType(_ctx.stringValue("DescribeTTSConfigResponse.TTSConfig.NlsServiceType"));
		tTSConfig.setAppKey(_ctx.stringValue("DescribeTTSConfigResponse.TTSConfig.AppKey"));
		describeTTSConfigResponse.setTTSConfig(tTSConfig);
	 
	 	return describeTTSConfigResponse;
	}
}