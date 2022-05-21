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

package com.aliyuncs.ram.transform.v20150501;

import com.aliyuncs.ram.model.v20150501.SetPasswordPolicyResponse;
import com.aliyuncs.ram.model.v20150501.SetPasswordPolicyResponse.PasswordPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetPasswordPolicyResponseUnmarshaller {

	public static SetPasswordPolicyResponse unmarshall(SetPasswordPolicyResponse setPasswordPolicyResponse, UnmarshallerContext _ctx) {
		
		setPasswordPolicyResponse.setRequestId(_ctx.stringValue("SetPasswordPolicyResponse.RequestId"));

		PasswordPolicy passwordPolicy = new PasswordPolicy();
		passwordPolicy.setRequireNumbers(_ctx.booleanValue("SetPasswordPolicyResponse.PasswordPolicy.RequireNumbers"));
		passwordPolicy.setRequireLowercaseCharacters(_ctx.booleanValue("SetPasswordPolicyResponse.PasswordPolicy.RequireLowercaseCharacters"));
		passwordPolicy.setHardExpiry(_ctx.booleanValue("SetPasswordPolicyResponse.PasswordPolicy.HardExpiry"));
		passwordPolicy.setPasswordReusePrevention(_ctx.integerValue("SetPasswordPolicyResponse.PasswordPolicy.PasswordReusePrevention"));
		passwordPolicy.setRequireSymbols(_ctx.booleanValue("SetPasswordPolicyResponse.PasswordPolicy.RequireSymbols"));
		passwordPolicy.setMaxPasswordAge(_ctx.integerValue("SetPasswordPolicyResponse.PasswordPolicy.MaxPasswordAge"));
		passwordPolicy.setMinimumPasswordLength(_ctx.integerValue("SetPasswordPolicyResponse.PasswordPolicy.MinimumPasswordLength"));
		passwordPolicy.setRequireUppercaseCharacters(_ctx.booleanValue("SetPasswordPolicyResponse.PasswordPolicy.RequireUppercaseCharacters"));
		passwordPolicy.setMaxLoginAttemps(_ctx.integerValue("SetPasswordPolicyResponse.PasswordPolicy.MaxLoginAttemps"));
		setPasswordPolicyResponse.setPasswordPolicy(passwordPolicy);
	 
	 	return setPasswordPolicyResponse;
	}
}