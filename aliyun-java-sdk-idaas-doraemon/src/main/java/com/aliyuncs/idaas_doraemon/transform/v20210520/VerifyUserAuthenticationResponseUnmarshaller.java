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

package com.aliyuncs.idaas_doraemon.transform.v20210520;

import com.aliyuncs.idaas_doraemon.model.v20210520.VerifyUserAuthenticationResponse;
import com.aliyuncs.idaas_doraemon.model.v20210520.VerifyUserAuthenticationResponse.AuthenticateResultInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyUserAuthenticationResponseUnmarshaller {

	public static VerifyUserAuthenticationResponse unmarshall(VerifyUserAuthenticationResponse verifyUserAuthenticationResponse, UnmarshallerContext _ctx) {
		
		verifyUserAuthenticationResponse.setRequestId(_ctx.stringValue("VerifyUserAuthenticationResponse.RequestId"));
		verifyUserAuthenticationResponse.setVerifyResult(_ctx.booleanValue("VerifyUserAuthenticationResponse.VerifyResult"));
		verifyUserAuthenticationResponse.setEtasSDKString(_ctx.stringValue("VerifyUserAuthenticationResponse.EtasSDKString"));
		verifyUserAuthenticationResponse.setIdToken(_ctx.stringValue("VerifyUserAuthenticationResponse.IdToken"));

		AuthenticateResultInfo authenticateResultInfo = new AuthenticateResultInfo();
		authenticateResultInfo.setUserId(_ctx.stringValue("VerifyUserAuthenticationResponse.AuthenticateResultInfo.UserId"));
		authenticateResultInfo.setCredentialId(_ctx.stringValue("VerifyUserAuthenticationResponse.AuthenticateResultInfo.CredentialId"));
		authenticateResultInfo.setBindHashBase64(_ctx.stringValue("VerifyUserAuthenticationResponse.AuthenticateResultInfo.BindHashBase64"));
		verifyUserAuthenticationResponse.setAuthenticateResultInfo(authenticateResultInfo);
	 
	 	return verifyUserAuthenticationResponse;
	}
}