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

package com.aliyuncs.kms.transform.v20160120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.kms.model.v20160120.DescribeSecretResponse;
import com.aliyuncs.kms.model.v20160120.DescribeSecretResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecretResponseUnmarshaller {

	public static DescribeSecretResponse unmarshall(DescribeSecretResponse describeSecretResponse, UnmarshallerContext _ctx) {
		
		describeSecretResponse.setRequestId(_ctx.stringValue("DescribeSecretResponse.RequestId"));
		describeSecretResponse.setUpdateTime(_ctx.stringValue("DescribeSecretResponse.UpdateTime"));
		describeSecretResponse.setCreateTime(_ctx.stringValue("DescribeSecretResponse.CreateTime"));
		describeSecretResponse.setNextRotationDate(_ctx.stringValue("DescribeSecretResponse.NextRotationDate"));
		describeSecretResponse.setEncryptionKeyId(_ctx.stringValue("DescribeSecretResponse.EncryptionKeyId"));
		describeSecretResponse.setRotationInterval(_ctx.stringValue("DescribeSecretResponse.RotationInterval"));
		describeSecretResponse.setArn(_ctx.stringValue("DescribeSecretResponse.Arn"));
		describeSecretResponse.setExtendedConfig(_ctx.stringValue("DescribeSecretResponse.ExtendedConfig"));
		describeSecretResponse.setLastRotationDate(_ctx.stringValue("DescribeSecretResponse.LastRotationDate"));
		describeSecretResponse.setDescription(_ctx.stringValue("DescribeSecretResponse.Description"));
		describeSecretResponse.setSecretName(_ctx.stringValue("DescribeSecretResponse.SecretName"));
		describeSecretResponse.setAutomaticRotation(_ctx.stringValue("DescribeSecretResponse.AutomaticRotation"));
		describeSecretResponse.setSecretType(_ctx.stringValue("DescribeSecretResponse.SecretType"));
		describeSecretResponse.setPlannedDeleteTime(_ctx.stringValue("DescribeSecretResponse.PlannedDeleteTime"));
		describeSecretResponse.setDKMSInstanceId(_ctx.stringValue("DescribeSecretResponse.DKMSInstanceId"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecretResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagValue(_ctx.stringValue("DescribeSecretResponse.Tags["+ i +"].TagValue"));
			tag.setTagKey(_ctx.stringValue("DescribeSecretResponse.Tags["+ i +"].TagKey"));

			tags.add(tag);
		}
		describeSecretResponse.setTags(tags);
	 
	 	return describeSecretResponse;
	}
}